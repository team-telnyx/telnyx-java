// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberExtensionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionService = client.portingOrders().phoneNumberExtensions()

        val phoneNumberExtension =
            phoneNumberExtensionService.create(
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

        phoneNumberExtension.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionService = client.portingOrders().phoneNumberExtensions()

        val page = phoneNumberExtensionService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberExtensionService = client.portingOrders().phoneNumberExtensions()

        val phoneNumberExtension =
            phoneNumberExtensionService.delete(
                PhoneNumberExtensionDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        phoneNumberExtension.validate()
    }
}
