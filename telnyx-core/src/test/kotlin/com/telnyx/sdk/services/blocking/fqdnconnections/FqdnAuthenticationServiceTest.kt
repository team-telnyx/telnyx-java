// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.fqdnconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnAuthenticationService = client.fqdnConnections().fqdnAuthentication()

        val fqdnAuthentications = fqdnAuthenticationService.list("fqdn_connection_id")

        fqdnAuthentications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnAuthenticationService = client.fqdnConnections().fqdnAuthentication()

        val response =
            fqdnAuthenticationService.patchAll(
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

        response.validate()
    }
}
