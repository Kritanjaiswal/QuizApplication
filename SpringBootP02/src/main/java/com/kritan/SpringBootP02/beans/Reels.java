package com.kritan.SpringBootP02.beans;

import org.springframework.stereotype.Component;

@Component
public class Reels {
    public Reels(){
        System.out.println("Reels Constructor Called");
    }
    public void dance(){
        System.out.println("Ravi naach raha hai");
    }
}
