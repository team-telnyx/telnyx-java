// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.api.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberOrderPhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberOrderPhoneNumberServiceAsync = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumberFuture =
            numberOrderPhoneNumberServiceAsync.retrieve("number_order_phone_number_id")

        val numberOrderPhoneNumber = numberOrderPhoneNumberFuture.get()
        numberOrderPhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirements() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
