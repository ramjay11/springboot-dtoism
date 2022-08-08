package com.ramjava.dto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String place;
	private String descriptio;
	private double longitude;
	private double latitude;
}
