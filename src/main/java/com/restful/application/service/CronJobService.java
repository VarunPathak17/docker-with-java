package com.restful.application.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CronJobService {

    public void dummyMethod() {
        // Your task logic goes here
        System.out.println("Scheduled task executed at: " + new Date());
    }
}
