// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageListResponseTest {

    @Test
    fun create() {
        val logMessageListResponse =
            LogMessageListResponse.builder()
                .code("10015")
                .title("Invalid attribute")
                .detail(
                    "The value provided for the attribute is not valid. Check the value used and try again."
                )
                .meta(
                    LogMessageListResponse.Meta.builder()
                        .externalConnectionId("1293384261075731499")
                        .telephoneNumber("+12345678")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .source(LogMessageListResponse.Source.builder().pointer("/attribute").build())
                .build()

        assertThat(logMessageListResponse.code()).isEqualTo("10015")
        assertThat(logMessageListResponse.title()).isEqualTo("Invalid attribute")
        assertThat(logMessageListResponse.detail())
            .contains(
                "The value provided for the attribute is not valid. Check the value used and try again."
            )
        assertThat(logMessageListResponse.meta())
            .contains(
                LogMessageListResponse.Meta.builder()
                    .externalConnectionId("1293384261075731499")
                    .telephoneNumber("+12345678")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
        assertThat(logMessageListResponse.source())
            .contains(LogMessageListResponse.Source.builder().pointer("/attribute").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessageListResponse =
            LogMessageListResponse.builder()
                .code("10015")
                .title("Invalid attribute")
                .detail(
                    "The value provided for the attribute is not valid. Check the value used and try again."
                )
                .meta(
                    LogMessageListResponse.Meta.builder()
                        .externalConnectionId("1293384261075731499")
                        .telephoneNumber("+12345678")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .source(LogMessageListResponse.Source.builder().pointer("/attribute").build())
                .build()

        val roundtrippedLogMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessageListResponse),
                jacksonTypeRef<LogMessageListResponse>(),
            )

        assertThat(roundtrippedLogMessageListResponse).isEqualTo(logMessageListResponse)
    }
}
