// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaConfigurationUpdateParamsTest {

    @Test
    fun create() {
        LoaConfigurationUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .address(
                LoaConfigurationUpdateParams.Address.builder()
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
                LoaConfigurationUpdateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
            .logo(
                LoaConfigurationUpdateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .name("My LOA Configuration")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LoaConfigurationUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    LoaConfigurationUpdateParams.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    LoaConfigurationUpdateParams.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .logo(
                    LoaConfigurationUpdateParams.Logo.builder()
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("My LOA Configuration")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LoaConfigurationUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    LoaConfigurationUpdateParams.Address.builder()
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
                    LoaConfigurationUpdateParams.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .logo(
                    LoaConfigurationUpdateParams.Logo.builder()
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("My LOA Configuration")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                LoaConfigurationUpdateParams.Address.builder()
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
                LoaConfigurationUpdateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
        assertThat(body.logo())
            .isEqualTo(
                LoaConfigurationUpdateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("My LOA Configuration")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LoaConfigurationUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    LoaConfigurationUpdateParams.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    LoaConfigurationUpdateParams.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .logo(
                    LoaConfigurationUpdateParams.Logo.builder()
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .name("My LOA Configuration")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                LoaConfigurationUpdateParams.Address.builder()
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
                LoaConfigurationUpdateParams.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
        assertThat(body.logo())
            .isEqualTo(
                LoaConfigurationUpdateParams.Logo.builder()
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.name()).isEqualTo("My LOA Configuration")
    }
}
