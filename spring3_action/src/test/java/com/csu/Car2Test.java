package com.csu;

import com.csu._3ioc.Car2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sharp on 2017/7/14 - 17:02
 */

public class Car2Test {
    @Test
    public void mehtod() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
    }
}
