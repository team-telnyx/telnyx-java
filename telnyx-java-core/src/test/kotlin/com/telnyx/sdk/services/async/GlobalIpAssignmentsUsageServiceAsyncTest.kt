// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentsUsageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentsUsageServiceAsync = client.globalIpAssignmentsUsage()

        val globalIpAssignmentsUsageFuture =
            globalIpAssignmentsUsageServiceAsync.retrieve(
                GlobalIpAssignmentsUsageRetrieveParams.builder()
                    .filter(
                        GlobalIpAssignmentsUsageRetrieveParams.Filter.builder()
                            .globalIpAssignmentId("string")
                            .globalIpId("string")
                            .build()
                    )
                    .build()
            )

        val globalIpAssignmentsUsage = globalIpAssignmentsUsageFuture.get()
        globalIpAssignmentsUsage.validate()
    }
}
