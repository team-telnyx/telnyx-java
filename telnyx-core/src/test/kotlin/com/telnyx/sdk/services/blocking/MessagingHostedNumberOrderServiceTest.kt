// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderListParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingHostedNumberOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrder =
            messagingHostedNumberOrderService.create(
                MessagingHostedNumberOrderCreateParams.builder()
                    .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
                    .addPhoneNumber("+18665550001")
                    .addPhoneNumber("+18665550002")
                    .build()
            )

        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrder = messagingHostedNumberOrderService.retrieve("id")

        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrders =
            messagingHostedNumberOrderService.list(
                MessagingHostedNumberOrderListParams.builder()
                    .page(
                        MessagingHostedNumberOrderListParams.Page.builder()
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        messagingHostedNumberOrders.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrder = messagingHostedNumberOrderService.delete("id")

        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkEligibility() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val response =
            messagingHostedNumberOrderService.checkEligibility(
                MessagingHostedNumberOrderCheckEligibilityParams.builder()
                    .addPhoneNumber("string")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createVerificationCodes() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val response =
            messagingHostedNumberOrderService.createVerificationCodes(
                MessagingHostedNumberOrderCreateVerificationCodesParams.builder()
                    .id("id")
                    .addPhoneNumber("string")
                    .verificationMethod(
                        MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod
                            .SMS
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validateCodes() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingHostedNumberOrderService = client.messagingHostedNumberOrders()

        val response =
            messagingHostedNumberOrderService.validateCodes(
                MessagingHostedNumberOrderValidateCodesParams.builder()
                    .id("id")
                    .addVerificationCode(
                        MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                            .code("code")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
