package com.espringjpa;

import com.espringjpa.domain.PlayList;
import com.espringjpa.repository.TimelineRepository;
import com.espringjpa.repository.PlayListRepository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ProyectoFinalApplication {

	@Autowired
	TimelineRepository timelineRepository;
	
	@Autowired
	PlayListRepository playListRepository;
	

	@RequestMapping("/playLists")
	@ResponseBody
	Collection<PlayList> listarPlayLists() {
		return playListRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
