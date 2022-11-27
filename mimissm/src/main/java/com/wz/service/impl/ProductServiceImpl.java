package com.wz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wz.domain.ProductInfo;
import com.wz.domain.ProductInfoExample;
import com.wz.domain.vo.ProductInfoVo;
import com.wz.mapper.ProductInfoMapper;
import com.wz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductInfoMapper productInfoMapper;
    @Override
    public List<ProductInfo> getAll() {
        List<ProductInfo> productInfos = productInfoMapper.selectByExample(new ProductInfoExample());
        return productInfos;
    }

    @Override
    public PageInfo splitage(int pagnum, int pagsize) {
        PageHelper.startPage(pagnum,pagsize);
        ProductInfoExample example = new ProductInfoExample();
        example.setOrderByClause("p_id desc");
        List<ProductInfo> list = productInfoMapper.selectByExample(example);
        PageInfo<ProductInfo> pageInfo =new PageInfo<>(list);
        return pageInfo;

    }

    @Override
    public int save(ProductInfo info) {
        int insert = productInfoMapper.insertSelective(info);
        return insert;
    }

    @Override
    public ProductInfo update(int pid) {
        ProductInfo i = productInfoMapper.selectByPrimaryKey(pid);
        return i;
    }

    @Override
    public int update2(ProductInfo info) {
        int i = productInfoMapper.updateByPrimaryKeySelective(info);
        return i;
    }

    @Override
    public int del(int pid) {
        int i = productInfoMapper.deleteByPrimaryKey(pid);
        return i;
    }

    @Override
    public int deletebeath(String [] pids) {
        int i = productInfoMapper.deleteBeach(pids);
        return i;
    }

    @Override
    public List<ProductInfo> selectBycondictioon(ProductInfoVo vo) {
     List<ProductInfo> productInfo =productInfoMapper.seletBycondiction(vo);
        return productInfo;
    }

    @Override
    public PageInfo<ProductInfo> splitPageVo(ProductInfoVo vo, int pageSize) {
        PageHelper.startPage(vo.getPage(),pageSize);
        List<ProductInfo> productInfos = productInfoMapper.seletBycondiction(vo);
        return new PageInfo<>(productInfos);
    }
}
