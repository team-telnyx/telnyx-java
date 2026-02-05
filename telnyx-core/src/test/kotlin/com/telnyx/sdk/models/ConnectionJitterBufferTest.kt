// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionJitterBufferTest {

    @Test
    fun create() {
        val connectionJitterBuffer =
            ConnectionJitterBuffer.builder()
                .enableJitterBuffer(true)
                .jitterbufferMsecMax(200L)
                .jitterbufferMsecMin(60L)
                .build()

        assertThat(connectionJitterBuffer.enableJitterBuffer()).contains(true)
        assertThat(connectionJitterBuffer.jitterbufferMsecMax()).contains(200L)
        assertThat(connectionJitterBuffer.jitterbufferMsecMin()).contains(60L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionJitterBuffer =
            ConnectionJitterBuffer.builder()
                .enableJitterBuffer(true)
                .jitterbufferMsecMax(200L)
                .jitterbufferMsecMin(60L)
                .build()

        val roundtrippedConnectionJitterBuffer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionJitterBuffer),
                jacksonTypeRef<ConnectionJitterBuffer>(),
            )

        assertThat(roundtrippedConnectionJitterBuffer).isEqualTo(connectionJitterBuffer)
    }
}
