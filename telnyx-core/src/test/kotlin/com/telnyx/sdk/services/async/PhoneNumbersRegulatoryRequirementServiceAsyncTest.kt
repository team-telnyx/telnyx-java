// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumbersRegulatoryRequirementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumbersRegulatoryRequirementServiceAsync =
            client.phoneNumbersRegulatoryRequirements()

        val phoneNumbersRegulatoryRequirementFuture =
            phoneNumbersRegulatoryRequirementServiceAsync.retrieve(
                PhoneNumbersRegulatoryRequirementRetrieveParams.builder()
                    .filter(
                        PhoneNumbersRegulatoryRequirementRetrieveParams.Filter.builder()
                            .phoneNumber("+41215470622,+41215470633")
                            .build()
                    )
                    .build()
            )

        val phoneNumbersRegulatoryRequirement = phoneNumbersRegulatoryRequirementFuture.get()
        phoneNumbersRegulatoryRequirement.validate()
    }
}
