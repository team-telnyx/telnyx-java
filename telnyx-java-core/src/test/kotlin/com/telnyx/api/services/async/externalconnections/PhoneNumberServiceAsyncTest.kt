// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.externalconnections

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberListParams
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.retrieve(
                PhoneNumberRetrieveParams.builder().id("id").phoneNumberId("1234567889").build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.update(
                PhoneNumberUpdateParams.builder()
                    .id("id")
                    .phoneNumberId("1234567889")
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.externalConnections().phoneNumbers()

        val phoneNumbersFuture =
            phoneNumberServiceAsync.list(
                PhoneNumberListParams.builder()
                    .id("id")
                    .filter(
                        PhoneNumberListParams.Filter.builder()
                            .civicAddressId(
                                PhoneNumberListParams.Filter.CivicAddressId.builder()
                                    .eq("19990261512338516954")
                                    .build()
                            )
                            .locationId(
                                PhoneNumberListParams.Filter.LocationId.builder()
                                    .eq("19995665508264022121")
                                    .build()
                            )
                            .phoneNumber(
                                PhoneNumberListParams.Filter.PhoneNumber.builder()
                                    .contains("+1970")
                                    .eq("+19705555098")
                                    .build()
                            )
                            .build()
                    )
                    .page(PhoneNumberListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val phoneNumbers = phoneNumbersFuture.get()
        phoneNumbers.validate()
    }
}
