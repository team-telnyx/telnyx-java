// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.actions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.actions.register.RegisterCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegisterServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val registerServiceAsync = client.actions().register()

        val registerFuture =
            registerServiceAsync.create(
                RegisterCreateParams.builder()
                    .registrationCodes(listOf("0000000001", "0000000002", "0000000003"))
                    .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(RegisterCreateParams.Status.STANDBY)
                    .tags(listOf("personal", "customers", "active-customers"))
                    .build()
            )

        val register = registerFuture.get()
        register.validate()
    }
}
