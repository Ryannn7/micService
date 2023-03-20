package com.itheima.order.service.impl;

import com.itheima.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ={ "classpath:spring/applicationContext.xml"})
public class OrderInfoServiceImplTest {



    @Test
    public void testOrder(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
      //  OrderInfoService orderInfoService = atc.getBean(OrderInfoService.class);
        OrderInfoService orderInfoService = (OrderInfoService)atc.getBean("orderInfoService");
        orderInfoService.create("itheima","1",1);
    }

}