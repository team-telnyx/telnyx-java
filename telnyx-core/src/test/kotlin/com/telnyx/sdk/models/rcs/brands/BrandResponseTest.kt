// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.rcs.agents.CapabilitiesResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandResponseTest {

    @Test
    fun create() {
        val brandResponse =
            BrandResponse.builder()
                .addresses(
                    BrandResponse.Addresses.builder()
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
                .brandId("11111111-1111-4111-8111-111111111111")
                .capabilities(
                    CapabilitiesResponse.builder()
                        .brandEntity(true)
                        .brandVerification(true)
                        .campaigns(false)
                        .distinctLaunchPhase(false)
                        .inviteTestDevices(false)
                        .perCarrierApproval(false)
                        .submissionSections(true)
                        .templates(false)
                        .vendorWebhooks(false)
                        .build()
                )
                .contacts(
                    BrandResponse.Contacts.builder()
                        .putAdditionalProperty(
                            "brand",
                            JsonValue.from(
                                mapOf(
                                    "contact_type" to "BRAND",
                                    "email" to "jane@example.com",
                                    "first_name" to "Jane",
                                    "last_name" to "Doe",
                                    "phone_number" to "+13125550100",
                                    "title" to "Messaging Operations Manager",
                                )
                            ),
                        )
                        .build()
                )
                .displayName("Acme")
                .identifiers(
                    BrandResponse.Identifiers.builder()
                        .putAdditionalProperty(
                            "ein",
                            JsonValue.from(
                                mapOf("identifier_type" to "EIN", "value" to "12-3456789")
                            ),
                        )
                        .build()
                )
                .legalEntityType("LIMITED_LIABILITY_COMPANY")
                .legalName("Acme LLC")
                .organizationType("PRIVATE_PROFIT")
                .profileId("40000000-0000-0000-0000-000000000001")
                .status(BrandResponse.Status.CREATED)
                .websiteUrl("https://www.example.com")
                .build()

        assertThat(brandResponse.addresses())
            .isEqualTo(
                BrandResponse.Addresses.builder()
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
        assertThat(brandResponse.brandId()).isEqualTo("11111111-1111-4111-8111-111111111111")
        assertThat(brandResponse.capabilities())
            .isEqualTo(
                CapabilitiesResponse.builder()
                    .brandEntity(true)
                    .brandVerification(true)
                    .campaigns(false)
                    .distinctLaunchPhase(false)
                    .inviteTestDevices(false)
                    .perCarrierApproval(false)
                    .submissionSections(true)
                    .templates(false)
                    .vendorWebhooks(false)
                    .build()
            )
        assertThat(brandResponse.contacts())
            .isEqualTo(
                BrandResponse.Contacts.builder()
                    .putAdditionalProperty(
                        "brand",
                        JsonValue.from(
                            mapOf(
                                "contact_type" to "BRAND",
                                "email" to "jane@example.com",
                                "first_name" to "Jane",
                                "last_name" to "Doe",
                                "phone_number" to "+13125550100",
                                "title" to "Messaging Operations Manager",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(brandResponse.displayName()).isEqualTo("Acme")
        assertThat(brandResponse.identifiers())
            .isEqualTo(
                BrandResponse.Identifiers.builder()
                    .putAdditionalProperty(
                        "ein",
                        JsonValue.from(mapOf("identifier_type" to "EIN", "value" to "12-3456789")),
                    )
                    .build()
            )
        assertThat(brandResponse.legalEntityType()).isEqualTo("LIMITED_LIABILITY_COMPANY")
        assertThat(brandResponse.legalName()).isEqualTo("Acme LLC")
        assertThat(brandResponse.organizationType()).isEqualTo("PRIVATE_PROFIT")
        assertThat(brandResponse.profileId()).contains("40000000-0000-0000-0000-000000000001")
        assertThat(brandResponse.status()).isEqualTo(BrandResponse.Status.CREATED)
        assertThat(brandResponse.websiteUrl()).isEqualTo("https://www.example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandResponse =
            BrandResponse.builder()
                .addresses(
                    BrandResponse.Addresses.builder()
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
                .brandId("11111111-1111-4111-8111-111111111111")
                .capabilities(
                    CapabilitiesResponse.builder()
                        .brandEntity(true)
                        .brandVerification(true)
                        .campaigns(false)
                        .distinctLaunchPhase(false)
                        .inviteTestDevices(false)
                        .perCarrierApproval(false)
                        .submissionSections(true)
                        .templates(false)
                        .vendorWebhooks(false)
                        .build()
                )
                .contacts(
                    BrandResponse.Contacts.builder()
                        .putAdditionalProperty(
                            "brand",
                            JsonValue.from(
                                mapOf(
                                    "contact_type" to "BRAND",
                                    "email" to "jane@example.com",
                                    "first_name" to "Jane",
                                    "last_name" to "Doe",
                                    "phone_number" to "+13125550100",
                                    "title" to "Messaging Operations Manager",
                                )
                            ),
                        )
                        .build()
                )
                .displayName("Acme")
                .identifiers(
                    BrandResponse.Identifiers.builder()
                        .putAdditionalProperty(
                            "ein",
                            JsonValue.from(
                                mapOf("identifier_type" to "EIN", "value" to "12-3456789")
                            ),
                        )
                        .build()
                )
                .legalEntityType("LIMITED_LIABILITY_COMPANY")
                .legalName("Acme LLC")
                .organizationType("PRIVATE_PROFIT")
                .profileId("40000000-0000-0000-0000-000000000001")
                .status(BrandResponse.Status.CREATED)
                .websiteUrl("https://www.example.com")
                .build()

        val roundtrippedBrandResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandResponse),
                jacksonTypeRef<BrandResponse>(),
            )

        assertThat(roundtrippedBrandResponse).isEqualTo(brandResponse)
    }
}
