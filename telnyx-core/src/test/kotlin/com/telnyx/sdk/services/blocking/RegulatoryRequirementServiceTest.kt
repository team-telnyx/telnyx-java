// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.regulatoryrequirements.RegulatoryRequirementRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegulatoryRequirementServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryRequirementService = client.regulatoryRequirements()

        val regulatoryRequirement =
            regulatoryRequirementService.retrieve(
                RegulatoryRequirementRetrieveParams.builder()
                    .filter(
                        RegulatoryRequirementRetrieveParams.Filter.builder()
                            .action(RegulatoryRequirementRetrieveParams.Filter.Action.ORDERING)
                            .countryCode("DE")
                            .phoneNumber("+41215470622")
                            .phoneNumberType(
                                RegulatoryRequirementRetrieveParams.Filter.PhoneNumberType.LOCAL
                            )
                            .requirementGroupId("d4c0b4a6-7bd2-40c5-a3b9-2acd99e212b2")
                            .build()
                    )
                    .build()
            )

        regulatoryRequirement.validate()
    }
}
