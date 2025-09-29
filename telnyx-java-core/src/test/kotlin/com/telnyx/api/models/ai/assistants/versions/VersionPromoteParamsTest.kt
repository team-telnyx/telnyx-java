// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.versions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionPromoteParamsTest {

    @Test
    fun create() {
        VersionPromoteParams.builder().assistantId("assistant_id").versionId("version_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            VersionPromoteParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("version_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
