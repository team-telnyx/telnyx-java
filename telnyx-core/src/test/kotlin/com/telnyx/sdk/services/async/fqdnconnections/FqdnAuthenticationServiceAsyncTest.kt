// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.fqdnconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fqdnAuthenticationServiceAsync = client.fqdnConnections().fqdnAuthentication()

        val fqdnAuthenticationsFuture = fqdnAuthenticationServiceAsync.list("fqdn_connection_id")

        val fqdnAuthentications = fqdnAuthenticationsFuture.get()
        fqdnAuthentications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fqdnAuthenticationServiceAsync = client.fqdnConnections().fqdnAuthentication()

        val responseFuture =
            fqdnAuthenticationServiceAsync.patchAll(
                FqdnAuthenticationPatchAllParams.builder()
                    .fqdnConnectionId("fqdn_connection_id")
                    .failoverUrl("https://failover.example.com")
                    .fqdnOutboundAuthentication(
                        FqdnAuthenticationPatchAllParams.FqdnOutboundAuthentication
                            .IP_AUTHENTICATION
                    )
                    .ipAuthenticationMethod(
                        FqdnAuthenticationPatchAllParams.IpAuthenticationMethod.P_CHARGE_INFO
                    )
                    .password("new_password")
                    .txtName("new_txt_name")
                    .txtTtl(300L)
                    .txtValue("new_txt_value")
                    .userName("newusername")
                    .webhookUrl("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
