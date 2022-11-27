package com.djt.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.domain.Book;
import com.djt.mapper.BookMapper;
import com.djt.service.BookSerice;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookSericeImpl extends ServiceImpl<BookMapper, Book> implements BookSerice {

    @Autowired
    BookMapper bookMapper;

    public Boolean saveBook(Book book) {
        return baseMapper.insert(book) > 0;
    }

    public Boolean modify(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    public Boolean deleteByid(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        bookMapper.selectPage(page,null);
        return page;
    }

    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        lqw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        lqw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        IPage page = new Page(currentPage,pageSize);
        bookMapper.selectPage(page,lqw);
        return page;
    }
}
