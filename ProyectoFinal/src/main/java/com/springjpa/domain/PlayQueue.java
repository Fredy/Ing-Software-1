package com.springjpa.domain;


public class PlayQueue extends SongList {
	
	protected Boolean random;
	protected Integer currentSong;
	
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
		this.currentSong= currentSong;
	}

	public void addPlayList (PlayList newPlayList){
        //TODO :songList.add(newPlayList); agregar cancion por cancion
    }
	
	//TODO :AddAlbum
	//TODO :AddSong
	
	public void next(){
		//TODO :if (random) then Funrandom()
		//TODO :else
		currentSong+=1;
		//something
	}
	public void prev(){
		//TODO :if (random) then Funrandom()
		//TODO :else
		currentSong-=1;
		//something
	}
}
