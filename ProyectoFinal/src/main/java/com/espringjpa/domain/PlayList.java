package com.espringjpa.domain;

import java.util.Vector;
import java.util.Date;

public class PlayList extends SongList {

	protected String name;
	protected Date creationDate;
	
	
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
