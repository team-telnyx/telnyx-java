// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberAssociateParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.NumberDisassociateParams
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
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .phoneNumber("+16035551234")
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

        val page = numberService.list("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

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
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addPhoneNumber("+16035551234")
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
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .phoneNumber("+16035551234")
                .build()
        )
    }
}
