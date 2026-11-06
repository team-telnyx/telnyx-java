// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingListParamsTest {

    @Test
    fun create() {
        MeetingListParams.builder()
            .id("id")
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = MeetingListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MeetingListParams.builder()
                .id("id")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "from",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
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
        val params = MeetingListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
