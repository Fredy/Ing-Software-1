package com.springjpa.domain;

import java.util.ArrayList;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; //NOTE: I think "URL file" might be a possible id
	@Column (name ="name")
	private String name;
	private boolean active;
	private float avgRating;
	private long sumRatings; /// We need sumRating for calculate avgRating -> avgRating = (sum(ratings)/timesRating)
	private int timesRating; /// We need timesRating for calculate avgRating -> avgRating = (sum(ratings)/timesRating)
	private long timesPlayed;
	
	@ManyToMany(mappedBy="songs")
	private List<Album> albums;

	private URL file;

	public Song(String name){
	    this.name = name;
        active = true;
        avgRating = 0f;
        timesRating = 0;
        timesPlayed = 0;
        albums = new ArrayList<Album>();
    }
	
	public Integer getId() {
		return id;
	}

    public void setId(Integer id) {
        this.id = id;
    }
	
	public void updateTimesPlayed(){
		timesPlayed++;
	}
	public boolean updateAvgRating(){
		avgRating = sumRatings / timesRating;
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

    public void setName(String name) {
        this.name = name;
    }

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public float getAvgRating() {
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

}
