package com.espringjpa;

import com.espringjpa.repository.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;

@SpringBootApplication
public class ProyectoFinalApplication {

	@Autowired
	TimelineRepository timelineRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
