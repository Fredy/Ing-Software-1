package com.espringjpa.repository;
import java.util.Collection;
import com.espringjpa.domain.Admin;

public interface IAdminRepository {
    void save(Admin admin);
    Admin get(String idNumber);
    Collection<Admin> getAll();
    void remove(String idNumber);
    // TODO: add id's and db connection in Admin Class
}



