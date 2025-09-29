// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpAssignmentHealthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
