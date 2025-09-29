// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.requirementtypes.RequirementTypeListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequirementTypeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementTypeService = client.requirementTypes()

        val requirementType =
            requirementTypeService.retrieve("a38c217a-8019-48f8-bff6-0fdd9939075b")

        requirementType.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementTypeService = client.requirementTypes()

        val requirementTypes =
            requirementTypeService.list(
                RequirementTypeListParams.builder()
                    .filter(
                        RequirementTypeListParams.Filter.builder()
                            .name(
                                RequirementTypeListParams.Filter.Name.builder()
                                    .contains("utility bill")
                                    .build()
                            )
                            .build()
                    )
                    .addSort(RequirementTypeListParams.Sort.NAME)
                    .build()
            )

        requirementTypes.validate()
    }
}
