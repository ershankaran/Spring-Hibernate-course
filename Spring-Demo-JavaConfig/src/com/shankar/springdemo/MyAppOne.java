package com.shankar.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppOne {
	
	public static void main(String args[]) {
		
	
	
	AnnotationConfigApplicationContext ctx =
			new AnnotationConfigApplicationContext(Config.class);
	
	Coach c1 = ctx.getBean("tennisCoach",Coach.class);
	Coach c2 = ctx.getBean("trackCoach",Coach.class);
	Coach c3 = ctx.getBean("baseballCoach",Coach.class);
	
	System.out.println(c1.getDailyWorkout());
	System.out.println(c1.getDailyFortune());
	
	System.out.println(c2.getDailyWorkout());
	System.out.println(c2.getDailyFortune());
	
	System.out.println(c3.getDailyWorkout());
	System.out.println(c3.getDailyFortune());
	
	ctx.close();
	
	
	}
}
