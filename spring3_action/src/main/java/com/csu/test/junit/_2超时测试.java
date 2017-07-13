package com.csu.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sharp on 2017/7/11 - 18:36
 */
public class _2超时测试 {
    @Before
    public void init() {
    
    }
    
    @Test(timeout = 10)//10ms
    public void method() {
    
    }
    
    @After
    public void destroy() {
    
    }
}
