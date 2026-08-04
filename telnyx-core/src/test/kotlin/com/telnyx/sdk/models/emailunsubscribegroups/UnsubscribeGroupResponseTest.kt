// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnsubscribeGroupResponseTest {

    @Test
    fun create() {
        val unsubscribeGroupResponse =
            UnsubscribeGroupResponse.builder()
                .data(
                    UnsubscribeGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("x")
                        .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(unsubscribeGroupResponse.data())
            .isEqualTo(
                UnsubscribeGroup.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .name("x")
                    .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unsubscribeGroupResponse =
            UnsubscribeGroupResponse.builder()
                .data(
                    UnsubscribeGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("x")
                        .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedUnsubscribeGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsubscribeGroupResponse),
                jacksonTypeRef<UnsubscribeGroupResponse>(),
            )

        assertThat(roundtrippedUnsubscribeGroupResponse).isEqualTo(unsubscribeGroupResponse)
    }
}
