package com.ramjava.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramjava.dto.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
