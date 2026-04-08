// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseCreateResponseTest {

    @Test
    fun create() {
        val enterpriseCreateResponse =
            EnterpriseCreateResponse.builder()
                .data(
                    EnterpriseCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseCreateResponse.Data.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseCreateResponse.Data.BillingContact.builder()
                                .email("billing@acme.com")
                                .firstName("John")
                                .lastName("Doe")
                                .phoneNumber("15551234568")
                                .build()
                        )
                        .corporateRegistrationNumber("corporate_registration_number")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .doingBusinessAs("Acme")
                        .dunBradstreetNumber("dun_bradstreet_number")
                        .fein("fein")
                        .industry("industry")
                        .legalName("Acme Corp Inc.")
                        .numberOfEmployees(EnterpriseCreateResponse.Data.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseCreateResponse.Data.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseCreateResponse.Data.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseCreateResponse.Data.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(EnterpriseCreateResponse.Data.OrganizationType.COMMERCIAL)
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseCreateResponse.Data.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .build()

        assertThat(enterpriseCreateResponse.data())
            .contains(
                EnterpriseCreateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .billingAddress(
                        EnterpriseCreateResponse.Data.BillingAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .billingContact(
                        EnterpriseCreateResponse.Data.BillingContact.builder()
                            .email("billing@acme.com")
                            .firstName("John")
                            .lastName("Doe")
                            .phoneNumber("15551234568")
                            .build()
                    )
                    .corporateRegistrationNumber("corporate_registration_number")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerReference("customer_reference")
                    .doingBusinessAs("Acme")
                    .dunBradstreetNumber("dun_bradstreet_number")
                    .fein("fein")
                    .industry("industry")
                    .legalName("Acme Corp Inc.")
                    .numberOfEmployees(EnterpriseCreateResponse.Data.NumberOfEmployees._1_10)
                    .organizationContact(
                        EnterpriseCreateResponse.Data.OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(
                        EnterpriseCreateResponse.Data.OrganizationLegalType.CORPORATION
                    )
                    .organizationPhysicalAddress(
                        EnterpriseCreateResponse.Data.OrganizationPhysicalAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .organizationType(EnterpriseCreateResponse.Data.OrganizationType.COMMERCIAL)
                    .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                    .professionalLicenseNumber("professional_license_number")
                    .roleType(EnterpriseCreateResponse.Data.RoleType.ENTERPRISE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseCreateResponse =
            EnterpriseCreateResponse.builder()
                .data(
                    EnterpriseCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseCreateResponse.Data.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseCreateResponse.Data.BillingContact.builder()
                                .email("billing@acme.com")
                                .firstName("John")
                                .lastName("Doe")
                                .phoneNumber("15551234568")
                                .build()
                        )
                        .corporateRegistrationNumber("corporate_registration_number")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .doingBusinessAs("Acme")
                        .dunBradstreetNumber("dun_bradstreet_number")
                        .fein("fein")
                        .industry("industry")
                        .legalName("Acme Corp Inc.")
                        .numberOfEmployees(EnterpriseCreateResponse.Data.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseCreateResponse.Data.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseCreateResponse.Data.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseCreateResponse.Data.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(EnterpriseCreateResponse.Data.OrganizationType.COMMERCIAL)
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseCreateResponse.Data.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .build()

        val roundtrippedEnterpriseCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseCreateResponse),
                jacksonTypeRef<EnterpriseCreateResponse>(),
            )

        assertThat(roundtrippedEnterpriseCreateResponse).isEqualTo(enterpriseCreateResponse)
    }
}
