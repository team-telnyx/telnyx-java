// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EnterpriseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val enterpriseServiceAsync = client.enterprises()

        val enterpriseFuture =
            enterpriseServiceAsync.create(
                EnterpriseCreateParams.builder()
                    .billingAddress(
                        EnterpriseCreateParams.BillingAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .billingContact(
                        EnterpriseCreateParams.BillingContact.builder()
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
                    .numberOfEmployees(EnterpriseCreateParams.NumberOfEmployees._51_200)
                    .organizationContact(
                        EnterpriseCreateParams.OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(EnterpriseCreateParams.OrganizationLegalType.CORPORATION)
                    .organizationPhysicalAddress(
                        EnterpriseCreateParams.OrganizationPhysicalAddress.builder()
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

        val enterprise = enterpriseFuture.get()
        enterprise.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val enterpriseServiceAsync = client.enterprises()

        val enterpriseFuture =
            enterpriseServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val enterprise = enterpriseFuture.get()
        enterprise.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val enterpriseServiceAsync = client.enterprises()

        val enterpriseFuture =
            enterpriseServiceAsync.update(
                EnterpriseUpdateParams.builder()
                    .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .billingAddress(
                        EnterpriseUpdateParams.BillingAddress.builder()
                            .administrativeArea("Illinois")
                            .city("Chicago")
                            .country("United States")
                            .postalCode("60601")
                            .streetAddress("123 Main St")
                            .extendedAddress("Suite 400")
                            .build()
                    )
                    .billingContact(
                        EnterpriseUpdateParams.BillingContact.builder()
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
                        EnterpriseUpdateParams.OrganizationContact.builder()
                            .email("jane.smith@acme.com")
                            .firstName("Jane")
                            .jobTitle("VP of Engineering")
                            .lastName("Smith")
                            .phone("+16035551234")
                            .build()
                    )
                    .organizationLegalType(EnterpriseUpdateParams.OrganizationLegalType.CORPORATION)
                    .organizationPhysicalAddress(
                        EnterpriseUpdateParams.OrganizationPhysicalAddress.builder()
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

        val enterprise = enterpriseFuture.get()
        enterprise.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val enterpriseServiceAsync = client.enterprises()

        val pageFuture = enterpriseServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val enterpriseServiceAsync = client.enterprises()

        val future = enterpriseServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = future.get()
    }
}
