// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageTest {

    @Test
    fun create() {
        val logMessage =
            LogMessage.builder()
                .code("10015")
                .title("Invalid attribute")
                .detail(
                    "The value provided for the attribute is not valid. Check the value used and try again."
                )
                .meta(
                    LogMessage.Meta.builder()
                        .externalConnectionId("1293384261075731499")
                        .telephoneNumber("+12345678")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .source(LogMessage.Source.builder().pointer("/attribute").build())
                .build()

        assertThat(logMessage.code()).isEqualTo("10015")
        assertThat(logMessage.title()).isEqualTo("Invalid attribute")
        assertThat(logMessage.detail())
            .contains(
                "The value provided for the attribute is not valid. Check the value used and try again."
            )
        assertThat(logMessage.meta())
            .contains(
                LogMessage.Meta.builder()
                    .externalConnectionId("1293384261075731499")
                    .telephoneNumber("+12345678")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
        assertThat(logMessage.source())
            .contains(LogMessage.Source.builder().pointer("/attribute").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessage =
            LogMessage.builder()
                .code("10015")
                .title("Invalid attribute")
                .detail(
                    "The value provided for the attribute is not valid. Check the value used and try again."
                )
                .meta(
                    LogMessage.Meta.builder()
                        .externalConnectionId("1293384261075731499")
                        .telephoneNumber("+12345678")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .source(LogMessage.Source.builder().pointer("/attribute").build())
                .build()

        val roundtrippedLogMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessage),
                jacksonTypeRef<LogMessage>(),
            )

        assertThat(roundtrippedLogMessage).isEqualTo(logMessage)
    }
}
