package com.coroutines.models

import com.squareup.moshi.Json

data class Geo(

	@Json(name="lng")
	val lng: String? = null,

	@Json(name="lat")
	val lat: String? = null
)