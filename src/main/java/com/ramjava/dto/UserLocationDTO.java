package com.ramjava.dto;

import lombok.Data;

@Data
public class UserLocationDTO {

	// Send information from server to client
	private long userId;
	private String email;
	private String place;
	private double longitude;
	private double latitude;
}
