// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveResponseTest {

    @Test
    fun create() {
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .data(
                    UserRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserRetrieveResponse.Data.Group.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .recordType("organization_sub_user")
                        .userStatus(UserRetrieveResponse.Data.UserStatus.ENABLED)
                        .build()
                )
                .build()

        assertThat(userRetrieveResponse.data())
            .contains(
                UserRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .email("user@example.com")
                    .addGroup(
                        UserRetrieveResponse.Data.Group.builder()
                            .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                            .name("Engineering")
                            .build()
                    )
                    .lastSignInAt("2018-02-02T22:25:27.521Z")
                    .organizationUserBypassesSso(false)
                    .recordType("organization_sub_user")
                    .userStatus(UserRetrieveResponse.Data.UserStatus.ENABLED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .data(
                    UserRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserRetrieveResponse.Data.Group.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .recordType("organization_sub_user")
                        .userStatus(UserRetrieveResponse.Data.UserStatus.ENABLED)
                        .build()
                )
                .build()

        val roundtrippedUserRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveResponse),
                jacksonTypeRef<UserRetrieveResponse>(),
            )

        assertThat(roundtrippedUserRetrieveResponse).isEqualTo(userRetrieveResponse)
    }
}
