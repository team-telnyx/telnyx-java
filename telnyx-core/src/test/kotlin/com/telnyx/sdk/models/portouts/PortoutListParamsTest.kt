// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortoutListParamsTest {

    @Test
    fun create() {
        PortoutListParams.builder()
            .filter(
                PortoutListParams.Filter.builder()
                    .carrierName("carrier_name")
                    .countryCode("US")
                    .addCountryCodeIn("CA")
                    .addCountryCodeIn("US")
                    .focDate(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                    .insertedAt(
                        PortoutListParams.Filter.InsertedAt.builder()
                            .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                            .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                            .build()
                    )
                    .phoneNumber("+13035551212")
                    .pon("pon")
                    .portedOutAt(
                        PortoutListParams.Filter.PortedOutAt.builder()
                            .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                            .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                            .build()
                    )
                    .spid("spid")
                    .status(PortoutListParams.Filter.Status.PENDING)
                    .addStatusIn(PortoutListParams.Filter.StatusIn.PENDING)
                    .supportKey("PO_abc123")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    @Disabled("disabled due to timestamp serialization issue")
    fun queryParams() {
        val params =
            PortoutListParams.builder()
                .filter(
                    PortoutListParams.Filter.builder()
                        .carrierName("carrier_name")
                        .countryCode("US")
                        .addCountryCodeIn("CA")
                        .addCountryCodeIn("US")
                        .focDate(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                        .insertedAt(
                            PortoutListParams.Filter.InsertedAt.builder()
                                .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                .build()
                        )
                        .phoneNumber("+13035551212")
                        .pon("pon")
                        .portedOutAt(
                            PortoutListParams.Filter.PortedOutAt.builder()
                                .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                .build()
                        )
                        .spid("spid")
                        .status(PortoutListParams.Filter.Status.PENDING)
                        .addStatusIn(PortoutListParams.Filter.StatusIn.PENDING)
                        .supportKey("PO_abc123")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[carrier_name]", "carrier_name")
                    .put("filter[country_code]", "US")
                    .put("filter[country_code_in]", listOf("CA", "US").joinToString(","))
                    .put("filter[foc_date]", "2024-09-04T00:00:00.000Z")
                    .put("filter[inserted_at][gte]", "2024-09-04T00:00:00.000Z")
                    .put("filter[inserted_at][lte]", "2024-09-04T00:00:00.000Z")
                    .put("filter[phone_number]", "+13035551212")
                    .put("filter[pon]", "pon")
                    .put("filter[ported_out_at][gte]", "2024-09-04T00:00:00.000Z")
                    .put("filter[ported_out_at][lte]", "2024-09-04T00:00:00.000Z")
                    .put("filter[spid]", "spid")
                    .put("filter[status]", "pending")
                    .put("filter[status_in]", listOf("pending").joinToString(","))
                    .put("filter[support_key]", "PO_abc123")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PortoutListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
