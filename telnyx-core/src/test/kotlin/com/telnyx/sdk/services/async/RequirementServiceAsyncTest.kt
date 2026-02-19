// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RequirementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementServiceAsync = client.requirements()

        val requirementFuture =
            requirementServiceAsync.retrieve("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")

        val requirement = requirementFuture.get()
        requirement.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requirementServiceAsync = client.requirements()

        val pageFuture = requirementServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
