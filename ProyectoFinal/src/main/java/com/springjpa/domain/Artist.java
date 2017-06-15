package com.springjpa.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.*;
/**
 * Created by mathHellscream
 */

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@Entity
@Table(name = "Artist")
public class Artist {
    //Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    private boolean active;


    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "ArtistAlbum",
            joinColumns = @JoinColumn(name = "ArtistId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="AlbumId", referencedColumnName = "id")
    )
    private List<Album> albums;

    @ManyToMany
    @JoinTable(
            name = "ArtistUser",
            joinColumns = @JoinColumn(name = "ArtistID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="UserID", referencedColumnName = "id")
    )
    private List<User> followedBy;

    //Methods

    public Artist(){
        albums = new ArrayList<Album>();
        followedBy = new ArrayList<User>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public List<Album> getAlbums() {
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
