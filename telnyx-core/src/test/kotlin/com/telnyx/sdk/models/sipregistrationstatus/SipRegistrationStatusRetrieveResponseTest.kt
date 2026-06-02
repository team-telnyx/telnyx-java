// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusRetrieveResponseTest {

    @Test
    fun create() {
        val sipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse.builder()
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .credentialUsername("credential_username")
                .lastRegistrationResponse("200 OK")
                .registered(true)
                .sipRegistrationDetails(
                    SipRegistrationStatusRetrieveResponse.SipRegistrationDetails.builder()
                        .authRetries(0L)
                        .expires(0L)
                        .failures(0L)
                        .nextActionAt(0L)
                        .sipUriUserHost("sipUriUserHost")
                        .uptime(0L)
                        .build()
                )
                .sipRegistrationStatus(
                    SipRegistrationStatusRetrieveResponse.SipRegistrationStatus.UNREGISTERING
                )
                .build()

        assertThat(sipRegistrationStatusRetrieveResponse.connectionId()).contains("connection_id")
        assertThat(sipRegistrationStatusRetrieveResponse.connectionName())
            .contains("connection_name")
        assertThat(sipRegistrationStatusRetrieveResponse.credentialType())
            .contains(SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL)
        assertThat(sipRegistrationStatusRetrieveResponse.credentialUsername())
            .contains("credential_username")
        assertThat(sipRegistrationStatusRetrieveResponse.lastRegistrationResponse())
            .contains("200 OK")
        assertThat(sipRegistrationStatusRetrieveResponse.registered()).contains(true)
        assertThat(sipRegistrationStatusRetrieveResponse.sipRegistrationDetails())
            .contains(
                SipRegistrationStatusRetrieveResponse.SipRegistrationDetails.builder()
                    .authRetries(0L)
                    .expires(0L)
                    .failures(0L)
                    .nextActionAt(0L)
                    .sipUriUserHost("sipUriUserHost")
                    .uptime(0L)
                    .build()
            )
        assertThat(sipRegistrationStatusRetrieveResponse.sipRegistrationStatus())
            .contains(SipRegistrationStatusRetrieveResponse.SipRegistrationStatus.UNREGISTERING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse.builder()
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .credentialUsername("credential_username")
                .lastRegistrationResponse("200 OK")
                .registered(true)
                .sipRegistrationDetails(
                    SipRegistrationStatusRetrieveResponse.SipRegistrationDetails.builder()
                        .authRetries(0L)
                        .expires(0L)
                        .failures(0L)
                        .nextActionAt(0L)
                        .sipUriUserHost("sipUriUserHost")
                        .uptime(0L)
                        .build()
                )
                .sipRegistrationStatus(
                    SipRegistrationStatusRetrieveResponse.SipRegistrationStatus.UNREGISTERING
                )
                .build()

        val roundtrippedSipRegistrationStatusRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sipRegistrationStatusRetrieveResponse),
                jacksonTypeRef<SipRegistrationStatusRetrieveResponse>(),
            )

        assertThat(roundtrippedSipRegistrationStatusRetrieveResponse)
            .isEqualTo(sipRegistrationStatusRetrieveResponse)
    }
}
