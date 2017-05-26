package com.espringjpa.domain;

import java.util.Vector;
/**
 * Created by mathHellscream
 */
public class Album {
    //Attributes
    private String name;
    private boolean active;
    private Vector<Song> songs;
    private Vector<Artist> artists;

    //Methods
    public void addSong(Song newSong){
        songs.add(newSong);
    }
    public void addArtist(Artist newArtist){
        artists.add(newArtist);
    }
    public void activateSong(Song song){
        song.activate();
    }
    public void deactivateSong(Song song){
        song.deactivate();
    }
    public void activate(){
        active = true;
    }
    public void deactivate(){
        active = false;
    }
    public void showSongs(){
        //Here must show the songs of the album
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Vector<Song> getSongs() {
        return songs;
    }

    public Vector<Artist> getArtists() {
        return artists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSongs(Vector<Song> songs) {
        this.songs = songs;
    }

    public void setArtists(Vector<Artist> artists) {
        this.artists = artists;
    }
}
