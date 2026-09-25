// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceListParamsTest {

    @Test
    fun create() {
        SourceListParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .pageNumber(1L)
            .pageSize(1L)
            .sessionId("session_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceListParams.builder().namespace("namespace").profileId("profile_id").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SourceListParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .pageNumber(1L)
                .pageSize(1L)
                .sessionId("session_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("session_id", "session_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SourceListParams.builder().namespace("namespace").profileId("profile_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
