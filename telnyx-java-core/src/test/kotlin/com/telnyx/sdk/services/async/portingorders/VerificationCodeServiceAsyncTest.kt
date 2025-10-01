// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerificationCodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationCodeServiceAsync = client.portingOrders().verificationCodes()

        val verificationCodesFuture =
            verificationCodeServiceAsync.list(
                VerificationCodeListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(VerificationCodeListParams.Filter.builder().verified(true).build())
                    .page(VerificationCodeListParams.Page.builder().number(1L).size(1L).build())
                    .sort(
                        VerificationCodeListParams.Sort.builder()
                            .value(VerificationCodeListParams.Sort.Value.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        val verificationCodes = verificationCodesFuture.get()
        verificationCodes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
