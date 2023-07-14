package com.back.soloautos.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class BrandService {

	public List<String> getBrands() {
		return List.of("Mercedes-benz","Honda","Nissan","Hyundai","Toyota","Fiat","Audi","BMW","Dodge"); 
	}
	
}
