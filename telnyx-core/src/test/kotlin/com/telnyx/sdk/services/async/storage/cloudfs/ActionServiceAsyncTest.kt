// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.cloudfs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.cloudfs.actions.ActionRotateMetaTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateMetaToken() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.storage().cloudfs().actions()

        val cloudfsFilesystemResponseWrapperFuture =
            actionServiceAsync.rotateMetaToken(
                ActionRotateMetaTokenParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .idempotencyKey("Idempotency-Key")
                    .build()
            )

        val cloudfsFilesystemResponseWrapper = cloudfsFilesystemResponseWrapperFuture.get()
        cloudfsFilesystemResponseWrapper.validate()
    }
}
