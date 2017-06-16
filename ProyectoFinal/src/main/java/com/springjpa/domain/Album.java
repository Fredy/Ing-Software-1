package com.springjpa.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import javax.persistence.*;

/**
 * Created by mathHellscream
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@Entity
@Table(name = "Album")
public class Album {
    //Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column (name = "name")
    private String name;
    private boolean active;

    @ManyToMany
    @JoinTable(
            name = "AlbumSong",
            joinColumns = @JoinColumn(name = "AlbumId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="SongId", referencedColumnName = "id")
    )
    private List<Song> songs;

    @ManyToMany(mappedBy = "albums")
    private List<Artist> artists;

    //Methods
    public Album(){
        songs = new ArrayList<Song>();
        artists = new ArrayList<Artist>();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
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

    public List<Song> getSongs() {
        return songs;
    }

    public List<Artist> getArtists() {
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
