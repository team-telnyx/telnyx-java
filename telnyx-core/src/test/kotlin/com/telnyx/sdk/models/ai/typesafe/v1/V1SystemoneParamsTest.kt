// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.typesafe.v1

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SystemoneParamsTest {

    @Test
    fun create() {
        V1SystemoneParams.builder()
            .questions(
                V1SystemoneParams.Questions.builder()
                    .putAdditionalProperty(
                        "team",
                        JsonValue.from(
                            mapOf(
                                "criteria" to
                                    mapOf(
                                        "billing" to "Payments and refunds",
                                        "technical_support" to
                                            "Service faults and technical problems",
                                        "sales" to "New purchases",
                                    ),
                                "instructions" to
                                    "Choose the team that should handle this incident.",
                                "type" to "choice",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "production_incident",
                        JsonValue.from(
                            mapOf(
                                "instructions" to
                                    "Does the message describe an active production incident?",
                                "type" to "noul",
                                "criteria" to mapOf("false" to "false", "true" to "true"),
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "urgency",
                        JsonValue.from(
                            mapOf(
                                "criteria" to listOf("Low", "Normal", "High", "Critical"),
                                "instructions" to "Rate operational urgency.",
                                "type" to "score",
                            )
                        ),
                    )
                    .build()
            )
            .state("Our production calls are failing. Every customer is affected.")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SystemoneParams.builder()
                .questions(
                    V1SystemoneParams.Questions.builder()
                        .putAdditionalProperty(
                            "team",
                            JsonValue.from(
                                mapOf(
                                    "criteria" to
                                        mapOf(
                                            "billing" to "Payments and refunds",
                                            "technical_support" to
                                                "Service faults and technical problems",
                                            "sales" to "New purchases",
                                        ),
                                    "instructions" to
                                        "Choose the team that should handle this incident.",
                                    "type" to "choice",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "production_incident",
                            JsonValue.from(
                                mapOf(
                                    "instructions" to
                                        "Does the message describe an active production incident?",
                                    "type" to "noul",
                                    "criteria" to mapOf("false" to "false", "true" to "true"),
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "urgency",
                            JsonValue.from(
                                mapOf(
                                    "criteria" to listOf("Low", "Normal", "High", "Critical"),
                                    "instructions" to "Rate operational urgency.",
                                    "type" to "score",
                                )
                            ),
                        )
                        .build()
                )
                .state("Our production calls are failing. Every customer is affected.")
                .build()

        val body = params._body()

        assertThat(body.questions())
            .isEqualTo(
                V1SystemoneParams.Questions.builder()
                    .putAdditionalProperty(
                        "team",
                        JsonValue.from(
                            mapOf(
                                "criteria" to
                                    mapOf(
                                        "billing" to "Payments and refunds",
                                        "technical_support" to
                                            "Service faults and technical problems",
                                        "sales" to "New purchases",
                                    ),
                                "instructions" to
                                    "Choose the team that should handle this incident.",
                                "type" to "choice",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "production_incident",
                        JsonValue.from(
                            mapOf(
                                "instructions" to
                                    "Does the message describe an active production incident?",
                                "type" to "noul",
                                "criteria" to mapOf("false" to "false", "true" to "true"),
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "urgency",
                        JsonValue.from(
                            mapOf(
                                "criteria" to listOf("Low", "Normal", "High", "Critical"),
                                "instructions" to "Rate operational urgency.",
                                "type" to "score",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.state())
            .isEqualTo(
                V1SystemoneParams.State.ofString(
                    "Our production calls are failing. Every customer is affected."
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1SystemoneParams.builder()
                .questions(
                    V1SystemoneParams.Questions.builder()
                        .putAdditionalProperty(
                            "team",
                            JsonValue.from(
                                mapOf(
                                    "criteria" to
                                        mapOf(
                                            "billing" to "Payments and refunds",
                                            "technical_support" to
                                                "Service faults and technical problems",
                                            "sales" to "New purchases",
                                        ),
                                    "instructions" to
                                        "Choose the team that should handle this incident.",
                                    "type" to "choice",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "production_incident",
                            JsonValue.from(
                                mapOf(
                                    "instructions" to
                                        "Does the message describe an active production incident?",
                                    "type" to "noul",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "urgency",
                            JsonValue.from(
                                mapOf(
                                    "criteria" to listOf("Low", "Normal", "High", "Critical"),
                                    "instructions" to "Rate operational urgency.",
                                    "type" to "score",
                                )
                            ),
                        )
                        .build()
                )
                .state("Our production calls are failing. Every customer is affected.")
                .build()

        val body = params._body()

        assertThat(body.questions())
            .isEqualTo(
                V1SystemoneParams.Questions.builder()
                    .putAdditionalProperty(
                        "team",
                        JsonValue.from(
                            mapOf(
                                "criteria" to
                                    mapOf(
                                        "billing" to "Payments and refunds",
                                        "technical_support" to
                                            "Service faults and technical problems",
                                        "sales" to "New purchases",
                                    ),
                                "instructions" to
                                    "Choose the team that should handle this incident.",
                                "type" to "choice",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "production_incident",
                        JsonValue.from(
                            mapOf(
                                "instructions" to
                                    "Does the message describe an active production incident?",
                                "type" to "noul",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "urgency",
                        JsonValue.from(
                            mapOf(
                                "criteria" to listOf("Low", "Normal", "High", "Critical"),
                                "instructions" to "Rate operational urgency.",
                                "type" to "score",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.state())
            .isEqualTo(
                V1SystemoneParams.State.ofString(
                    "Our production calls are failing. Every customer is affected."
                )
            )
    }
}
