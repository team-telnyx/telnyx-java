// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.telnyx.sdk.models.calls.actions.Loopcount
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionPlayParamsTest {

    @Test
    fun create() {
        ActionPlayParams.builder()
            .id("id")
            .audioUrl("http://www.example.com/sounds/greeting.wav")
            .addCallControlId("string")
            .loop("infinity")
            .mediaName("my_media_uploaded_to_media_storage_api")
            .region(ActionPlayParams.Region.US)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionPlayParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionPlayParams.builder()
                .id("id")
                .audioUrl("http://www.example.com/sounds/greeting.wav")
                .addCallControlId("string")
                .loop("infinity")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .region(ActionPlayParams.Region.US)
                .build()

        val body = params._body()

        assertThat(body.audioUrl()).contains("http://www.example.com/sounds/greeting.wav")
        assertThat(body.callControlIds().getOrNull()).containsExactly("string")
        assertThat(body.loop()).contains(Loopcount.ofLoopcountString("infinity"))
        assertThat(body.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.region()).contains(ActionPlayParams.Region.US)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionPlayParams.builder().id("id").build()

        val body = params._body()
    }
}
