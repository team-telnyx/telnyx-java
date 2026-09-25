// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.typesafe.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SystemoneResponseTest {

    @Test
    fun create() {
        val v1SystemoneResponse =
            V1SystemoneResponse.builder()
                .answers(
                    V1SystemoneResponse.Answers.builder()
                        .putAdditionalProperty(
                            "team",
                            JsonValue.from(
                                mapOf(
                                    "choice" to "technical_support",
                                    "confidence" to 0.9820522416354122,
                                    "probabilities" to
                                        mapOf(
                                            "billing" to 0.0024719786572585446,
                                            "technical_support" to 0.9972674768333701,
                                            "sales" to 0.00026054450937119613,
                                        ),
                                    "type" to "choice",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "production_incident",
                            JsonValue.from(mapOf("noul" to 0.9991959141264766, "type" to "noul")),
                        )
                        .putAdditionalProperty(
                            "urgency",
                            JsonValue.from(
                                mapOf(
                                    "confidence" to 0.9894200002646713,
                                    "legend" to
                                        mapOf(
                                            "0" to "Low",
                                            "1" to "Normal",
                                            "2" to "High",
                                            "3" to "Critical",
                                        ),
                                    "probabilities" to
                                        mapOf(
                                            "0" to 0.0003348349100603869,
                                            "1" to 0.00003529133987660637,
                                            "2" to 0.0015006266723396524,
                                            "3" to 0.9981292470777234,
                                        ),
                                    "score" to 2.9974242859177265,
                                    "type" to "score",
                                )
                            ),
                        )
                        .build()
                )
                .model(V1SystemoneResponse.Model.TELNYX_DECISION_FLASH)
                .usage(
                    V1SystemoneResponse.Usage.builder().inputTokens(267L).outputTokens(4L).build()
                )
                .build()

        assertThat(v1SystemoneResponse.answers())
            .isEqualTo(
                V1SystemoneResponse.Answers.builder()
                    .putAdditionalProperty(
                        "team",
                        JsonValue.from(
                            mapOf(
                                "choice" to "technical_support",
                                "confidence" to 0.9820522416354122,
                                "probabilities" to
                                    mapOf(
                                        "billing" to 0.0024719786572585446,
                                        "technical_support" to 0.9972674768333701,
                                        "sales" to 0.00026054450937119613,
                                    ),
                                "type" to "choice",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "production_incident",
                        JsonValue.from(mapOf("noul" to 0.9991959141264766, "type" to "noul")),
                    )
                    .putAdditionalProperty(
                        "urgency",
                        JsonValue.from(
                            mapOf(
                                "confidence" to 0.9894200002646713,
                                "legend" to
                                    mapOf(
                                        "0" to "Low",
                                        "1" to "Normal",
                                        "2" to "High",
                                        "3" to "Critical",
                                    ),
                                "probabilities" to
                                    mapOf(
                                        "0" to 0.0003348349100603869,
                                        "1" to 0.00003529133987660637,
                                        "2" to 0.0015006266723396524,
                                        "3" to 0.9981292470777234,
                                    ),
                                "score" to 2.9974242859177265,
                                "type" to "score",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(v1SystemoneResponse.model())
            .isEqualTo(V1SystemoneResponse.Model.TELNYX_DECISION_FLASH)
        assertThat(v1SystemoneResponse.usage())
            .isEqualTo(
                V1SystemoneResponse.Usage.builder().inputTokens(267L).outputTokens(4L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SystemoneResponse =
            V1SystemoneResponse.builder()
                .answers(
                    V1SystemoneResponse.Answers.builder()
                        .putAdditionalProperty(
                            "team",
                            JsonValue.from(
                                mapOf(
                                    "choice" to "technical_support",
                                    "confidence" to 0.9820522416354122,
                                    "probabilities" to
                                        mapOf(
                                            "billing" to 0.0024719786572585446,
                                            "technical_support" to 0.9972674768333701,
                                            "sales" to 0.00026054450937119613,
                                        ),
                                    "type" to "choice",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "production_incident",
                            JsonValue.from(mapOf("noul" to 0.9991959141264766, "type" to "noul")),
                        )
                        .putAdditionalProperty(
                            "urgency",
                            JsonValue.from(
                                mapOf(
                                    "confidence" to 0.9894200002646713,
                                    "legend" to
                                        mapOf(
                                            "0" to "Low",
                                            "1" to "Normal",
                                            "2" to "High",
                                            "3" to "Critical",
                                        ),
                                    "probabilities" to
                                        mapOf(
                                            "0" to 0.0003348349100603869,
                                            "1" to 0.00003529133987660637,
                                            "2" to 0.0015006266723396524,
                                            "3" to 0.9981292470777234,
                                        ),
                                    "score" to 2.9974242859177265,
                                    "type" to "score",
                                )
                            ),
                        )
                        .build()
                )
                .model(V1SystemoneResponse.Model.TELNYX_DECISION_FLASH)
                .usage(
                    V1SystemoneResponse.Usage.builder().inputTokens(267L).outputTokens(4L).build()
                )
                .build()

        val roundtrippedV1SystemoneResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SystemoneResponse),
                jacksonTypeRef<V1SystemoneResponse>(),
            )

        assertThat(roundtrippedV1SystemoneResponse).isEqualTo(v1SystemoneResponse)
    }
}
