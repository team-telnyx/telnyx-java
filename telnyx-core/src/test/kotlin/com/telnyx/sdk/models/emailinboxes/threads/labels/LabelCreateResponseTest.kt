// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads.labels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelCreateResponseTest {

    @Test
    fun create() {
        val labelCreateResponse =
            LabelCreateResponse.builder()
                .data(
                    LabelCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .recordType(LabelCreateResponse.Data.RecordType.EMAIL_THREAD)
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(labelCreateResponse.data())
            .isEqualTo(
                LabelCreateResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLabel("string")
                    .recordType(LabelCreateResponse.Data.RecordType.EMAIL_THREAD)
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val labelCreateResponse =
            LabelCreateResponse.builder()
                .data(
                    LabelCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .recordType(LabelCreateResponse.Data.RecordType.EMAIL_THREAD)
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedLabelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(labelCreateResponse),
                jacksonTypeRef<LabelCreateResponse>(),
            )

        assertThat(roundtrippedLabelCreateResponse).isEqualTo(labelCreateResponse)
    }
}
