// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarUpdateParamsTest {

    @Test
    fun create() {
        AvatarUpdateParams.builder()
            .avatarId("avatar_0123456789abcdef0123456789abcdef")
            .name("Updated portrait")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AvatarUpdateParams.builder()
                .avatarId("avatar_0123456789abcdef0123456789abcdef")
                .name("Updated portrait")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("avatar_0123456789abcdef0123456789abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AvatarUpdateParams.builder()
                .avatarId("avatar_0123456789abcdef0123456789abcdef")
                .name("Updated portrait")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Updated portrait")
    }
}
