// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignupListParamsTest {

    @Test
    fun create() {
        SignupListParams.builder()
            .filterCreatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterCreatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterCustomerId("filter[customer_id]")
            .filterWabaId("filter[waba_id]")
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SignupListParams.builder()
                .filterCreatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterCreatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterCustomerId("filter[customer_id]")
                .filterWabaId("filter[waba_id]")
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[created_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put(
                        "filter[created_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("filter[customer_id]", "filter[customer_id]")
                    .put("filter[waba_id]", "filter[waba_id]")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SignupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
