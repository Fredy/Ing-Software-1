package com.springjpa.domain;

import java.util.ArrayList;

//import java.util.Vector;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity 
//@Table(name = "Playlist")
public class PlayList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected long id;
	protected String name;
	protected Date creationDate;
	protected boolean active;	
	
	@ManyToMany
		@JoinTable(name = "playList_song", 
		joinColumns = @JoinColumn(name = "PlayListID"),
		inverseJoinColumns = @JoinColumn(name = "SongID"))
	protected List<Song> songList;
	
	@ManyToMany
    @JoinTable(
            name = "followedPlayListUser",
            joinColumns = @JoinColumn(name = "PlayListID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="UserID", referencedColumnName = "id"))
	private List<User> followers;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public PlayList() {
		songList = new ArrayList<Song>();
		followers= new ArrayList<User>();
		active    = true;
	}

	public PlayList(String name,User user) {
		songList = new ArrayList<Song>();
		this.name = name;
		this.user = user;
		followers= new ArrayList<User>();
		active    = true;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name ){
		this.name=name;
	}
	public long getId(){
		return id;
	}
	
	public Date getCreationDate(){
		return creationDate;
	}

	public void activate(){
        active = true;
    }
	
	public void desactivate(){
        active = false;
    }
	
	public boolean isActive() {
        return active;
    }
	
	public List<User> getFollowers(){
		return followers;
	}
	
	public void addFollowers(User newFollower){
		followers.add(newFollower);
	}
	
	public void removeFollowers(User FollowerToDelete){
		followers.remove(FollowerToDelete);
	}

	public void addAlbum (Album newAlbum){
        songList.addAll(newAlbum.getSongs());
	}

    public void removeSong (Song songToDelete){
        songList.remove(songToDelete);
    }

    public List<Song> getSongList() {
		return songList;
	}
    
    public void addSong (Song newSong){
      songList.add(newSong);
	}
	
}
