package com.itheima.item.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

public class ItemServcieImplTest {

    @Test
    public void testItem() throws IOException {
        ApplicationContext atc = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        //阻塞线程
        System.in.read();
    }

}