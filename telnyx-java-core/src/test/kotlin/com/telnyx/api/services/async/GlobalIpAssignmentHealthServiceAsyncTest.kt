// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpAssignmentHealthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentHealthServiceAsync = client.globalIpAssignmentHealth()

        val globalIpAssignmentHealthFuture =
            globalIpAssignmentHealthServiceAsync.retrieve(
                GlobalIpAssignmentHealthRetrieveParams.builder()
                    .filter(
                        GlobalIpAssignmentHealthRetrieveParams.Filter.builder()
                            .globalIpAssignmentId("string")
                            .globalIpId("string")
                            .build()
                    )
                    .build()
            )

        val globalIpAssignmentHealth = globalIpAssignmentHealthFuture.get()
        globalIpAssignmentHealth.validate()
    }
}
