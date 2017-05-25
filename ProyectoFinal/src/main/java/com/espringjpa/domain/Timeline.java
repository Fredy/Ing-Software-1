package com.espringjpa.domain;

public class Timeline {
    private list<Played> songsPlayed;
    private User owner;

    public boolean show(){
		//do something
		return true;
	}

    public void addSongPlayed (Played newSong){
        songsPlayed.push_back(newSong);
    }

    public void removeSongPlayed (Played songToDelete){
        songsPlayed.remove(songToDelete);
    }

    public list<Played> getSongsPlayed() {
		return songsPlayed;
	}
	public void setSongsPlayed(list<Played> songsPlayed ) {
		this.songsPlayed = songsPlayed;
	}

	public User getUser() {
		return owner;
	}
	public void setUser(User owner) {
		this.owner = owner;
	}
}
