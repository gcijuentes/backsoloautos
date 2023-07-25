package com.back.soloautos.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.back.soloautos.controller.response.BrandResponse;
import com.back.soloautos.repository.BrandRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
@Component
public class BrandService {

	private final BrandRepository brandRepository;
	
	public List<BrandResponse> getBrands() {
		
		return brandRepository.findAll()
				.stream().map( brand ->{
						return BrandResponse
								.builder()
								.name(brand.getNombreMarca())
								.imageUrl("https://logowik.com/content/uploads/images/mazda-3d-black4958.jpg").build();
							}
						).toList();
	}
}
