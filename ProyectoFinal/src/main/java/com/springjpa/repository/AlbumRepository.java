package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Album;

public interface AlbumRepository extends CrudRepository<Album,Long>{
}
