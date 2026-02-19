// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentHealthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentHealthService = client.globalIpAssignmentHealth()

        val globalIpAssignmentHealth =
            globalIpAssignmentHealthService.retrieve(
                GlobalIpAssignmentHealthRetrieveParams.builder()
                    .filter(
                        GlobalIpAssignmentHealthRetrieveParams.Filter.builder()
                            .globalIpAssignmentId("string")
                            .globalIpId("string")
                            .build()
                    )
                    .build()
            )

        globalIpAssignmentHealth.validate()
    }
}
