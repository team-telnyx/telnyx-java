// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numbersfeatures

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumbersFeatureCreateResponseTest {

    @Test
    fun create() {
        val numbersFeatureCreateResponse =
            NumbersFeatureCreateResponse.builder()
                .addData(
                    NumbersFeatureCreateResponse.Data.builder()
                        .addFeature("string")
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        assertThat(numbersFeatureCreateResponse.data().getOrNull())
            .containsExactly(
                NumbersFeatureCreateResponse.Data.builder()
                    .addFeature("string")
                    .phoneNumber("phone_number")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numbersFeatureCreateResponse =
            NumbersFeatureCreateResponse.builder()
                .addData(
                    NumbersFeatureCreateResponse.Data.builder()
                        .addFeature("string")
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        val roundtrippedNumbersFeatureCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numbersFeatureCreateResponse),
                jacksonTypeRef<NumbersFeatureCreateResponse>(),
            )

        assertThat(roundtrippedNumbersFeatureCreateResponse).isEqualTo(numbersFeatureCreateResponse)
    }
}
