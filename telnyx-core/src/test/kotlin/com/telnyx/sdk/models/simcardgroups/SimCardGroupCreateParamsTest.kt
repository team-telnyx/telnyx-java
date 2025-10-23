// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupCreateParamsTest {

    @Test
    fun create() {
        SimCardGroupCreateParams.builder()
            .name("My Test Group")
            .dataLimit(
                SimCardGroupCreateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SimCardGroupCreateParams.builder()
                .name("My Test Group")
                .dataLimit(
                    SimCardGroupCreateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Test Group")
        assertThat(body.dataLimit())
            .contains(
                SimCardGroupCreateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SimCardGroupCreateParams.builder().name("My Test Group").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Test Group")
    }
}
