// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numbersfeatures

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumbersFeatureCreateParamsTest {

    @Test
    fun create() {
        NumbersFeatureCreateParams.builder().addPhoneNumber("string").build()
    }

    @Test
    fun body() {
        val params = NumbersFeatureCreateParams.builder().addPhoneNumber("string").build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("string")
    }
}
