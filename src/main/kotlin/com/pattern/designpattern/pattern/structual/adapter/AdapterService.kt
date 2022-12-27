package com.pattern.designpattern.pattern.structual.adapter

import com.pattern.designpattern.pattern.structual.adapter.model.KycApplicationDraftDto
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleType
import org.springframework.stereotype.Service

@Service
class AdapterService(
  private val verificationRequestAdapterFactory: VerificationRequestAdapterFactory,
) {

  fun getSpec(){
    val verificationModuleType = VerificationModuleType.MOTHER_NAME_MODULE
    val spec = verificationRequestAdapterFactory[verificationModuleType]
      .createModuleSpecFromApplicationDraft(
        applicationDraft = KycApplicationDraftDto(1, "KYC", "1234"),
        additionalData = mapOf()
      )
  }
}
