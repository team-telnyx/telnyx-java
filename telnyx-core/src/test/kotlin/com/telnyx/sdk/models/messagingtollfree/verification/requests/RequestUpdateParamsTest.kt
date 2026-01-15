// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestUpdateParamsTest {

    @Test
    fun create() {
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
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
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554398").build())
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554399").build())
                        .productionMessageContent("Your Telnyx OTP is XXXX")
                        .useCase(UseCaseCategories.TWO_FA)
                        .useCaseSummary(
                            "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554398").build())
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554399").build())
                        .productionMessageContent("Your Telnyx OTP is XXXX")
                        .useCase(UseCaseCategories.TWO_FA)
                        .useCaseSummary(
                            "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .build()
            )
    }
}
