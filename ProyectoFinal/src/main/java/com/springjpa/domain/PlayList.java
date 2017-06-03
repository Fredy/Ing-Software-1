package com.springjpa.domain;

//import java.util.Vector;

import java.util.Date;
import java.util.List;

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
	public long getId(){
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public Date getCreationDate(){
		return creationDate;
	}

}
