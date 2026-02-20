// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageRetrieveResponseTest {

    @Test
    fun create() {
        val logMessageRetrieveResponse =
            LogMessageRetrieveResponse.builder()
                .addLogMessage(
                    LogMessageRetrieveResponse.LogMessage.builder()
                        .code("10015")
                        .title("Invalid attribute")
                        .detail(
                            "The value provided for the attribute is not valid. Check the value used and try again."
                        )
                        .meta(
                            LogMessageRetrieveResponse.LogMessage.Meta.builder()
                                .externalConnectionId("1293384261075731499")
                                .telephoneNumber("+12345678")
                                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                                .build()
                        )
                        .source(
                            LogMessageRetrieveResponse.LogMessage.Source.builder()
                                .pointer("/attribute")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(logMessageRetrieveResponse.logMessages().getOrNull())
            .containsExactly(
                LogMessageRetrieveResponse.LogMessage.builder()
                    .code("10015")
                    .title("Invalid attribute")
                    .detail(
                        "The value provided for the attribute is not valid. Check the value used and try again."
                    )
                    .meta(
                        LogMessageRetrieveResponse.LogMessage.Meta.builder()
                            .externalConnectionId("1293384261075731499")
                            .telephoneNumber("+12345678")
                            .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                            .build()
                    )
                    .source(
                        LogMessageRetrieveResponse.LogMessage.Source.builder()
                            .pointer("/attribute")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessageRetrieveResponse =
            LogMessageRetrieveResponse.builder()
                .addLogMessage(
                    LogMessageRetrieveResponse.LogMessage.builder()
                        .code("10015")
                        .title("Invalid attribute")
                        .detail(
                            "The value provided for the attribute is not valid. Check the value used and try again."
                        )
                        .meta(
                            LogMessageRetrieveResponse.LogMessage.Meta.builder()
                                .externalConnectionId("1293384261075731499")
                                .telephoneNumber("+12345678")
                                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                                .build()
                        )
                        .source(
                            LogMessageRetrieveResponse.LogMessage.Source.builder()
                                .pointer("/attribute")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedLogMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessageRetrieveResponse),
                jacksonTypeRef<LogMessageRetrieveResponse>(),
            )

        assertThat(roundtrippedLogMessageRetrieveResponse).isEqualTo(logMessageRetrieveResponse)
    }
}
