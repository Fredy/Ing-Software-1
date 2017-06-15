package com.springjpa.domain;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="played")
public class Played {
	
	@Id
	private long id;

	@ManyToOne
	@JoinColumn(name="TimelineOwner")
	private Song songPlayed;

	@ManyToOne
	@JoinColumn(name="UserWhoPlayed")
	private User userWhoPlayed;
	private Date datePlayed;

	Played(User u,Song sp){
        userWhoPlayed = u;
        songPlayed = sp;
        datePlayed = new Date();
    }
	
	public boolean updateTimesPlayed(Song song, User user){
		//do something
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

