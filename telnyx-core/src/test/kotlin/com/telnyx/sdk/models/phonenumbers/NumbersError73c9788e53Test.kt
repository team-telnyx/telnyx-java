// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumbersError73c9788e53Test {

    @Test
    fun create() {
        val numbersError73c9788e53 =
            NumbersError73c9788e53.builder()
                .code("10007")
                .detail("An unexpected error occured.")
                .meta(
                    NumbersError73c9788e53.Meta.builder()
                        .url("https://developers.telnyx.com/docs/overview/errors/10015")
                        .build()
                )
                .source(
                    NumbersError73c9788e53.Source.builder()
                        .parameter("parameter")
                        .pointer("/base")
                        .build()
                )
                .title("Unexpected error")
                .build()

        assertThat(numbersError73c9788e53.code()).contains("10007")
        assertThat(numbersError73c9788e53.detail()).contains("An unexpected error occured.")
        assertThat(numbersError73c9788e53.meta())
            .contains(
                NumbersError73c9788e53.Meta.builder()
                    .url("https://developers.telnyx.com/docs/overview/errors/10015")
                    .build()
            )
        assertThat(numbersError73c9788e53.source())
            .contains(
                NumbersError73c9788e53.Source.builder()
                    .parameter("parameter")
                    .pointer("/base")
                    .build()
            )
        assertThat(numbersError73c9788e53.title()).contains("Unexpected error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numbersError73c9788e53 =
            NumbersError73c9788e53.builder()
                .code("10007")
                .detail("An unexpected error occured.")
                .meta(
                    NumbersError73c9788e53.Meta.builder()
                        .url("https://developers.telnyx.com/docs/overview/errors/10015")
                        .build()
                )
                .source(
                    NumbersError73c9788e53.Source.builder()
                        .parameter("parameter")
                        .pointer("/base")
                        .build()
                )
                .title("Unexpected error")
                .build()

        val roundtrippedNumbersError73c9788e53 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numbersError73c9788e53),
                jacksonTypeRef<NumbersError73c9788e53>(),
            )

        assertThat(roundtrippedNumbersError73c9788e53).isEqualTo(numbersError73c9788e53)
    }
}
