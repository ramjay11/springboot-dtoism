package com.ramjava.dtoism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramjava.dto.model.Location;
import com.ramjava.dto.model.User;
import com.ramjava.dto.repository.LocationRepository;
import com.ramjava.dto.repository.UserRepository;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private LocationRepository locationRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pasig");
		location.setDescription("Pasig is Green City");
		location.setLongitude(50.5);
		location.setLatitude(40.5);
		locationRepo.save(location);
		
		User user1 = new User();
		user1.setFirstName("Huskey");
		user1.setLastName("Saint");
		user1.setEmail("HuskeySaint@outlook.com");
		user1.setPassword("Password1");
		user1.setLocation(location);
		userRepo.save(user1);
		
		User user2 = new User();
		user2.setFirstName("Siber");
		user2.setLastName("Saint");
		user2.setEmail("SiberSaint@outlook.com");
		user2.setPassword("Password2");
		user2.setLocation(locastion);
		userRepo.save(user2);
	}

}
