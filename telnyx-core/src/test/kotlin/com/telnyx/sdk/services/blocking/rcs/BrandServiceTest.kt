// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.rcs.brands.BrandContact
import com.telnyx.sdk.models.rcs.brands.BrandCreateParams
import com.telnyx.sdk.models.rcs.brands.BrandLegalEntityType
import com.telnyx.sdk.models.rcs.brands.BrandOrganizationType
import com.telnyx.sdk.models.rcs.brands.BrandUpdateParams
import com.telnyx.sdk.models.rcs.brands.EinBrandIdentifier
import com.telnyx.sdk.models.rcs.brands.StockSymbolBrandIdentifier
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.rcs().brands()

        val brandResponse =
            brandService.create(
                BrandCreateParams.builder()
                    .addresses(
                        BrandCreateParams.Addresses.builder()
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
                    .contacts(
                        BrandCreateParams.Contacts.builder()
                            .brand(
                                BrandCreateParams.Contacts.Brand.builder()
                                    .contactType(BrandContact.ContactType.BRAND)
                                    .email("jane@example.com")
                                    .firstName("Jane")
                                    .lastName("Doe")
                                    .phoneNumber("+13125550100")
                                    .title("Messaging Operations Manager")
                                    .build()
                            )
                            .build()
                    )
                    .displayName("Acme")
                    .identifiers(
                        BrandCreateParams.Identifiers.builder()
                            .ein(EinBrandIdentifier.builder().value("12-3456789").build())
                            .stockSymbol(
                                StockSymbolBrandIdentifier.builder()
                                    .value("J!Q0Ok0bzJb7:pro")
                                    .build()
                            )
                            .build()
                    )
                    .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
                    .legalName("Acme LLC")
                    .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
                    .websiteUrl("https://www.example.com")
                    .profileId("40000000-0000-0000-0000-000000000001")
                    .build()
            )

        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.rcs().brands()

        val brandResponse = brandService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.rcs().brands()

        val brandResponse =
            brandService.update(
                BrandUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addresses(
                        BrandUpdateParams.Addresses.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "administrative_area" to "x",
                                        "city" to "x",
                                        "country_code" to "SE",
                                        "line_1" to "x",
                                        "postal_code" to "x",
                                        "line_2" to "x",
                                    )
                                ),
                            )
                            .build()
                    )
                    .contacts(
                        BrandUpdateParams.Contacts.builder()
                            .brand(
                                BrandUpdateParams.Contacts.Brand.builder()
                                    .contactType(BrandContact.ContactType.BRAND)
                                    .email("dev@stainless.com")
                                    .firstName("x")
                                    .lastName("x")
                                    .phoneNumber("+49605132")
                                    .title("x")
                                    .build()
                            )
                            .build()
                    )
                    .displayName("Acme Communications")
                    .identifiers(
                        BrandUpdateParams.Identifiers.builder()
                            .ein(EinBrandIdentifier.builder().value("29-1051329").build())
                            .stockSymbol(
                                StockSymbolBrandIdentifier.builder()
                                    .value("J!Q0Ok0bzJb7:pro")
                                    .build()
                            )
                            .build()
                    )
                    .legalEntityType(BrandLegalEntityType.LIMITED_LIABILITY_COMPANY)
                    .legalName("x")
                    .organizationType(BrandOrganizationType.PRIVATE_PROFIT)
                    .profileId("profile_id")
                    .websiteUrl("https://example.com")
                    .build()
            )

        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.rcs().brands()

        val brandResponses = brandService.list()

        brandResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.rcs().brands()

        val brandResponse = brandService.submit("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        brandResponse.validate()
    }
}
