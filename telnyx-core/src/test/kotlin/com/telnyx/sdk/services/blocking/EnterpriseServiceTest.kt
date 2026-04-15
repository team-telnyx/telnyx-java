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

        val enterprise =
            enterpriseService.create(
                EnterpriseCreateParams.builder()
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
                    .countryCode("US")
                    .doingBusinessAs("Acme")
                    .fein("12-3456789")
                    .industry("technology")
                    .legalName("Acme Corp Inc.")
                    .numberOfEmployees(
                        EnterpriseCreateParams.NumberOfEmployees.NUMBER_OF_EMPLOYEES_51_200
                    )
                    .organizationContact(
                        OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(EnterpriseCreateParams.OrganizationLegalType.CORPORATION)
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
                    .organizationType(EnterpriseCreateParams.OrganizationType.COMMERCIAL)
                    .website("https://acme.com")
                    .corporateRegistrationNumber("corporate_registration_number")
                    .customerReference("customer_reference")
                    .dunBradstreetNumber("dun_bradstreet_number")
                    .primaryBusinessDomainSicCode("7372")
                    .professionalLicenseNumber("professional_license_number")
                    .roleType(EnterpriseCreateParams.RoleType.ENTERPRISE)
                    .build()
            )

        enterprise.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprise = enterpriseService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        enterprise.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val enterpriseService = client.enterprises()

        val enterprise =
            enterpriseService.update(
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
                    .numberOfEmployees(
                        EnterpriseUpdateParams.NumberOfEmployees.NUMBER_OF_EMPLOYEES_1_10
                    )
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
            )

        enterprise.validate()
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

        enterpriseService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }
}
