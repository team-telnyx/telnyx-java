// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumberblocks

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumberBlocks().jobs()

        val job = jobService.retrieve("id")

        job.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumberBlocks().jobs()

        val page = jobService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePhoneNumberBlock() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumberBlocks().jobs()

        val response =
            jobService.deletePhoneNumberBlock(
                JobDeletePhoneNumberBlockParams.builder()
                    .phoneNumberBlockId("f3946371-7199-4261-9c3d-81a0d7935146")
                    .build()
            )

        response.validate()
    }
}
