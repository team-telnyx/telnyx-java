// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.compute

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FuncServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveLogs() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val funcService = client.compute().funcs()

        val response =
            funcService.retrieveLogs(
                FuncRetrieveLogsParams.builder()
                    .id("id")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FuncRetrieveLogsParams.Type.RUNTIME)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveMetricAggregates() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val funcService = client.compute().funcs()

        val response =
            funcService.retrieveMetricAggregates(
                FuncRetrieveMetricAggregatesParams.builder()
                    .id("id")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filterEdgeSite("filter[edge_site]")
                    .filterNamespace("filter[namespace]")
                    .pageNumber(0L)
                    .pageSize(1L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRevisions() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val funcService = client.compute().funcs()

        val response =
            funcService.retrieveRevisions(
                FuncRetrieveRevisionsParams.builder().id("id").pageNumber(1L).pageSize(1L).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveShipInspection() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val funcService = client.compute().funcs()

        val response = funcService.retrieveShipInspection("id")

        response.validate()
    }
}
