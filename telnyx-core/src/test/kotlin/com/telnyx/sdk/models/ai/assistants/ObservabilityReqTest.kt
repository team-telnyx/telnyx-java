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
                .promptLabel("prompt_label")
                .promptName("prompt_name")
                .promptSync(PromptSyncStatus.ENABLED)
                .promptVersion(1L)
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(ObservabilityStatus.ENABLED)
                .build()

        assertThat(observabilityReq.host()).contains("host")
        assertThat(observabilityReq.promptLabel()).contains("prompt_label")
        assertThat(observabilityReq.promptName()).contains("prompt_name")
        assertThat(observabilityReq.promptSync()).contains(PromptSyncStatus.ENABLED)
        assertThat(observabilityReq.promptVersion()).contains(1L)
        assertThat(observabilityReq.publicKeyRef()).contains("public_key_ref")
        assertThat(observabilityReq.secretKeyRef()).contains("secret_key_ref")
        assertThat(observabilityReq.status()).contains(ObservabilityStatus.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val observabilityReq =
            ObservabilityReq.builder()
                .host("host")
                .promptLabel("prompt_label")
                .promptName("prompt_name")
                .promptSync(PromptSyncStatus.ENABLED)
                .promptVersion(1L)
                .publicKeyRef("public_key_ref")
                .secretKeyRef("secret_key_ref")
                .status(ObservabilityStatus.ENABLED)
                .build()

        val roundtrippedObservabilityReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(observabilityReq),
                jacksonTypeRef<ObservabilityReq>(),
            )

        assertThat(roundtrippedObservabilityReq).isEqualTo(observabilityReq)
    }
}
