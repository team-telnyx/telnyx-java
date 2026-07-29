// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads.labels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelDeleteAllResponseTest {

    @Test
    fun create() {
        val labelDeleteAllResponse =
            LabelDeleteAllResponse.builder()
                .data(
                    LabelDeleteAllResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .recordType(LabelDeleteAllResponse.Data.RecordType.EMAIL_THREAD)
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(labelDeleteAllResponse.data())
            .isEqualTo(
                LabelDeleteAllResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLabel("string")
                    .recordType(LabelDeleteAllResponse.Data.RecordType.EMAIL_THREAD)
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val labelDeleteAllResponse =
            LabelDeleteAllResponse.builder()
                .data(
                    LabelDeleteAllResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .recordType(LabelDeleteAllResponse.Data.RecordType.EMAIL_THREAD)
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedLabelDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(labelDeleteAllResponse),
                jacksonTypeRef<LabelDeleteAllResponse>(),
            )

        assertThat(roundtrippedLabelDeleteAllResponse).isEqualTo(labelDeleteAllResponse)
    }
}
