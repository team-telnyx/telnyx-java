// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusListResponseTest {

    @Test
    fun create() {
        val sipRegistrationStatusListResponse =
            SipRegistrationStatusListResponse.builder()
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusListResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .credentialUsername("credential_username")
                .lastRegistrationResponse("200 OK")
                .registered(true)
                .sipRegistrationDetails(
                    SipRegistrationStatusListResponse.SipRegistrationDetails.builder()
                        .authRetries(0L)
                        .expires(0L)
                        .failures(0L)
                        .lastModified("last_modified")
                        .nextActionAt(0L)
                        .sipUriUserHost("sip_uri_user_host")
                        .transport("transport")
                        .uaIp("ua_ip")
                        .uaPort(0L)
                        .uptime(0L)
                        .build()
                )
                .sipRegistrationStatus(
                    SipRegistrationStatusListResponse.SipRegistrationStatus.UNREGISTERING
                )
                .build()

        assertThat(sipRegistrationStatusListResponse.connectionId()).contains("connection_id")
        assertThat(sipRegistrationStatusListResponse.connectionName()).contains("connection_name")
        assertThat(sipRegistrationStatusListResponse.credentialType())
            .contains(SipRegistrationStatusListResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL)
        assertThat(sipRegistrationStatusListResponse.credentialUsername())
            .contains("credential_username")
        assertThat(sipRegistrationStatusListResponse.lastRegistrationResponse()).contains("200 OK")
        assertThat(sipRegistrationStatusListResponse.registered()).contains(true)
        assertThat(sipRegistrationStatusListResponse.sipRegistrationDetails())
            .contains(
                SipRegistrationStatusListResponse.SipRegistrationDetails.builder()
                    .authRetries(0L)
                    .expires(0L)
                    .failures(0L)
                    .lastModified("last_modified")
                    .nextActionAt(0L)
                    .sipUriUserHost("sip_uri_user_host")
                    .transport("transport")
                    .uaIp("ua_ip")
                    .uaPort(0L)
                    .uptime(0L)
                    .build()
            )
        assertThat(sipRegistrationStatusListResponse.sipRegistrationStatus())
            .contains(SipRegistrationStatusListResponse.SipRegistrationStatus.UNREGISTERING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sipRegistrationStatusListResponse =
            SipRegistrationStatusListResponse.builder()
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusListResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .credentialUsername("credential_username")
                .lastRegistrationResponse("200 OK")
                .registered(true)
                .sipRegistrationDetails(
                    SipRegistrationStatusListResponse.SipRegistrationDetails.builder()
                        .authRetries(0L)
                        .expires(0L)
                        .failures(0L)
                        .lastModified("last_modified")
                        .nextActionAt(0L)
                        .sipUriUserHost("sip_uri_user_host")
                        .transport("transport")
                        .uaIp("ua_ip")
                        .uaPort(0L)
                        .uptime(0L)
                        .build()
                )
                .sipRegistrationStatus(
                    SipRegistrationStatusListResponse.SipRegistrationStatus.UNREGISTERING
                )
                .build()

        val roundtrippedSipRegistrationStatusListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sipRegistrationStatusListResponse),
                jacksonTypeRef<SipRegistrationStatusListResponse>(),
            )

        assertThat(roundtrippedSipRegistrationStatusListResponse)
            .isEqualTo(sipRegistrationStatusListResponse)
    }
}
