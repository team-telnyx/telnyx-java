// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.regulatoryrequirements.RegulatoryRequirementRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegulatoryRequirementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryRequirementServiceAsync = client.regulatoryRequirements()

        val regulatoryRequirementFuture =
            regulatoryRequirementServiceAsync.retrieve(
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

        val regulatoryRequirement = regulatoryRequirementFuture.get()
        regulatoryRequirement.validate()
    }
}
