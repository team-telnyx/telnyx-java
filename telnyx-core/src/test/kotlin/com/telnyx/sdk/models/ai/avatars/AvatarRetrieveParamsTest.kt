// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarRetrieveParamsTest {

    @Test
    fun create() {
        AvatarRetrieveParams.builder().avatarId("avatar_0123456789abcdef0123456789abcdef").build()
    }

    @Test
    fun pathParams() {
        val params =
            AvatarRetrieveParams.builder()
                .avatarId("avatar_0123456789abcdef0123456789abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("avatar_0123456789abcdef0123456789abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
