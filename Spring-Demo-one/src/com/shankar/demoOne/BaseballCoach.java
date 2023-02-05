package com.shankar.demoOne;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Baseball - run batting practise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public void doStartMethod() {
		System.out.println("Baseball bean started");
	}
	
	public void doStopMethod() {
		System.out.println("Baseball bean stopped");
	}
	

}
