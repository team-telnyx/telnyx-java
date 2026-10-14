// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SipRegistrationStatusServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sipRegistrationStatusServiceAsync = client.sipRegistrationStatus()

        val sipRegistrationStatusesFuture =
            sipRegistrationStatusServiceAsync.list(
                SipRegistrationStatusListParams.builder()
                    .credentialType(
                        SipRegistrationStatusListParams.CredentialType.UAC_EXTERNAL_CREDENTIAL
                    )
                    .connectionId("connection_id")
                    .username("username")
                    .build()
            )

        val sipRegistrationStatuses = sipRegistrationStatusesFuture.get()
        sipRegistrationStatuses.validate()
    }
}
