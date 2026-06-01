// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusRetrieveResponseTest {

    @Test
    fun create() {
        val sipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse.builder()
                .b2buaExternal(
                    SipRegistrationStatusRetrieveResponse.B2buaExternal.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .b2buaInternal(
                    SipRegistrationStatusRetrieveResponse.B2buaInternal.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .externalState("REGED")
                .externalUacSettings(
                    SipRegistrationStatusRetrieveResponse.ExternalUacSettings.builder()
                        .authUsername("auth_username")
                        .expirationSec(0L)
                        .fromUser("from_user")
                        .outboundProxy("outbound_proxy")
                        .password("***")
                        .proxy("proxy")
                        .transport(
                            SipRegistrationStatusRetrieveResponse.ExternalUacSettings.Transport.TCP
                        )
                        .username("username")
                        .build()
                )
                .internalUacSettings(
                    SipRegistrationStatusRetrieveResponse.InternalUacSettings.builder()
                        .destinationUri("destination_uri")
                        .build()
                )
                .lastRegistrationResponse("200 OK")
                .pairState("ACTIVE")
                .registered(true)
                .userId("user_id")
                .username("username")
                .build()

        assertThat(sipRegistrationStatusRetrieveResponse.b2buaExternal())
            .contains(
                SipRegistrationStatusRetrieveResponse.B2buaExternal.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(sipRegistrationStatusRetrieveResponse.b2buaInternal())
            .contains(
                SipRegistrationStatusRetrieveResponse.B2buaInternal.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(sipRegistrationStatusRetrieveResponse.connectionId()).contains("connection_id")
        assertThat(sipRegistrationStatusRetrieveResponse.connectionName())
            .contains("connection_name")
        assertThat(sipRegistrationStatusRetrieveResponse.credentialType())
            .contains(SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL)
        assertThat(sipRegistrationStatusRetrieveResponse.externalState()).contains("REGED")
        assertThat(sipRegistrationStatusRetrieveResponse.externalUacSettings())
            .contains(
                SipRegistrationStatusRetrieveResponse.ExternalUacSettings.builder()
                    .authUsername("auth_username")
                    .expirationSec(0L)
                    .fromUser("from_user")
                    .outboundProxy("outbound_proxy")
                    .password("***")
                    .proxy("proxy")
                    .transport(
                        SipRegistrationStatusRetrieveResponse.ExternalUacSettings.Transport.TCP
                    )
                    .username("username")
                    .build()
            )
        assertThat(sipRegistrationStatusRetrieveResponse.internalUacSettings())
            .contains(
                SipRegistrationStatusRetrieveResponse.InternalUacSettings.builder()
                    .destinationUri("destination_uri")
                    .build()
            )
        assertThat(sipRegistrationStatusRetrieveResponse.lastRegistrationResponse())
            .contains("200 OK")
        assertThat(sipRegistrationStatusRetrieveResponse.pairState()).contains("ACTIVE")
        assertThat(sipRegistrationStatusRetrieveResponse.registered()).contains(true)
        assertThat(sipRegistrationStatusRetrieveResponse.userId()).contains("user_id")
        assertThat(sipRegistrationStatusRetrieveResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sipRegistrationStatusRetrieveResponse =
            SipRegistrationStatusRetrieveResponse.builder()
                .b2buaExternal(
                    SipRegistrationStatusRetrieveResponse.B2buaExternal.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .b2buaInternal(
                    SipRegistrationStatusRetrieveResponse.B2buaInternal.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .connectionId("connection_id")
                .connectionName("connection_name")
                .credentialType(
                    SipRegistrationStatusRetrieveResponse.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .externalState("REGED")
                .externalUacSettings(
                    SipRegistrationStatusRetrieveResponse.ExternalUacSettings.builder()
                        .authUsername("auth_username")
                        .expirationSec(0L)
                        .fromUser("from_user")
                        .outboundProxy("outbound_proxy")
                        .password("***")
                        .proxy("proxy")
                        .transport(
                            SipRegistrationStatusRetrieveResponse.ExternalUacSettings.Transport.TCP
                        )
                        .username("username")
                        .build()
                )
                .internalUacSettings(
                    SipRegistrationStatusRetrieveResponse.InternalUacSettings.builder()
                        .destinationUri("destination_uri")
                        .build()
                )
                .lastRegistrationResponse("200 OK")
                .pairState("ACTIVE")
                .registered(true)
                .userId("user_id")
                .username("username")
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
