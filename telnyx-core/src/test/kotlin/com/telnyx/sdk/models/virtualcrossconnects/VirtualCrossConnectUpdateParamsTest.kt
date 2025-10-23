// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectUpdateParamsTest {

    @Test
    fun create() {
        VirtualCrossConnectUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .primaryCloudIp("169.254.0.2")
            .primaryEnabled(true)
            .primaryRoutingAnnouncement(false)
            .secondaryCloudIp("169.254.0.4")
            .secondaryEnabled(true)
            .secondaryRoutingAnnouncement(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VirtualCrossConnectUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VirtualCrossConnectUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(false)
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryRoutingAnnouncement(false)
                .build()

        val body = params._body()

        assertThat(body.primaryCloudIp()).contains("169.254.0.2")
        assertThat(body.primaryEnabled()).contains(true)
        assertThat(body.primaryRoutingAnnouncement()).contains(false)
        assertThat(body.secondaryCloudIp()).contains("169.254.0.4")
        assertThat(body.secondaryEnabled()).contains(true)
        assertThat(body.secondaryRoutingAnnouncement()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualCrossConnectUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
