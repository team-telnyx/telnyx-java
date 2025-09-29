// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementtypes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementTypeRetrieveParamsTest {

    @Test
    fun create() {
        RequirementTypeRetrieveParams.builder().id("a38c217a-8019-48f8-bff6-0fdd9939075b").build()
    }

    @Test
    fun pathParams() {
        val params =
            RequirementTypeRetrieveParams.builder()
                .id("a38c217a-8019-48f8-bff6-0fdd9939075b")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("a38c217a-8019-48f8-bff6-0fdd9939075b")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
