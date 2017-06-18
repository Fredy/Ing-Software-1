package com.springjpa.domain;
import java.util.Vector;



public abstract class SongList {
	
	Vector<Song> songList;

	public void addAlbum (Album newAlbum){
        songList.addAll(newAlbum.getSongs());
	}

    public void removeSong (Song songToDelete){
        songList.remove(songToDelete);
    }

    public Vector<Song> getSongList() {
		return songList;
	}
}
