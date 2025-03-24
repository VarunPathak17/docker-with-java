package com.restful.application.scheduled;

import com.restful.application.service.CronJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    CronJobService cronJobService;

    @Scheduled(cron= "0 * * * * *") //=> For 1 minute
    public void scheduled(){
        cronJobService.dummyMethod();
    }
}
