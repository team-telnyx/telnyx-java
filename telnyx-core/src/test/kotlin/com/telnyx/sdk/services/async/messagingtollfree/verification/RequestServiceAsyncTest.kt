// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingtollfree.verification

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.TfPhoneNumber
import com.telnyx.sdk.models.messagingtollfree.verification.requests.TfVerificationRequest
import com.telnyx.sdk.models.messagingtollfree.verification.requests.TollFreeVerificationEntityType
import com.telnyx.sdk.models.messagingtollfree.verification.requests.Url
import com.telnyx.sdk.models.messagingtollfree.verification.requests.UseCaseCategories
import com.telnyx.sdk.models.messagingtollfree.verification.requests.Volume
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequestServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestServiceAsync = client.messagingTollfree().verification().requests()

        val verificationRequestEgressFuture =
            requestServiceAsync.create(
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
                    .messageVolume(Volume.V_100000)
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
                    .useCase(UseCaseCategories.TWO_FA)
                    .useCaseSummary(
                        "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                    )
                    .ageGatedContent(true)
                    .businessAddr2("14th Floor")
                    .businessRegistrationCountry("US")
                    .businessRegistrationNumber("12-3456789")
                    .businessRegistrationType("EIN")
                    .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                    .doingBusinessAs("Acme Services")
                    .entityType(TollFreeVerificationEntityType.SOLE_PROPRIETOR)
                    .helpMessageResponse(
                        "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                    )
                    .optInConfirmationResponse(
                        "You have successfully opted in to receive messages from Acme Corp"
                    )
                    .optInKeywords("START, YES, SUBSCRIBE")
                    .privacyPolicyUrl("https://example.com/privacy")
                    .termsAndConditionUrl("https://example.com/terms")
                    .webhookUrl("http://example-webhook.com")
                    .build()
            )

        val verificationRequestEgress = verificationRequestEgressFuture.get()
        verificationRequestEgress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestServiceAsync = client.messagingTollfree().verification().requests()

        val verificationRequestStatusFuture =
            requestServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val verificationRequestStatus = verificationRequestStatusFuture.get()
        verificationRequestStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestServiceAsync = client.messagingTollfree().verification().requests()

        val verificationRequestEgressFuture =
            requestServiceAsync.update(
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
                            .messageVolume(Volume.V_100000)
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
                            .useCase(UseCaseCategories.TWO_FA)
                            .useCaseSummary(
                                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                            )
                            .ageGatedContent(true)
                            .businessAddr2("14th Floor")
                            .businessRegistrationCountry("US")
                            .businessRegistrationNumber("12-3456789")
                            .businessRegistrationType("EIN")
                            .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                            .doingBusinessAs("Acme Services")
                            .entityType(TollFreeVerificationEntityType.SOLE_PROPRIETOR)
                            .helpMessageResponse(
                                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                            )
                            .optInConfirmationResponse(
                                "You have successfully opted in to receive messages from Acme Corp"
                            )
                            .optInKeywords("START, YES, SUBSCRIBE")
                            .privacyPolicyUrl("https://example.com/privacy")
                            .termsAndConditionUrl("https://example.com/terms")
                            .webhookUrl("http://example-webhook.com")
                            .build()
                    )
                    .build()
            )

        val verificationRequestEgress = verificationRequestEgressFuture.get()
        verificationRequestEgress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestServiceAsync = client.messagingTollfree().verification().requests()

        val pageFuture =
            requestServiceAsync.list(RequestListParams.builder().page(1L).pageSize(1L).build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requestServiceAsync = client.messagingTollfree().verification().requests()

        val future = requestServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
