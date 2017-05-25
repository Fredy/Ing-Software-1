package com.espringjpa.domain;

import java.util.Vector;
import java.util.Date;

public class PlayList implements SongList {

	protected String name;
	protected Date creationDate;
	
	public void addAlbum (Album newAlbum){
        songList.add(newAlbum);
    }


}
