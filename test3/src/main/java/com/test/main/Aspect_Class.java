package com.test.main;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.logging.Logger;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Aspect_Class {
	private Logger logger = Logger.getLogger(VehicleServices.class.getName());

	@After("execution(public * playMusic((boolean vehicleStarted, Song song))")
	 private String Aftermethood(Temporal start,Joinpoint song) {
		 System.out.println("Aspect after method------------------------------------------ ");
		 logger.info("method execution end");
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			logger.info("Time took to execute the method : " + timeElapsed);
	return "Aspect method---------------------"; 
	}


		


}
