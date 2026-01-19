// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumberblocks

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumberBlocks().jobs()

        val jobFuture = jobServiceAsync.retrieve("id")

        val job = jobFuture.get()
        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumberBlocks().jobs()

        val pageFuture = jobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deletePhoneNumberBlock() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumberBlocks().jobs()

        val responseFuture =
            jobServiceAsync.deletePhoneNumberBlock(
                JobDeletePhoneNumberBlockParams.builder()
                    .phoneNumberBlockId("f3946371-7199-4261-9c3d-81a0d7935146")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
