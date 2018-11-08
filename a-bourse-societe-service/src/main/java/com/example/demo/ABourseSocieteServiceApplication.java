package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import org.springframework.context.ApplicationContext;

import com.example.demo.dao.SocieteRepository;
import com.example.demo.entities.Societe;

@EnableDiscoveryClient
@SpringBootApplication
public class ABourseSocieteServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ABourseSocieteServiceApplication.class, args);
		SocieteRepository societeRepository = ctx.getBean(SocieteRepository.class);

		Stream.of("A", "B", "C").forEach(s -> societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s -> System.out.println(s.getNameSociete()));
	}
	
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ABourseSocieteServiceApplication.class) ;
		
	}
}
