// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.chargesbreakdown

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargesBreakdownRetrieveParamsTest {

    @Test
    fun create() {
        ChargesBreakdownRetrieveParams.builder()
            .startDate(LocalDate.parse("2025-05-01"))
            .endDate(LocalDate.parse("2025-06-01"))
            .format(ChargesBreakdownRetrieveParams.Format.JSON)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChargesBreakdownRetrieveParams.builder()
                .startDate(LocalDate.parse("2025-05-01"))
                .endDate(LocalDate.parse("2025-06-01"))
                .format(ChargesBreakdownRetrieveParams.Format.JSON)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("start_date", "2025-05-01")
                    .put("end_date", "2025-06-01")
                    .put("format", "json")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ChargesBreakdownRetrieveParams.builder()
                .startDate(LocalDate.parse("2025-05-01"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("start_date", "2025-05-01").build())
    }
}
