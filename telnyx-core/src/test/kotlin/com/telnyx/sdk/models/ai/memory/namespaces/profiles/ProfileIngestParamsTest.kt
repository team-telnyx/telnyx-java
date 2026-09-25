// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileIngestParamsTest {

    @Test
    fun create() {
        ProfileIngestParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .sessionId("session_id")
            .body(
                ProfileIngestParams.Body.UnionMember0.builder()
                    .putAdditionalProperty("messages", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileIngestParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .body(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProfileIngestParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .sessionId("session_id")
                .body(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("session_id", "session_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ProfileIngestParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .body(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProfileIngestParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .sessionId("session_id")
                .body(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProfileIngestParams.Body.ofUnionMember0(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfileIngestParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .body(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProfileIngestParams.Body.ofUnionMember0(
                    ProfileIngestParams.Body.UnionMember0.builder()
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .build()
                )
            )
    }
}
