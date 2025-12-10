// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.addresses

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsParams
import com.telnyx.sdk.models.addresses.actions.ActionValidateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun acceptSuggestions() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.addresses().actions()

        val responseFuture =
            actionServiceAsync.acceptSuggestions(
                ActionAcceptSuggestionsParams.builder()
                    .addressUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validate() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.addresses().actions()

        val responseFuture =
            actionServiceAsync.validate(
                ActionValidateParams.builder()
                    .countryCode("US")
                    .postalCode("78701")
                    .streetAddress("600 Congress Avenue")
                    .administrativeArea("TX")
                    .extendedAddress("14th Floor")
                    .locality("Austin")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
