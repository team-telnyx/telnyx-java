// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRetrieveResponseTest {

    @Test
    fun create() {
        val batchRetrieveResponse =
            BatchRetrieveResponse.builder()
                .data(
                    BatchRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(BatchRetrieveResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                        .status(EmailValidationBatchStatus.PENDING)
                        .total(0L)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .results(
                            BatchRetrieveResponse.Data.Results.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "checks" to
                                                mapOf(
                                                    "disposable" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "mx" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "role_based" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "syntax" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "typo" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                            "suggestion" to "suggestion",
                                                        ),
                                                ),
                                            "email" to "email",
                                            "risk_score" to 0,
                                            "valid" to true,
                                            "did_you_mean" to "did_you_mean",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .webhookUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(batchRetrieveResponse.data())
            .isEqualTo(
                BatchRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recordType(BatchRetrieveResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                    .status(EmailValidationBatchStatus.PENDING)
                    .total(0L)
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .results(
                        BatchRetrieveResponse.Data.Results.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "checks" to
                                            mapOf(
                                                "disposable" to
                                                    mapOf("pass" to true, "details" to "details"),
                                                "mx" to
                                                    mapOf("pass" to true, "details" to "details"),
                                                "role_based" to
                                                    mapOf("pass" to true, "details" to "details"),
                                                "syntax" to
                                                    mapOf("pass" to true, "details" to "details"),
                                                "typo" to
                                                    mapOf(
                                                        "pass" to true,
                                                        "details" to "details",
                                                        "suggestion" to "suggestion",
                                                    ),
                                            ),
                                        "email" to "email",
                                        "risk_score" to 0,
                                        "valid" to true,
                                        "did_you_mean" to "did_you_mean",
                                    )
                                ),
                            )
                            .build()
                    )
                    .webhookUrl("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRetrieveResponse =
            BatchRetrieveResponse.builder()
                .data(
                    BatchRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(BatchRetrieveResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                        .status(EmailValidationBatchStatus.PENDING)
                        .total(0L)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .results(
                            BatchRetrieveResponse.Data.Results.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "checks" to
                                                mapOf(
                                                    "disposable" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "mx" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "role_based" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "syntax" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                        ),
                                                    "typo" to
                                                        mapOf(
                                                            "pass" to true,
                                                            "details" to "details",
                                                            "suggestion" to "suggestion",
                                                        ),
                                                ),
                                            "email" to "email",
                                            "risk_score" to 0,
                                            "valid" to true,
                                            "did_you_mean" to "did_you_mean",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .webhookUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedBatchRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRetrieveResponse),
                jacksonTypeRef<BatchRetrieveResponse>(),
            )

        assertThat(roundtrippedBatchRetrieveResponse).isEqualTo(batchRetrieveResponse)
    }
}
