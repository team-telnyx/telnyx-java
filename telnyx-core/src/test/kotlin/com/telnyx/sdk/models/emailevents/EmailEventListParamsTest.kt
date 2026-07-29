// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailEventListParamsTest {

    @Test
    fun create() {
        EmailEventListParams.builder()
            .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .eventType("string")
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageCursor("page_cursor")
            .pageSize(1L)
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailEventListParams.builder()
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType("string")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageCursor("page_cursor")
                .pageSize(1L)
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("email_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("event_type", "string")
                    .put(
                        "from",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("page_cursor", "page_cursor")
                    .put("page_size", "1")
                    .put(
                        "to",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailEventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
