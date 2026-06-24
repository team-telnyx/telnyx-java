// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveInfoParams
import com.telnyx.sdk.models.termsofservice.TermsOfServiceRetrieveStatusParams
import com.telnyx.sdk.models.termsofservice.agreements.TosProductType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TermsOfServiceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveInfo() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val termsOfServiceService = client.termsOfService()

        val response =
            termsOfServiceService.retrieveInfo(
                TermsOfServiceRetrieveInfoParams.builder()
                    .productType(TosProductType.BRANDED_CALLING)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val termsOfServiceService = client.termsOfService()

        val response =
            termsOfServiceService.retrieveStatus(
                TermsOfServiceRetrieveStatusParams.builder()
                    .productType(TosProductType.BRANDED_CALLING)
                    .build()
            )

        response.validate()
    }
}
