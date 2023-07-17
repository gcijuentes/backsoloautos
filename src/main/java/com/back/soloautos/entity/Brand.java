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
@Entity(name = "Marca")
@Table(name = "Marca")
public class Brand implements Serializable {

	private static final long serialVersionUID = 8825330910244297293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "nombre_marca", nullable = true)
	private String nombreMarca;
	
	@Column(name = "url_imagen", nullable = true)
	private String urlImagen;

}