// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailAddressTest {

    @Test
    fun create() {
        val emailAddress = EmailAddress.builder().email("email").name("name").build()

        assertThat(emailAddress.email()).isEqualTo("email")
        assertThat(emailAddress.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailAddress = EmailAddress.builder().email("email").name("name").build()

        val roundtrippedEmailAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailAddress),
                jacksonTypeRef<EmailAddress>(),
            )

        assertThat(roundtrippedEmailAddress).isEqualTo(emailAddress)
    }
}
