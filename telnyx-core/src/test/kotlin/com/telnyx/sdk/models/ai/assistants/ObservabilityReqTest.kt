// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObservabilityReqTest {

    @Test
    fun create() {
        val observabilityReq =
            ObservabilityReq.builder()
                .host("host")
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(ObservabilityReq.Status.ENABLED)
                .build()

        assertThat(observabilityReq.host()).contains("host")
        assertThat(observabilityReq.publicKeyRef()).contains("public_key_ref")
        assertThat(observabilityReq.secretKeyRef()).contains("secret_key_ref")
        assertThat(observabilityReq.status()).contains(ObservabilityReq.Status.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val observabilityReq =
            ObservabilityReq.builder()
                .host("host")
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(ObservabilityReq.Status.ENABLED)
                .build()

        val roundtrippedObservabilityReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(observabilityReq),
                jacksonTypeRef<ObservabilityReq>(),
            )

        assertThat(roundtrippedObservabilityReq).isEqualTo(observabilityReq)
    }
}
