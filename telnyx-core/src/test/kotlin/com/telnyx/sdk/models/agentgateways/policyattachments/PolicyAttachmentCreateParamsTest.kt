// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policyattachments

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyAttachmentCreateParamsTest {

    @Test
    fun create() {
        PolicyAttachmentCreateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .policy("strict")
            .isDefault(true)
            .addModel("GLM-5.3*")
            .priority(10L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PolicyAttachmentCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .policy("strict")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PolicyAttachmentCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .policy("strict")
                .isDefault(true)
                .addModel("GLM-5.3*")
                .priority(10L)
                .build()

        val body = params._body()

        assertThat(body.policy()).isEqualTo("strict")
        assertThat(body.isDefault()).contains(true)
        assertThat(body.models().getOrNull()).containsExactly("GLM-5.3*")
        assertThat(body.priority()).contains(10L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PolicyAttachmentCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .policy("strict")
                .build()

        val body = params._body()

        assertThat(body.policy()).isEqualTo("strict")
    }
}
