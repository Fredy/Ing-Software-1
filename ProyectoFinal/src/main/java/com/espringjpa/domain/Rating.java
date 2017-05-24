package com.espringjpa.domain;
import java.util.Date;

public class Rating {
	private Song songRated;
	private User userWhoRated;
	private Date dateRated;
	private int rate;
	
	public boolean rateSong(Song song, User user){
		//do something
		return true;
	}
	
	public Song getSongRated() {
		return songRated;
	}
	public void setSongRated(Song songRated) {
		this.songRated = songRated;
	}
	public User getUserWhoRated() {
		return userWhoRated;
	}
	public void setUserWhoRated(User userWhoRated) {
		this.userWhoRated = userWhoRated;
	}
	public Date getDateRated() {
		return dateRated;
	}
	public void setDateRated(Date dateRated) {
		this.dateRated = dateRated;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
