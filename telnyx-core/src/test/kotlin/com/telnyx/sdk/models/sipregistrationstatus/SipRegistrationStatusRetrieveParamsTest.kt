// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sipregistrationstatus

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusRetrieveParamsTest {

    @Test
    fun create() {
        SipRegistrationStatusRetrieveParams.builder()
            .connectionId("connection_id")
            .credentialType(
                SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
            )
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SipRegistrationStatusRetrieveParams.builder()
                .connectionId("connection_id")
                .credentialType(
                    SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                )
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("connection_id", "connection_id")
                    .put("credential_type", "uac_external_credential")
                    .put("user_id", "user_id")
                    .build()
            )
    }
}
