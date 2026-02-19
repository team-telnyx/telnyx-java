// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.addresses

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsParams
import com.telnyx.sdk.models.addresses.actions.ActionValidateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun acceptSuggestions() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.addresses().actions()

        val response =
            actionService.acceptSuggestions(
                ActionAcceptSuggestionsParams.builder()
                    .addressUuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.addresses().actions()

        val response =
            actionService.validate(
                ActionValidateParams.builder()
                    .countryCode("US")
                    .postalCode("78701")
                    .streetAddress("600 Congress Avenue")
                    .administrativeArea("TX")
                    .extendedAddress("14th Floor")
                    .locality("Austin")
                    .build()
            )

        response.validate()
    }
}
