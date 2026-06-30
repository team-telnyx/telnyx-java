// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusRetrieveParamsTest {

    @Test
    fun create() {
        SipRegistrationStatusRetrieveParams.builder()
            .credentialType(
                SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
            )
            .connectionId("connection_id")
            .username("username")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SipRegistrationStatusRetrieveParams.builder()
                .credentialType(
                    SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .connectionId("connection_id")
                .username("username")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("credential_type", "uac_external_credential")
                    .put("connection_id", "connection_id")
                    .put("username", "username")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SipRegistrationStatusRetrieveParams.builder()
                .credentialType(
                    SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("credential_type", "uac_external_credential").build()
            )
    }
}
