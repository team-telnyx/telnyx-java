// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.numberlookup.NumberLookupRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberLookupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberLookupServiceAsync = client.numberLookup()

        val numberLookupFuture =
            numberLookupServiceAsync.retrieve(
                NumberLookupRetrieveParams.builder()
                    .phoneNumber("+18665552368")
                    .type(NumberLookupRetrieveParams.Type.CARRIER)
                    .build()
            )

        val numberLookup = numberLookupFuture.get()
        numberLookup.validate()
    }
}
