// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGroupReferenceTest {

    @Test
    fun create() {
        val userGroupReference =
            UserGroupReference.builder()
                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                .name("Engineering")
                .build()

        assertThat(userGroupReference.id()).isEqualTo("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
        assertThat(userGroupReference.name()).isEqualTo("Engineering")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userGroupReference =
            UserGroupReference.builder()
                .id("7b09cdc3-8948-47f0-aa62-74ac943d6c59")
                .name("Engineering")
                .build()

        val roundtrippedUserGroupReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userGroupReference),
                jacksonTypeRef<UserGroupReference>(),
            )

        assertThat(roundtrippedUserGroupReference).isEqualTo(userGroupReference)
    }
}
