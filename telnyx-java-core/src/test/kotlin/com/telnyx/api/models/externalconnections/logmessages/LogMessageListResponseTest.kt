// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageListResponseTest {

    @Test
    fun create() {
        val logMessageListResponse =
            LogMessageListResponse.builder()
                .addLogMessage(
                    LogMessageListResponse.LogMessage.builder()
                        .code("code")
                        .title("Invalid attribute")
                        .detail(
                            "The value provided for the attribute is not valid. Check the value used and try again."
                        )
                        .meta(
                            LogMessageListResponse.LogMessage.Meta.builder()
                                .externalConnectionId("external_connection_id")
                                .telephoneNumber("+12345678")
                                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                                .build()
                        )
                        .source(
                            LogMessageListResponse.LogMessage.Source.builder()
                                .pointer("/attribute")
                                .build()
                        )
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(logMessageListResponse.logMessages().getOrNull())
            .containsExactly(
                LogMessageListResponse.LogMessage.builder()
                    .code("code")
                    .title("Invalid attribute")
                    .detail(
                        "The value provided for the attribute is not valid. Check the value used and try again."
                    )
                    .meta(
                        LogMessageListResponse.LogMessage.Meta.builder()
                            .externalConnectionId("external_connection_id")
                            .telephoneNumber("+12345678")
                            .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                            .build()
                    )
                    .source(
                        LogMessageListResponse.LogMessage.Source.builder()
                            .pointer("/attribute")
                            .build()
                    )
                    .build()
            )
        assertThat(logMessageListResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessageListResponse =
            LogMessageListResponse.builder()
                .addLogMessage(
                    LogMessageListResponse.LogMessage.builder()
                        .code("code")
                        .title("Invalid attribute")
                        .detail(
                            "The value provided for the attribute is not valid. Check the value used and try again."
                        )
                        .meta(
                            LogMessageListResponse.LogMessage.Meta.builder()
                                .externalConnectionId("external_connection_id")
                                .telephoneNumber("+12345678")
                                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                                .build()
                        )
                        .source(
                            LogMessageListResponse.LogMessage.Source.builder()
                                .pointer("/attribute")
                                .build()
                        )
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedLogMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessageListResponse),
                jacksonTypeRef<LogMessageListResponse>(),
            )

        assertThat(roundtrippedLogMessageListResponse).isEqualTo(logMessageListResponse)
    }
}
