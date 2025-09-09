package com.solutions.hydrogaurd.repository;

import com.solutions.hydrogaurd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries can be added here
    User findByUsername(String username);
}


