package com.wz.test;

import com.wz.domain.ProductInfo;
import com.wz.domain.vo.ProductInfoVo;
import com.wz.mapper.ProductInfoMapper;
import com.wz.mapper.ProductTypeMapper;
import org.apache.commons.fileupload.MultipartStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-*.xml"})
public class Mytest {
    @Autowired
    ProductInfoMapper productInfoMapper;
    @Test
    public void  test(){
        ProductInfoVo vo =new ProductInfoVo();
        List<ProductInfo> productInfos = productInfoMapper.seletBycondiction(vo);
     productInfos.forEach(productInfo -> System.out.println(productInfo));

    }
}
