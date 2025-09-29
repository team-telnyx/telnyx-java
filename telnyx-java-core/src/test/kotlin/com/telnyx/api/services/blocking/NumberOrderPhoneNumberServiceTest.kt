// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.api.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberOrderPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberOrderPhoneNumberService = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumber =
            numberOrderPhoneNumberService.retrieve("number_order_phone_number_id")

        numberOrderPhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberOrderPhoneNumberService = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumbers =
            numberOrderPhoneNumberService.list(
                NumberOrderPhoneNumberListParams.builder()
                    .filter(
                        NumberOrderPhoneNumberListParams.Filter.builder().countryCode("US").build()
                    )
                    .build()
            )

        numberOrderPhoneNumbers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberOrderPhoneNumberService = client.numberOrderPhoneNumbers()

        val response =
            numberOrderPhoneNumberService.updateRequirementGroup(
                NumberOrderPhoneNumberUpdateRequirementGroupParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirements() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberOrderPhoneNumberService = client.numberOrderPhoneNumbers()

        val response =
            numberOrderPhoneNumberService.updateRequirements(
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

        response.validate()
    }
}
