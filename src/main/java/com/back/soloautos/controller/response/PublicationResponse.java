package com.back.soloautos.controller.response;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PublicationResponse {

	private String title; 
	private String publicationDate;
	private List<ImageResponse> images; 
	private VehicleResponse car;
}
