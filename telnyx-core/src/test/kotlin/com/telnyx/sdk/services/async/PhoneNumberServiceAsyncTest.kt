// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateParams
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
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture = phoneNumberServiceAsync.retrieve("1293384261075731499")

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
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.update(
                PhoneNumberUpdateParams.builder()
                    .pathId("1293384261075731499")
                    .bodyId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .billingGroupId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .connectionId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .customerReference("customer-reference")
                    .externalPin("1234")
                    .hdVoiceEnabled(true)
                    .addTag("tag")
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
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumbersFuture =
            phoneNumberServiceAsync.list(
                PhoneNumberListParams.builder()
                    .filter(
                        PhoneNumberListParams.Filter.builder()
                            .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                            .connectionId("1521916448077776306")
                            .countryIsoAlpha2("US")
                            .customerReference("customer_reference")
                            .emergencyAddressId("9102160989215728032")
                            .numberType(
                                PhoneNumberListParams.Filter.NumberType.builder()
                                    .eq(PhoneNumberListParams.Filter.NumberType.Eq.LOCAL)
                                    .build()
                            )
                            .phoneNumber("phone_number")
                            .source(PhoneNumberListParams.Filter.Source.PORTED)
                            .status(PhoneNumberListParams.Filter.Status.ACTIVE)
                            .tag("tag")
                            .voiceConnectionName(
                                PhoneNumberListParams.Filter.VoiceConnectionName.builder()
                                    .contains("test")
                                    .endsWith("test")
                                    .eq("test")
                                    .startsWith("test")
                                    .build()
                            )
                            .voiceUsagePaymentMethod(
                                PhoneNumberListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                            )
                            .withoutTags(PhoneNumberListParams.Filter.WithoutTags.TRUE)
                            .build()
                    )
                    .page(PhoneNumberListParams.Page.builder().number(1L).size(1L).build())
                    .sort(PhoneNumberListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        val phoneNumbers = phoneNumbersFuture.get()
        phoneNumbers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture = phoneNumberServiceAsync.delete("1293384261075731499")

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun slimList() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.slimList(
                PhoneNumberSlimListParams.builder()
                    .filter(
                        PhoneNumberSlimListParams.Filter.builder()
                            .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                            .connectionId("1521916448077776306")
                            .countryIsoAlpha2("US")
                            .customerReference("customer_reference")
                            .emergencyAddressId("9102160989215728032")
                            .numberType(
                                PhoneNumberSlimListParams.Filter.NumberType.builder()
                                    .eq(PhoneNumberSlimListParams.Filter.NumberType.Eq.LOCAL)
                                    .build()
                            )
                            .phoneNumber("phone_number")
                            .source(PhoneNumberSlimListParams.Filter.Source.PORTED)
                            .status(PhoneNumberSlimListParams.Filter.Status.ACTIVE)
                            .tag("tag")
                            .voiceConnectionName(
                                PhoneNumberSlimListParams.Filter.VoiceConnectionName.builder()
                                    .contains("test")
                                    .endsWith("test")
                                    .eq("test")
                                    .startsWith("test")
                                    .build()
                            )
                            .voiceUsagePaymentMethod(
                                PhoneNumberSlimListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                            )
                            .build()
                    )
                    .includeConnection(true)
                    .includeTags(true)
                    .page(PhoneNumberSlimListParams.Page.builder().number(1L).size(1L).build())
                    .sort(PhoneNumberSlimListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
