package com.back.soloautos.entity;

import java.io.Serializable;

import converter.JsonNodeConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Vehicle")
@Table(name = "vehicle")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 8825330910244297293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = true)
	private String title;
	
	@Column(name = "kilometers", nullable = true)
	private Long kilometers;

	@Column(name = "fuel", nullable = true)
	private String fuel;

	@Column(name = "transmission", nullable = true)
	private String transmission;

	@Column(name = "fuel_efficiency", nullable = true)
	private String fuel_efficiency;

	@Column(name = "price", nullable = true)
	private Long price;

	@Column(name = "comment", nullable = true)
	private String comment;

	@Column(name = "color", nullable = true)
	private String color;

	@Column(name = "liters_engine", nullable = true)
	private Float liters_engine;

	@Column(name = "cylinders", nullable = true)
	private Integer cylinders;

	@Column(name = "phone", nullable = true)
	private String phone;

	@Column(name = "mail", nullable = true)
	private String mail;

	@Column(name = "type", nullable = true)
	private String type;

	@Column(name = "patent", nullable = true)
	private String patent;

	@Column(name = "url", nullable = true)
	private String url;

	@Column(name = "status", nullable = true)
	private String status;

	@Column(name = "id_yapo", nullable = true)
	private String idYapo;

	@Column(name = "year", nullable = true)
	private String year;
	
	@Convert(converter = JsonNodeConverter.class)
	@Column(name = "images_json", columnDefinition = "json")
	private String imagesJson;
	
	@Convert(converter = JsonNodeConverter.class)
	@Column(name = "brand_json", columnDefinition = "json")
	private String brandJson;
	
	@Column(name = "city", nullable = true)
	private String city;
	
	@Column(name = "region", nullable = true)
	private String region;
	
	@Column(name = "marca", nullable = true)
	private String brand;
	
	@Column(name = "modelo", nullable = true)
	private String model;
}