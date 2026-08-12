// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections.fqdnauthentication

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationTest {

    @Test
    fun create() {
        val fqdnAuthentication =
            FqdnAuthentication.builder()
                .id("1293384261075731499")
                .connectionId("1293384261075731499")
                .failoverUrl("https://example.com")
                .fqdnOutboundAuthentication(
                    FqdnAuthentication.FqdnOutboundAuthentication.IP_AUTHENTICATION
                )
                .ipAuthenticationMethod(FqdnAuthentication.IpAuthenticationMethod.TOKEN)
                .microsoftTeamsSbc(true)
                .password("password")
                .recordType("fqdn_authentication")
                .txtName("txt_name")
                .txtTtl(0L)
                .txtValue("txt_value")
                .userName("user_name")
                .webhookUrl("https://example.com")
                .build()

        assertThat(fqdnAuthentication.id()).contains("1293384261075731499")
        assertThat(fqdnAuthentication.connectionId()).contains("1293384261075731499")
        assertThat(fqdnAuthentication.failoverUrl()).contains("https://example.com")
        assertThat(fqdnAuthentication.fqdnOutboundAuthentication())
            .contains(FqdnAuthentication.FqdnOutboundAuthentication.IP_AUTHENTICATION)
        assertThat(fqdnAuthentication.ipAuthenticationMethod())
            .contains(FqdnAuthentication.IpAuthenticationMethod.TOKEN)
        assertThat(fqdnAuthentication.microsoftTeamsSbc()).contains(true)
        assertThat(fqdnAuthentication.password()).contains("password")
        assertThat(fqdnAuthentication.recordType()).contains("fqdn_authentication")
        assertThat(fqdnAuthentication.txtName()).contains("txt_name")
        assertThat(fqdnAuthentication.txtTtl()).contains(0L)
        assertThat(fqdnAuthentication.txtValue()).contains("txt_value")
        assertThat(fqdnAuthentication.userName()).contains("user_name")
        assertThat(fqdnAuthentication.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fqdnAuthentication =
            FqdnAuthentication.builder()
                .id("1293384261075731499")
                .connectionId("1293384261075731499")
                .failoverUrl("https://example.com")
                .fqdnOutboundAuthentication(
                    FqdnAuthentication.FqdnOutboundAuthentication.IP_AUTHENTICATION
                )
                .ipAuthenticationMethod(FqdnAuthentication.IpAuthenticationMethod.TOKEN)
                .microsoftTeamsSbc(true)
                .password("password")
                .recordType("fqdn_authentication")
                .txtName("txt_name")
                .txtTtl(0L)
                .txtValue("txt_value")
                .userName("user_name")
                .webhookUrl("https://example.com")
                .build()

        val roundtrippedFqdnAuthentication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnAuthentication),
                jacksonTypeRef<FqdnAuthentication>(),
            )

        assertThat(roundtrippedFqdnAuthentication).isEqualTo(fqdnAuthentication)
    }
}
