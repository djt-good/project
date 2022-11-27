package com.wz.listener;

import com.wz.domain.ProductType;
import com.wz.service.ProductTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public class ProductTypeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-*.xml");
        ProductTypeService bean = applicationContext.getBean(ProductTypeService.class);
        List<ProductType> all = bean.getAll();

        sce.getServletContext().setAttribute("typelist",all);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
