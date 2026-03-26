// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseUpdateParamsTest {

    @Test
    fun create() {
        EnterpriseUpdateParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .billingAddress(
                BillingAddress.builder()
                    .administrativeArea("Illinois")
                    .city("Chicago")
                    .country("United States")
                    .postalCode("60601")
                    .streetAddress("123 Main St")
                    .extendedAddress("Suite 400")
                    .build()
            )
            .billingContact(
                BillingContact.builder()
                    .email("billing@acme.com")
                    .firstName("John")
                    .lastName("Doe")
                    .phoneNumber("15551234568")
                    .build()
            )
            .corporateRegistrationNumber("corporate_registration_number")
            .customerReference("customer_reference")
            .doingBusinessAs("doing_business_as")
            .dunBradstreetNumber("dun_bradstreet_number")
            .fein("fein")
            .industry("industry")
            .legalName("xxx")
            .numberOfEmployees(EnterpriseUpdateParams.NumberOfEmployees._1_10)
            .organizationContact(
                OrganizationContact.builder()
                    .email("jane.smith@acme.com")
                    .firstName("Jane")
                    .jobTitle("VP of Engineering")
                    .lastName("Smith")
                    .phone("+16035551234")
                    .build()
            )
            .organizationLegalType(EnterpriseUpdateParams.OrganizationLegalType.CORPORATION)
            .organizationPhysicalAddress(
                PhysicalAddress.builder()
                    .administrativeArea("Illinois")
                    .city("Chicago")
                    .country("United States")
                    .postalCode("60601")
                    .streetAddress("123 Main St")
                    .extendedAddress("Suite 400")
                    .build()
            )
            .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
            .professionalLicenseNumber("professional_license_number")
            .website("website")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .billingAddress(
                    BillingAddress.builder()
                        .administrativeArea("Illinois")
                        .city("Chicago")
                        .country("United States")
                        .postalCode("60601")
                        .streetAddress("123 Main St")
                        .extendedAddress("Suite 400")
                        .build()
                )
                .billingContact(
                    BillingContact.builder()
                        .email("billing@acme.com")
                        .firstName("John")
                        .lastName("Doe")
                        .phoneNumber("15551234568")
                        .build()
                )
                .corporateRegistrationNumber("corporate_registration_number")
                .customerReference("customer_reference")
                .doingBusinessAs("doing_business_as")
                .dunBradstreetNumber("dun_bradstreet_number")
                .fein("fein")
                .industry("industry")
                .legalName("xxx")
                .numberOfEmployees(EnterpriseUpdateParams.NumberOfEmployees._1_10)
                .organizationContact(
                    OrganizationContact.builder()
                        .email("jane.smith@acme.com")
                        .firstName("Jane")
                        .jobTitle("VP of Engineering")
                        .lastName("Smith")
                        .phone("+16035551234")
                        .build()
                )
                .organizationLegalType(EnterpriseUpdateParams.OrganizationLegalType.CORPORATION)
                .organizationPhysicalAddress(
                    PhysicalAddress.builder()
                        .administrativeArea("Illinois")
                        .city("Chicago")
                        .country("United States")
                        .postalCode("60601")
                        .streetAddress("123 Main St")
                        .extendedAddress("Suite 400")
                        .build()
                )
                .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                .professionalLicenseNumber("professional_license_number")
                .website("website")
                .build()

        val body = params._body()

        assertThat(body.billingAddress())
            .contains(
                BillingAddress.builder()
                    .administrativeArea("Illinois")
                    .city("Chicago")
                    .country("United States")
                    .postalCode("60601")
                    .streetAddress("123 Main St")
                    .extendedAddress("Suite 400")
                    .build()
            )
        assertThat(body.billingContact())
            .contains(
                BillingContact.builder()
                    .email("billing@acme.com")
                    .firstName("John")
                    .lastName("Doe")
                    .phoneNumber("15551234568")
                    .build()
            )
        assertThat(body.corporateRegistrationNumber()).contains("corporate_registration_number")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.doingBusinessAs()).contains("doing_business_as")
        assertThat(body.dunBradstreetNumber()).contains("dun_bradstreet_number")
        assertThat(body.fein()).contains("fein")
        assertThat(body.industry()).contains("industry")
        assertThat(body.legalName()).contains("xxx")
        assertThat(body.numberOfEmployees())
            .contains(EnterpriseUpdateParams.NumberOfEmployees._1_10)
        assertThat(body.organizationContact())
            .contains(
                OrganizationContact.builder()
                    .email("jane.smith@acme.com")
                    .firstName("Jane")
                    .jobTitle("VP of Engineering")
                    .lastName("Smith")
                    .phone("+16035551234")
                    .build()
            )
        assertThat(body.organizationLegalType())
            .contains(EnterpriseUpdateParams.OrganizationLegalType.CORPORATION)
        assertThat(body.organizationPhysicalAddress())
            .contains(
                PhysicalAddress.builder()
                    .administrativeArea("Illinois")
                    .city("Chicago")
                    .country("United States")
                    .postalCode("60601")
                    .streetAddress("123 Main St")
                    .extendedAddress("Suite 400")
                    .build()
            )
        assertThat(body.primaryBusinessDomainSicCode()).contains("primary_business_domain_sic_code")
        assertThat(body.professionalLicenseNumber()).contains("professional_license_number")
        assertThat(body.website()).contains("website")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EnterpriseUpdateParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
