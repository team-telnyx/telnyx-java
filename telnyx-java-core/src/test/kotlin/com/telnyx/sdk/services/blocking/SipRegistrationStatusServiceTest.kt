// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sipRegistrationStatusService = client.sipRegistrationStatus()

        val sipRegistrationStatus =
            sipRegistrationStatusService.retrieve(
                SipRegistrationStatusRetrieveParams.builder()
                    .connectionId("connection_id")
                    .credentialType(
                        SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                    )
                    .build()
            )

        sipRegistrationStatus.validate()
    }
}
