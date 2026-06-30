// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRefreshParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.enterprises().reputation().numbers()

        val number =
            numberService.retrieve(
                NumberRetrieveParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .phoneNumber("+19493253498")
                    .fresh(true)
                    .build()
            )

        number.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.enterprises().reputation().numbers()

        val page = numberService.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun associate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.enterprises().reputation().numbers()

        val response =
            numberService.associate(
                NumberAssociateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disassociate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.enterprises().reputation().numbers()

        numberService.disassociate(
            NumberDisassociateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .phoneNumber("+19493253498")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refresh() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.enterprises().reputation().numbers()

        val response =
            numberService.refresh(
                NumberRefreshParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .addPhoneNumber("+19493253498")
                    .build()
            )

        response.validate()
    }
}
