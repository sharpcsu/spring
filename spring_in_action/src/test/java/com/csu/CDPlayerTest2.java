package com.csu;

import com.csu._2装配Bean.SgtPeppers;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by sharp on 2017/7/13 - 16:10
 */
public class CDPlayerTest2 {
    @Test
    public void method() {
        // TODO: 2017/7/13 配置文件为什么会找不到
        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        
        SgtPeppers sgtPeppers = (SgtPeppers) context.getBean("sgtPeppers");
        sgtPeppers.play();
    }
}
