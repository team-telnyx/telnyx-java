// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rooms.actions.ActionGenerateJoinClientTokenParams
import com.telnyx.sdk.models.rooms.actions.ActionRefreshClientTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun generateJoinClientToken() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.rooms().actions()

        val response =
            actionService.generateJoinClientToken(
                ActionGenerateJoinClientTokenParams.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .refreshTokenTtlSecs(3600L)
                    .tokenTtlSecs(600L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refreshClientToken() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.rooms().actions()

        val response =
            actionService.refreshClientToken(
                ActionRefreshClientTokenParams.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .refreshToken(
                        "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJ0ZWxueXhfdGVsZXBob255IiwiZXhwIjoxNTkwMDEwMTQzLCJpYXQiOjE1ODc1OTA5NDMsImlzcyI6InRlbG55eF90ZWxlcGhvbnkiLCJqdGkiOiJiOGM3NDgzNy1kODllLTRhNjUtOWNmMi0zNGM3YTZmYTYwYzgiLCJuYmYiOjE1ODc1OTA5NDIsInN1YiI6IjVjN2FjN2QwLWRiNjUtNGYxMS05OGUxLWVlYzBkMWQ1YzZhZSIsInRlbF90b2tlbiI6InJqX1pra1pVT1pNeFpPZk9tTHBFVUIzc2lVN3U2UmpaRmVNOXMtZ2JfeENSNTZXRktGQUppTXlGMlQ2Q0JSbWxoX1N5MGlfbGZ5VDlBSThzRWlmOE1USUlzenl6U2xfYURuRzQ4YU81MHlhSEd1UlNZYlViU1ltOVdJaVEwZz09IiwidHlwIjoiYWNjZXNzIn0.gNEwzTow5MLLPLQENytca7pUN79PmPj6FyqZWW06ZeEmesxYpwKh0xRtA0TzLh6CDYIRHrI8seofOO0YFGDhpQ"
                    )
                    .tokenTtlSecs(600L)
                    .build()
            )

        response.validate()
    }
}
