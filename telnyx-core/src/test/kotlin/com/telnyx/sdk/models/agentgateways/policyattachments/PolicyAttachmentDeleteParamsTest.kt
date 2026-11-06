// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policyattachments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyAttachmentDeleteParamsTest {

    @Test
    fun create() {
        PolicyAttachmentDeleteParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .attachmentId("3394712f-2ad5-428a-8a3d-7a08d4b2906d")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PolicyAttachmentDeleteParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .attachmentId("3394712f-2ad5-428a-8a3d-7a08d4b2906d")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("3394712f-2ad5-428a-8a3d-7a08d4b2906d")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
