package com.espringjpa.domain;

import java.util.List;
import java.net.URL;

public class Song {
	private String name;
	private boolean active;
	private int avgRating;
	private long timesPlayed;
	private List<Artist> artist;
	private URL file;
	
	public boolean updateTimesPlayed(){
		//do something
		return true;
	}
	public boolean updateAvgRating(){
		//do something
		return true;
	}
	public void activate(){
		setActive(true);
	}
	public void deactivate(){
		setActive(false);
	}
	
	public String getName() {
		return name;
	}
	//public void setName(String name) { this.name = name; } // this field is only for read
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public long getTimesPlayed() {
		return timesPlayed;
	}
	public void setTimesPlayed(long timesPlayed) {
		this.timesPlayed = timesPlayed;
	}
	
	public List<Artist> getArtist() {
		return artist;
	}
	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}
	public URL getFile() {
		return file;
	}
	//public void setFile(Url file) { this.file = file; } // this field is only for read
	
}
