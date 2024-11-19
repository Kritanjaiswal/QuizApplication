package com.kritan.SpringBootP03.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FlipkartPayment {
    public FlipkartPayment(){
        System.out.println("FlipkartPayment Constructor Called");
    }
    @Autowired ///it will inject dependency via byType
//    @Qualifier("juspay") // this annotation help us to transform from byType to byName Dependency Injection
    Partners pat;
    @Value("${kritan.url}")
    private String url;// value of url is picked from application.properties file by using @Value annotation
    public void pay(){
        System.out.println(url);
        pat.payment();
    }
}
