package com.back.soloautos.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Vehiculoss")
@Table(name = "vehiculoss")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 8825330910244297293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "kilometraje", nullable = true)
	private Long kilometraje;

	@Column(name = "combustible", nullable = true)
	private String combustible;

	@Column(name = "transmision", nullable = true)
	private String transmision;

	@Column(name = "consumo", nullable = true)
	private String consumo;

	@Column(name = "precio", nullable = true)
	private Long precio;

	@Column(name = "comentario", nullable = true)
	private String comentario;

	@Column(name = "color", nullable = true)
	private String color;

	@Column(name = "litros_motor", nullable = true)
	private Float litrosMotor;

	@Column(name = "cilindros", nullable = true)
	private Integer cilindros;

	@Column(name = "telefono", nullable = true)
	private String telefono;

	@Column(name = "mail", nullable = true)
	private String mail;

	@Column(name = "tipo", nullable = true)
	private String tipo;

	@Column(name = "patente", nullable = true)
	private String patente;

	@Column(name = "url", nullable = true)
	private String url;

	@Column(name = "id_marca", nullable = false)
	private Integer idMarca;

	@Column(name = "estado", nullable = true)
	private String estado;

	@Column(name = "id_yapo", nullable = true)
	private String idYapo;

	@Column(name = "anio", nullable = true)
	private String anio;

	@Column(name = "detalle", nullable = true)
	private String detalle;

	@Column(name = "updated_at", nullable = true)
	private Date updatedAt;

	@Column(name = "created_at", nullable = true)
	private Date createdAt;

//	@OneToOne(cascade = { CascadeType.ALL }, mappedBy = "car", fetch = FetchType.LAZY)
//	private Ad ad;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_ciudad", referencedColumnName = "id")
//	private City city;
//
//	@OneToMany(mappedBy = "car", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
//	private List<Image> images = new ArrayList<>();
//
//	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
//	@JoinColumn(name = "id_marca")
//	private Brand brand;
//	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
//	@JoinColumn(name = "id_tipo_vehiculo")
//	private CarType carType;
	
	
	@Column(name = "vendedor", nullable = true)
	private String vendedor;

}