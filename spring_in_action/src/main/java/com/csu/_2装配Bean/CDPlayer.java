package com.csu._2装配Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sharp on 2017/7/14 - 11:29
 */
@Component
public class CDPlayer {
    CompactDisc cd;
    
    @Autowired //自动装配
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
    
    public void play() {
        cd.play();
    }
}
