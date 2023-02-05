package com.shankar.demoOne;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService2;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis - Netting practise for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService2.getFortune();
	}

	public FortuneService getFortuneService2() {
		return fortuneService2;
	}

	public void setFortuneService2(FortuneService fortuneService) {
		this.fortuneService2 = fortuneService;
	}

	public void doStartMethod() {
		System.out.println("Tennis bean started");
	}
	
	public void doStopMethod() {
		System.out.println("Tennis bean stopped");
	}
	
}
