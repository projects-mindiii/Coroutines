package com.coroutines.models

import com.squareup.moshi.Json

data class User(

	@Json(name="website")
	val website: String? = null,

	@Json(name="address")
	val address: Address? = null,

	@Json(name="phone")
	val phone: String? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="company")
	val company: Company? = null,

	@Json(name="id")
	val id: Int? = null,

	@Json(name="email")
	val email: String? = null,

	@Json(name="username")
	val username: String? = null
)