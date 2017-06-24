package com.springjpa.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@Entity
@Table (name="Song")
public class Song {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column (name ="name")
	private String name;
	private boolean active;
	private float avgRating;
	private long sumRatings; /// We need sumRating for calculate avgRating -> avgRating = (sum(ratings)/timesRating)
	private int timesRated; /// We need timesRating for calculate avgRating -> avgRating = (sum(ratings)/timesRating)
	private long timesPlayed;
    private int duration;
	
	@ManyToMany(mappedBy="songs")
	private List<Album> albums;

	private URL file;

	public Song(String name){
	    this.name = name;
		this.active = true;
		this.avgRating = 0f;
		this.timesRated = 0;
		this.timesPlayed = 0;
		this.duration = 0;
		this.albums = new ArrayList<Album>();
    }

    public Song(){
		this.albums = new ArrayList<Album>();
	}
	
	public Long getId() {
		return id;
	}

    public void setId(Long id) {
        this.id = id;
    }
	
	public void updateTimesPlayed(){
		this.timesPlayed++;
	}
	public boolean updateAvgRating(){
		avgRating = sumRatings / timesRated;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
