// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappContactTest {

    @Test
    fun create() {
        val whatsappContact =
            WhatsappContact.builder()
                .addAddress(
                    WhatsappContact.Address.builder()
                        .city("city")
                        .country("country")
                        .countryCode("country_code")
                        .state("state")
                        .street("street")
                        .type("type")
                        .zip("zip")
                        .build()
                )
                .birthday("birthday")
                .addEmail(WhatsappContact.Email.builder().email("email").type("type").build())
                .name("name")
                .org(
                    WhatsappContact.Org.builder()
                        .company("company")
                        .department("department")
                        .title("title")
                        .build()
                )
                .addPhone(
                    WhatsappContact.Phone.builder()
                        .phone("phone")
                        .type("type")
                        .waId("wa_id")
                        .build()
                )
                .addUrl(WhatsappContact.Url.builder().type("type").url("url").build())
                .build()

        assertThat(whatsappContact.addresses().getOrNull())
            .containsExactly(
                WhatsappContact.Address.builder()
                    .city("city")
                    .country("country")
                    .countryCode("country_code")
                    .state("state")
                    .street("street")
                    .type("type")
                    .zip("zip")
                    .build()
            )
        assertThat(whatsappContact.birthday()).contains("birthday")
        assertThat(whatsappContact.emails().getOrNull())
            .containsExactly(WhatsappContact.Email.builder().email("email").type("type").build())
        assertThat(whatsappContact.name()).contains("name")
        assertThat(whatsappContact.org())
            .contains(
                WhatsappContact.Org.builder()
                    .company("company")
                    .department("department")
                    .title("title")
                    .build()
            )
        assertThat(whatsappContact.phones().getOrNull())
            .containsExactly(
                WhatsappContact.Phone.builder().phone("phone").type("type").waId("wa_id").build()
            )
        assertThat(whatsappContact.urls().getOrNull())
            .containsExactly(WhatsappContact.Url.builder().type("type").url("url").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappContact =
            WhatsappContact.builder()
                .addAddress(
                    WhatsappContact.Address.builder()
                        .city("city")
                        .country("country")
                        .countryCode("country_code")
                        .state("state")
                        .street("street")
                        .type("type")
                        .zip("zip")
                        .build()
                )
                .birthday("birthday")
                .addEmail(WhatsappContact.Email.builder().email("email").type("type").build())
                .name("name")
                .org(
                    WhatsappContact.Org.builder()
                        .company("company")
                        .department("department")
                        .title("title")
                        .build()
                )
                .addPhone(
                    WhatsappContact.Phone.builder()
                        .phone("phone")
                        .type("type")
                        .waId("wa_id")
                        .build()
                )
                .addUrl(WhatsappContact.Url.builder().type("type").url("url").build())
                .build()

        val roundtrippedWhatsappContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappContact),
                jacksonTypeRef<WhatsappContact>(),
            )

        assertThat(roundtrippedWhatsappContact).isEqualTo(whatsappContact)
    }
}
