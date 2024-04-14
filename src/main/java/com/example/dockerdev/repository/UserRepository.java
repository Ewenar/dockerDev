package com.example.dockerdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dockerdev.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
