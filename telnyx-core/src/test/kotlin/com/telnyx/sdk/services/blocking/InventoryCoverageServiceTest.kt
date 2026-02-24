// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.inventorycoverage.InventoryCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryCoverageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val inventoryCoverageService = client.inventoryCoverage()

        val inventoryCoverages =
            inventoryCoverageService.list(
                InventoryCoverageListParams.builder()
                    .filter(
                        InventoryCoverageListParams.Filter.builder()
                            .administrativeArea("administrative_area")
                            .count(true)
                            .countryCode(InventoryCoverageListParams.Filter.CountryCode.AT)
                            .addFeature(InventoryCoverageListParams.Filter.Feature.VOICE)
                            .addFeature(InventoryCoverageListParams.Filter.Feature.SMS)
                            .groupBy(InventoryCoverageListParams.Filter.GroupBy.LOCALITY)
                            .npa(0L)
                            .nxx(0L)
                            .phoneNumberType(
                                InventoryCoverageListParams.Filter.PhoneNumberType.LOCAL
                            )
                            .build()
                    )
                    .build()
            )

        inventoryCoverages.validate()
    }
}
