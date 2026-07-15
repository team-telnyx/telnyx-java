// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.telnyx.sdk.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfCreateParamsTest {

    @Test
    fun create() {
        CloudfCreateParams.builder()
            .idempotencyKey("Idempotency-Key")
            .name("agent-fs")
            .region(CloudfCreateParams.Region.US_EAST_1)
            .build()
    }

    @Test
    fun headers() {
        val params =
            CloudfCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("agent-fs")
                .region(CloudfCreateParams.Region.US_EAST_1)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun body() {
        val params =
            CloudfCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("agent-fs")
                .region(CloudfCreateParams.Region.US_EAST_1)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("agent-fs")
        assertThat(body.region()).isEqualTo(CloudfCreateParams.Region.US_EAST_1)
    }
}
