// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectPatchTest {

    @Test
    fun create() {
        val virtualCrossConnectPatch =
            VirtualCrossConnectPatch.builder()
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(false)
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryRoutingAnnouncement(false)
                .build()

        assertThat(virtualCrossConnectPatch.primaryCloudIp()).contains("169.254.0.2")
        assertThat(virtualCrossConnectPatch.primaryEnabled()).contains(true)
        assertThat(virtualCrossConnectPatch.primaryRoutingAnnouncement()).contains(false)
        assertThat(virtualCrossConnectPatch.secondaryCloudIp()).contains("169.254.0.4")
        assertThat(virtualCrossConnectPatch.secondaryEnabled()).contains(true)
        assertThat(virtualCrossConnectPatch.secondaryRoutingAnnouncement()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectPatch =
            VirtualCrossConnectPatch.builder()
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(false)
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryRoutingAnnouncement(false)
                .build()

        val roundtrippedVirtualCrossConnectPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectPatch),
                jacksonTypeRef<VirtualCrossConnectPatch>(),
            )

        assertThat(roundtrippedVirtualCrossConnectPatch).isEqualTo(virtualCrossConnectPatch)
    }
}
