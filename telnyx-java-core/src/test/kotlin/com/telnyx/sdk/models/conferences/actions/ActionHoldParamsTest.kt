// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionHoldParamsTest {

    @Test
    fun create() {
        ActionHoldParams.builder()
            .id("id")
            .audioUrl("http://example.com/message.wav")
            .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .mediaName("my_media_uploaded_to_media_storage_api")
            .region(ActionHoldParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionHoldParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionHoldParams.builder()
                .id("id")
                .audioUrl("http://example.com/message.wav")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .region(ActionHoldParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.audioUrl()).contains("http://example.com/message.wav")
        assertThat(body.callControlIds().getOrNull())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.region()).contains(ActionHoldParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionHoldParams.builder().id("id").build()

        val body = params._body()
    }
}
