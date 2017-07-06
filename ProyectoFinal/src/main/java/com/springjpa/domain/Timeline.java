package com.springjpa.domain;
import java.util.List;
import java.util.Vector;

import javax.persistence.*;

@Entity
@Table(name = "timeline")
public class Timeline {
	
	@Id
	@Column(name = "idTimeline")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id;
	
	@OneToMany
	@JoinColumn(name="SongsPlayed")
    private List<Played> songsPlayed;
    
    @OneToOne(mappedBy="timeline")
    private User owner;

    //Llamado por el constructor del usuario XD
    public Timeline(User owner){
    	this.owner = owner;
    	this.songsPlayed =  new Vector<Played>();
	}

	public Timeline(){
		this.songsPlayed = new Vector<Played>();
	}

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
