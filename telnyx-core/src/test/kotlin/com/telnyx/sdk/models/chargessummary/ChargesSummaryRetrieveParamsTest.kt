// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.chargessummary

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargesSummaryRetrieveParamsTest {

    @Test
    fun create() {
        ChargesSummaryRetrieveParams.builder()
            .endDate(LocalDate.parse("2025-06-01"))
            .startDate(LocalDate.parse("2025-05-01"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChargesSummaryRetrieveParams.builder()
                .endDate(LocalDate.parse("2025-06-01"))
                .startDate(LocalDate.parse("2025-05-01"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "2025-06-01")
                    .put("start_date", "2025-05-01")
                    .build()
            )
    }
}
