// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingtollfree.verification.requests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestCreateParamsTest {

    @Test
    fun create() {
        RequestCreateParams.builder()
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
            .build()
    }

    @Test
    fun body() {
        val params =
            RequestCreateParams.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RequestCreateParams.builder()
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
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554398").build())
                        .addPhoneNumber(TfPhoneNumber.builder().phoneNumber("+18773554399").build())
                        .productionMessageContent("Your Telnyx OTP is XXXX")
                        .useCase(UseCaseCategories._2_FA)
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
                    .build()
            )
    }
}
