package com.espringjpa.domain;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "timeline")
public class Timeline {
	
	@Id
    private long id;
	
	@OneToMany
	@JoinColumn(name="SongPlayed")
    private List<Played> songsPlayed;
    
    @OneToOne(mappedBy="timeline")
    private User owner;

    public boolean show(){
		//do something
		return true;
	}

    public void addSongPlayed (Played newSong){
        songsPlayed.add(newSong);
    }

    public void removeSongPlayed (Played songToDelete){
        songsPlayed.remove(songToDelete);
    }

    public List<Played> getSongsPlayed() {
		return songsPlayed;
	}
	public void setSongsPlayed(List<Played> songsPlayed ) {
		this.songsPlayed = songsPlayed;
	}

	public User getUser() {
		return owner;
	}
	public void setUser(User owner) {
		this.owner = owner;
	}
}
