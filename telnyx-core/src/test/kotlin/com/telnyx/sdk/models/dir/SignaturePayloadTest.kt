// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignaturePayloadTest {

    @Test
    fun create() {
        val signaturePayload =
            SignaturePayload.builder().imageBase64("x").signerName("signer_name").build()

        assertThat(signaturePayload.imageBase64()).isEqualTo("x")
        assertThat(signaturePayload.signerName()).contains("signer_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signaturePayload =
            SignaturePayload.builder().imageBase64("x").signerName("signer_name").build()

        val roundtrippedSignaturePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signaturePayload),
                jacksonTypeRef<SignaturePayload>(),
            )

        assertThat(roundtrippedSignaturePayload).isEqualTo(signaturePayload)
    }
}
