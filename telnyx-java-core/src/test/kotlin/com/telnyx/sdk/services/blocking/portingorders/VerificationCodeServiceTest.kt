// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerificationCodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationCodeService = client.portingOrders().verificationCodes()

        val verificationCodes =
            verificationCodeService.list(
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

        verificationCodes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationCodeService = client.portingOrders().verificationCodes()

        verificationCodeService.send(
            VerificationCodeSendParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPhoneNumber("+61424000001")
                .addPhoneNumber("+61424000002")
                .verificationMethod(VerificationCodeSendParams.VerificationMethod.SMS)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationCodeService = client.portingOrders().verificationCodes()

        val response =
            verificationCodeService.verify(
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

        response.validate()
    }
}
