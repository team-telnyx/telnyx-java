// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestListResponseTest {

    @Test
    fun create() {
        val requestListResponse =
            RequestListResponse.builder()
                .addRecord(
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
                        .messageVolume(Volume._100_000)
                        .optInWorkflow(
                            "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
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
                        .verificationStatus(TfVerificationStatus.VERIFIED)
                        .businessAddr2("14th Floor")
                        .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                        .reason(
                            "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                        )
                        .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                        .webhookUrl("http://example-webhook.com")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(requestListResponse.records().getOrNull())
            .containsExactly(
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
                    .messageVolume(Volume._100_000)
                    .optInWorkflow(
                        "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
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
                    .verificationStatus(TfVerificationStatus.VERIFIED)
                    .businessAddr2("14th Floor")
                    .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                    .reason(
                        "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                    )
                    .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                    .webhookUrl("http://example-webhook.com")
                    .build()
            )
        assertThat(requestListResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestListResponse =
            RequestListResponse.builder()
                .addRecord(
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
                        .messageVolume(Volume._100_000)
                        .optInWorkflow(
                            "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset"
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
                        .verificationStatus(TfVerificationStatus.VERIFIED)
                        .businessAddr2("14th Floor")
                        .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                        .reason(
                            "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers."
                        )
                        .updatedAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                        .webhookUrl("http://example-webhook.com")
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedRequestListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestListResponse),
                jacksonTypeRef<RequestListResponse>(),
            )

        assertThat(roundtrippedRequestListResponse).isEqualTo(requestListResponse)
    }
}
