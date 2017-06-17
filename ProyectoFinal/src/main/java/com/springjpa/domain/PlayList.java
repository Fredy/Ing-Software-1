package com.springjpa.domain;

import java.util.ArrayList;

//import java.util.Vector;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity 
//@Table(name = "Playlist")
public class PlayList extends SongList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected long id;
	protected String name;
	protected Date creationDate;
	
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
	}
	public PlayList(String name,User user) {
		this.name = name;
		this.user = user;
		songList = new ArrayList<Song>();
		followers= new ArrayList<User>();
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
//	public void setId(Long id){
//		this.id=id;
//	}
	public Date getCreationDate(){
		return creationDate;
	}
	
	public void addFollowers(User newFollower){
		followers.add(newFollower);
	}
	
	public void removeFollowers(User FollowerToDelete){
		followers.remove(FollowerToDelete);
	}

}
