package com.coroutines.models

import com.squareup.moshi.Json

data class Company(

	@Json(name="bs")
	val bs: String? = null,

	@Json(name="catchPhrase")
	val catchPhrase: String? = null,

	@Json(name="name")
	val name: String? = null
)