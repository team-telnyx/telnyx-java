// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingTollFreeVerificationTfVerificationRequestTest {

    @Test
    fun create() {
        val messagingTollFreeVerificationTfVerificationRequest =
            MessagingTollFreeVerificationTfVerificationRequest.builder()
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
                .messageVolume(Volume.V_100000)
                .optInWorkflow(
                    "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
                )
                .addOptInWorkflowImageUrl(Url.builder().url("https://telnyx.com/sign-up").build())
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
                .entityType(MessagingTollFreeVerificationEntityType.SOLE_PROPRIETOR)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .isvReseller("isvReseller")
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .termsAndConditionUrl("https://example.com/terms")
                .webhookUrl("http://example-webhook.com")
                .build()

        assertThat(messagingTollFreeVerificationTfVerificationRequest.additionalInformation())
            .isEqualTo("additionalInformation")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessAddr1())
            .isEqualTo("600 Congress Avenue")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessCity())
            .isEqualTo("Austin")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessContactEmail())
            .isEqualTo("email@example.com")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessContactFirstName())
            .isEqualTo("John")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessContactLastName())
            .isEqualTo("Doe")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessContactPhone())
            .isEqualTo("+18005550100")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessName())
            .isEqualTo("Telnyx LLC")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessState())
            .isEqualTo("Texas")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessZip())
            .isEqualTo("78701")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.corporateWebsite())
            .isEqualTo("http://example.com")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.messageVolume())
            .isEqualTo(Volume.V_100000)
        assertThat(messagingTollFreeVerificationTfVerificationRequest.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(messagingTollFreeVerificationTfVerificationRequest.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(messagingTollFreeVerificationTfVerificationRequest.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(messagingTollFreeVerificationTfVerificationRequest.productionMessageContent())
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.useCase())
            .isEqualTo(UseCaseCategories.TWO_FA)
        assertThat(messagingTollFreeVerificationTfVerificationRequest.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(messagingTollFreeVerificationTfVerificationRequest.ageGatedContent())
            .contains(true)
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessAddr2())
            .contains("14th Floor")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessRegistrationCountry())
            .contains("US")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessRegistrationNumber())
            .contains("12-3456789")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.businessRegistrationType())
            .contains("EIN")
        assertThat(
                messagingTollFreeVerificationTfVerificationRequest
                    .campaignVerifyAuthorizationToken()
            )
            .contains("cv_token_abc123xyz")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.doingBusinessAs())
            .contains("Acme Services")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.entityType())
            .contains(MessagingTollFreeVerificationEntityType.SOLE_PROPRIETOR)
        assertThat(messagingTollFreeVerificationTfVerificationRequest.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(messagingTollFreeVerificationTfVerificationRequest.isvReseller())
            .contains("isvReseller")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.optInConfirmationResponse())
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.optInKeywords())
            .contains("START, YES, SUBSCRIBE")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.privacyPolicyUrl())
            .contains("https://example.com/privacy")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(messagingTollFreeVerificationTfVerificationRequest.webhookUrl())
            .contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingTollFreeVerificationTfVerificationRequest =
            MessagingTollFreeVerificationTfVerificationRequest.builder()
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
                .messageVolume(Volume.V_100000)
                .optInWorkflow(
                    "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
                )
                .addOptInWorkflowImageUrl(Url.builder().url("https://telnyx.com/sign-up").build())
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
                .entityType(MessagingTollFreeVerificationEntityType.SOLE_PROPRIETOR)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .isvReseller("isvReseller")
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .termsAndConditionUrl("https://example.com/terms")
                .webhookUrl("http://example-webhook.com")
                .build()

        val roundtrippedMessagingTollFreeVerificationTfVerificationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingTollFreeVerificationTfVerificationRequest),
                jacksonTypeRef<MessagingTollFreeVerificationTfVerificationRequest>(),
            )

        assertThat(roundtrippedMessagingTollFreeVerificationTfVerificationRequest)
            .isEqualTo(messagingTollFreeVerificationTfVerificationRequest)
    }
}
