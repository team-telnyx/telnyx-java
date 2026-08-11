// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateParamsTest {

    @Test
    fun create() {
        BrandUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addresses(
                BrandUpdateParams.Addresses.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "administrative_area" to "x",
                                "city" to "x",
                                "country_code" to "SE",
                                "line_1" to "x",
                                "postal_code" to "x",
                                "line_2" to "x",
                            )
                        ),
                    )
                    .build()
            )
            .contacts(
                BrandUpdateParams.Contacts.builder()
                    .brand(
                        BrandUpdateParams.Contacts.Brand.builder()
                            .contactType(BrandContact.ContactType.BRAND)
                            .email("dev@stainless.com")
                            .firstName("x")
                            .lastName("x")
                            .phoneNumber("+49605132")
                            .title("x")
                            .build()
                    )
                    .build()
            )
            .displayName("Acme Communications")
            .identifiers(
                BrandUpdateParams.Identifiers.builder()
                    .ein(EinBrandIdentifier.builder().value("29-1051329").build())
                    .stockSymbol(
                        StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                    )
                    .build()
            )
            .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
            .legalName("x")
            .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
            .profileId("profile_id")
            .websiteUrl("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BrandUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addresses(
                    BrandUpdateParams.Addresses.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "administrative_area" to "x",
                                    "city" to "x",
                                    "country_code" to "SE",
                                    "line_1" to "x",
                                    "postal_code" to "x",
                                    "line_2" to "x",
                                )
                            ),
                        )
                        .build()
                )
                .contacts(
                    BrandUpdateParams.Contacts.builder()
                        .brand(
                            BrandUpdateParams.Contacts.Brand.builder()
                                .contactType(BrandContact.ContactType.BRAND)
                                .email("dev@stainless.com")
                                .firstName("x")
                                .lastName("x")
                                .phoneNumber("+49605132")
                                .title("x")
                                .build()
                        )
                        .build()
                )
                .displayName("Acme Communications")
                .identifiers(
                    BrandUpdateParams.Identifiers.builder()
                        .ein(EinBrandIdentifier.builder().value("29-1051329").build())
                        .stockSymbol(
                            StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                        )
                        .build()
                )
                .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
                .legalName("x")
                .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
                .profileId("profile_id")
                .websiteUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.addresses())
            .contains(
                BrandUpdateParams.Addresses.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "administrative_area" to "x",
                                "city" to "x",
                                "country_code" to "SE",
                                "line_1" to "x",
                                "postal_code" to "x",
                                "line_2" to "x",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.contacts())
            .contains(
                BrandUpdateParams.Contacts.builder()
                    .brand(
                        BrandUpdateParams.Contacts.Brand.builder()
                            .contactType(BrandContact.ContactType.BRAND)
                            .email("dev@stainless.com")
                            .firstName("x")
                            .lastName("x")
                            .phoneNumber("+49605132")
                            .title("x")
                            .build()
                    )
                    .build()
            )
        assertThat(body.displayName()).contains("Acme Communications")
        assertThat(body.identifiers())
            .contains(
                BrandUpdateParams.Identifiers.builder()
                    .ein(EinBrandIdentifier.builder().value("29-1051329").build())
                    .stockSymbol(
                        StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                    )
                    .build()
            )
        assertThat(body.legalEntityType()).contains(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
        assertThat(body.legalName()).contains("x")
        assertThat(body.organizationType()).contains(BrandOrganizationType.PRIVATE_PROFIT)
        assertThat(body.profileId()).contains("profile_id")
        assertThat(body.websiteUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
