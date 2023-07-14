package com.back.soloautos.controller.response;

import com.back.soloautos.dto.Brand;

import lombok.Builder;

@Builder
public record VehicleResponse (String summary, Integer kilometers, String transmition, int year, Brand brand, String model, String color) {

}
