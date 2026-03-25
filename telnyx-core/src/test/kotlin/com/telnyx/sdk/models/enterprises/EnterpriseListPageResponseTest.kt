// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseListPageResponseTest {

    @Test
    fun create() {
        val enterpriseListPageResponse =
            EnterpriseListPageResponse.builder()
                .addData(
                    EnterpriseListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseListResponse.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseListResponse.BillingContact.builder()
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
                        .numberOfEmployees(EnterpriseListResponse.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseListResponse.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseListResponse.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseListResponse.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(EnterpriseListResponse.OrganizationType.COMMERCIAL)
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseListResponse.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .meta(
                    EnterpriseListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(enterpriseListPageResponse.data().getOrNull())
            .containsExactly(
                EnterpriseListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .billingAddress(
                        EnterpriseListResponse.BillingAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .billingContact(
                        EnterpriseListResponse.BillingContact.builder()
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
                    .numberOfEmployees(EnterpriseListResponse.NumberOfEmployees._1_10)
                    .organizationContact(
                        EnterpriseListResponse.OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(EnterpriseListResponse.OrganizationLegalType.CORPORATION)
                    .organizationPhysicalAddress(
                        EnterpriseListResponse.OrganizationPhysicalAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .organizationType(EnterpriseListResponse.OrganizationType.COMMERCIAL)
                    .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                    .professionalLicenseNumber("professional_license_number")
                    .roleType(EnterpriseListResponse.RoleType.ENTERPRISE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
        assertThat(enterpriseListPageResponse.meta())
            .contains(
                EnterpriseListPageResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enterpriseListPageResponse =
            EnterpriseListPageResponse.builder()
                .addData(
                    EnterpriseListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .billingAddress(
                            EnterpriseListResponse.BillingAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .billingContact(
                            EnterpriseListResponse.BillingContact.builder()
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
                        .numberOfEmployees(EnterpriseListResponse.NumberOfEmployees._1_10)
                        .organizationContact(
                            EnterpriseListResponse.OrganizationContact.builder()
                                .email("jane.smith@acme.com")
                                .firstName("Jane")
                                .jobTitle("VP of Engineering")
                                .lastName("Smith")
                                .phone("+16035551234")
                                .build()
                        )
                        .organizationLegalType(
                            EnterpriseListResponse.OrganizationLegalType.CORPORATION
                        )
                        .organizationPhysicalAddress(
                            EnterpriseListResponse.OrganizationPhysicalAddress.builder()
                                .administrativeArea("Illinois")
                                .city("Chicago")
                                .country("United States")
                                .postalCode("60601")
                                .streetAddress("123 Main St")
                                .extendedAddress("Suite 400")
                                .build()
                        )
                        .organizationType(EnterpriseListResponse.OrganizationType.COMMERCIAL)
                        .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                        .professionalLicenseNumber("professional_license_number")
                        .roleType(EnterpriseListResponse.RoleType.ENTERPRISE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .meta(
                    EnterpriseListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedEnterpriseListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enterpriseListPageResponse),
                jacksonTypeRef<EnterpriseListPageResponse>(),
            )

        assertThat(roundtrippedEnterpriseListPageResponse).isEqualTo(enterpriseListPageResponse)
    }
}
