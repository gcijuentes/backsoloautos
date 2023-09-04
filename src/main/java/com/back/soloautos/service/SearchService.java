package com.back.soloautos.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.back.soloautos.controller.response.ImageResponse;
import com.back.soloautos.controller.response.SuggestionResponse;
import com.back.soloautos.controller.response.VehicleResponse;
import com.back.soloautos.entity.Brand;
import com.back.soloautos.entity.Model;
import com.back.soloautos.entity.Vehicle;
import com.back.soloautos.repository.BrandRepository;
import com.back.soloautos.repository.ModelRepository;
import com.back.soloautos.repository.VehicleRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class SearchService {

	private final BrandRepository brandRepository;

	private final ModelRepository modelRepository;
	
	private final VehicleRepository vehicleRepository;
	
	public List<SuggestionResponse> getSuggestions(final String searchText) {
		
		List<SuggestionResponse> listSuggestionResponse = new ArrayList<>();
		
		List<Brand> brandList = brandRepository.findByBrandNameLike(searchText);
		
		List<Model> modelList =  modelRepository.findByModelNameLike(searchText);
		
		listSuggestionResponse.addAll(brandList.stream()
		.map(brand -> {
			return SuggestionResponse.builder().textResult(brand.getBrandName()).build();
					}
		).toList());
		
		listSuggestionResponse.addAll(modelList.stream()
				.map(model -> {
					return SuggestionResponse.builder().textResult(model.getModelName()).build();
							}
				).toList());
		return listSuggestionResponse;
	}


	
	public Page<VehicleResponse> searchVehicles(String searchTerm, Pageable pageable) {
		
		Page<Vehicle> pageVehicle = null;
		if(StringUtils.isBlank(searchTerm)) {
			log.debug("searchVehicles | searchTerm empty");
			pageVehicle = vehicleRepository.findAll(pageable);	
		}else {
			log.debug("searchVehicles | searchTerm:{}",searchTerm);
			pageVehicle = vehicleRepository.findByTitle(searchTerm,pageable);
		}
		
		List<VehicleResponse> vehicleResponse = pageVehicle.stream().map(
				vehicle -> {
				return VehicleResponse.builder()
						.city(vehicle.getCity())
						.color(vehicle.getColor())
						.model(vehicle.getModel())
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
	}
}
