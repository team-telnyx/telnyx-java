// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncRetrieveLogsParamsTest {

    @Test
    fun create() {
        FuncRetrieveLogsParams.builder()
            .id("id")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .type(FuncRetrieveLogsParams.Type.RUNTIME)
            .build()
    }

    @Test
    fun pathParams() {
        val params = FuncRetrieveLogsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FuncRetrieveLogsParams.builder()
                .id("id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(FuncRetrieveLogsParams.Type.RUNTIME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "end_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("limit", "1")
                    .put(
                        "start_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("type", "runtime")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FuncRetrieveLogsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
