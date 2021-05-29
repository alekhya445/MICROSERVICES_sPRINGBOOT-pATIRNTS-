package com.springboot.patients.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaClient

public class PatientsRecord implements CommandLineRunner {

	//for Single application.properties value annotation is best//
	@Value("${record}")
	String record;
	
	public static void main(String[] args) {
		SpringApplication.run(PatientsRecord.class, args);
		// TODO Auto-generated method stub

	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(record);
//		// TODO Auto-generated method stub
//		
//	}
	
	public void run(String... args) throws Exception {
		System.out.println(record);
		// TODO Auto-generated method stub
		
	}

}
