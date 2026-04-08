// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReputationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        val reputation = reputationService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        reputation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        reputationService.disable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        val response =
            reputationService.enable(
                ReputationEnableParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .loaDocumentId("doc_01HXYZ1234ABCDEF")
                    .checkFrequency(ReputationEnableParams.CheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFrequency() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        val response =
            reputationService.updateFrequency(
                ReputationUpdateFrequencyParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        response.validate()
    }
}
