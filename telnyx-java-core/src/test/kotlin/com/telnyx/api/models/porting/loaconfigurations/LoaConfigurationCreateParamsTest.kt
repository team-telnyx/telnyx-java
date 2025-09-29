// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.loaconfigurations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaConfigurationCreateParamsTest {

    @Test
    fun create() {
        LoaConfigurationCreateParams.builder()
            .address(
                LoaConfigurationCreateParams.Address.builder()
                    .city("Austin")
                    .countryCode("US")
                    .state("TX")
                    .streetAddress("600 Congress Avenue")
                    .zipCode("78701")
                    .extendedAddress("14th Floor")
                    .build()
            )
            .companyName("Telnyx")
            .contact(
                LoaConfigurationCreateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
            .logo(
                LoaConfigurationCreateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .name("My LOA Configuration")
            .build()
    }

    @Test
    fun body() {
        val params =
            LoaConfigurationCreateParams.builder()
                .address(
                    LoaConfigurationCreateParams.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .extendedAddress("14th Floor")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    LoaConfigurationCreateParams.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .logo(
                    LoaConfigurationCreateParams.Logo.builder()
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("My LOA Configuration")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                LoaConfigurationCreateParams.Address.builder()
                    .city("Austin")
                    .countryCode("US")
                    .state("TX")
                    .streetAddress("600 Congress Avenue")
                    .zipCode("78701")
                    .extendedAddress("14th Floor")
                    .build()
            )
        assertThat(body.companyName()).isEqualTo("Telnyx")
        assertThat(body.contact())
            .isEqualTo(
                LoaConfigurationCreateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
        assertThat(body.logo())
            .isEqualTo(
                LoaConfigurationCreateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("My LOA Configuration")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LoaConfigurationCreateParams.builder()
                .address(
                    LoaConfigurationCreateParams.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    LoaConfigurationCreateParams.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .logo(
                    LoaConfigurationCreateParams.Logo.builder()
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("My LOA Configuration")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                LoaConfigurationCreateParams.Address.builder()
                    .city("Austin")
                    .countryCode("US")
                    .state("TX")
                    .streetAddress("600 Congress Avenue")
                    .zipCode("78701")
                    .build()
            )
        assertThat(body.companyName()).isEqualTo("Telnyx")
        assertThat(body.contact())
            .isEqualTo(
                LoaConfigurationCreateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
        assertThat(body.logo())
            .isEqualTo(
                LoaConfigurationCreateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("My LOA Configuration")
    }
}
