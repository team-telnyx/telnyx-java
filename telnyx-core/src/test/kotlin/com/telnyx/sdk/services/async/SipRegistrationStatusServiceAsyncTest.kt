// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sipRegistrationStatusServiceAsync = client.sipRegistrationStatus()

        val sipRegistrationStatusFuture =
            sipRegistrationStatusServiceAsync.retrieve(
                SipRegistrationStatusRetrieveParams.builder()
                    .credentialType(
                        SipRegistrationStatusRetrieveParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                    )
                    .connectionId("connection_id")
                    .username("username")
                    .build()
            )

        val sipRegistrationStatus = sipRegistrationStatusFuture.get()
        sipRegistrationStatus.validate()
    }
}
