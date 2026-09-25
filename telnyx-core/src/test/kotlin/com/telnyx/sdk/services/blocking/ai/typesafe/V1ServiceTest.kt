// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.typesafe

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.typesafe.v1.V1SystemoneParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun systemone() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val v1Service = client.ai().typesafe().v1()

        val response =
            v1Service.systemone(
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
                    .model(V1SystemoneParams.Model.TELNYX_DECISION_FLASH)
                    .build()
            )

        response.validate()
    }
}
