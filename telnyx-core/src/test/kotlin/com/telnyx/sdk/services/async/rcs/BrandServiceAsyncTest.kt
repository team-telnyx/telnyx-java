// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
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

internal class BrandServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.rcs().brands()

        val brandResponseFuture =
            brandServiceAsync.create(
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

        val brandResponse = brandResponseFuture.get()
        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.rcs().brands()

        val brandResponseFuture = brandServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val brandResponse = brandResponseFuture.get()
        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.rcs().brands()

        val brandResponseFuture =
            brandServiceAsync.update(
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

        val brandResponse = brandResponseFuture.get()
        brandResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.rcs().brands()

        val brandResponsesFuture = brandServiceAsync.list()

        val brandResponses = brandResponsesFuture.get()
        brandResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.rcs().brands()

        val brandResponseFuture = brandServiceAsync.submit("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val brandResponse = brandResponseFuture.get()
        brandResponse.validate()
    }
}
