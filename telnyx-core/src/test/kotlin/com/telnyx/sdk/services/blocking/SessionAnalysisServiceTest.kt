// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SessionAnalysisServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sessionAnalysisService = client.sessionAnalysis()

        val sessionAnalysis =
            sessionAnalysisService.retrieve(
                SessionAnalysisRetrieveParams.builder()
                    .recordType("record_type")
                    .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expand(SessionAnalysisRetrieveParams.Expand.RECORD)
                    .includeChildren(true)
                    .maxDepth(1L)
                    .build()
            )

        sessionAnalysis.validate()
    }
}
