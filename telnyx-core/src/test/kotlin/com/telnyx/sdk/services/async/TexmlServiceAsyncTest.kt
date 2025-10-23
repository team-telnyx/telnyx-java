// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TexmlServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun secrets() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlServiceAsync = client.texml()

        val responseFuture =
            texmlServiceAsync.secrets(
                TexmlSecretsParams.builder().name("My Secret Name").value("My Secret Value").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
