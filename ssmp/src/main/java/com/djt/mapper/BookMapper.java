package com.djt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djt.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
