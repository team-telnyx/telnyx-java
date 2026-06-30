// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderUserFeedbackTest {

    @Test
    fun create() {
        val portingOrderUserFeedback =
            PortingOrderUserFeedback.builder()
                .userComment("I loved my experience porting numbers with Telnyx")
                .userRating(5L)
                .build()

        assertThat(portingOrderUserFeedback.userComment())
            .contains("I loved my experience porting numbers with Telnyx")
        assertThat(portingOrderUserFeedback.userRating()).contains(5L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderUserFeedback =
            PortingOrderUserFeedback.builder()
                .userComment("I loved my experience porting numbers with Telnyx")
                .userRating(5L)
                .build()

        val roundtrippedPortingOrderUserFeedback =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderUserFeedback),
                jacksonTypeRef<PortingOrderUserFeedback>(),
            )

        assertThat(roundtrippedPortingOrderUserFeedback).isEqualTo(portingOrderUserFeedback)
    }
}
