package com.springboot.nag;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingComponent {

	@Scheduled(fixedDelay = 10000, initialDelay = 60000)
	private void fixedScheduler() {

		System.out.println("Fixed Scheduler job is running:" + new Date());

	}

	@Scheduled(cron = "0 3 15 * * *")
	private void cronScheduler() {

		System.out.println("Cron Scheduler job is running:" + new Date());

	}

	@Scheduled(fixedRate = 5000)
	private void fixedRateScheduler() {

		System.out.println("Fixed rate Scheduler job is running:" + new Date());

	}

}
