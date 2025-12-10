// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationRequestStatusTest {

    @Test
    fun create() {
        val verificationRequestStatus =
            VerificationRequestStatus.builder()
                .id("eaba9f52-164e-58e0-b002-4f668e18b7ed")
                .additionalInformation("This is for security purposes, blah blah blah")
                .businessAddr1("600 Congress Avenue")
                .businessCity("Austin")
                .businessContactEmail("email@example.com")
                .businessContactFirstName("John")
                .businessContactLastName("Doe")
                .businessContactPhone("+18889809750")
                .businessName("Telnyx LLC")
                .businessState("Texas")
                .businessZip("78701")
                .corporateWebsite("http://example.com")
                .isvReseller("Yes")
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
                .verificationStatus(TfVerificationStatus.WAITING_FOR_CUSTOMER)
                .ageGatedContent(false)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .doingBusinessAs("Acme Services")
                .entityType(TollFreeVerificationEntityType.PRIVATE_PROFIT)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .reason(
                    "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                )
                .termsAndConditionUrl("https://example.com/terms")
                .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .webhookUrl("http://example-webhook.com")
                .build()

        assertThat(verificationRequestStatus.id()).isEqualTo("eaba9f52-164e-58e0-b002-4f668e18b7ed")
        assertThat(verificationRequestStatus.additionalInformation())
            .isEqualTo("This is for security purposes, blah blah blah")
        assertThat(verificationRequestStatus.businessAddr1()).isEqualTo("600 Congress Avenue")
        assertThat(verificationRequestStatus.businessCity()).isEqualTo("Austin")
        assertThat(verificationRequestStatus.businessContactEmail()).isEqualTo("email@example.com")
        assertThat(verificationRequestStatus.businessContactFirstName()).isEqualTo("John")
        assertThat(verificationRequestStatus.businessContactLastName()).isEqualTo("Doe")
        assertThat(verificationRequestStatus.businessContactPhone()).isEqualTo("+18889809750")
        assertThat(verificationRequestStatus.businessName()).isEqualTo("Telnyx LLC")
        assertThat(verificationRequestStatus.businessState()).isEqualTo("Texas")
        assertThat(verificationRequestStatus.businessZip()).isEqualTo("78701")
        assertThat(verificationRequestStatus.corporateWebsite()).isEqualTo("http://example.com")
        assertThat(verificationRequestStatus.isvReseller()).isEqualTo("Yes")
        assertThat(verificationRequestStatus.messageVolume()).isEqualTo(Volume.V_100000)
        assertThat(verificationRequestStatus.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(verificationRequestStatus.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(verificationRequestStatus.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(verificationRequestStatus.productionMessageContent())
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(verificationRequestStatus.useCase()).isEqualTo(UseCaseCategories.TWO_FA)
        assertThat(verificationRequestStatus.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(verificationRequestStatus.verificationStatus())
            .isEqualTo(TfVerificationStatus.WAITING_FOR_CUSTOMER)
        assertThat(verificationRequestStatus.ageGatedContent()).contains(false)
        assertThat(verificationRequestStatus.businessAddr2()).contains("14th Floor")
        assertThat(verificationRequestStatus.businessRegistrationCountry()).contains("US")
        assertThat(verificationRequestStatus.businessRegistrationNumber()).contains("12-3456789")
        assertThat(verificationRequestStatus.businessRegistrationType()).contains("EIN")
        assertThat(verificationRequestStatus.createdAt())
            .contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(verificationRequestStatus.doingBusinessAs()).contains("Acme Services")
        assertThat(verificationRequestStatus.entityType())
            .contains(TollFreeVerificationEntityType.PRIVATE_PROFIT)
        assertThat(verificationRequestStatus.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(verificationRequestStatus.optInConfirmationResponse())
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(verificationRequestStatus.optInKeywords()).contains("START, YES, SUBSCRIBE")
        assertThat(verificationRequestStatus.privacyPolicyUrl())
            .contains("https://example.com/privacy")
        assertThat(verificationRequestStatus.reason())
            .contains(
                "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
            )
        assertThat(verificationRequestStatus.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(verificationRequestStatus.updatedAt())
            .contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(verificationRequestStatus.webhookUrl()).contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationRequestStatus =
            VerificationRequestStatus.builder()
                .id("eaba9f52-164e-58e0-b002-4f668e18b7ed")
                .additionalInformation("This is for security purposes, blah blah blah")
                .businessAddr1("600 Congress Avenue")
                .businessCity("Austin")
                .businessContactEmail("email@example.com")
                .businessContactFirstName("John")
                .businessContactLastName("Doe")
                .businessContactPhone("+18889809750")
                .businessName("Telnyx LLC")
                .businessState("Texas")
                .businessZip("78701")
                .corporateWebsite("http://example.com")
                .isvReseller("Yes")
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
                .verificationStatus(TfVerificationStatus.WAITING_FOR_CUSTOMER)
                .ageGatedContent(false)
                .businessAddr2("14th Floor")
                .businessRegistrationCountry("US")
                .businessRegistrationNumber("12-3456789")
                .businessRegistrationType("EIN")
                .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .doingBusinessAs("Acme Services")
                .entityType(TollFreeVerificationEntityType.PRIVATE_PROFIT)
                .helpMessageResponse(
                    "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
                )
                .optInConfirmationResponse(
                    "You have successfully opted in to receive messages from Acme Corp"
                )
                .optInKeywords("START, YES, SUBSCRIBE")
                .privacyPolicyUrl("https://example.com/privacy")
                .reason(
                    "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                )
                .termsAndConditionUrl("https://example.com/terms")
                .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .webhookUrl("http://example-webhook.com")
                .build()

        val roundtrippedVerificationRequestStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationRequestStatus),
                jacksonTypeRef<VerificationRequestStatus>(),
            )

        assertThat(roundtrippedVerificationRequestStatus).isEqualTo(verificationRequestStatus)
    }
}
