package com.espringjpa.domain;
import java.util.Date;
import javax.persistence.*;

//@Entity
//@Table(name="rating")
public class Rating {
	//@Id
	private long id;
	
	
	//@ManyToOne
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
	public User getUserWhoRated(){
		return userWhoRated;
	}
	
	public void setUserWhoRated(User user) {
		this.userWhoRated = user;
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
