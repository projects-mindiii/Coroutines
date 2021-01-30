package com.coroutines.models

import com.squareup.moshi.Json

data class Address(

	@Json(name="zipcode")
	val zipcode: String? = null,

	@Json(name="geo")
	val geo: Geo? = null,

	@Json(name="suite")
	val suite: String? = null,

	@Json(name="city")
	val city: String? = null,

	@Json(name="street")
	val street: String? = null
)