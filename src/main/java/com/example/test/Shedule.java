package com.example.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Shedule {
    @Scheduled(cron = "0 29-31 * * * *")
    public void startProcess(){
        System.out.println(new Date()+"Duong Van Thanh");
    }
}
