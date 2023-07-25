package com.back.soloautos.service;

import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.back.soloautos.controller.response.ImageResponse;
import com.back.soloautos.controller.response.VehicleResponse;
import com.back.soloautos.dto.Brand;
import com.back.soloautos.entity.Vehicle;
import com.back.soloautos.repository.VehicleRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleService {

	private final VehicleRepository vehicleRepository;
	
	public Page<VehicleResponse> getVehicles(Pageable pageable) {
		
		Page<Vehicle> pageVehicle = vehicleRepository.findAll(pageable);
		
		List<VehicleResponse> vehicleResponse = pageVehicle.stream().map(
				vehicle -> {
					
				return VehicleResponse.builder()
						.brand(Brand.builder().name("Mazda")
								.url("").build())
						.city("Temuco")
						.color(vehicle.getColor())
						.model("CX-5")
						.transmission(vehicle.getTransmission())
						.title(vehicle.getTitle())
						.url(vehicle.getUrl())
						.price(vehicle.getPrice().toString())
						.year(vehicle.getYear())
						.images(List.of(
								ImageResponse.builder()
								.url("https://chileautos.pxcrush.net/chileautos/cars/private/enhd2ndn8g3gu77qxsvb0sits.jpg")
								.build(),
								ImageResponse.builder()
								.url("https://chileautos.pxcrush.net/chileautos/cars/private/9b0tk1ffefim5stupcmjlceak.jpg")
								.build()))
						.build();
				}).toList();
		
		
		return new PageImpl<>(vehicleResponse);
		//return pageVehicle;
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
