package com.back.soloautos.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BrandResponse {
	private String name; 
	private String imageUrl;
}
