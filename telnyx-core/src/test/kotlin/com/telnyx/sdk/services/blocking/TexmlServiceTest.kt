// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TexmlServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun secrets() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val texmlService = client.texml()

        val response =
            texmlService.secrets(
                TexmlSecretsParams.builder().name("My Secret Name").value("My Secret Value").build()
            )

        response.validate()
    }
}
