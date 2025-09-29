// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.versions

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveParamsTest {

    @Test
    fun create() {
        VersionRetrieveParams.builder()
            .assistantId("assistant_id")
            .versionId("version_id")
            .includeMcpServers(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VersionRetrieveParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("version_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            VersionRetrieveParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .includeMcpServers(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_mcp_servers", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            VersionRetrieveParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
