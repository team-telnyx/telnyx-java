// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberOrderPhoneNumberService = client.numberOrderPhoneNumbers()

        val numberOrderPhoneNumber =
            numberOrderPhoneNumberService.retrieve("number_order_phone_number_id")

        numberOrderPhoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirements() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
