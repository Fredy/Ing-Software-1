package com.springjpa.repository;

import com.springjpa.domain.Song;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jhoelccari on 2/06/17.
 */
public interface SongRepository extends CrudRepository<Song,Long>{

}
