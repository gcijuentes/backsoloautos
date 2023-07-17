package com.back.soloautos.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.back.soloautos.controller.response.PublicationResponse;

@Service
public class PublicationService {

	private VehicleService vehicleService;
	
	public List<PublicationResponse> getPublications(Pageable pageable) {
		
		vehicleService.getVehicles(pageable);
		
		return null;
	}
	
}
