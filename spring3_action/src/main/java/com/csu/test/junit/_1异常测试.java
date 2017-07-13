package com.csu.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by sharp on 2017/7/11 - 18:20
 */
public class _1异常测试 {
    User user;
    
    @Before
    public void init() {
        user = null;
    }
    
    //预期抛出空指针异常
    @Test(expected=NullPointerException.class)
    public void method() {
        assertNotNull(user.getUserName());
    }
    
    @After
    public void destroy() {
    
    }
}

class User{
    private String userName;
    private int age;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}