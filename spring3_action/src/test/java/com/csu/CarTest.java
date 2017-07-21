package com.csu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sharp on 2017/7/14 - 14:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CarTest {
    @Test
    public void method() {
        String xmlPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context);
    }
}
