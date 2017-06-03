package com.springjpa;

import java.util.Collection;

import javax.annotation.PostConstruct;

import com.springjpa.domain.Song;
import com.springjpa.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.springjpa.domain.PlayList;
import com.springjpa.repository.PlayListRepository;
import com.springjpa.repository.TimelineRepository;

@Controller
@SpringBootApplication
public class ProyectoFinalApplication {

	@Autowired
	TimelineRepository timelineRepository;
	
	@Autowired
	PlayListRepository playListRepository;

	@Autowired
    SongRepository songRepository;
	
//	@PostConstruct
//	void init() {
//		PlayList pl1 = new PlayList();
//		pl1.setName("001");
//		pl1.setId(System.currentTimeMillis());
//		playListRepository.save(pl1);
//	}
    @PostConstruct
    void init(){

        Song s1 = new Song("el pio pio");
        songRepository.save(s1);

    }

    @RequestMapping("/songs")
    @ResponseBody
    Collection<Song> ShowSongs() {
        return songRepository.findAll();
    }

	@RequestMapping("/playLists")
	@ResponseBody
	Collection<PlayList> listarPlayLists() {
		return playListRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
