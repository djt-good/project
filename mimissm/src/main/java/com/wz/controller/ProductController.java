package com.wz.controller;

import com.github.pagehelper.PageInfo;
import com.wz.domain.ProductInfo;
import com.wz.domain.vo.ProductInfoVo;
import com.wz.service.ProductService;
import com.wz.utils.FileNameUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pro")
public class ProductController {
    private String saveFilename="";

    private static int Page_Size = 5;
    @Autowired
    ProductService productService;
    @RequestMapping("/all")
    public String getAll(HttpServletRequest request){
        List<ProductInfo> all = productService.getAll();
        request.setAttribute("list",all);
        return "product";
    }

    @RequestMapping("/split")
    public String split(HttpServletRequest request){
        PageInfo info=null;
        Object vo =request.getSession().getAttribute("proVo");
        if (vo !=null){
            info =productService.splitPageVo((ProductInfoVo) vo,Page_Size);
            request.getSession().removeAttribute("proVo");
        }else {
            info = productService.splitage(1, Page_Size);
        }
        request.setAttribute("info",info);
        return "product";

    }
    @ResponseBody
    @RequestMapping("/splitajax")
    public void splitajax(ProductInfoVo vo, HttpSession session){
//        PageInfo splitage = productService.splitage(page, Page_Size);
     PageInfo splitage = productService.splitPageVo(vo,Page_Size);

            session.setAttribute("info",splitage);
    }

    @ResponseBody
    @RequestMapping("/ajaxImg")
    public Object ajaxImg(MultipartFile pimage,HttpServletRequest request)  {
      saveFilename = FileNameUtil.getUUIDFileName() + FileNameUtil.getFileType(pimage.getOriginalFilename());
        String realPath = request.getServletContext().getRealPath("/image_big");
        try {
            pimage.transferTo(new File(realPath+File.separator+saveFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject object =new JSONObject();
        object.put("imgurl",saveFilename);
        return object.toString();
    }
    @RequestMapping("/save")
    public String save(ProductInfo info,HttpServletRequest request){
        info.setpImage(saveFilename);
        info.setpDate(new Date());
        int save = -1;
             save   = productService.save(info);
        if (save !=-1){
            request.setAttribute("msg","增加成功");
        }else {
            request.setAttribute("msg","增加失败");
        }
        saveFilename = "";
        return "forward:/pro/split";
    }

    @RequestMapping("/one")
    public String update(int pid,ProductInfoVo vo, Model model,HttpSession session){
        ProductInfo save = productService.update(pid);
        model.addAttribute("prod",save);
        session.setAttribute("proVo",vo);
        return  "update";
    }

    @RequestMapping("/update")
    public String update(ProductInfo info,HttpServletRequest request){
        if (!saveFilename.equals("")){
            info.setpImage(saveFilename);
        }
        int num = -1;
        num = productService.update2(info);
        if (num !=-1){
            request.setAttribute("msg","更新成功");
        }else {
            request.setAttribute("msg","更新失败");
        }
        return "forward:/pro/split";
    }
    @RequestMapping("/delete")
    public String delete(int pid,ProductInfoVo vo,HttpServletRequest request){
        int num = -1;
         num = productService.del(pid);
         if (num !=-1){
             request.setAttribute("msg","删除成功");
             request.getSession().setAttribute("deleteProdVo",vo);
         }else {
             request.setAttribute("msg","删除失败");
         }

         return "forward:/pro/delectsolit";


    }
    @ResponseBody
    @RequestMapping(value = "/delectsolit",produces = "text/html;charset=utf-8")
    public Object delectsolit(HttpServletRequest request){
        PageInfo info = null;
        Object vo = request.getSession().getAttribute("deleteProdVo");
        if(vo != null){
            info = productService.splitPageVo((ProductInfoVo)vo,Page_Size);
        }else {
            info = productService.splitage(1, Page_Size);
        }
        request.getSession().setAttribute("info",info);
        return request.getAttribute("msg");

    }
    @RequestMapping("/deletebeach")
    public String deletebeach(String pids,HttpServletRequest request){
        String[] split = pids.split(",");

        int num = -1;
        num = productService.deletebeath(split);
        if (num >0){
            request.setAttribute("msg","批量删除成功");
        }else {
            request.setAttribute("msg","批量删除失败");
        }

        return "forward:/pro/delectsolit";
    }
    @ResponseBody
    @RequestMapping("/condiction")
    public void condiction(ProductInfoVo vo, HttpSession session){
        List<ProductInfo> productInfos = productService.selectBycondictioon(vo);
        session.setAttribute("list",productInfos);
    }
}
