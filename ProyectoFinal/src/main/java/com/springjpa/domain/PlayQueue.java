package com.springjpa.domain;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class PlayQueue {
	
	protected Boolean random;
	protected Integer currentSong;
	protected Integer size;
	protected List<Song> songList;
	protected Random aleatorio;
	
	public PlayQueue(){
		songList = new ArrayList<Song>();
		size = 0;
		currentSong = 0;
		random = false;
		aleatorio = new Random(System.currentTimeMillis());
	}
	
	public boolean isRandom() {
        return random;
    }
	
	public void setRandom(boolean random) {
        this.random = random;
	}
	
	public Integer getCurrentSong(){
		return currentSong;
	}
	
	public void setCurrentSong(Integer currentSong){
		this.currentSong = currentSong;
	}

	public void addPlayList (PlayList newPlayList){
		songList.addAll(newPlayList.getSongList());
		updateSize();
    }
	
	public void addSong (Song newSong){
	      songList.add(newSong);
	      updateSize();
	}
	
	public void addAlbum (Album newAlbum){
        songList.addAll(newAlbum.getSongs());
        updateSize();
	}
	
	public void removeSong (Song songToDelete){
        songList.remove(songToDelete);
        updateSize();
    }

    public List<Song> getSongList() {
		return songList;
	}
    
    public Integer getSongListSize() {
		return songList.size();
	}    
    
	public void next(){
		if (isRandom()){
			currentSong=getRandom();
		}
		currentSong += 1;
		currentSong = currentSong % size;
	}
	
	public void prev(){
		currentSong -= 1;
		currentSong = currentSong % size;
	}
	
	protected Integer getRandom(){
		Integer rand = aleatorio.nextInt(size);
		return rand;
	}
	
	protected void updateSize(){
		size = songList.size();
	}
    
}
