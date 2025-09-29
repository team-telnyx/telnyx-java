// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveParams
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
