package com.springjpa;

import java.util.Collection;

import javax.annotation.PostConstruct;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;
import com.springjpa.domain.Song;
import com.springjpa.repository.*;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springjpa.domain.PlayList;

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


	
//	@PostConstruct
//	void init() {
//		PlayList pl1 = new PlayList();
//		pl1.setName("001");
//		pl1.setId(System.currentTimeMillis());
//		playListRepository.save(pl1);
//	}

	@RequestMapping("/playLists")
	@ResponseBody
	Collection<PlayList> listarPlayLists() {
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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}
