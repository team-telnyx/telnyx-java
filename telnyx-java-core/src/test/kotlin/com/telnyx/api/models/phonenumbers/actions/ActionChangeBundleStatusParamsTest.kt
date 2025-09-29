// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionChangeBundleStatusParamsTest {

    @Test
    fun create() {
        ActionChangeBundleStatusParams.builder()
            .id("1293384261075731499")
            .bundleId("5194d8fc-87e6-4188-baa9-1c434bbe861b")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionChangeBundleStatusParams.builder()
                .id("1293384261075731499")
                .bundleId("5194d8fc-87e6-4188-baa9-1c434bbe861b")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionChangeBundleStatusParams.builder()
                .id("1293384261075731499")
                .bundleId("5194d8fc-87e6-4188-baa9-1c434bbe861b")
                .build()

        val body = params._body()

        assertThat(body.bundleId()).isEqualTo("5194d8fc-87e6-4188-baa9-1c434bbe861b")
    }
}
