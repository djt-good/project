package com.djt.reg.service;

import com.djt.reg.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author Sadness
 * @description 针对表【category(菜品及套餐分类)】的数据库操作Service
 * @createDate 2022-11-25 16:29:30
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
