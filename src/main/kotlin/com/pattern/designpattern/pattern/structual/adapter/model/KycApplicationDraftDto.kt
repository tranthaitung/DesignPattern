package com.pattern.designpattern.pattern.structual.adapter.model

import com.fasterxml.jackson.annotation.JsonProperty

data class KycApplicationDraftDto(
  @JsonProperty("applicationDraftId")
  val id: Long = 0,
  val merchantId: String,
  val idCardNumber: String? = null,
  val additionalData: Map<*, *>? = null
)
