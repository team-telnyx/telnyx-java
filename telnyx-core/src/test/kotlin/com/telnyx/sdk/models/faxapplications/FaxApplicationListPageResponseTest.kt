// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxApplicationListPageResponseTest {

    @Test
    fun create() {
        val faxApplicationListPageResponse =
            FaxApplicationListPageResponse.builder()
                .addData(
                    FaxApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                        .applicationName("fax-router")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .inbound(
                            FaxApplication.Inbound.builder()
                                .channelLimit(10L)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    FaxApplication.Inbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            FaxApplication.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType("fax_application")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(faxApplicationListPageResponse.data().getOrNull())
            .containsExactly(
                FaxApplication.builder()
                    .id("1293384261075731499")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .applicationName("fax-router")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .inbound(
                        FaxApplication.Inbound.builder()
                            .channelLimit(10L)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                FaxApplication.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        FaxApplication.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .recordType("fax_application")
                    .addTag("tag1")
                    .addTag("tag2")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )
        assertThat(faxApplicationListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val faxApplicationListPageResponse =
            FaxApplicationListPageResponse.builder()
                .addData(
                    FaxApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                        .applicationName("fax-router")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .inbound(
                            FaxApplication.Inbound.builder()
                                .channelLimit(10L)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    FaxApplication.Inbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            FaxApplication.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType("fax_application")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedFaxApplicationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxApplicationListPageResponse),
                jacksonTypeRef<FaxApplicationListPageResponse>(),
            )

        assertThat(roundtrippedFaxApplicationListPageResponse)
            .isEqualTo(faxApplicationListPageResponse)
    }
}
