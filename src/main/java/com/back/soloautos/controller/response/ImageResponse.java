package com.back.soloautos.controller.response;

import lombok.Builder;

@Builder
public record ImageResponse (String url, String type) {
	
}
