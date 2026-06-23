// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val reputationPhoneNumberWithReputationFuture =
            numberServiceAsync.retrieve(
                NumberRetrieveParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .phoneNumber("+19493253498")
                    .fresh(true)
                    .build()
            )

        val reputationPhoneNumberWithReputation = reputationPhoneNumberWithReputationFuture.get()
        reputationPhoneNumberWithReputation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val pageFuture = numberServiceAsync.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val reputationPhoneNumberListFuture =
            numberServiceAsync.associate(
                NumberAssociateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .build()
            )

        val reputationPhoneNumberList = reputationPhoneNumberListFuture.get()
        reputationPhoneNumberList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disassociate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val future =
            numberServiceAsync.disassociate(
                NumberDisassociateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .phoneNumber("+19493253498")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refresh() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.enterprises().reputation().numbers()

        val responseFuture =
            numberServiceAsync.refresh(
                NumberRefreshParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .addPhoneNumber("+19493253498")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
