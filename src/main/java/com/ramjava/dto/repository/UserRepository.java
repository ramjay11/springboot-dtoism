package com.ramjava.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramjava.dto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
