// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val numberFuture =
            numberServiceAsync.retrieve(
                NumberRetrieveParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .phoneNumber("+16035551234")
                    .fresh(true)
                    .build()
            )

        val number = numberFuture.get()
        number.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val pageFuture = numberServiceAsync.list("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val responseFuture =
            numberServiceAsync.associate(
                NumberAssociateParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addPhoneNumber("+16035551234")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disassociate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val future =
            numberServiceAsync.disassociate(
                NumberDisassociateParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .phoneNumber("+16035551234")
                    .build()
            )

        val response = future.get()
    }
}
