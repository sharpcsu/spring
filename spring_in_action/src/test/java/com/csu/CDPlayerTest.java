package com.csu;

import com.csu._2装配Bean.CDPlayerConfig;
import com.csu._2装配Bean.CompactDisc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sharp on 2017/7/13 - 15:32
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定测试启动器
@ContextConfiguration(classes = CDPlayerConfig.class) //加载配置
public class CDPlayerTest {
    @Autowired
    private CompactDisc compactDisc;
    
    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
