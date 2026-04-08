// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseRetrieveResponseTest {

    @Test
    fun create() {
        val enterpriseRetrieveResponse =
            EnterpriseRetrieveResponse.builder()
                .data(
                    EnterpriseRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseRetrieveResponse.Data.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseRetrieveResponse.Data.BillingContact.builder()
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
                        .numberOfEmployees(EnterpriseRetrieveResponse.Data.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseRetrieveResponse.Data.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseRetrieveResponse.Data.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseRetrieveResponse.Data.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(
                            EnterpriseRetrieveResponse.Data.OrganizationType.COMMERCIAL
                        )
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseRetrieveResponse.Data.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .build()

        assertThat(enterpriseRetrieveResponse.data())
            .contains(
                EnterpriseRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .billingAddress(
                        EnterpriseRetrieveResponse.Data.BillingAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .billingContact(
                        EnterpriseRetrieveResponse.Data.BillingContact.builder()
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
                    .numberOfEmployees(EnterpriseRetrieveResponse.Data.NumberOfEmployees._1_10)
                    .organizationContact(
                        EnterpriseRetrieveResponse.Data.OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(
                        EnterpriseRetrieveResponse.Data.OrganizationLegalType.CORPORATION
                    )
                    .organizationPhysicalAddress(
                        EnterpriseRetrieveResponse.Data.OrganizationPhysicalAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .organizationType(EnterpriseRetrieveResponse.Data.OrganizationType.COMMERCIAL)
                    .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                    .professionalLicenseNumber("professional_license_number")
                    .roleType(EnterpriseRetrieveResponse.Data.RoleType.ENTERPRISE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseRetrieveResponse =
            EnterpriseRetrieveResponse.builder()
                .data(
                    EnterpriseRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseRetrieveResponse.Data.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseRetrieveResponse.Data.BillingContact.builder()
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
                        .numberOfEmployees(EnterpriseRetrieveResponse.Data.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseRetrieveResponse.Data.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseRetrieveResponse.Data.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseRetrieveResponse.Data.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(
                            EnterpriseRetrieveResponse.Data.OrganizationType.COMMERCIAL
                        )
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseRetrieveResponse.Data.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .build()

        val roundtrippedEnterpriseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseRetrieveResponse),
                jacksonTypeRef<EnterpriseRetrieveResponse>(),
            )

        assertThat(roundtrippedEnterpriseRetrieveResponse).isEqualTo(enterpriseRetrieveResponse)
    }
}
