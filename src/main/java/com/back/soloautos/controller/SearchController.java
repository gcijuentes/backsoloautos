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

import com.back.soloautos.controller.response.SuggestionResponse;
import com.back.soloautos.controller.response.VehicleResponse;
import com.back.soloautos.service.SearchService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/soloautos")
public class SearchController {


	private final SearchService searchService;

	@GetMapping("/suggestion")
	public List<SuggestionResponse> suggestionSearch(
			@RequestParam(value = "searchText") final String searchText) {
		return searchService.getSuggestions(searchText);
	}
	
	
	@GetMapping("/vehicles")
	public ResponseEntity<Page<VehicleResponse>> searchVehicles(
			@RequestParam(required = false) String searchTerm,
			@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return ResponseEntity.ok(searchService.searchVehicles(searchTerm,pageable));
	}
}
