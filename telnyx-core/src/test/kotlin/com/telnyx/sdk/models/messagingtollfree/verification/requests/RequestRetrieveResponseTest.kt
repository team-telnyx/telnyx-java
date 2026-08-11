// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestRetrieveResponseTest {

    @Test
    fun create() {
        val requestRetrieveResponse =
            RequestRetrieveResponse.builder()
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
                .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
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
                .reason(
                    "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                )
                .termsAndConditionUrl("https://example.com/terms")
                .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .webhookUrl("http://example-webhook.com")
                .build()

        assertThat(requestRetrieveResponse.id()).isEqualTo("eaba9f52-164e-58e0-b002-4f668e18b7ed")
        assertThat(requestRetrieveResponse.additionalInformation())
            .isEqualTo("This is for security purposes, blah blah blah")
        assertThat(requestRetrieveResponse.businessAddr1()).isEqualTo("600 Congress Avenue")
        assertThat(requestRetrieveResponse.businessCity()).isEqualTo("Austin")
        assertThat(requestRetrieveResponse.businessContactEmail()).isEqualTo("email@example.com")
        assertThat(requestRetrieveResponse.businessContactFirstName()).isEqualTo("John")
        assertThat(requestRetrieveResponse.businessContactLastName()).isEqualTo("Doe")
        assertThat(requestRetrieveResponse.businessContactPhone()).isEqualTo("+18889809750")
        assertThat(requestRetrieveResponse.businessName()).isEqualTo("Telnyx LLC")
        assertThat(requestRetrieveResponse.businessState()).isEqualTo("Texas")
        assertThat(requestRetrieveResponse.businessZip()).isEqualTo("78701")
        assertThat(requestRetrieveResponse.corporateWebsite()).isEqualTo("http://example.com")
        assertThat(requestRetrieveResponse.messageVolume()).isEqualTo(Volume.V_100000)
        assertThat(requestRetrieveResponse.optInWorkflow())
            .isEqualTo(
                "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
            )
        assertThat(requestRetrieveResponse.optInWorkflowImageUrls())
            .containsExactly(
                Url.builder().url("https://telnyx.com/sign-up").build(),
                Url.builder().url("https://telnyx.com/company/data-privacy").build(),
            )
        assertThat(requestRetrieveResponse.phoneNumbers())
            .containsExactly(
                TfPhoneNumber.builder().phoneNumber("+18773554398").build(),
                TfPhoneNumber.builder().phoneNumber("+18773554399").build(),
            )
        assertThat(requestRetrieveResponse.productionMessageContent())
            .isEqualTo("Your Telnyx OTP is XXXX")
        assertThat(requestRetrieveResponse.useCase()).isEqualTo(UseCaseCategories.TWO_FA)
        assertThat(requestRetrieveResponse.useCaseSummary())
            .isEqualTo(
                "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal"
            )
        assertThat(requestRetrieveResponse.verificationStatus())
            .isEqualTo(TfVerificationStatus.WAITING_FOR_CUSTOMER)
        assertThat(requestRetrieveResponse.ageGatedContent()).contains(false)
        assertThat(requestRetrieveResponse.businessAddr2()).contains("14th Floor")
        assertThat(requestRetrieveResponse.businessRegistrationCountry()).contains("US")
        assertThat(requestRetrieveResponse.businessRegistrationNumber()).contains("12-3456789")
        assertThat(requestRetrieveResponse.businessRegistrationType()).contains("EIN")
        assertThat(requestRetrieveResponse.campaignVerifyAuthorizationToken())
            .contains("cv_token_abc123xyz")
        assertThat(requestRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(requestRetrieveResponse.doingBusinessAs()).contains("Acme Services")
        assertThat(requestRetrieveResponse.entityType())
            .contains(MessagingTollFreeVerificationEntityType.PRIVATE_PROFIT)
        assertThat(requestRetrieveResponse.helpMessageResponse())
            .contains(
                "Reply HELP for assistance or STOP to unsubscribe. Contact: support@example.com"
            )
        assertThat(requestRetrieveResponse.isvReseller()).contains("Yes")
        assertThat(requestRetrieveResponse.optInConfirmationResponse())
            .contains("You have successfully opted in to receive messages from Acme Corp")
        assertThat(requestRetrieveResponse.optInKeywords()).contains("START, YES, SUBSCRIBE")
        assertThat(requestRetrieveResponse.privacyPolicyUrl())
            .contains("https://example.com/privacy")
        assertThat(requestRetrieveResponse.reason())
            .contains(
                "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
            )
        assertThat(requestRetrieveResponse.termsAndConditionUrl())
            .contains("https://example.com/terms")
        assertThat(requestRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(requestRetrieveResponse.webhookUrl()).contains("http://example-webhook.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestRetrieveResponse =
            RequestRetrieveResponse.builder()
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
                .campaignVerifyAuthorizationToken("cv_token_abc123xyz")
                .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
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
                .reason(
                    "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                )
                .termsAndConditionUrl("https://example.com/terms")
                .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                .webhookUrl("http://example-webhook.com")
                .build()

        val roundtrippedRequestRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestRetrieveResponse),
                jacksonTypeRef<RequestRetrieveResponse>(),
            )

        assertThat(roundtrippedRequestRetrieveResponse).isEqualTo(requestRetrieveResponse)
    }
}
