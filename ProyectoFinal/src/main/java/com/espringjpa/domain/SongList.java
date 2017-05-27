package com.espringjpa.domain;
import java.util.Vector;

import javax.persistence.*;


public abstract class SongList {
	
	Vector<Song> songList;

	public void addSong (Song newSong){
        songList.add(newSong);
    }
	
	public void addAlbum (Album newAlbum){
        //songList.add(newSong); agregar cancion por cancion
    }

    public void removeSong (Song songToDelete){
        songList.remove(songToDelete);
    }

    public Vector<Song> getSongList() {
		return songList;
	}
}
