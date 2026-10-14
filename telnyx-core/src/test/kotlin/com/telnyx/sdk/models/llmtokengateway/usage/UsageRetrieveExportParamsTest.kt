// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveExportParamsTest {

    @Test
    fun create() {
        UsageRetrieveExportParams.builder()
            .cursor("cursor")
            .limit(1L)
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .types("types")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageRetrieveExportParams.builder()
                .cursor("cursor")
                .limit(1L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .types("types")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put(
                        "start_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("types", "types")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageRetrieveExportParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
