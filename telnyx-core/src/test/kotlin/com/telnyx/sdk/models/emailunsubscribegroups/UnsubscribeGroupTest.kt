// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnsubscribeGroupTest {

    @Test
    fun create() {
        val unsubscribeGroup =
            UnsubscribeGroup.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("x")
                .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(unsubscribeGroup.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(unsubscribeGroup.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(unsubscribeGroup.description()).contains("description")
        assertThat(unsubscribeGroup.name()).isEqualTo("x")
        assertThat(unsubscribeGroup.recordType())
            .isEqualTo(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
        assertThat(unsubscribeGroup.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unsubscribeGroup =
            UnsubscribeGroup.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("x")
                .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUnsubscribeGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsubscribeGroup),
                jacksonTypeRef<UnsubscribeGroup>(),
            )

        assertThat(roundtrippedUnsubscribeGroup).isEqualTo(unsubscribeGroup)
    }
}
