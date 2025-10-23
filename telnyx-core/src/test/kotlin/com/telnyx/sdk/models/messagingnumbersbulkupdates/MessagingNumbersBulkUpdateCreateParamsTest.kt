// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingnumbersbulkupdates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingNumbersBulkUpdateCreateParamsTest {

    @Test
    fun create() {
        MessagingNumbersBulkUpdateCreateParams.builder()
            .messagingProfileId("00000000-0000-0000-0000-000000000000")
            .numbers(listOf("+18880000000", "+18880000001", "+18880000002"))
            .build()
    }

    @Test
    fun body() {
        val params =
            MessagingNumbersBulkUpdateCreateParams.builder()
                .messagingProfileId("00000000-0000-0000-0000-000000000000")
                .numbers(listOf("+18880000000", "+18880000001", "+18880000002"))
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("00000000-0000-0000-0000-000000000000")
        assertThat(body.numbers()).containsExactly("+18880000000", "+18880000001", "+18880000002")
    }
}
