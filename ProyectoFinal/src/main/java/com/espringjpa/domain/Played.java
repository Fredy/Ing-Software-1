package com.espringjpa.domain;
import java.util.Date;

public class Played {
	private Song songPlayed;
	private User UserWhoPlayed;
	private Date datePlayed;
	
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
		return UserWhoPlayed;
	}
	public void setUserWhoPlayed(User userWhoPlayed) {
		UserWhoPlayed = userWhoPlayed;
	}
	public Date getDatePlayed() {
		return datePlayed;
	}
	public void setDatePlayed(Date datePlayed) {
		this.datePlayed = datePlayed;
	}
}
