package com.djt.reg.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djt.reg.common.R;
import com.djt.reg.domain.Category;
import com.djt.reg.service.CategoryService;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * ClassName: CategoryController
 * Package: com.djt.reg.controller
 * Description:
 *
 * @Author ????
 * @Create 2022/11/26 12:40
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @PostMapping
    public R<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return R.success("新增分类成功");
    }

    @GetMapping("/page")
    public R<Page> getPage(int page, int pageSize, String name) {
        Page page1 = new Page(page, pageSize);
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper();
//        lambdaQueryWrapper.like(StringUtils.isNotEmpty(name), Category::getName,name);
        lambdaQueryWrapper.orderByAsc(Category::getSort);
        Page page2 = categoryService.page(page1, lambdaQueryWrapper);
        return R.success(page2);
    }

    @DeleteMapping
    public R<String> delete( Long ids) {
        log.info("删除分类，id为：{}", ids);

//        categoryService.removeById(id);
        categoryService.remove(ids);

        return R.success("分类信息删除成功");
    }

    /**
     * 根据id修改分类信息
     *
     * @param category
     * @return
     */
    @PutMapping
    public R<String> update(@RequestBody Category category) {
        log.info("修改分类信息：{}", category);

        categoryService.updateById(category);

        return R.success("修改分类信息成功");
    }

    @GetMapping("/list")
    public R<List<Category>> getCategprySort(Integer type){
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(type !=null,Category::getType,type);
        List<Category> list = categoryService.list(lambdaQueryWrapper);
        return R.success(list);
    }
}
