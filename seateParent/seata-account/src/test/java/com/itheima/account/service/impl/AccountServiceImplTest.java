package com.itheima.account.service.impl;

import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.*;
//@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceImplTest {
   /**
    * // 指定配置类使用 classes 参数
    * @ContextConfiguration(classes = SpringConfiguration.class)
    * // 指定配置文件使用 locations 参数
    * //@ContextConfiguration(locations = "classpath:applicationContext.xml")
    * @throws IOException
    */
   @Test
    public void accountTest() throws IOException {
       ApplicationContext atc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");


      System.out.println("account start");
       //阻塞线程
       System.in.read();
   }
  
}