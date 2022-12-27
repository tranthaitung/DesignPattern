package com.pattern.designpattern.pattern.structual.adapter

import com.pattern.designpattern.pattern.structual.adapter.model.KycApplicationDraftDto
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleSpec
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleType

interface VerificationRequestAdapter {
  fun supports(verificationModule: VerificationModuleType): Boolean

  fun createRequestFromModuleSpec(spec: VerificationModuleSpec): Map<String, String>

  fun createModuleSpecFromApplicationDraft(
    applicationDraft: KycApplicationDraftDto,
    additionalData: Map<String, Any?>
  ): VerificationModuleSpec

}
