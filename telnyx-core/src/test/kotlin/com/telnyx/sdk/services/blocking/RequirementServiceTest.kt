// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.requirements.RequirementListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequirementServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementService = client.requirements()

        val requirement = requirementService.retrieve("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")

        requirement.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementService = client.requirements()

        val requirements =
            requirementService.list(
                RequirementListParams.builder()
                    .filter(
                        RequirementListParams.Filter.builder()
                            .action(RequirementListParams.Filter.Action.PORTING)
                            .countryCode("US")
                            .phoneNumberType(RequirementListParams.Filter.PhoneNumberType.LOCAL)
                            .build()
                    )
                    .page(RequirementListParams.Page.builder().number(1L).size(1L).build())
                    .addSort(RequirementListParams.Sort.COUNTRY_CODE)
                    .build()
            )

        requirements.validate()
    }
}
