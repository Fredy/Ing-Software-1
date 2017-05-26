package com.espringjpa.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.espringjpa.domain.PlayList;

//@Component
public class PlayListRepository implements IPlaylistRepository{
	
	Map<String, PlayList> playLists = new HashMap<>();


	@Override
	public void save(PlayList playList){
		playLists.put(playList.getName(), playList);
	}
	@Override
	public PlayList get(String name) {
		return playLists.get(name);
	}

	@Override
	public Collection<PlayList> getAll() {
		return playLists.values();
	}
	@Override
	public void remove(String name) {
		playLists.remove(name);
	}

}
