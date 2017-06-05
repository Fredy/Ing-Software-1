package com.springjpa;

import java.util.Collection;

import javax.annotation.PostConstruct;

import com.springjpa.domain.*;
import com.springjpa.repository.*;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ProyectoFinalApplication {

	@Autowired
	TimelineRepository timelineRepository;
	
	@Autowired
	PlayListRepository playListRepository;

	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	ArtistRepository artistRepository;

    @Autowired
	SongRepository songRepository;

    @Autowired
	UserRepository userRepository;

	
//	@PostConstruct
//	void init() {
//		PlayList pl1 = new PlayList();
//		pl1.setName("PlayList1");
//		playListRepository.save(pl1);
//	}
    @PostConstruct
    void init(){
        Song s1 = new Song("alguna cancion");
        songRepository.save(s1);
    }

	@RequestMapping("/playLists")
	@ResponseBody
	Collection<PlayList> showPlayLists() {
		return playListRepository.findAll();
	}

	@RequestMapping("/artists")
	@ResponseBody
	Collection<Artist> listarArtists(){
		return artistRepository.findAll();
	}

	@RequestMapping("/albums")
	@ResponseBody
	Collection<Album> listarAlbums(){
		return albumRepository.findAll();
	}

	@RequestMapping("/giveArtists")
	@ResponseBody
	Collection<Artist> giveArtists(@RequestParam String idOfAlbum){
		return albumRepository.getArtists(Long.parseLong(idOfAlbum));
	}

	@RequestMapping("/songs")
    @ResponseBody
    Collection<Song> showSongs(){
	    return songRepository.findAll();
    }

	@RequestMapping("/users")
	@ResponseBody
	Collection<User> showUsers(){
		return userRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
