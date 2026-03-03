// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionAnalysisRetrieveParamsTest {

    @Test
    fun create() {
        SessionAnalysisRetrieveParams.builder()
            .recordType("record_type")
            .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .expand(SessionAnalysisRetrieveParams.Expand.RECORD)
            .includeChildren(true)
            .maxDepth(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionAnalysisRetrieveParams.builder()
                .recordType("record_type")
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("record_type")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SessionAnalysisRetrieveParams.builder()
                .recordType("record_type")
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expand(SessionAnalysisRetrieveParams.Expand.RECORD)
                .includeChildren(true)
                .maxDepth(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date_time", "2019-12-27T18:11:19.117Z")
                    .put("expand", "record")
                    .put("include_children", "true")
                    .put("max_depth", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SessionAnalysisRetrieveParams.builder()
                .recordType("record_type")
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
