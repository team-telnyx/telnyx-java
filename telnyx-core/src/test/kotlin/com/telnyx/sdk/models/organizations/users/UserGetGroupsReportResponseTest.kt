// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGetGroupsReportResponseTest {

    @Test
    fun create() {
        val userGetGroupsReportResponse =
            UserGetGroupsReportResponse.builder()
                .addData(
                    UserGetGroupsReportResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserGetGroupsReportResponse.Data.Group.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .recordType("organization_sub_user")
                        .userStatus(UserGetGroupsReportResponse.Data.UserStatus.ENABLED)
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .build()
                )
                .build()

        assertThat(userGetGroupsReportResponse.data().getOrNull())
            .containsExactly(
                UserGetGroupsReportResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .email("user@example.com")
                    .addGroup(
                        UserGetGroupsReportResponse.Data.Group.builder()
                            .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                            .name("Engineering")
                            .build()
                    )
                    .recordType("organization_sub_user")
                    .userStatus(UserGetGroupsReportResponse.Data.UserStatus.ENABLED)
                    .lastSignInAt("2018-02-02T22:25:27.521Z")
                    .organizationUserBypassesSso(false)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userGetGroupsReportResponse =
            UserGetGroupsReportResponse.builder()
                .addData(
                    UserGetGroupsReportResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .email("user@example.com")
                        .addGroup(
                            UserGetGroupsReportResponse.Data.Group.builder()
                                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                                .name("Engineering")
                                .build()
                        )
                        .recordType("organization_sub_user")
                        .userStatus(UserGetGroupsReportResponse.Data.UserStatus.ENABLED)
                        .lastSignInAt("2018-02-02T22:25:27.521Z")
                        .organizationUserBypassesSso(false)
                        .build()
                )
                .build()

        val roundtrippedUserGetGroupsReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userGetGroupsReportResponse),
                jacksonTypeRef<UserGetGroupsReportResponse>(),
            )

        assertThat(roundtrippedUserGetGroupsReportResponse).isEqualTo(userGetGroupsReportResponse)
    }
}
