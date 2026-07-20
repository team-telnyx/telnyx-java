// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.cloudfs.CloudfCreateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfListParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CloudfServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cloudfService = client.storage().cloudfs()

        val cloudfsFilesystemResponseWrapper =
            cloudfService.create(
                CloudfCreateParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .name("agent-fs")
                    .region(CloudfCreateParams.Region.US_EAST_1)
                    .build()
            )

        cloudfsFilesystemResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cloudfService = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        cloudfsFilesystemDetailResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cloudfService = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfService.update(
                CloudfUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("agent-fs")
                    .build()
            )

        cloudfsFilesystemDetailResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cloudfService = client.storage().cloudfs()

        val cloudfs =
            cloudfService.list(
                CloudfListParams.builder()
                    .filterName("filter[name]")
                    .filterRegion("us-east-1")
                    .filterStatus(CloudfListParams.FilterStatus.PROVISIONING)
                    .pageAfter("page[after]")
                    .pageBefore("page[before]")
                    .pageLimit(1L)
                    .sort(CloudfListParams.Sort.CREATED_AT)
                    .build()
            )

        cloudfs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cloudfService = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        cloudfsFilesystemDetailResponseWrapper.validate()
    }
}
