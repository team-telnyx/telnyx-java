// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUnmuteParamsTest {

    @Test
    fun create() {
        ActionUnmuteParams.builder()
            .id("id")
            .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .region(ActionUnmuteParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionUnmuteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionUnmuteParams.builder()
                .id("id")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .region(ActionUnmuteParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.callControlIds().getOrNull())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.region()).contains(ActionUnmuteParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionUnmuteParams.builder().id("id").build()

        val body = params._body()
    }
}
