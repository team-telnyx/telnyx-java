// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumbersRegulatoryRequirementServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumbersRegulatoryRequirementService = client.phoneNumbersRegulatoryRequirements()

        val phoneNumbersRegulatoryRequirement =
            phoneNumbersRegulatoryRequirementService.retrieve(
                PhoneNumbersRegulatoryRequirementRetrieveParams.builder()
                    .filter(
                        PhoneNumbersRegulatoryRequirementRetrieveParams.Filter.builder()
                            .phoneNumber("+41215470622,+41215470633")
                            .build()
                    )
                    .build()
            )

        phoneNumbersRegulatoryRequirement.validate()
    }
}
