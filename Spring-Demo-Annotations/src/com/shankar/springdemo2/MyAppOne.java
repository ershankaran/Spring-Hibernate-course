package com.shankar.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c1 =  ctx.getBean("theTrackCoach",Coach.class);
		Coach c2 =  ctx.getBean("cricketCoach",Coach.class);
		Coach c3 =  ctx.getBean("baseballCoach",Coach.class);
		
		
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		
		System.out.println(c2.getDailyWorkout());
		System.out.println(c2.getDailyFortune());
		
		System.out.println(c3.getDailyWorkout());
		System.out.println(c3.getDailyFortune());
		
		ctx.close();

	}

}
