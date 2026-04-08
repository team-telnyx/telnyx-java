// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
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

        val reputationFuture =
            reputationServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val reputation = reputationFuture.get()
        reputation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val future = reputationServiceAsync.disable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val responseFuture =
            reputationServiceAsync.enable(
                ReputationEnableParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .loaDocumentId("doc_01HXYZ1234ABCDEF")
                    .checkFrequency(ReputationEnableParams.CheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFrequency() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reputationServiceAsync = client.enterprises().reputation()

        val responseFuture =
            reputationServiceAsync.updateFrequency(
                ReputationUpdateFrequencyParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
