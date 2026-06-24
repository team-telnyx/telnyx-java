// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectUpdateParamsTest {

    @Test
    fun create() {
        VirtualCrossConnectUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .virtualCrossConnectPatch(
                VirtualCrossConnectPatch.builder()
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .secondaryCloudIp("169.254.0.4")
                    .secondaryEnabled(true)
                    .secondaryRoutingAnnouncement(false)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VirtualCrossConnectUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .virtualCrossConnectPatch(VirtualCrossConnectPatch.builder().build())
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
                .virtualCrossConnectPatch(
                    VirtualCrossConnectPatch.builder()
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .secondaryCloudIp("169.254.0.4")
                        .secondaryEnabled(true)
                        .secondaryRoutingAnnouncement(false)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VirtualCrossConnectPatch.builder()
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .secondaryCloudIp("169.254.0.4")
                    .secondaryEnabled(true)
                    .secondaryRoutingAnnouncement(false)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualCrossConnectUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .virtualCrossConnectPatch(VirtualCrossConnectPatch.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(VirtualCrossConnectPatch.builder().build())
    }
}
