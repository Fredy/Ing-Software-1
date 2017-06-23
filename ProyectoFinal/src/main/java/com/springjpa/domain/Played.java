package com.springjpa.domain;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="played")
public class Played {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name="songPlayed")
	private Song songPlayed;

	@ManyToOne
	@JoinColumn(name="UserWhoPlayed")
	private User userWhoPlayed;

	private Date datePlayed;

	public Played(User u,Song sp){
        this.userWhoPlayed = u;
        this.songPlayed = sp;
        datePlayed = new Date();
    }

    public Played(){

    }
	
	public boolean updateTimesPlayed(Song song, User user){
        songPlayed.updateTimesPlayed(); /// check this, because I don't remember why we need Song and User parameters
		return true;
	}
	
	public Song getSongPlayed() {
	    return songPlayed;
	}
	public void setSongPlayed(Song songPlayed) {
	    this.songPlayed = songPlayed;
	}
	
	public User getUserWhoPlayed() {
	    return userWhoPlayed;
	}

	public void setUserWhoPlayed(User userWhoPlayed) {
	    userWhoPlayed = userWhoPlayed;
	}

	public Date getDatePlayed() {
	    return datePlayed;
	}
	public void setDatePlayed(Date datePlayed) {
	    this.datePlayed = datePlayed;
	}
}

