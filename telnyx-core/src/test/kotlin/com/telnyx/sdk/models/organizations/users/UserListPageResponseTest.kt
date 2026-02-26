// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListPageResponseTest {

    @Test
    fun create() {
        val userListPageResponse =
            UserListPageResponse.builder()
                .addData(
                    OrganizationUser.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserGroupReference.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .recordType("organization_sub_user")
                        .userStatus(OrganizationUser.UserStatus.ENABLED)
                        .build()
                )
                .meta(
                    UserListPageResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(userListPageResponse.data().getOrNull())
            .containsExactly(
                OrganizationUser.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .email("user@example.com")
                    .addGroup(
                        UserGroupReference.builder()
                            .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                            .name("Engineering")
                            .build()
                    )
                    .lastSignInAt("2018-02-02T22:25:27.521Z")
                    .organizationUserBypassesSso(false)
                    .recordType("organization_sub_user")
                    .userStatus(OrganizationUser.UserStatus.ENABLED)
                    .build()
            )
        assertThat(userListPageResponse.meta())
            .contains(
                UserListPageResponse.Meta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListPageResponse =
            UserListPageResponse.builder()
                .addData(
                    OrganizationUser.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserGroupReference.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .recordType("organization_sub_user")
                        .userStatus(OrganizationUser.UserStatus.ENABLED)
                        .build()
                )
                .meta(
                    UserListPageResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedUserListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListPageResponse),
                jacksonTypeRef<UserListPageResponse>(),
            )

        assertThat(roundtrippedUserListPageResponse).isEqualTo(userListPageResponse)
    }
}
