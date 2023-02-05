package com.shankar.demoOne;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;	
	
	private String teamName;
	private String teamEmail;
	

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket -Bowling practise for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doStartMethod() {
		System.out.println("Cricket bean started");
	}
	
	public void doStopMethod() {
		System.out.println("Cricket bean stopped");
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamEmail() {
		return teamEmail;
	}

	public void setTeamEmail(String teamEmail) {
		this.teamEmail = teamEmail;
	}
	
	

}
