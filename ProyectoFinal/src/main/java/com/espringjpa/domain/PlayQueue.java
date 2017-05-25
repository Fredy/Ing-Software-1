package com.espringjpa.domain;

public class PlayQueue extends SongList {
	
	protected Boolean random;
	protected Integer currentSong;
	
	public Boolean getRandom(){
		return random;
	}
	public void setRandom(Boolean random){
		this.random=random;
	}
	
	public Integer getCurrentSong(){
		return currentSong;
	}
	public void setCurrentSong(Integer currentSong){
		this.currentSong= currentSong;
	}
	public void addPlayList(PlayList newPlayList){
		//something
	}
	
	public void next(){
		currentSong+=1;
		//something
	}
	public void prev(){
		currentSong-=1;
		//something
	}
}
