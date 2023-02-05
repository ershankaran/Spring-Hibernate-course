package com.shankar.demoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppOne {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c1 = ctx.getBean("myCoach",Coach.class);
		Coach c2 = ctx.getBean("baseballCoach",Coach.class);
		CricketCoach c3 = ctx.getBean("cricketCoach",CricketCoach.class);
		TennisCoach c4 = ctx.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		
		System.out.println(c2.getDailyWorkout());
		System.out.println(c2.getDailyFortune());
		
		System.out.println(c3.getDailyWorkout());
		System.out.println(c3.getDailyFortune());
		
		System.out.println(c3.getTeamEmail());
		System.out.println(c3.getTeamName());
		
		System.out.println(c4.getDailyWorkout());
		System.out.println(c4.getDailyFortune());
		
		ctx.close();

	}

}
