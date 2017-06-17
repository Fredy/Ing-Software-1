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
    
//    @Query("SELECT b from PlayList a inner join a.playList_song b where  a.id= ?1")
//    Collection<Song>  getSongList(long PlaylistId);
//    
//
//    @Query("SELECT b from PlayList a inner join a.followedPlayListUser b where  a.id= ?1")
//    Collection<User> getFollowers(long PlaylistId);
}