// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockListParamsTest {

    @Test
    fun create() {
        EmailBlockListParams.builder()
            .filterCreatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterCreatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterDomainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterReason(EmailBlockListParams.FilterReason.HARD_BOUNCE)
            .pageAfter("page[after]")
            .pageBefore("page[before]")
            .pageNumber(1L)
            .pageSize(1L)
            .sort(EmailBlockListParams.Sort.CREATED_AT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailBlockListParams.builder()
                .filterCreatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterCreatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterDomainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterReason(EmailBlockListParams.FilterReason.HARD_BOUNCE)
                .pageAfter("page[after]")
                .pageBefore("page[before]")
                .pageNumber(1L)
                .pageSize(1L)
                .sort(EmailBlockListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[created_after]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put(
                        "filter[created_before]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("filter[domain_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[reason]", "hard_bounce")
                    .put("page[after]", "page[after]")
                    .put("page[before]", "page[before]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailBlockListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
