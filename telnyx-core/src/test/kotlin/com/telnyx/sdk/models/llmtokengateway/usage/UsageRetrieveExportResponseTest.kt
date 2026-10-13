// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveExportResponseTest {

    @Test
    fun create() {
        val usageRetrieveExportResponse =
            UsageRetrieveExportResponse.builder()
                .addData(
                    UsageRetrieveExportResponse.Data.InferenceRequest.builder()
                        .id("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .attempts(0L)
                        .biller(UsageRetrieveExportResponse.Data.InferenceRequest.Biller.TELNYX)
                        .cacheHit(true)
                        .configurationVersion(1L)
                        .cost("1000000000.000000")
                        .endUserId("end_user_id")
                        .inputTokens(0L)
                        .metadata(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                                .build()
                        )
                        .model("model")
                        .outputTokens(0L)
                        .protocol(UsageRetrieveExportResponse.Data.InferenceRequest.Protocol.OPENAI)
                        .provider("provider")
                        .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .providerModel("provider_model")
                        .rateVersion("rate_version")
                        .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .revision(1L)
                        .routeMode(
                            UsageRetrieveExportResponse.Data.InferenceRequest.RouteMode.MANAGED
                        )
                        .status(UsageRetrieveExportResponse.Data.InferenceRequest.Status.SUCCEEDED)
                        .stream(true)
                        .supersedes("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .timings(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Timings.builder()
                                .admittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .firstAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .gatewayDurationMs(0L)
                                .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .usageSource(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageSource.PROVIDER
                        )
                        .usageStatus(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageStatus.KNOWN
                        )
                        .build()
                )
                .meta(
                    UsageRetrieveExportResponse.Meta.builder()
                        .hasMore(true)
                        .horizonLagSeconds(0L)
                        .nextCursor("next_cursor")
                        .build()
                )
                .build()

        assertThat(usageRetrieveExportResponse.data())
            .containsExactly(
                UsageRetrieveExportResponse.Data.ofInferenceRequest(
                    UsageRetrieveExportResponse.Data.InferenceRequest.builder()
                        .id("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .attempts(0L)
                        .biller(UsageRetrieveExportResponse.Data.InferenceRequest.Biller.TELNYX)
                        .cacheHit(true)
                        .configurationVersion(1L)
                        .cost("1000000000.000000")
                        .endUserId("end_user_id")
                        .inputTokens(0L)
                        .metadata(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                                .build()
                        )
                        .model("model")
                        .outputTokens(0L)
                        .protocol(UsageRetrieveExportResponse.Data.InferenceRequest.Protocol.OPENAI)
                        .provider("provider")
                        .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .providerModel("provider_model")
                        .rateVersion("rate_version")
                        .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .revision(1L)
                        .routeMode(
                            UsageRetrieveExportResponse.Data.InferenceRequest.RouteMode.MANAGED
                        )
                        .status(UsageRetrieveExportResponse.Data.InferenceRequest.Status.SUCCEEDED)
                        .stream(true)
                        .supersedes("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .timings(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Timings.builder()
                                .admittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .firstAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .gatewayDurationMs(0L)
                                .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .usageSource(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageSource.PROVIDER
                        )
                        .usageStatus(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageStatus.KNOWN
                        )
                        .build()
                )
            )
        assertThat(usageRetrieveExportResponse.meta())
            .isEqualTo(
                UsageRetrieveExportResponse.Meta.builder()
                    .hasMore(true)
                    .horizonLagSeconds(0L)
                    .nextCursor("next_cursor")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageRetrieveExportResponse =
            UsageRetrieveExportResponse.builder()
                .addData(
                    UsageRetrieveExportResponse.Data.InferenceRequest.builder()
                        .id("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .attempts(0L)
                        .biller(UsageRetrieveExportResponse.Data.InferenceRequest.Biller.TELNYX)
                        .cacheHit(true)
                        .configurationVersion(1L)
                        .cost("1000000000.000000")
                        .endUserId("end_user_id")
                        .inputTokens(0L)
                        .metadata(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                                .build()
                        )
                        .model("model")
                        .outputTokens(0L)
                        .protocol(UsageRetrieveExportResponse.Data.InferenceRequest.Protocol.OPENAI)
                        .provider("provider")
                        .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .providerModel("provider_model")
                        .rateVersion("rate_version")
                        .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .revision(1L)
                        .routeMode(
                            UsageRetrieveExportResponse.Data.InferenceRequest.RouteMode.MANAGED
                        )
                        .status(UsageRetrieveExportResponse.Data.InferenceRequest.Status.SUCCEEDED)
                        .stream(true)
                        .supersedes("req_-2fdc-d-d8--bb--3a671d0-3-ae4a0-33c-_r9667572")
                        .timings(
                            UsageRetrieveExportResponse.Data.InferenceRequest.Timings.builder()
                                .admittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .firstAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .gatewayDurationMs(0L)
                                .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .usageSource(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageSource.PROVIDER
                        )
                        .usageStatus(
                            UsageRetrieveExportResponse.Data.InferenceRequest.UsageStatus.KNOWN
                        )
                        .build()
                )
                .meta(
                    UsageRetrieveExportResponse.Meta.builder()
                        .hasMore(true)
                        .horizonLagSeconds(0L)
                        .nextCursor("next_cursor")
                        .build()
                )
                .build()

        val roundtrippedUsageRetrieveExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageRetrieveExportResponse),
                jacksonTypeRef<UsageRetrieveExportResponse>(),
            )

        assertThat(roundtrippedUsageRetrieveExportResponse).isEqualTo(usageRetrieveExportResponse)
    }
}
