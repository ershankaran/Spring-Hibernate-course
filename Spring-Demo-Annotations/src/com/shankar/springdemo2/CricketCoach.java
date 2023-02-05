package com.shankar.springdemo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket - run 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void postConstructM() {
		System.out.println("Cricket bean started");
	}
	
	@PreDestroy
	public void preDestroyM() {
		System.out.println("Cricket bean stopped");
	}


	
}
