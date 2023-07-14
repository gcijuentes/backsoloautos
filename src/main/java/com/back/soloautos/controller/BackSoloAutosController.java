package com.back.soloautos.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.back.soloautos.controller.response.VehicleResponse;
import com.back.soloautos.entity.Vehicle;
import com.back.soloautos.service.BrandService;
import com.back.soloautos.service.VehicleService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/soloautos")
public class BackSoloAutosController {

	private final BrandService brandService;
	
	private final VehicleService vehicleService;
	
	@GetMapping("/brands")
	public List<String> getBrands() {
		log.debug("getBrands");
		return brandService.getBrands();
	}
	
	@GetMapping("/cars")
	public ResponseEntity<Page<Vehicle>> getCars(
			@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
		
		Pageable pageable = PageRequest.of(page, size);
		
		log.debug("getCars");
		return ResponseEntity.ok(vehicleService.getVehicles(pageable));
	}
	
}
