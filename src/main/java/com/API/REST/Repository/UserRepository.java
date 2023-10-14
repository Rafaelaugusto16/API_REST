package com.API.REST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API.REST.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
