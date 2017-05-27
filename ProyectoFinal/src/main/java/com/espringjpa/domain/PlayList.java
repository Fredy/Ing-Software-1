package com.espringjpa.domain;

//import java.util.Vector;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
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
