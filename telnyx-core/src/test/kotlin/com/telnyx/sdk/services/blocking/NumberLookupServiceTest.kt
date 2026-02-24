// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberlookup.NumberLookupRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberLookupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberLookupService = client.numberLookup()

        val numberLookup =
            numberLookupService.retrieve(
                NumberLookupRetrieveParams.builder()
                    .phoneNumber("+18665552368")
                    .type(NumberLookupRetrieveParams.Type.CARRIER)
                    .build()
            )

        numberLookup.validate()
    }
}
