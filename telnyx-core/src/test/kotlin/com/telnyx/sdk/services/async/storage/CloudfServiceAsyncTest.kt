// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.cloudfs.CloudfCreateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfListParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CloudfServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cloudfServiceAsync = client.storage().cloudfs()

        val cloudfsFilesystemResponseWrapperFuture =
            cloudfServiceAsync.create(
                CloudfCreateParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .name("agent-fs")
                    .region(CloudfCreateParams.Region.US_EAST_1)
                    .build()
            )

        val cloudfsFilesystemResponseWrapper = cloudfsFilesystemResponseWrapperFuture.get()
        cloudfsFilesystemResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cloudfServiceAsync = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapperFuture =
            cloudfServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfsFilesystemDetailResponseWrapperFuture.get()
        cloudfsFilesystemDetailResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cloudfServiceAsync = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapperFuture =
            cloudfServiceAsync.update(
                CloudfUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("agent-fs")
                    .build()
            )

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfsFilesystemDetailResponseWrapperFuture.get()
        cloudfsFilesystemDetailResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cloudfServiceAsync = client.storage().cloudfs()

        val cloudfsFuture =
            cloudfServiceAsync.list(
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

        val cloudfs = cloudfsFuture.get()
        cloudfs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cloudfServiceAsync = client.storage().cloudfs()

        val cloudfsFilesystemDetailResponseWrapperFuture =
            cloudfServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val cloudfsFilesystemDetailResponseWrapper =
            cloudfsFilesystemDetailResponseWrapperFuture.get()
        cloudfsFilesystemDetailResponseWrapper.validate()
    }
}
