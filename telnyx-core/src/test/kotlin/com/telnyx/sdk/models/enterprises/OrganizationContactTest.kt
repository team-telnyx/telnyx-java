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
                .email("jane.smith@acme.com")
                .firstName("Jane")
                .jobTitle("VP of Engineering")
                .lastName("Smith")
                .phone("+16035551234")
                .build()

        assertThat(organizationContact.email()).isEqualTo("jane.smith@acme.com")
        assertThat(organizationContact.firstName()).isEqualTo("Jane")
        assertThat(organizationContact.jobTitle()).isEqualTo("VP of Engineering")
        assertThat(organizationContact.lastName()).isEqualTo("Smith")
        assertThat(organizationContact.phone()).isEqualTo("+16035551234")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationContact =
            OrganizationContact.builder()
                .email("jane.smith@acme.com")
                .firstName("Jane")
                .jobTitle("VP of Engineering")
                .lastName("Smith")
                .phone("+16035551234")
                .build()

        val roundtrippedOrganizationContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationContact),
                jacksonTypeRef<OrganizationContact>(),
            )

        assertThat(roundtrippedOrganizationContact).isEqualTo(organizationContact)
    }
}
