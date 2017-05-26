package com.espringjpa.domain;

import java.util.Vector;
/**
 * Created by mathHellscream
 */
public class Artist {
    //Attributes
    private String name;
    private boolean active;
    private Vector<Album> albums;


    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Vector<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Vector<Album> albums) {
        this.albums = albums;
    }

    public void showAlbums() {
        //Here Must Show Albums
    }

    public void addAlbum(Album newAlbum){
        albums.add(newAlbum);
    }

    public void activateAlbum(Album artistAlbum){
        artistAlbum.activate();
    }
    public void deactivateAlbum(Album artistAlbum){
        artistAlbum.deactivate();
    }
    public void activate(){
        active=true;
    }
    public void deactivate(){
        active=false;
    }

}