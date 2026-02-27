// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirementgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRequirementTest {

    @Test
    fun create() {
        val userRequirement =
            UserRequirement.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fieldType("field_type")
                .fieldValue("field_value")
                .requirementId("requirement_id")
                .status(UserRequirement.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userRequirement.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userRequirement.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userRequirement.fieldType()).contains("field_type")
        assertThat(userRequirement.fieldValue()).contains("field_value")
        assertThat(userRequirement.requirementId()).contains("requirement_id")
        assertThat(userRequirement.status()).contains(UserRequirement.Status.APPROVED)
        assertThat(userRequirement.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRequirement =
            UserRequirement.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fieldType("field_type")
                .fieldValue("field_value")
                .requirementId("requirement_id")
                .status(UserRequirement.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRequirement),
                jacksonTypeRef<UserRequirement>(),
            )

        assertThat(roundtrippedUserRequirement).isEqualTo(userRequirement)
    }
}
