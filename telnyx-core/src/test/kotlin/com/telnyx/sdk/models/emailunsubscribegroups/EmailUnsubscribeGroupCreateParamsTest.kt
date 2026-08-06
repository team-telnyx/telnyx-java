// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailUnsubscribeGroupCreateParamsTest {

    @Test
    fun create() {
        EmailUnsubscribeGroupCreateParams.builder()
            .name("Marketing Newsletter")
            .description("Weekly product updates and promotions")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailUnsubscribeGroupCreateParams.builder()
                .name("Marketing Newsletter")
                .description("Weekly product updates and promotions")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Marketing Newsletter")
        assertThat(body.description()).contains("Weekly product updates and promotions")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailUnsubscribeGroupCreateParams.builder().name("Marketing Newsletter").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Marketing Newsletter")
    }
}
