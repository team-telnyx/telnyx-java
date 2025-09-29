// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.inventorycoverage.InventoryCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InventoryCoverageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inventoryCoverageService = client.inventoryCoverage()

        val inventoryCoverages =
            inventoryCoverageService.list(
                InventoryCoverageListParams.builder()
                    .filter(
                        InventoryCoverageListParams.Filter.builder()
                            .administrativeArea("administrative_area")
                            .count(true)
                            .countryCode(InventoryCoverageListParams.Filter.CountryCode.AT)
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
