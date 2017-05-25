package com.espringjpa.domain;

/**
 * Created by Maria on 25/05/2017.
 */
public class PlayQueue implements SongList{
    protected boolean random;
    protected Integer currentSong;

    public void addAlbum (Album newAlbum){
        songList.add(newAlbum);
    }
    public void addPlayList (PlayList newPlayList){
        songList.add(newPlayList);
    }

    public void next(){
        //do Something
    }
    public void prev() {
        //do Something
    }

    public boolean isRandom() {
        return random;
    }

    public void setRandom(boolean random) {
        this.random = random;
    }

    public Integer getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(Integer currentSong) {
        this.currentSong = currentSong;
    }
}
