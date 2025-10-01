// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.requirementtypes.RequirementTypeListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequirementTypeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementTypeServiceAsync = client.requirementTypes()

        val requirementTypeFuture =
            requirementTypeServiceAsync.retrieve("a38c217a-8019-48f8-bff6-0fdd9939075b")

        val requirementType = requirementTypeFuture.get()
        requirementType.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementTypeServiceAsync = client.requirementTypes()

        val requirementTypesFuture =
            requirementTypeServiceAsync.list(
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

        val requirementTypes = requirementTypesFuture.get()
        requirementTypes.validate()
    }
}
