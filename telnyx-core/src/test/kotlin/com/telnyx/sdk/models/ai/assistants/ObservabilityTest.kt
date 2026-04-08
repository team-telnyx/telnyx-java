// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObservabilityTest {

    @Test
    fun create() {
        val observability =
            Observability.builder()
                .host("host")
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(Observability.Status.ENABLED)
                .build()

        assertThat(observability.host()).contains("host")
        assertThat(observability.publicKeyRef()).contains("public_key_ref")
        assertThat(observability.secretKeyRef()).contains("secret_key_ref")
        assertThat(observability.status()).contains(Observability.Status.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val observability =
            Observability.builder()
                .host("host")
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(Observability.Status.ENABLED)
                .build()

        val roundtrippedObservability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(observability),
                jacksonTypeRef<Observability>(),
            )

        assertThat(roundtrippedObservability).isEqualTo(observability)
    }
}
