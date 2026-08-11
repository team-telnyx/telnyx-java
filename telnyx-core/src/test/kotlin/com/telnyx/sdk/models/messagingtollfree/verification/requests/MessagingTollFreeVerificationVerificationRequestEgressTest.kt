// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingTollFreeVerificationVerificationRequestEgressTest {

    @Test
    fun create() {
        val messagingTollFreeVerificationVerificationRequestEgress =
            MessagingTollFreeVerificationVerificationRequestEgress.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .additionalInformation("This is for security purposes, blah blah blah")
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
                    "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
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
                .verificationRequestId("verificationRequestId")
                .ageGatedContent(false)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                .doingBusinessAs("Acme Services")
                .entityType(MessagingTollFreeVerificationEntityType.PRIVATE_PROFIT)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .isvReseller("Yes")
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .termsAndConditionUrl("https://example.com/terms")
                .verificationStatus(TfVerificationStatus.VERIFIED)
                .webhookUrl("http://example-webhook.com")
                .build()

        assertThat(messagingTollFreeVerificationVerificationRequestEgress.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.additionalInformation())
            .isEqualTo("This is for security purposes, blah blah blah")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessAddr1())
            .isEqualTo("600 Congress Avenue")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessCity())
            .isEqualTo("Austin")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessContactEmail())
            .isEqualTo("email@example.com")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.businessContactFirstName()
            )
            .isEqualTo("John")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessContactLastName())
            .isEqualTo("Doe")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessContactPhone())
            .isEqualTo("+18005550100")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessName())
            .isEqualTo("Telnyx LLC")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessState())
            .isEqualTo("Texas")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessZip())
            .isEqualTo("78701")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.corporateWebsite())
            .isEqualTo("http://example.com")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.messageVolume())
            .isEqualTo(Volume.V_100000)
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.productionMessageContent()
            )
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.useCase())
            .isEqualTo(UseCaseCategories.TWO_FA)
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.verificationRequestId())
            .isEqualTo("verificationRequestId")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.ageGatedContent())
            .contains(false)
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.businessAddr2())
            .contains("14th Floor")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.businessRegistrationCountry()
            )
            .contains("US")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.businessRegistrationNumber()
            )
            .contains("12-3456789")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.businessRegistrationType()
            )
            .contains("EIN")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress
                    .campaignVerifyAuthorizationToken()
            )
            .contains("cv_token_abc123xyz")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.doingBusinessAs())
            .contains("Acme Services")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.entityType())
            .contains(MessagingTollFreeVerificationEntityType.PRIVATE_PROFIT)
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.isvReseller())
            .contains("Yes")
        assertThat(
                messagingTollFreeVerificationVerificationRequestEgress.optInConfirmationResponse()
            )
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.optInKeywords())
            .contains("START, YES, SUBSCRIBE")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.privacyPolicyUrl())
            .contains("https://example.com/privacy")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.verificationStatus())
            .contains(TfVerificationStatus.VERIFIED)
        assertThat(messagingTollFreeVerificationVerificationRequestEgress.webhookUrl())
            .contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingTollFreeVerificationVerificationRequestEgress =
            MessagingTollFreeVerificationVerificationRequestEgress.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .additionalInformation("This is for security purposes, blah blah blah")
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
                    "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
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
                .verificationRequestId("verificationRequestId")
                .ageGatedContent(false)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                .doingBusinessAs("Acme Services")
                .entityType(MessagingTollFreeVerificationEntityType.PRIVATE_PROFIT)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .isvReseller("Yes")
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .termsAndConditionUrl("https://example.com/terms")
                .verificationStatus(TfVerificationStatus.VERIFIED)
                .webhookUrl("http://example-webhook.com")
                .build()

        val roundtrippedMessagingTollFreeVerificationVerificationRequestEgress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    messagingTollFreeVerificationVerificationRequestEgress
                ),
                jacksonTypeRef<MessagingTollFreeVerificationVerificationRequestEgress>(),
            )

        assertThat(roundtrippedMessagingTollFreeVerificationVerificationRequestEgress)
            .isEqualTo(messagingTollFreeVerificationVerificationRequestEgress)
    }
}
