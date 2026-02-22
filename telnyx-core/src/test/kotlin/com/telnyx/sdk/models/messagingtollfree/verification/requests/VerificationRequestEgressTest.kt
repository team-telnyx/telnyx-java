// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationRequestEgressTest {

    @Test
    fun create() {
        val verificationRequestEgress =
            VerificationRequestEgress.builder()
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
                .entityType(TollFreeVerificationEntityType.PRIVATE_PROFIT)
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

        assertThat(verificationRequestEgress.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(verificationRequestEgress.additionalInformation())
            .isEqualTo("This is for security purposes, blah blah blah")
        assertThat(verificationRequestEgress.businessAddr1()).isEqualTo("600 Congress Avenue")
        assertThat(verificationRequestEgress.businessCity()).isEqualTo("Austin")
        assertThat(verificationRequestEgress.businessContactEmail()).isEqualTo("email@example.com")
        assertThat(verificationRequestEgress.businessContactFirstName()).isEqualTo("John")
        assertThat(verificationRequestEgress.businessContactLastName()).isEqualTo("Doe")
        assertThat(verificationRequestEgress.businessContactPhone()).isEqualTo("+18005550100")
        assertThat(verificationRequestEgress.businessName()).isEqualTo("Telnyx LLC")
        assertThat(verificationRequestEgress.businessState()).isEqualTo("Texas")
        assertThat(verificationRequestEgress.businessZip()).isEqualTo("78701")
        assertThat(verificationRequestEgress.corporateWebsite()).isEqualTo("http://example.com")
        assertThat(verificationRequestEgress.messageVolume()).isEqualTo(Volume.V_100000)
        assertThat(verificationRequestEgress.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(verificationRequestEgress.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(verificationRequestEgress.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(verificationRequestEgress.productionMessageContent())
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(verificationRequestEgress.useCase()).isEqualTo(UseCaseCategories.TWO_FA)
        assertThat(verificationRequestEgress.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(verificationRequestEgress.verificationRequestId())
            .isEqualTo("verificationRequestId")
        assertThat(verificationRequestEgress.ageGatedContent()).contains(false)
        assertThat(verificationRequestEgress.businessAddr2()).contains("14th Floor")
        assertThat(verificationRequestEgress.businessRegistrationCountry()).contains("US")
        assertThat(verificationRequestEgress.businessRegistrationNumber()).contains("12-3456789")
        assertThat(verificationRequestEgress.businessRegistrationType()).contains("EIN")
        assertThat(verificationRequestEgress.campaignVerifyAuthorizationToken())
            .contains("cv_token_abc123xyz")
        assertThat(verificationRequestEgress.doingBusinessAs()).contains("Acme Services")
        assertThat(verificationRequestEgress.entityType())
            .contains(TollFreeVerificationEntityType.PRIVATE_PROFIT)
        assertThat(verificationRequestEgress.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(verificationRequestEgress.isvReseller()).contains("Yes")
        assertThat(verificationRequestEgress.optInConfirmationResponse())
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(verificationRequestEgress.optInKeywords()).contains("START, YES, SUBSCRIBE")
        assertThat(verificationRequestEgress.privacyPolicyUrl())
            .contains("https://example.com/privacy")
        assertThat(verificationRequestEgress.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(verificationRequestEgress.verificationStatus())
            .contains(TfVerificationStatus.VERIFIED)
        assertThat(verificationRequestEgress.webhookUrl()).contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationRequestEgress =
            VerificationRequestEgress.builder()
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
                .entityType(TollFreeVerificationEntityType.PRIVATE_PROFIT)
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

        val roundtrippedVerificationRequestEgress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationRequestEgress),
                jacksonTypeRef<VerificationRequestEgress>(),
            )

        assertThat(roundtrippedVerificationRequestEgress).isEqualTo(verificationRequestEgress)
    }
}
