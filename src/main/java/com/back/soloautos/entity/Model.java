package com.back.soloautos.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Model")
@Table(name = "model")
public class Model implements Serializable {

	private static final long serialVersionUID = 8825330910244297293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "model_name", nullable = true)
	private String modelName;
	
	@Column(name = "brand_id", nullable = true)
	private Long brandId;

}