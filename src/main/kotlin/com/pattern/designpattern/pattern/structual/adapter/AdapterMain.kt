package com.pattern.designpattern.pattern.structual.adapter

import com.pattern.designpattern.pattern.structual.adapter.model.KycApplicationDraftDto
import com.pattern.designpattern.pattern.structual.adapter.model.VerificationModuleType
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.Arrays
import org.springframework.stereotype.Service

@Service
class AdapterMain(
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

  fun jdkExample(){

    Arrays.asList("Larry", "Moe", "Curly")

    listOf("Larry", "Moe", "Curly")

    val geek = FileInputStream("ABC.txt")
    val in_strm = InputStreamReader(geek)

  }
}
