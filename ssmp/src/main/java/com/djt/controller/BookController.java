package com.djt.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.djt.domain.Book;
import com.djt.service.BookSerice;
import com.djt.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController{
    @Autowired
    BookSerice bookSerice;

    @ResponseBody

    @GetMapping
    public Result getAllbooks() {
        return new Result(true, bookSerice.list());
    }

    @PostMapping
    public Result save(@RequestBody Book book) throws Exception {
        if(book.getName().equals("c")){
            throw new Exception();
        }
        return new Result(true,bookSerice.save(book)) ;
    }

    @DeleteMapping("/{id}")
    public Result delectByid(@PathVariable("id") Integer id){
        return new Result(true,bookSerice.deleteByid(id));
    }

    @PutMapping
    public Result updateByid(@RequestBody Book book){
        return new Result(true,bookSerice.modify(book),"更新成功！！！！！");
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id){
        return new Result(true,bookSerice.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public Result getAllByPageAndfind(@PathVariable("currentPage") Integer currentPage,
                                      @PathVariable("pageSize") Integer pageSize,
                                      Book book){
        IPage<Book> page = bookSerice.getPage(currentPage, pageSize, book);
        if (currentPage >page.getPages()){
            page = bookSerice.getPage((int)page.getPages(), pageSize, book);
        }
  return new Result(true,page,null);
    }
}
