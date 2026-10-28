// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.artifactdownloads

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactDownloadRetrieveParamsTest {

    @Test
    fun create() {
        ArtifactDownloadRetrieveParams.builder()
            .artifactId("artifactId")
            .expires("expires")
            .sig("sig")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ArtifactDownloadRetrieveParams.builder()
                .artifactId("artifactId")
                .expires("expires")
                .sig("sig")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("artifactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ArtifactDownloadRetrieveParams.builder()
                .artifactId("artifactId")
                .expires("expires")
                .sig("sig")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("expires", "expires").put("sig", "sig").build())
    }
}
