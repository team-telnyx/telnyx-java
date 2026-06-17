// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.BillingAddress
import com.telnyx.sdk.models.enterprises.BillingContact
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.models.enterprises.OrganizationContact
import com.telnyx.sdk.models.enterprises.PhysicalAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EnterpriseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprisePublicWrapped =
            enterpriseService.create(
                EnterpriseCreateParams.builder()
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
                            .email("billing@run065.example.com")
                            .firstName("Alex")
                            .lastName("Bill")
                            .phoneNumber("+13125550001")
                            .build()
                    )
                    .countryCode("US")
                    .doingBusinessAs("Run 065 Debug")
                    .fein("12-3456789")
                    .industry(EnterpriseCreateParams.Industry.TECHNOLOGY)
                    .jurisdictionOfIncorporation("Delaware")
                    .legalName("Run 065 Debug Co")
                    .numberOfEmployees(
                        EnterpriseCreateParams.NumberOfEmployees.NUMBER_OF_EMPLOYEES_51_200
                    )
                    .organizationContact(
                        OrganizationContact.builder()
                            .email("org@run065.example.com")
                            .firstName("Sam")
                            .jobTitle("Compliance Lead")
                            .lastName("Org")
                            .phoneNumber("+13125550000")
                            .build()
                    )
                    .organizationLegalType(EnterpriseCreateParams.OrganizationLegalType.LLC)
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
                    .organizationType(EnterpriseCreateParams.OrganizationType.COMMERCIAL)
                    .website("https://run065.example.com")
                    .corporateRegistrationNumber("corporate_registration_number")
                    .customerReference("internal-id-12345")
                    .dunBradstreetNumber("dun_bradstreet_number")
                    .primaryBusinessDomainSicCode("primary_business_domain_sic_code")
                    .professionalLicenseNumber("professional_license_number")
                    .roleType(EnterpriseCreateParams.RoleType.ENTERPRISE)
                    .build()
            )

        enterprisePublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprisePublicWrapped =
            enterpriseService.retrieve("4a6192a4-573d-446d-b3ce-aff9117272a6")

        enterprisePublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprisePublicWrapped =
            enterpriseService.update(
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
            )

        enterprisePublicWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val page = enterpriseService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        enterpriseService.delete("4a6192a4-573d-446d-b3ce-aff9117272a6")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun brandedCalling() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprisePublicWrapped =
            enterpriseService.brandedCalling("4a6192a4-573d-446d-b3ce-aff9117272a6")

        enterprisePublicWrapped.validate()
    }
}
