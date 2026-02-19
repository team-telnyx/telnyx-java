// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.inventorycoverage.InventoryCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryCoverageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inventoryCoverageServiceAsync = client.inventoryCoverage()

        val inventoryCoveragesFuture =
            inventoryCoverageServiceAsync.list(
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

        val inventoryCoverages = inventoryCoveragesFuture.get()
        inventoryCoverages.validate()
    }
}
