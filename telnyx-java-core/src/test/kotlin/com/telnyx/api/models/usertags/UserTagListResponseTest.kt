// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.usertags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTagListResponseTest {

    @Test
    fun create() {
        val userTagListResponse =
            UserTagListResponse.builder()
                .data(
                    UserTagListResponse.Data.builder()
                        .addNumberTag("my-tag")
                        .addOutboundProfileTag("my-tag")
                        .build()
                )
                .build()

        assertThat(userTagListResponse.data())
            .contains(
                UserTagListResponse.Data.builder()
                    .addNumberTag("my-tag")
                    .addOutboundProfileTag("my-tag")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userTagListResponse =
            UserTagListResponse.builder()
                .data(
                    UserTagListResponse.Data.builder()
                        .addNumberTag("my-tag")
                        .addOutboundProfileTag("my-tag")
                        .build()
                )
                .build()

        val roundtrippedUserTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userTagListResponse),
                jacksonTypeRef<UserTagListResponse>(),
            )

        assertThat(roundtrippedUserTagListResponse).isEqualTo(userTagListResponse)
    }
}
