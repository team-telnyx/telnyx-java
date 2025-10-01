// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.oauthgrants.OAuthGrantListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthGrantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantServiceAsync = client.oauthGrants()

        val oauthGrantFuture =
            oauthGrantServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val oauthGrant = oauthGrantFuture.get()
        oauthGrant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantServiceAsync = client.oauthGrants()

        val oauthGrantsFuture =
            oauthGrantServiceAsync.list(
                OAuthGrantListParams.builder().pageNumber(1L).pageSize(1L).build()
            )

        val oauthGrants = oauthGrantsFuture.get()
        oauthGrants.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthGrantServiceAsync = client.oauthGrants()

        val oauthGrantFuture = oauthGrantServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val oauthGrant = oauthGrantFuture.get()
        oauthGrant.validate()
    }
}
