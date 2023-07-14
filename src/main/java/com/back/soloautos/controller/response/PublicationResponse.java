package com.back.soloautos.controller.response;

import java.util.List;

public record PublicationResponse(String title, String date, List<ImageResponse> images, VehicleResponse car  ) {

}
