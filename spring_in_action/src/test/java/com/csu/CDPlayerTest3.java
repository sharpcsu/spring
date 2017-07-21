package com.csu;

import com.csu._2装配Bean.CDPlayer;
import com.csu._2装配Bean.CDPlayerConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sharp on 2017/7/14 - 11:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest3 {
    
    @Autowired
    CDPlayer player;
    
    @Test
    public void play() {
        player.play();
    }
}
