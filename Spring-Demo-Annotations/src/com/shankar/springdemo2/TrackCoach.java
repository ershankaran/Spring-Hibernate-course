package com.shankar.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theTrackCoach")
public class TrackCoach implements Coach{
	
	
	private FortuneService fortuneService;
	
	
    @Autowired    
	public TrackCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track -run 5 miles";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
