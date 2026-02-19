// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumbersFeatureServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numbersFeatureServiceAsync = client.numbersFeatures()

        val numbersFeatureFuture =
            numbersFeatureServiceAsync.create(
                NumbersFeatureCreateParams.builder().addPhoneNumber("string").build()
            )

        val numbersFeature = numbersFeatureFuture.get()
        numbersFeature.validate()
    }
}
