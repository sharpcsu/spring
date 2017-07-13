package com.csu._2装配Bean;

import org.springframework.stereotype.Component;

/**
 * Created by sharp on 2017/7/13 - 15:17
 */
@Component //组件类
public class SgtPeppers implements CompactDisc {
    private String title = "sgt peppers";
    private String artist = "the beatles";
    
    @Override
    public void play() {
        System.out.println("playing " + title + "by " + artist);
    }
}
