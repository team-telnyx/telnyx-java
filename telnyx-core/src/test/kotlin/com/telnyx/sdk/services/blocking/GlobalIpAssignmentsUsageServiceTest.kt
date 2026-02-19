// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentsUsageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentsUsageService = client.globalIpAssignmentsUsage()

        val globalIpAssignmentsUsage =
            globalIpAssignmentsUsageService.retrieve(
                GlobalIpAssignmentsUsageRetrieveParams.builder()
                    .filter(
                        GlobalIpAssignmentsUsageRetrieveParams.Filter.builder()
                            .globalIpAssignmentId("string")
                            .globalIpId("string")
                            .build()
                    )
                    .build()
            )

        globalIpAssignmentsUsage.validate()
    }
}
