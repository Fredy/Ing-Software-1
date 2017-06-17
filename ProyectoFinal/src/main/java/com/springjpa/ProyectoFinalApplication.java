package com.springjpa;

import java.sql.Time;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;

import com.springjpa.controller.SongController;
import com.springjpa.controller.UserController;
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
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
//@EnableWebMvc
@SpringBootApplication
public class ProyectoFinalApplication {

	@Autowired //TODO: Remove after tests
	TimelineRepository timelineRepository; //TODO: Remove after tests

	@Autowired
	PlayListRepository playListRepository;

	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	ArtistRepository artistRepository;

    @Autowired
	SongRepository songRepository;

	@Autowired
	PlayedRepository playedRepository;

	@Autowired // TODO: remove this ???
	UserRepository userRepository;

    @PostConstruct
    void init() {


    	// USER
        for (int i = 1 ; i<= 10; i++) {
            Timeline tml = new Timeline();

            timelineRepository.save(tml);
            User usr = new User("USER_" + Integer.toString(i),
					"EMAIL" + Integer.toString(i), true,
                    "USRNAME_" + Integer.toString(i),
                    "PSWRD_" + Integer.toString(i), Date.from(Instant.EPOCH),tml);
            userRepository.save(usr);

            Timeline tml1 = new Timeline();
            timelineRepository.save(tml1);

            User usr1 = new User("USER_2" + Integer.toString(i),
					"EMAIL_" + Integer.toString(i), true,
                    "USRNAME_2" + Integer.toString(i),
                    "PSWRD_2" + Integer.toString(i), Date.from(Instant.EPOCH),tml1);
            userRepository.save(usr1);

            usr.getFollowedUsers().add(usr1);
            userRepository.save(usr);
            usr1.getFollowedUsers().add(usr);
            userRepository.save(usr1);
        }

        Timeline tml1 = new Timeline();

        timelineRepository.save(tml1);
        User usr1 = new User("Pepito Arce", "esdsd@sdsd.com",true, "pp32",
                             "hola", Date.from(Instant.EPOCH),tml1);
        userRepository.save(usr1);

		PlayList pl1 = new PlayList("001", usr1);
		playListRepository.save(pl1);

		//SONGS

		Song s1 = new Song("macarena");
		songRepository.save(s1);

        Song s2 = new Song("baila");
        songRepository.save(s2);


        Played p1 = new Played(usr1,s1);
		playedRepository.save(p1);

		tml1.addSongPlayed(p1);
		timelineRepository.save(tml1);
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

    /*
	@RequestMapping("/songs")
	@ResponseBody
	Collection<Song> showSongs(){
		return songRepository.findAll();
	}

	@RequestMapping("/playeds")
	@ResponseBody
	Collection<Played> showPlayeds(){
		return playedRepository.findAll();
	}
    */


    public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

}