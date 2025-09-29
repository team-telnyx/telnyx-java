// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.numberlookup.NumberLookupRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberLookupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
