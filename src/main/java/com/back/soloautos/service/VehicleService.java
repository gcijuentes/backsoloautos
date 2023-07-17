package com.back.soloautos.service;

import java.util.Collections;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.back.soloautos.controller.response.VehicleResponse;
import com.back.soloautos.entity.Vehicle;
import com.back.soloautos.repository.VehicleRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleService {

	private final VehicleRepository vehicleRepository;
	
	public Page<Vehicle> getVehicles(Pageable pageable) {
		
		Page<Vehicle> pageVehicle = vehicleRepository.findAll(pageable);
		
//		pageVehicle.stream().map(
//				vehicle -> {
//					
//				return VehicleResponse.builder()
//						.brand(null)
//						
//				});
//		
		
		//return new PageImpl<>(Collections.emptyList());
		return pageVehicle;
//		VehicleResponse fiat = VehicleResponse.builder()
//				.brand(Brand.builder().name("Fiat").build())
//				.model("Palio")
//				.summary("Descripción del auto")
//				.color("rojo")
//				.kilometers(150000)
//				.transmition("Mecánica")
//				.build();
//		
//		VehicleResponse Tucson = VehicleResponse.builder()
//				.brand(Brand.builder().name("Fiat").build())
//				.model("Tucson")
//				.summary("Descripción del auto")
//				.color("negro")
//				.kilometers(120000)
//				.transmition("Mecánica")
//				.build();
//		 
//		return List.of(fiat,Tucson);
	}
}
