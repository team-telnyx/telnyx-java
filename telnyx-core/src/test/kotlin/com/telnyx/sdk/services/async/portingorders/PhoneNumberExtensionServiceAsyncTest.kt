// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberExtensionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberExtensionServiceAsync = client.portingOrders().phoneNumberExtensions()

        val pageFuture =
            phoneNumberExtensionServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
