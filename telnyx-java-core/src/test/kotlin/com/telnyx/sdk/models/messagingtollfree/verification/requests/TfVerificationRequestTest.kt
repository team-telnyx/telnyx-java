// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TfVerificationRequestTest {

    @Test
    fun create() {
        val tfVerificationRequest =
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
                .addOptInWorkflowImageUrl(Url.builder().url("https://telnyx.com/sign-up").build())
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
                .ageGatedContent(true)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .doingBusinessAs("Acme Services")
                .entityType(TfVerificationRequest.EntityType.SOLE_PROPRIETOR)
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

        assertThat(tfVerificationRequest.additionalInformation()).isEqualTo("additionalInformation")
        assertThat(tfVerificationRequest.businessAddr1()).isEqualTo("600 Congress Avenue")
        assertThat(tfVerificationRequest.businessCity()).isEqualTo("Austin")
        assertThat(tfVerificationRequest.businessContactEmail()).isEqualTo("email@example.com")
        assertThat(tfVerificationRequest.businessContactFirstName()).isEqualTo("John")
        assertThat(tfVerificationRequest.businessContactLastName()).isEqualTo("Doe")
        assertThat(tfVerificationRequest.businessContactPhone()).isEqualTo("+18005550100")
        assertThat(tfVerificationRequest.businessName()).isEqualTo("Telnyx LLC")
        assertThat(tfVerificationRequest.businessState()).isEqualTo("Texas")
        assertThat(tfVerificationRequest.businessZip()).isEqualTo("78701")
        assertThat(tfVerificationRequest.corporateWebsite()).isEqualTo("http://example.com")
        assertThat(tfVerificationRequest.isvReseller()).isEqualTo("isvReseller")
        assertThat(tfVerificationRequest.messageVolume()).isEqualTo(Volume._100_000)
        assertThat(tfVerificationRequest.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters a number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(tfVerificationRequest.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(tfVerificationRequest.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(tfVerificationRequest.productionMessageContent())
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(tfVerificationRequest.useCase()).isEqualTo(UseCaseCategories._2_FA)
        assertThat(tfVerificationRequest.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(tfVerificationRequest.ageGatedContent()).contains(true)
        assertThat(tfVerificationRequest.businessAddr2()).contains("14th Floor")
        assertThat(tfVerificationRequest.businessRegistrationCountry()).contains("US")
        assertThat(tfVerificationRequest.businessRegistrationNumber()).contains("12-3456789")
        assertThat(tfVerificationRequest.businessRegistrationType()).contains("EIN")
        assertThat(tfVerificationRequest.doingBusinessAs()).contains("Acme Services")
        assertThat(tfVerificationRequest.entityType())
            .contains(TfVerificationRequest.EntityType.SOLE_PROPRIETOR)
        assertThat(tfVerificationRequest.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(tfVerificationRequest.optInConfirmationResponse())
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(tfVerificationRequest.optInKeywords()).contains("START, YES, SUBSCRIBE")
        assertThat(tfVerificationRequest.privacyPolicyUrl()).contains("https://example.com/privacy")
        assertThat(tfVerificationRequest.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(tfVerificationRequest.webhookUrl()).contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tfVerificationRequest =
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
                .addOptInWorkflowImageUrl(Url.builder().url("https://telnyx.com/sign-up").build())
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
                .ageGatedContent(true)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .doingBusinessAs("Acme Services")
                .entityType(TfVerificationRequest.EntityType.SOLE_PROPRIETOR)
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

        val roundtrippedTfVerificationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tfVerificationRequest),
                jacksonTypeRef<TfVerificationRequest>(),
            )

        assertThat(roundtrippedTfVerificationRequest).isEqualTo(tfVerificationRequest)
    }
}
