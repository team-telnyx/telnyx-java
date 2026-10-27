// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedicatedIpUpdateParamsTest {

    @Test
    fun create() {
        DedicatedIpUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .drain(true)
            .force(true)
            .poolId("9b1c4d70-abcd-4e5f-8a9b-0c1d2e3f4a5b")
            .warmup(DedicatedIpUpdateParams.Warmup.builder().paused(true).build())
            .warmupPaused(true)
            .weight(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DedicatedIpUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DedicatedIpUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .drain(true)
                .force(true)
                .poolId("9b1c4d70-abcd-4e5f-8a9b-0c1d2e3f4a5b")
                .warmup(DedicatedIpUpdateParams.Warmup.builder().paused(true).build())
                .warmupPaused(true)
                .weight(100L)
                .build()

        val body = params._body()

        assertThat(body.drain()).contains(true)
        assertThat(body.force()).contains(true)
        assertThat(body.poolId()).contains("9b1c4d70-abcd-4e5f-8a9b-0c1d2e3f4a5b")
        assertThat(body.warmup())
            .contains(DedicatedIpUpdateParams.Warmup.builder().paused(true).build())
        assertThat(body.warmupPaused()).contains(true)
        assertThat(body.weight()).contains(100L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DedicatedIpUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
