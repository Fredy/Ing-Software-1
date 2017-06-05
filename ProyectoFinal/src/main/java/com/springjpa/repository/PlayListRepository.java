package com.springjpa.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.PlayList;
import com.springjpa.domain.Song;
import com.springjpa.domain.User;

//@Component
public interface PlayListRepository extends CrudRepository<PlayList, Long>{
	
    @Query("SELECT a FROM PlayList a WHERE a.id = ?1")
    PlayList findOne(long id);

    @Query("SELECT a FROM PlayList a")
    Collection<PlayList> findAll();
    
    @Query("SELECT a FROM playList_song a WHERE a.PlayListID = ?1")
    Collection<Song> getSongList(long PlayListId);
    
    @Query("SELECT a FROM followedPlayListUser a WHERE a.PlayListID = ?1")
    Collection<User> getFollowers(long PlayListId);
}