package com.espringjpa.domain;

import java.util.List;
import java.util.Vector;
import javax.persistence.*;
/**
 * Created by mathHellscream
 */

@Entity
@Table(name = "Artist")
public class Artist {
    //Attributes
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    private boolean active;


    @ManyToMany
    @JoinTable(
            name = "ArtistAlbum",
            joinColumns = @JoinColumn(name = "ArtistID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="AlbumID", referencedColumnName = "id")
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
