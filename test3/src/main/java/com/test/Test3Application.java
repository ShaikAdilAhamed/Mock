package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.main.Person;
import com.test.main.Song;
import com.test.main.VehicleServices;

@SpringBootApplication
public class Test3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = SpringApplication.run(Test3Application.class, args);

		VehicleServices p = context.getBean(VehicleServices.class);
//		System.out.println(p.getName());
//		System.out.println(p.getVehicle().getName());
//	
	
	
		Song song= new Song();
		song.setTitle("Title song");
		song.setSingerName("Arijit");
		//VehicleServices vehicleServices= new VehicleServices();
		String playMusic = p.playMusic(true, song);
		System.out.println(playMusic);
	}

}
