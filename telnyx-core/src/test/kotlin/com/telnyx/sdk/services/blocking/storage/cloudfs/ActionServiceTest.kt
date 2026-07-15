// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.cloudfs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.cloudfs.actions.ActionRotateMetaTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateMetaToken() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.storage().cloudfs().actions()

        val cloudfsFilesystemResponseWrapper =
            actionService.rotateMetaToken(
                ActionRotateMetaTokenParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .idempotencyKey("Idempotency-Key")
                    .build()
            )

        cloudfsFilesystemResponseWrapper.validate()
    }
}
