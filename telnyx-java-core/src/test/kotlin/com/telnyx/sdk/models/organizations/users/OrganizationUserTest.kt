// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationUserTest {

    @Test
    fun create() {
        val organizationUser =
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

        assertThat(organizationUser.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(organizationUser.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(organizationUser.email()).contains("user@example.com")
        assertThat(organizationUser.groups().getOrNull())
            .containsExactly(
                UserGroupReference.builder()
                    .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                    .name("Engineering")
                    .build()
            )
        assertThat(organizationUser.lastSignInAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(organizationUser.organizationUserBypassesSso()).contains(false)
        assertThat(organizationUser.recordType()).contains("organization_sub_user")
        assertThat(organizationUser.userStatus()).contains(OrganizationUser.UserStatus.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationUser =
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

        val roundtrippedOrganizationUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationUser),
                jacksonTypeRef<OrganizationUser>(),
            )

        assertThat(roundtrippedOrganizationUser).isEqualTo(organizationUser)
    }
}
