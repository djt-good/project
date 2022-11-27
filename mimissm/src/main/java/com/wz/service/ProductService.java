package com.wz.service;

import com.github.pagehelper.PageInfo;
import com.wz.domain.ProductInfo;
import com.wz.domain.vo.ProductInfoVo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> getAll();
    PageInfo splitage(int pagnum,int pagsize);

    int save(ProductInfo info);
    ProductInfo update(int pid);
    int update2(ProductInfo info);

    int del(int pid);
    int deletebeath(String[] pids);
    List<ProductInfo> selectBycondictioon(ProductInfoVo vo);
    public PageInfo splitPageVo(ProductInfoVo vo,int pageSize);


}
