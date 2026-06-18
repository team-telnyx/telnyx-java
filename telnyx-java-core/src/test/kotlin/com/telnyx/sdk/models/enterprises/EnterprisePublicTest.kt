// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterprisePublicTest {

    @Test
    fun create() {
        val enterprisePublic =
            EnterprisePublic.builder()
                .id("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .billingAddress(
                    BillingAddress.builder()
                        .administrativeArea("IL")
                        .city("Chicago")
                        .country("US")
                        .postalCode("60601")
                        .streetAddress("100 Main St")
                        .extendedAddress("Suite 504")
                        .build()
                )
                .billingContact(
                    BillingContact.builder()
                        .email("billing@acmeplumbing.example.com")
                        .firstName("Alex")
                        .lastName("Bill")
                        .phoneNumber("+13125550001")
                        .build()
                )
                .brandedCallingEnabled(true)
                .corporateRegistrationNumber(null)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .customerReference("internal-id-12345")
                .doingBusinessAs("Acme Plumbing")
                .dunBradstreetNumber(null)
                .fein("12-3456789")
                .industry("technology")
                .jurisdictionOfIncorporation("Delaware")
                .legalName("Acme Plumbing LLC")
                .numberOfEmployees("51-200")
                .numberReputationEnabled(true)
                .organizationContact(
                    OrganizationContact.builder()
                        .email("sam@acmeplumbing.example.com")
                        .firstName("Sam")
                        .jobTitle("Compliance Lead")
                        .lastName("Org")
                        .phoneNumber("+13125550000")
                        .build()
                )
                .organizationLegalType("llc")
                .organizationPhysicalAddress(
                    PhysicalAddress.builder()
                        .administrativeArea("IL")
                        .city("Chicago")
                        .country("US")
                        .postalCode("60601")
                        .streetAddress("100 Main St")
                        .extendedAddress("Suite 504")
                        .build()
                )
                .organizationType("commercial")
                .primaryBusinessDomainSicCode(null)
                .professionalLicenseNumber(null)
                .roleType("enterprise")
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .website("https://acmeplumbing.example.com")
                .build()

        assertThat(enterprisePublic.id()).contains("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(enterprisePublic.billingAddress())
            .contains(
                BillingAddress.builder()
                    .administrativeArea("IL")
                    .city("Chicago")
                    .country("US")
                    .postalCode("60601")
                    .streetAddress("100 Main St")
                    .extendedAddress("Suite 504")
                    .build()
            )
        assertThat(enterprisePublic.billingContact())
            .contains(
                BillingContact.builder()
                    .email("billing@acmeplumbing.example.com")
                    .firstName("Alex")
                    .lastName("Bill")
                    .phoneNumber("+13125550001")
                    .build()
            )
        assertThat(enterprisePublic.brandedCallingEnabled()).contains(true)
        assertThat(enterprisePublic.corporateRegistrationNumber()).isEmpty
        assertThat(enterprisePublic.countryCode()).contains("US")
        assertThat(enterprisePublic.createdAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
        assertThat(enterprisePublic.customerReference()).contains("internal-id-12345")
        assertThat(enterprisePublic.doingBusinessAs()).contains("Acme Plumbing")
        assertThat(enterprisePublic.dunBradstreetNumber()).isEmpty
        assertThat(enterprisePublic.fein()).contains("12-3456789")
        assertThat(enterprisePublic.industry()).contains("technology")
        assertThat(enterprisePublic.jurisdictionOfIncorporation()).contains("Delaware")
        assertThat(enterprisePublic.legalName()).contains("Acme Plumbing LLC")
        assertThat(enterprisePublic.numberOfEmployees()).contains("51-200")
        assertThat(enterprisePublic.numberReputationEnabled()).contains(true)
        assertThat(enterprisePublic.organizationContact())
            .contains(
                OrganizationContact.builder()
                    .email("sam@acmeplumbing.example.com")
                    .firstName("Sam")
                    .jobTitle("Compliance Lead")
                    .lastName("Org")
                    .phoneNumber("+13125550000")
                    .build()
            )
        assertThat(enterprisePublic.organizationLegalType()).contains("llc")
        assertThat(enterprisePublic.organizationPhysicalAddress())
            .contains(
                PhysicalAddress.builder()
                    .administrativeArea("IL")
                    .city("Chicago")
                    .country("US")
                    .postalCode("60601")
                    .streetAddress("100 Main St")
                    .extendedAddress("Suite 504")
                    .build()
            )
        assertThat(enterprisePublic.organizationType()).contains("commercial")
        assertThat(enterprisePublic.primaryBusinessDomainSicCode()).isEmpty
        assertThat(enterprisePublic.professionalLicenseNumber()).isEmpty
        assertThat(enterprisePublic.roleType()).contains("enterprise")
        assertThat(enterprisePublic.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
        assertThat(enterprisePublic.website()).contains("https://acmeplumbing.example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterprisePublic =
            EnterprisePublic.builder()
                .id("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .billingAddress(
                    BillingAddress.builder()
                        .administrativeArea("IL")
                        .city("Chicago")
                        .country("US")
                        .postalCode("60601")
                        .streetAddress("100 Main St")
                        .extendedAddress("Suite 504")
                        .build()
                )
                .billingContact(
                    BillingContact.builder()
                        .email("billing@acmeplumbing.example.com")
                        .firstName("Alex")
                        .lastName("Bill")
                        .phoneNumber("+13125550001")
                        .build()
                )
                .brandedCallingEnabled(true)
                .corporateRegistrationNumber(null)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .customerReference("internal-id-12345")
                .doingBusinessAs("Acme Plumbing")
                .dunBradstreetNumber(null)
                .fein("12-3456789")
                .industry("technology")
                .jurisdictionOfIncorporation("Delaware")
                .legalName("Acme Plumbing LLC")
                .numberOfEmployees("51-200")
                .numberReputationEnabled(true)
                .organizationContact(
                    OrganizationContact.builder()
                        .email("sam@acmeplumbing.example.com")
                        .firstName("Sam")
                        .jobTitle("Compliance Lead")
                        .lastName("Org")
                        .phoneNumber("+13125550000")
                        .build()
                )
                .organizationLegalType("llc")
                .organizationPhysicalAddress(
                    PhysicalAddress.builder()
                        .administrativeArea("IL")
                        .city("Chicago")
                        .country("US")
                        .postalCode("60601")
                        .streetAddress("100 Main St")
                        .extendedAddress("Suite 504")
                        .build()
                )
                .organizationType("commercial")
                .primaryBusinessDomainSicCode(null)
                .professionalLicenseNumber(null)
                .roleType("enterprise")
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .website("https://acmeplumbing.example.com")
                .build()

        val roundtrippedEnterprisePublic =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterprisePublic),
                jacksonTypeRef<EnterprisePublic>(),
            )

        assertThat(roundtrippedEnterprisePublic).isEqualTo(enterprisePublic)
    }
}
