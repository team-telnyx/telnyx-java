// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationListPageResponseTest {

    @Test
    fun create() {
        val callControlApplicationListPageResponse =
            CallControlApplicationListPageResponse.builder()
                .addData(
                    CallControlApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                        .applicationName("call-router")
                        .callCostInWebhooks(false)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dtmfType(CallControlApplication.DtmfType.INBAND)
                        .firstCommandTimeout(true)
                        .firstCommandTimeoutSecs(10L)
                        .inbound(
                            CallControlApplicationInbound.builder()
                                .channelLimit(10L)
                                .shakenStirEnabled(true)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    CallControlApplicationInbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            CallControlApplicationOutbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
                        .redactDtmfDebugLogging(true)
                        .addTag("string")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(CallControlApplication.WebhookApiVersion.V1)
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

        assertThat(callControlApplicationListPageResponse.data().getOrNull())
            .containsExactly(
                CallControlApplication.builder()
                    .id("1293384261075731499")
                    .active(false)
                    .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                    .applicationName("call-router")
                    .callCostInWebhooks(false)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .dtmfType(CallControlApplication.DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .inbound(
                        CallControlApplicationInbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                CallControlApplicationInbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        CallControlApplicationOutbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .recordType(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
                    .redactDtmfDebugLogging(true)
                    .addTag("string")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .webhookApiVersion(CallControlApplication.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )
        assertThat(callControlApplicationListPageResponse.meta())
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
        val callControlApplicationListPageResponse =
            CallControlApplicationListPageResponse.builder()
                .addData(
                    CallControlApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                        .applicationName("call-router")
                        .callCostInWebhooks(false)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dtmfType(CallControlApplication.DtmfType.INBAND)
                        .firstCommandTimeout(true)
                        .firstCommandTimeoutSecs(10L)
                        .inbound(
                            CallControlApplicationInbound.builder()
                                .channelLimit(10L)
                                .shakenStirEnabled(true)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    CallControlApplicationInbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            CallControlApplicationOutbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
                        .redactDtmfDebugLogging(true)
                        .addTag("string")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(CallControlApplication.WebhookApiVersion.V1)
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

        val roundtrippedCallControlApplicationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlApplicationListPageResponse),
                jacksonTypeRef<CallControlApplicationListPageResponse>(),
            )

        assertThat(roundtrippedCallControlApplicationListPageResponse)
            .isEqualTo(callControlApplicationListPageResponse)
    }
}
