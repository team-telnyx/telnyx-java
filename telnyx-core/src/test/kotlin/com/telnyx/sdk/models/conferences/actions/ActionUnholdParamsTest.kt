// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUnholdParamsTest {

    @Test
    fun create() {
        ActionUnholdParams.builder()
            .id("id")
            .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .region(ActionUnholdParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionUnholdParams.builder()
                .id("id")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionUnholdParams.builder()
                .id("id")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .region(ActionUnholdParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.callControlIds())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.region()).contains(ActionUnholdParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionUnholdParams.builder()
                .id("id")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        val body = params._body()

        assertThat(body.callControlIds())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
    }
}
