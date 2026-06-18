// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationContactTest {

    @Test
    fun create() {
        val organizationContact =
            OrganizationContact.builder()
                .email("sam@acmeplumbing.example.com")
                .firstName("Sam")
                .jobTitle("Compliance Lead")
                .lastName("Org")
                .phoneNumber("+13125550000")
                .build()

        assertThat(organizationContact.email()).isEqualTo("sam@acmeplumbing.example.com")
        assertThat(organizationContact.firstName()).isEqualTo("Sam")
        assertThat(organizationContact.jobTitle()).isEqualTo("Compliance Lead")
        assertThat(organizationContact.lastName()).isEqualTo("Org")
        assertThat(organizationContact.phoneNumber()).isEqualTo("+13125550000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationContact =
            OrganizationContact.builder()
                .email("sam@acmeplumbing.example.com")
                .firstName("Sam")
                .jobTitle("Compliance Lead")
                .lastName("Org")
                .phoneNumber("+13125550000")
                .build()

        val roundtrippedOrganizationContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationContact),
                jacksonTypeRef<OrganizationContact>(),
            )

        assertThat(roundtrippedOrganizationContact).isEqualTo(organizationContact)
    }
}
