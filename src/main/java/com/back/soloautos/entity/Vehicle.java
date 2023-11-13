package com.back.soloautos.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "vehicle")
@Table(name = "vehicle")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 8825330910244297293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = true)
	private String title;

	@Column(name = "year", nullable = true)
	private String year;

	@Column(name = "kilometers", nullable = true)
	private Long kilometers;

	@Column(name = "fuel", nullable = true)
	private String fuel;

	@Column(name = "transmission", nullable = true)
	private String transmission;

	@Column(name = "kilometers_per_liter", nullable = true)
	private String kilometersPerLiter;

	@Column(name = "price", nullable = true)
	private Long price;

	@Column(name = "comment", nullable = true)
	private String comment;

	@Column(name = "url", nullable = true)
	private String url;

	@Column(name = "color", nullable = true)
	private String color;

	@Column(name = "liters_engine", nullable = true)
	private Float litersEngine;

	@Column(name = "cylinders", nullable = true)
	private Integer cylinders;

	@Column(name = "type", nullable = true)
	private String type;

	@Column(name = "status", nullable = true)
	private String status;

	@Column(name = "city_id", nullable = true)
	private String city;
	
	@Column(name = "model_id", nullable = true)
	private Long modelId;
}