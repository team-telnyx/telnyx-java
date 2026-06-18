// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageListPageResponseTest {

    @Test
    fun create() {
        val logMessageListPageResponse =
            LogMessageListPageResponse.builder()
                .addLogMessage(
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
                        .source(
                            LogMessageListResponse.Source.builder().pointer("/attribute").build()
                        )
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(logMessageListPageResponse.logMessages().getOrNull())
            .containsExactly(
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
            )
        assertThat(logMessageListPageResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessageListPageResponse =
            LogMessageListPageResponse.builder()
                .addLogMessage(
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
                        .source(
                            LogMessageListResponse.Source.builder().pointer("/attribute").build()
                        )
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedLogMessageListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessageListPageResponse),
                jacksonTypeRef<LogMessageListPageResponse>(),
            )

        assertThat(roundtrippedLogMessageListPageResponse).isEqualTo(logMessageListPageResponse)
    }
}
