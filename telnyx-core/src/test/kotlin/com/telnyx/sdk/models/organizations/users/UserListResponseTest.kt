// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Test
    fun create() {
        val userListResponse =
            UserListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .email("user@example.com")
                .addGroup(
                    UserListResponse.Group.builder()
                        .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                        .name("Engineering")
                        .build()
                )
                .lastSignInAt("2018-02-02T22:25:27.521Z")
                .organizationUserBypassesSso(false)
                .recordType("organization_sub_user")
                .userStatus(UserListResponse.UserStatus.ENABLED)
                .build()

        assertThat(userListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(userListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(userListResponse.email()).contains("user@example.com")
        assertThat(userListResponse.groups().getOrNull())
            .containsExactly(
                UserListResponse.Group.builder()
                    .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                    .name("Engineering")
                    .build()
            )
        assertThat(userListResponse.lastSignInAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(userListResponse.organizationUserBypassesSso()).contains(false)
        assertThat(userListResponse.recordType()).contains("organization_sub_user")
        assertThat(userListResponse.userStatus()).contains(UserListResponse.UserStatus.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse =
            UserListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .email("user@example.com")
                .addGroup(
                    UserListResponse.Group.builder()
                        .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                        .name("Engineering")
                        .build()
                )
                .lastSignInAt("2018-02-02T22:25:27.521Z")
                .organizationUserBypassesSso(false)
                .recordType("organization_sub_user")
                .userStatus(UserListResponse.UserStatus.ENABLED)
                .build()

        val roundtrippedUserListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListResponse),
                jacksonTypeRef<UserListResponse>(),
            )

        assertThat(roundtrippedUserListResponse).isEqualTo(userListResponse)
    }
}
