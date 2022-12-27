package com.pattern.designpattern.pattern.structual.adapter.impl

import com.pattern.designpattern.pattern.structual.adapter.VerificationRequestAdapter
import com.pattern.designpattern.pattern.structual.adapter.model.KycApplicationDraftDto
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleSpec
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleType
import com.pattern.designpattern.pattern.structual.adapter.model.DemographicVerificationModuleSpec
import org.springframework.stereotype.Service

@Service
class DemographicVerificationRequestAdapter : VerificationRequestAdapter {
  override fun supports(verificationModule: VerificationModuleType): Boolean {
    return verificationModule === VerificationModuleType.DEMOGRAPHIC_MODULE
  }

  override fun createRequestFromModuleSpec(spec: VerificationModuleSpec): Map<String, String> {
    TODO("Not yet implemented")
  }

  override fun createModuleSpecFromApplicationDraft(
    applicationDraft: KycApplicationDraftDto,
    additionalData: Map<String, Any?>
  ): VerificationModuleSpec {
    return DemographicVerificationModuleSpec(
      demoGraphic = "demoGraphic"
    )
  }
}
