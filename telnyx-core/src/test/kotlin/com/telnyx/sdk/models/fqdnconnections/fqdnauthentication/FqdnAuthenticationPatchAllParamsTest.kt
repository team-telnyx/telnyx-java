// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections.fqdnauthentication

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationPatchAllParamsTest {

    @Test
    fun create() {
        FqdnAuthenticationPatchAllParams.builder()
            .fqdnConnectionId("fqdn_connection_id")
            .failoverUrl("https://failover.example.com")
            .fqdnOutboundAuthentication(
                FqdnAuthenticationPatchAllParams.FqdnOutboundAuthentication.IP_AUTHENTICATION
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
    }

    @Test
    fun pathParams() {
        val params =
            FqdnAuthenticationPatchAllParams.builder()
                .fqdnConnectionId("fqdn_connection_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fqdn_connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FqdnAuthenticationPatchAllParams.builder()
                .fqdnConnectionId("fqdn_connection_id")
                .failoverUrl("https://failover.example.com")
                .fqdnOutboundAuthentication(
                    FqdnAuthenticationPatchAllParams.FqdnOutboundAuthentication.IP_AUTHENTICATION
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

        val body = params._body()

        assertThat(body.failoverUrl()).contains("https://failover.example.com")
        assertThat(body.fqdnOutboundAuthentication())
            .contains(FqdnAuthenticationPatchAllParams.FqdnOutboundAuthentication.IP_AUTHENTICATION)
        assertThat(body.ipAuthenticationMethod())
            .contains(FqdnAuthenticationPatchAllParams.IpAuthenticationMethod.P_CHARGE_INFO)
        assertThat(body.password()).contains("new_password")
        assertThat(body.txtName()).contains("new_txt_name")
        assertThat(body.txtTtl()).contains(300L)
        assertThat(body.txtValue()).contains("new_txt_value")
        assertThat(body.userName()).contains("newusername")
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FqdnAuthenticationPatchAllParams.builder()
                .fqdnConnectionId("fqdn_connection_id")
                .build()

        val body = params._body()
    }
}
