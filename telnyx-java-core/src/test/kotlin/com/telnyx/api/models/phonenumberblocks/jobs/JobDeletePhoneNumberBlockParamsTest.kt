// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumberblocks.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDeletePhoneNumberBlockParamsTest {

    @Test
    fun create() {
        JobDeletePhoneNumberBlockParams.builder()
            .phoneNumberBlockId("f3946371-7199-4261-9c3d-81a0d7935146")
            .build()
    }

    @Test
    fun body() {
        val params =
            JobDeletePhoneNumberBlockParams.builder()
                .phoneNumberBlockId("f3946371-7199-4261-9c3d-81a0d7935146")
                .build()

        val body = params._body()

        assertThat(body.phoneNumberBlockId()).isEqualTo("f3946371-7199-4261-9c3d-81a0d7935146")
    }
}
