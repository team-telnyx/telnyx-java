// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.reputation.ReputationCheckFrequency
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReputationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val enterpriseReputationPublicWrappedFuture =
            reputationServiceAsync.retrieve("4a6192a4-573d-446d-b3ce-aff9117272a6")

        val enterpriseReputationPublicWrapped = enterpriseReputationPublicWrappedFuture.get()
        enterpriseReputationPublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val future = reputationServiceAsync.disable("4a6192a4-573d-446d-b3ce-aff9117272a6")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val enterpriseReputationPublicWrappedFuture =
            reputationServiceAsync.enable(
                ReputationEnableParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        val enterpriseReputationPublicWrapped = enterpriseReputationPublicWrappedFuture.get()
        enterpriseReputationPublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFrequency() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val enterpriseReputationPublicWrappedFuture =
            reputationServiceAsync.updateFrequency(
                ReputationUpdateFrequencyParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .checkFrequency(ReputationCheckFrequency.WEEKLY)
                    .build()
            )

        val enterpriseReputationPublicWrapped = enterpriseReputationPublicWrappedFuture.get()
        enterpriseReputationPublicWrapped.validate()
    }
}
