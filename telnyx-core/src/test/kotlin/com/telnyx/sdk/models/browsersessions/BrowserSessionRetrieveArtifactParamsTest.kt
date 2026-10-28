// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowserSessionRetrieveArtifactParamsTest {

    @Test
    fun create() {
        BrowserSessionRetrieveArtifactParams.builder().id("id").artifactId("artifactId").build()
    }

    @Test
    fun pathParams() {
        val params =
            BrowserSessionRetrieveArtifactParams.builder().id("id").artifactId("artifactId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("artifactId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
