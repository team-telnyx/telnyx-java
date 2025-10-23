// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveAuthorizeParamsTest {

    @Test
    fun create() {
        OAuthRetrieveAuthorizeParams.builder()
            .clientId("client_id")
            .redirectUri("https://example.com")
            .responseType(OAuthRetrieveAuthorizeParams.ResponseType.CODE)
            .codeChallenge("code_challenge")
            .codeChallengeMethod(OAuthRetrieveAuthorizeParams.CodeChallengeMethod.PLAIN)
            .scope("scope")
            .state("state")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OAuthRetrieveAuthorizeParams.builder()
                .clientId("client_id")
                .redirectUri("https://example.com")
                .responseType(OAuthRetrieveAuthorizeParams.ResponseType.CODE)
                .codeChallenge("code_challenge")
                .codeChallengeMethod(OAuthRetrieveAuthorizeParams.CodeChallengeMethod.PLAIN)
                .scope("scope")
                .state("state")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("client_id", "client_id")
                    .put("redirect_uri", "https://example.com")
                    .put("response_type", "code")
                    .put("code_challenge", "code_challenge")
                    .put("code_challenge_method", "plain")
                    .put("scope", "scope")
                    .put("state", "state")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            OAuthRetrieveAuthorizeParams.builder()
                .clientId("client_id")
                .redirectUri("https://example.com")
                .responseType(OAuthRetrieveAuthorizeParams.ResponseType.CODE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("client_id", "client_id")
                    .put("redirect_uri", "https://example.com")
                    .put("response_type", "code")
                    .build()
            )
    }
}
