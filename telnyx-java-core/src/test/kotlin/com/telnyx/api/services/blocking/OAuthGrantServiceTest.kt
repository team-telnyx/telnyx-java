// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.oauthgrants.OAuthGrantListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthGrantServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantService = client.oauthGrants()

        val oauthGrant = oauthGrantService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        oauthGrant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantService = client.oauthGrants()

        val oauthGrants =
            oauthGrantService.list(
                OAuthGrantListParams.builder().pageNumber(1L).pageSize(1L).build()
            )

        oauthGrants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantService = client.oauthGrants()

        val oauthGrant = oauthGrantService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        oauthGrant.validate()
    }
}
