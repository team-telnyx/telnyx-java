// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDeleteBatchParamsTest {

    @Test
    fun create() {
        JobDeleteBatchParams.builder()
            .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
            .build()
    }

    @Test
    fun body() {
        val params =
            JobDeleteBatchParams.builder()
                .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers())
            .containsExactly("+19705555098", "+19715555098", "32873127836")
    }
}
