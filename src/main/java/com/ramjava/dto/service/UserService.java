package com.ramjava.dto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramjava.dto.UserLocationDTO;
import com.ramjava.dto.model.User;
import com.ramjava.dto.repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<UserLocationDTO> getAllUserLocation() {
		return userRepo.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
	
	private UserLocationDTO convertEntityToDto(User user) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(user.getId());
		userLocationDTO.setEmail(user.getEmail());
		userLocationDTO.setPlace(user.getPlace());
		userLocationDTO.setLongitude(user.getLongitude());
		userLocationDTO.setLatitude(user.getLatitude());
		return userLocationDTO;
	}
}
