// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberOrderPhoneNumberServiceAsync = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumberFuture =
            numberOrderPhoneNumberServiceAsync.retrieve("number_order_phone_number_id")

        val numberOrderPhoneNumber = numberOrderPhoneNumberFuture.get()
        numberOrderPhoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberOrderPhoneNumberServiceAsync = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumbersFuture =
            numberOrderPhoneNumberServiceAsync.list(
                NumberOrderPhoneNumberListParams.builder()
                    .filter(
                        NumberOrderPhoneNumberListParams.Filter.builder().countryCode("US").build()
                    )
                    .build()
            )

        val numberOrderPhoneNumbers = numberOrderPhoneNumbersFuture.get()
        numberOrderPhoneNumbers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberOrderPhoneNumberServiceAsync = client.numberOrderPhoneNumbers()

        val responseFuture =
            numberOrderPhoneNumberServiceAsync.updateRequirementGroup(
                NumberOrderPhoneNumberUpdateRequirementGroupParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirements() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberOrderPhoneNumberServiceAsync = client.numberOrderPhoneNumbers()

        val responseFuture =
            numberOrderPhoneNumberServiceAsync.updateRequirements(
                NumberOrderPhoneNumberUpdateRequirementsParams.builder()
                    .numberOrderPhoneNumberId("number_order_phone_number_id")
                    .addRegulatoryRequirement(
                        UpdateRegulatoryRequirement.builder()
                            .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
