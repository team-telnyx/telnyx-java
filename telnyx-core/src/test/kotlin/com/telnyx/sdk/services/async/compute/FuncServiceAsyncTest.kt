// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FuncServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveLogs() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val funcServiceAsync = client.compute().funcs()

        val responseFuture =
            funcServiceAsync.retrieveLogs(
                FuncRetrieveLogsParams.builder()
                    .id("id")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FuncRetrieveLogsParams.Type.RUNTIME)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveMetricAggregates() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val funcServiceAsync = client.compute().funcs()

        val responseFuture =
            funcServiceAsync.retrieveMetricAggregates(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRevisions() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val funcServiceAsync = client.compute().funcs()

        val responseFuture =
            funcServiceAsync.retrieveRevisions(
                FuncRetrieveRevisionsParams.builder().id("id").pageNumber(1L).pageSize(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveShipInspection() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val funcServiceAsync = client.compute().funcs()

        val responseFuture = funcServiceAsync.retrieveShipInspection("id")

        val response = responseFuture.get()
        response.validate()
    }
}
