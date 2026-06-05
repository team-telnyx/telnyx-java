// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseUpdateParamsTest {

    @Test
    fun create() {
        EnterpriseUpdateParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
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
            .corporateRegistrationNumber("corporate_registration_number")
            .customerReference("internal-ref-2026Q2")
            .doingBusinessAs("Acme Plumbing")
            .dunBradstreetNumber("dun_bradstreet_number")
            .fein("12-3456789")
            .industry(EnterpriseUpdateParams.Industry.BUSINESS)
            .jurisdictionOfIncorporation("Delaware")
            .legalName("Acme Plumbing LLC")
            .numberOfEmployees("51-200")
            .organizationContact(
                OrganizationContact.builder()
                    .email("sam@acmeplumbing.example.com")
                    .firstName("Sam")
                    .jobTitle("Compliance Lead")
                    .lastName("Owner")
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
            .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
            .professionalLicenseNumber("professional_license_number")
            .website("https://acmeplumbing.example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
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
                .corporateRegistrationNumber("corporate_registration_number")
                .customerReference("internal-ref-2026Q2")
                .doingBusinessAs("Acme Plumbing")
                .dunBradstreetNumber("dun_bradstreet_number")
                .fein("12-3456789")
                .industry(EnterpriseUpdateParams.Industry.BUSINESS)
                .jurisdictionOfIncorporation("Delaware")
                .legalName("Acme Plumbing LLC")
                .numberOfEmployees("51-200")
                .organizationContact(
                    OrganizationContact.builder()
                        .email("sam@acmeplumbing.example.com")
                        .firstName("Sam")
                        .jobTitle("Compliance Lead")
                        .lastName("Owner")
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
                .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                .professionalLicenseNumber("professional_license_number")
                .website("https://acmeplumbing.example.com")
                .build()

        val body = params._body()

        assertThat(body.billingAddress())
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
        assertThat(body.billingContact())
            .contains(
                BillingContact.builder()
                    .email("billing@acmeplumbing.example.com")
                    .firstName("Alex")
                    .lastName("Bill")
                    .phoneNumber("+13125550001")
                    .build()
            )
        assertThat(body.corporateRegistrationNumber()).contains("corporate_registration_number")
        assertThat(body.customerReference()).contains("internal-ref-2026Q2")
        assertThat(body.doingBusinessAs()).contains("Acme Plumbing")
        assertThat(body.dunBradstreetNumber()).contains("dun_bradstreet_number")
        assertThat(body.fein()).contains("12-3456789")
        assertThat(body.industry()).contains(EnterpriseUpdateParams.Industry.BUSINESS)
        assertThat(body.jurisdictionOfIncorporation()).contains("Delaware")
        assertThat(body.legalName()).contains("Acme Plumbing LLC")
        assertThat(body.numberOfEmployees()).contains("51-200")
        assertThat(body.organizationContact())
            .contains(
                OrganizationContact.builder()
                    .email("sam@acmeplumbing.example.com")
                    .firstName("Sam")
                    .jobTitle("Compliance Lead")
                    .lastName("Owner")
                    .phoneNumber("+13125550000")
                    .build()
            )
        assertThat(body.organizationLegalType()).contains("llc")
        assertThat(body.organizationPhysicalAddress())
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
        assertThat(body.primaryBusinessDomainSicCode()).contains("primary_business_domain_sic_code")
        assertThat(body.professionalLicenseNumber()).contains("professional_license_number")
        assertThat(body.website()).contains("https://acmeplumbing.example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        val body = params._body()
    }
}
