package com.espringjpa.domain;

public abstract class SongList {
	protected list<Song> songList;

	public void addSong (Song newSong){
        songList.push_back(newSong);
    }

    public void removeSong (Song songToDelete){
        songList.remove(songToDelete);
    }

    public list<Song> getSongList() {
		return songList;
	}
	public void setSongList(list<Song> songList) {
		this.songList = songList;
	}
}
