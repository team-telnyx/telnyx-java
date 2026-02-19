// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobRetrieveParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActivationJobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val activationJobServiceAsync = client.portingOrders().activationJobs()

        val activationJobFuture =
            activationJobServiceAsync.retrieve(
                ActivationJobRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val activationJob = activationJobFuture.get()
        activationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val activationJobServiceAsync = client.portingOrders().activationJobs()

        val activationJobFuture =
            activationJobServiceAsync.update(
                ActivationJobUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .activateAt(OffsetDateTime.parse("2019-01-01T00:00:00Z"))
                    .build()
            )

        val activationJob = activationJobFuture.get()
        activationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val activationJobServiceAsync = client.portingOrders().activationJobs()

        val pageFuture = activationJobServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }
}
