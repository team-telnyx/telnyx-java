// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberExtensionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionServiceAsync = client.portingOrders().phoneNumberExtensions()

        val phoneNumberExtensionFuture =
            phoneNumberExtensionServiceAsync.create(
                PhoneNumberExtensionCreateParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addActivationRange(
                        PhoneNumberExtensionCreateParams.ActivationRange.builder()
                            .endAt(10L)
                            .startAt(1L)
                            .build()
                    )
                    .extensionRange(
                        PhoneNumberExtensionCreateParams.ExtensionRange.builder()
                            .endAt(10L)
                            .startAt(1L)
                            .build()
                    )
                    .portingPhoneNumberId("f24151b6-3389-41d3-8747-7dd8c681e5e2")
                    .build()
            )

        val phoneNumberExtension = phoneNumberExtensionFuture.get()
        phoneNumberExtension.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionServiceAsync = client.portingOrders().phoneNumberExtensions()

        val phoneNumberExtensionsFuture =
            phoneNumberExtensionServiceAsync.list(
                PhoneNumberExtensionListParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(
                        PhoneNumberExtensionListParams.Filter.builder()
                            .portingPhoneNumberId("04f8f1b9-310c-4a3c-963e-7dfc54765140")
                            .build()
                    )
                    .page(PhoneNumberExtensionListParams.Page.builder().number(1L).size(1L).build())
                    .sort(
                        PhoneNumberExtensionListParams.Sort.builder()
                            .value(PhoneNumberExtensionListParams.Sort.Value_.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        val phoneNumberExtensions = phoneNumberExtensionsFuture.get()
        phoneNumberExtensions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionServiceAsync = client.portingOrders().phoneNumberExtensions()

        val phoneNumberExtensionFuture =
            phoneNumberExtensionServiceAsync.delete(
                PhoneNumberExtensionDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val phoneNumberExtension = phoneNumberExtensionFuture.get()
        phoneNumberExtension.validate()
    }
}
