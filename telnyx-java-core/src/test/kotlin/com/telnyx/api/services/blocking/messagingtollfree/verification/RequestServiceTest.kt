// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.messagingtollfree.verification

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.api.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.api.models.messagingtollfree.verification.requests.TfPhoneNumber
import com.telnyx.api.models.messagingtollfree.verification.requests.TfVerificationRequest
import com.telnyx.api.models.messagingtollfree.verification.requests.TfVerificationStatus
import com.telnyx.api.models.messagingtollfree.verification.requests.Url
import com.telnyx.api.models.messagingtollfree.verification.requests.UseCaseCategories
import com.telnyx.api.models.messagingtollfree.verification.requests.Volume
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequestServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestService = client.messagingTollfree().verification().requests()

        val verificationRequestEgress =
            requestService.create(
                TfVerificationRequest.builder()
                    .additionalInformation("additionalInformation")
                    .businessAddr1("600 Congress Avenue")
                    .businessCity("Austin")
                    .businessContactEmail("email@example.com")
                    .businessContactFirstName("John")
                    .businessContactLastName("Doe")
                    .businessContactPhone("+18005550100")
                    .businessName("Telnyx LLC")
                    .businessState("Texas")
                    .businessZip("78701")
                    .corporateWebsite("http://example.com")
                    .isvReseller("isvReseller")
                    .messageVolume(Volume._100_000)
                    .optInWorkflow(
                        "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
                    )
                    .addOptInWorkflowImageUrl(
                        Url.builder().url("https://telnyx.com/sign-up").build()
                    )
                    .addOptInWorkflowImageUrl(
                        Url.builder().url("https://telnyx.com/company/data-privacy").build()
                    )
                    .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554398").build())
                    .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554399").build())
                    .productionMessageContent("Your Telnyx OTP is XXXX")
                    .useCase(UseCaseCategories._2_FA)
                    .useCaseSummary(
                        "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                    )
                    .businessAddr2("14th Floor")
                    .webhookUrl("http://example-webhook.com")
                    .build()
            )

        verificationRequestEgress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestService = client.messagingTollfree().verification().requests()

        val verificationRequestStatus =
            requestService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        verificationRequestStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestService = client.messagingTollfree().verification().requests()

        val verificationRequestEgress =
            requestService.update(
                RequestUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tfVerificationRequest(
                        TfVerificationRequest.builder()
                            .additionalInformation("additionalInformation")
                            .businessAddr1("600 Congress Avenue")
                            .businessCity("Austin")
                            .businessContactEmail("email@example.com")
                            .businessContactFirstName("John")
                            .businessContactLastName("Doe")
                            .businessContactPhone("+18005550100")
                            .businessName("Telnyx LLC")
                            .businessState("Texas")
                            .businessZip("78701")
                            .corporateWebsite("http://example.com")
                            .isvReseller("isvReseller")
                            .messageVolume(Volume._100_000)
                            .optInWorkflow(
                                "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
                            )
                            .addOptInWorkflowImageUrl(
                                Url.builder().url("https://telnyx.com/sign-up").build()
                            )
                            .addOptInWorkflowImageUrl(
                                Url.builder().url("https://telnyx.com/company/data-privacy").build()
                            )
                            .addPhoneNumber(
                                TfPhoneNumber.builder().phoneNumber("+18773554398").build()
                            )
                            .addPhoneNumber(
                                TfPhoneNumber.builder().phoneNumber("+18773554399").build()
                            )
                            .productionMessageContent("Your Telnyx OTP is XXXX")
                            .useCase(UseCaseCategories._2_FA)
                            .useCaseSummary(
                                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                            )
                            .businessAddr2("14th Floor")
                            .webhookUrl("http://example-webhook.com")
                            .build()
                    )
                    .build()
            )

        verificationRequestEgress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestService = client.messagingTollfree().verification().requests()

        val requests =
            requestService.list(
                RequestListParams.builder()
                    .page(1L)
                    .pageSize(1L)
                    .dateEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .phoneNumber("phone_number")
                    .status(TfVerificationStatus.VERIFIED)
                    .build()
            )

        requests.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestService = client.messagingTollfree().verification().requests()

        val request = requestService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        request.validate()
    }
}
