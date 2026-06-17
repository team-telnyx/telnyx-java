// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.reputation().numbers()

        val reputationPhoneNumberWithReputationFuture =
            numberServiceAsync.retrieve(
                NumberRetrieveParams.builder().phoneNumber("+19493253498").fresh(true).build()
            )

        val reputationPhoneNumberWithReputation = reputationPhoneNumberWithReputationFuture.get()
        reputationPhoneNumberWithReputation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.reputation().numbers()

        val pageFuture = numberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.reputation().numbers()

        val future = numberServiceAsync.delete("+19493253498")

        val response = future.get()
    }
}
