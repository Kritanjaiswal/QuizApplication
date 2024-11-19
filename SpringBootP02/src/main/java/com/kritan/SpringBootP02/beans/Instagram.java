package com.kritan.SpringBootP02.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Instagram {
    public Instagram(){
        System.out.println("Instagram Constructor Called");
    }
    @Autowired
    Reels reels;

    @Autowired
    LocalDateTime ldt;
    public void doing(){
        reels.dance();
    }
    public void dateTime(){
        System.out.println("Current Date and Time"+ ldt);
    }
}
