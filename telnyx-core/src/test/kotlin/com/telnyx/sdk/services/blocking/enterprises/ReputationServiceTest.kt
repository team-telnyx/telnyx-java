// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.ReputationCheckFrequency
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

        val enterpriseReputationPublicWrapped =
            reputationService.retrieve("4a6192a4-573d-446d-b3ce-aff9117272a6")

        enterpriseReputationPublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        reputationService.disable("4a6192a4-573d-446d-b3ce-aff9117272a6")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        val enterpriseReputationPublicWrapped =
            reputationService.enable(
                ReputationEnableParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        enterpriseReputationPublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFrequency() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val reputationService = client.enterprises().reputation()

        val enterpriseReputationPublicWrapped =
            reputationService.updateFrequency(
                ReputationUpdateFrequencyParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .checkFrequency(ReputationCheckFrequency.WEEKLY)
                    .build()
            )

        enterpriseReputationPublicWrapped.validate()
    }
}
