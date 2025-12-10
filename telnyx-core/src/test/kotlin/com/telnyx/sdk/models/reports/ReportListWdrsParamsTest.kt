// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListWdrsParamsTest {

    @Test
    fun create() {
        ReportListWdrsParams.builder()
            .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
            .endDate("2021-06-01T00:00:00Z")
            .imsi("123456")
            .mcc("204")
            .mnc("01")
            .pageNumber(0L)
            .pageSize(0L)
            .phoneNumber("+12345678910")
            .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
            .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
            .simGroupName("sim name")
            .addSort("created_at")
            .startDate("2021-05-01T00:00:00Z")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportListWdrsParams.builder()
                .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
                .endDate("2021-06-01T00:00:00Z")
                .imsi("123456")
                .mcc("204")
                .mnc("01")
                .pageNumber(0L)
                .pageSize(0L)
                .phoneNumber("+12345678910")
                .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                .simGroupName("sim name")
                .addSort("created_at")
                .startDate("2021-05-01T00:00:00Z")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "e093fbe0-5bde-11eb-ae93-0242ac130002")
                    .put("end_date", "2021-06-01T00:00:00Z")
                    .put("imsi", "123456")
                    .put("mcc", "204")
                    .put("mnc", "01")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("phone_number", "+12345678910")
                    .put("sim_card_id", "877f80a6-e5b2-4687-9a04-88076265720f")
                    .put("sim_group_id", "f05a189f-7c46-4531-ac56-1460dc465a42")
                    .put("sim_group_name", "sim name")
                    .put("sort", listOf("created_at").joinToString(","))
                    .put("start_date", "2021-05-01T00:00:00Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportListWdrsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
