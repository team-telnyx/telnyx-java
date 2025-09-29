// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.numbersfeatures.NumbersFeatureCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumbersFeatureServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numbersFeatureServiceAsync = client.numbersFeatures()

        val numbersFeatureFuture =
            numbersFeatureServiceAsync.create(
                NumbersFeatureCreateParams.builder().addPhoneNumber("string").build()
            )

        val numbersFeature = numbersFeatureFuture.get()
        numbersFeature.validate()
    }
}
