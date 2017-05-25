package com.espringjpa.domain;
import java.util.Vector;

public class Timeline {
    private Vector<Played> songsPlayed;
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

    public Vector<Played> getSongsPlayed() {
		return songsPlayed;
	}
	public void setSongsPlayed(Vector<Played> songsPlayed ) {
		this.songsPlayed = songsPlayed;
	}

	public User getUser() {
		return owner;
	}
	public void setUser(User owner) {
		this.owner = owner;
	}
}
