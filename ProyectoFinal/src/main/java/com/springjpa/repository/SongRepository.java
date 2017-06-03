package com.springjpa.repository;

import com.springjpa.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Long>{

}
