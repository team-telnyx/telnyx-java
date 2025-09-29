// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListMdrsParamsTest {

    @Test
    fun create() {
        ReportListMdrsParams.builder()
            .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
            .cld("+15551237654")
            .cli("+15551237654")
            .direction(ReportListMdrsParams.Direction.INBOUND)
            .endDate("end_date")
            .messageType(ReportListMdrsParams.MessageType.SMS)
            .profile("My profile")
            .startDate("start_date")
            .status(ReportListMdrsParams.Status.DELIVERED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportListMdrsParams.builder()
                .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
                .cld("+15551237654")
                .cli("+15551237654")
                .direction(ReportListMdrsParams.Direction.INBOUND)
                .endDate("end_date")
                .messageType(ReportListMdrsParams.MessageType.SMS)
                .profile("My profile")
                .startDate("start_date")
                .status(ReportListMdrsParams.Status.DELIVERED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "e093fbe0-5bde-11eb-ae93-0242ac130002")
                    .put("cld", "+15551237654")
                    .put("cli", "+15551237654")
                    .put("direction", "INBOUND")
                    .put("end_date", "end_date")
                    .put("message_type", "SMS")
                    .put("profile", "My profile")
                    .put("start_date", "start_date")
                    .put("status", "DELIVERED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportListMdrsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
