package com.espringjpa.domain;

//import java.util.Vector;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.*;


@Entity 
public class PlayList extends SongList {

	@Id
	protected long id;
	protected String name;
	protected Date creationDate;
	
	@OneToMany
		@JoinTable(name = "playList_song", 
		joinColumns = @JoinColumn(name = "idPlayList"),
		inverseJoinColumns = @JoinColumn(name = "idSong"))
	protected List<Song> songList;
	
	
	
	@ManyToMany
    @JoinTable(
            name = "followedPlayListUser",
            joinColumns = @JoinColumn(name = "PlayListID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="UserID", referencedColumnName = "id"))
	private List<User> followers;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name ){
		this.name=name;
	}
	public Date getCreationDate(){
		return creationDate;
	}

}
