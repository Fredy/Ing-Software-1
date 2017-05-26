package com.espringjpa.repository;

import java.util.Collection;

import com.espringjpa.domain.PlayList;

public interface IPlaylistRepository {

	void save(PlayList playList);

	PlayList get(String name); // name? o id?

	Collection<PlayList> getAll();

	void remove(String name);// name o id?
	
}
