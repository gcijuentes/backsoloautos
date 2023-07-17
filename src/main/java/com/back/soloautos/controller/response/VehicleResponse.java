package com.back.soloautos.controller.response;

import com.back.soloautos.dto.Brand;

import lombok.Builder;

@Builder
public record VehicleResponse (
		String title,
		String price,
		String year,
		String summary, 
		Integer kilometers, 
		String transmission, 
		Brand brand, 
		String model, 
		String color,
		String city,
		String url,
		String images) {

}
