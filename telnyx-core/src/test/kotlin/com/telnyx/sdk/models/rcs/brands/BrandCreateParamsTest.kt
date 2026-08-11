// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandCreateParamsTest {

    @Test
    fun create() {
        BrandCreateParams.builder()
            .addresses(
                BrandCreateParams.Addresses.builder()
                    .putAdditionalProperty(
                        "primary",
                        JsonValue.from(
                            mapOf(
                                "administrative_area" to "IL",
                                "city" to "Chicago",
                                "country_code" to "US",
                                "line_1" to "1 Main Street",
                                "postal_code" to "60601",
                                "line_2" to "x",
                            )
                        ),
                    )
                    .build()
            )
            .contacts(
                BrandCreateParams.Contacts.builder()
                    .brand(
                        BrandCreateParams.Contacts.Brand.builder()
                            .contactType(BrandContact.ContactType.BRAND)
                            .email("jane@example.com")
                            .firstName("Jane")
                            .lastName("Doe")
                            .phoneNumber("+13125550100")
                            .title("Messaging Operations Manager")
                            .build()
                    )
                    .build()
            )
            .displayName("Acme")
            .identifiers(
                BrandCreateParams.Identifiers.builder()
                    .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                    .stockSymbol(
                        StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                    )
                    .build()
            )
            .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
            .legalName("Acme LLC")
            .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
            .websiteUrl("https://www.example.com")
            .profileId("40000000-0000-0000-0000-000000000001")
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandCreateParams.builder()
                .addresses(
                    BrandCreateParams.Addresses.builder()
                        .putAdditionalProperty(
                            "primary",
                            JsonValue.from(
                                mapOf(
                                    "administrative_area" to "IL",
                                    "city" to "Chicago",
                                    "country_code" to "US",
                                    "line_1" to "1 Main Street",
                                    "postal_code" to "60601",
                                    "line_2" to "x",
                                )
                            ),
                        )
                        .build()
                )
                .contacts(
                    BrandCreateParams.Contacts.builder()
                        .brand(
                            BrandCreateParams.Contacts.Brand.builder()
                                .contactType(BrandContact.ContactType.BRAND)
                                .email("jane@example.com")
                                .firstName("Jane")
                                .lastName("Doe")
                                .phoneNumber("+13125550100")
                                .title("Messaging Operations Manager")
                                .build()
                        )
                        .build()
                )
                .displayName("Acme")
                .identifiers(
                    BrandCreateParams.Identifiers.builder()
                        .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                        .stockSymbol(
                            StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                        )
                        .build()
                )
                .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
                .legalName("Acme LLC")
                .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
                .websiteUrl("https://www.example.com")
                .profileId("40000000-0000-0000-0000-000000000001")
                .build()

        val body = params._body()

        assertThat(body.addresses())
            .isEqualTo(
                BrandCreateParams.Addresses.builder()
                    .putAdditionalProperty(
                        "primary",
                        JsonValue.from(
                            mapOf(
                                "administrative_area" to "IL",
                                "city" to "Chicago",
                                "country_code" to "US",
                                "line_1" to "1 Main Street",
                                "postal_code" to "60601",
                                "line_2" to "x",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.contacts())
            .isEqualTo(
                BrandCreateParams.Contacts.builder()
                    .brand(
                        BrandCreateParams.Contacts.Brand.builder()
                            .contactType(BrandContact.ContactType.BRAND)
                            .email("jane@example.com")
                            .firstName("Jane")
                            .lastName("Doe")
                            .phoneNumber("+13125550100")
                            .title("Messaging Operations Manager")
                            .build()
                    )
                    .build()
            )
        assertThat(body.displayName()).isEqualTo("Acme")
        assertThat(body.identifiers())
            .isEqualTo(
                BrandCreateParams.Identifiers.builder()
                    .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                    .stockSymbol(
                        StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
                    )
                    .build()
            )
        assertThat(body.legalEntityType()).isEqualTo(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
        assertThat(body.legalName()).isEqualTo("Acme LLC")
        assertThat(body.organizationType()).isEqualTo(BrandOrganizationType.PRIVATE_PROFIT)
        assertThat(body.websiteUrl()).isEqualTo("https://www.example.com")
        assertThat(body.profileId()).contains("40000000-0000-0000-0000-000000000001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrandCreateParams.builder()
                .addresses(
                    BrandCreateParams.Addresses.builder()
                        .putAdditionalProperty(
                            "primary",
                            JsonValue.from(
                                mapOf(
                                    "administrative_area" to "IL",
                                    "city" to "Chicago",
                                    "country_code" to "US",
                                    "line_1" to "1 Main Street",
                                    "postal_code" to "60601",
                                )
                            ),
                        )
                        .build()
                )
                .contacts(
                    BrandCreateParams.Contacts.builder()
                        .brand(
                            BrandCreateParams.Contacts.Brand.builder()
                                .contactType(BrandContact.ContactType.BRAND)
                                .email("jane@example.com")
                                .firstName("Jane")
                                .lastName("Doe")
                                .phoneNumber("+13125550100")
                                .build()
                        )
                        .build()
                )
                .displayName("Acme")
                .identifiers(
                    BrandCreateParams.Identifiers.builder()
                        .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                        .build()
                )
                .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
                .legalName("Acme LLC")
                .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
                .websiteUrl("https://www.example.com")
                .build()

        val body = params._body()

        assertThat(body.addresses())
            .isEqualTo(
                BrandCreateParams.Addresses.builder()
                    .putAdditionalProperty(
                        "primary",
                        JsonValue.from(
                            mapOf(
                                "administrative_area" to "IL",
                                "city" to "Chicago",
                                "country_code" to "US",
                                "line_1" to "1 Main Street",
                                "postal_code" to "60601",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.contacts())
            .isEqualTo(
                BrandCreateParams.Contacts.builder()
                    .brand(
                        BrandCreateParams.Contacts.Brand.builder()
                            .contactType(BrandContact.ContactType.BRAND)
                            .email("jane@example.com")
                            .firstName("Jane")
                            .lastName("Doe")
                            .phoneNumber("+13125550100")
                            .build()
                    )
                    .build()
            )
        assertThat(body.displayName()).isEqualTo("Acme")
        assertThat(body.identifiers())
            .isEqualTo(
                BrandCreateParams.Identifiers.builder()
                    .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                    .build()
            )
        assertThat(body.legalEntityType()).isEqualTo(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
        assertThat(body.legalName()).isEqualTo("Acme LLC")
        assertThat(body.organizationType()).isEqualTo(BrandOrganizationType.PRIVATE_PROFIT)
        assertThat(body.websiteUrl()).isEqualTo("https://www.example.com")
    }
}
