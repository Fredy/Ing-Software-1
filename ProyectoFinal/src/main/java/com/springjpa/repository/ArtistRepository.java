package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Artist;

public interface ArtistRepository extends CrudRepository<Artist,Long> {
}
