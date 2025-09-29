// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumberblocks

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import com.telnyx.api.models.phonenumberblocks.jobs.JobListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.phoneNumberBlocks().jobs()

        val job = jobService.retrieve("id")

        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.phoneNumberBlocks().jobs()

        val jobs =
            jobService.list(
                JobListParams.builder()
                    .filter(
                        JobListParams.Filter.builder()
                            .status(JobListParams.Filter.Status.IN_PROGRESS)
                            .type(JobListParams.Filter.Type.DELETE_PHONE_NUMBER_BLOCK)
                            .build()
                    )
                    .page(JobListParams.Page.builder().number(1L).size(1L).build())
                    .sort(JobListParams.Sort.CREATED_AT)
                    .build()
            )

        jobs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deletePhoneNumberBlock() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
