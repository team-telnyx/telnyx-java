// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections.fqdnauthentication

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationPatchAllResponseTest {

    @Test
    fun create() {
        val fqdnAuthenticationPatchAllResponse =
            FqdnAuthenticationPatchAllResponse.builder()
                .data(
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
                )
                .build()

        assertThat(fqdnAuthenticationPatchAllResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fqdnAuthenticationPatchAllResponse =
            FqdnAuthenticationPatchAllResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedFqdnAuthenticationPatchAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnAuthenticationPatchAllResponse),
                jacksonTypeRef<FqdnAuthenticationPatchAllResponse>(),
            )

        assertThat(roundtrippedFqdnAuthenticationPatchAllResponse)
            .isEqualTo(fqdnAuthenticationPatchAllResponse)
    }
}
