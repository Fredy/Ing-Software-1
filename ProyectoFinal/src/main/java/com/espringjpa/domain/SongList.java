package com.espringjpa.domain;
import java.util.Vector;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class SongList {
	
	@Id
	@Column(name = "id")
	private Long idSongList;
	
	@OneToMany
	@JoinTable(name = "songList_song", 
		joinColumns = @JoinColumn(name = "idSongList", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "idSong", referencedColumnName = "id"))
	protected Vector<Song> songList;

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
	public void setSongList(Vector<Song> songList) {
		this.songList = songList;
	}
}
