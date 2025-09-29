// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobListParams
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobRetrieveParams
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActivationJobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val activationJobServiceAsync = client.portingOrders().activationJobs()

        val activationJobsFuture =
            activationJobServiceAsync.list(
                ActivationJobListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(ActivationJobListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val activationJobs = activationJobsFuture.get()
        activationJobs.validate()
    }
}
