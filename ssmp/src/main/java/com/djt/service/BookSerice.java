package com.djt.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djt.domain.Book;
import org.apache.logging.log4j.util.Strings;

public interface BookSerice extends IService<Book> {
    public Boolean saveBook(Book book) ;

    public Boolean modify(Book book) ;

    public Boolean deleteByid(Integer id);

    public IPage<Book> getPage(int currentPage, int pageSize);

    public IPage<Book> getPage(int currentPage, int pageSize, Book book) ;
}
