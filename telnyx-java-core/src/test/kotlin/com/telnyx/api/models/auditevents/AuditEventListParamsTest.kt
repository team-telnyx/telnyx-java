// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.auditevents

import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListParamsTest {

    @Test
    fun create() {
        AuditEventListParams.builder()
            .filter(
                AuditEventListParams.Filter.builder()
                    .createdAfter(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .createdBefore(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                    .build()
            )
            .page(AuditEventListParams.Page.builder().number(1L).size(10L).build())
            .sort(AuditEventListParams.Sort.DESC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuditEventListParams.builder()
                .filter(
                    AuditEventListParams.Filter.builder()
                        .createdAfter(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                        .createdBefore(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                        .build()
                )
                .page(AuditEventListParams.Page.builder().number(1L).size(10L).build())
                .sort(AuditEventListParams.Sort.DESC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_after]", "2021-01-01T00:00:00Z")
                    .put("filter[created_before]", "2021-01-01T00:00:00Z")
                    .put("page[number]", "1")
                    .put("page[size]", "10")
                    .put("sort", "desc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuditEventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
