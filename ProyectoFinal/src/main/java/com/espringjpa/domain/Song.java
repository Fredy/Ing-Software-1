package com.espringjpa.domain;

import java.util.List;
import java.net.URL;
/*
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
*/
import javax.persistence.*;

@Entity
@Table (name="Song")
public class Song {
	
	@Id
	private Integer id; //NOTE: I think "URL file" might be a possible id
	@Column (name ="name")
	private String name;
	private boolean active;
	private int avgRating;
	private long timesPlayed;
	
	@ManyToMany(mappedBy="songs")
	private List<Album> albums;

	private URL file;
	
	public Integer getId() {
		return id;
	}
	
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
	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	public URL getFile() {
		return file;
	}
	//public void setFile(Url file) { this.file = file; } // this field is only for read
	
}
