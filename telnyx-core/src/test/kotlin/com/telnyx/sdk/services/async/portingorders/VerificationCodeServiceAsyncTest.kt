// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerificationCodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verificationCodeServiceAsync = client.portingOrders().verificationCodes()

        val pageFuture = verificationCodeServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verificationCodeServiceAsync = client.portingOrders().verificationCodes()

        val future =
            verificationCodeServiceAsync.send(
                VerificationCodeSendParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPhoneNumber("+61424000001")
                    .addPhoneNumber("+61424000002")
                    .verificationMethod(VerificationCodeSendParams.VerificationMethod.SMS)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verificationCodeServiceAsync = client.portingOrders().verificationCodes()

        val responseFuture =
            verificationCodeServiceAsync.verify(
                VerificationCodeVerifyParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addVerificationCode(
                        VerificationCodeVerifyParams.VerificationCode.builder()
                            .code("12345")
                            .phoneNumber("+61424000001")
                            .build()
                    )
                    .addVerificationCode(
                        VerificationCodeVerifyParams.VerificationCode.builder()
                            .code("54321")
                            .phoneNumber("+61424000002")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
