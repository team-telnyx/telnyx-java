// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsessions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotSessionListParamsTest {

    @Test
    fun create() {
        BotSessionListParams.builder()
            .email("agent-owner@example.com")
            .portalRedirectToken("01890a7e-e2f7-7c3d-8dbb-9a2c5f3d1e0b")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BotSessionListParams.builder()
                .email("agent-owner@example.com")
                .portalRedirectToken("01890a7e-e2f7-7c3d-8dbb-9a2c5f3d1e0b")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("email", "agent-owner@example.com")
                    .put("portal_redirect_token", "01890a7e-e2f7-7c3d-8dbb-9a2c5f3d1e0b")
                    .build()
            )
    }
}
