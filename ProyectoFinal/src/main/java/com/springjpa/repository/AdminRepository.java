package com.springjpa.repository;
import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long>{
    // TODO: more queries ??
}



