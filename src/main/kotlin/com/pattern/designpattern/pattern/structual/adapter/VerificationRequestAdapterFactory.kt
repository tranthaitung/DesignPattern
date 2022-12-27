package com.pattern.designpattern.pattern.structual.adapter

import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleType
import org.springframework.stereotype.Service

@Service
class VerificationRequestAdapterFactory(
  private val adapterService: List<VerificationRequestAdapter>
) {
  operator fun get(verificationModule: VerificationModuleType): VerificationRequestAdapter {
    adapterService.forEach { verificationRequestAdapter ->
      if (verificationRequestAdapter.supports(verificationModule)) {
        return verificationRequestAdapter
      }
    }
    throw IllegalArgumentException("No service found for this $verificationModule type")
  }
}
