package com.springjpa.domain;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="rating")
public class Rating {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="songRated")
	private Song songRated;
	@ManyToOne
	@JoinColumn(name="userWhoRated")	
	private User userWhoRated;

	private Date dateRated;
	private int rate;
	
	public boolean rateSong(Song song, User user){
        
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
