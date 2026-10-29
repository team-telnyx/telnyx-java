// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.externalverification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVerificationTest {

    @Test
    fun create() {
        val externalVerification =
            ExternalVerification.builder()
                .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addPhoneNumber("+13125550142")
                .rejectionReason("The invoice does not show the phone numbers.")
                .reviewedAt(OffsetDateTime.parse("2026-10-06T14:03:10Z"))
                .status(ExternalVerificationStatus.PENDING)
                .submittedAt(OffsetDateTime.parse("2026-10-05T09:12:44Z"))
                .build()

        assertThat(externalVerification.documentIds().getOrNull())
            .containsExactly("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
        assertThat(externalVerification.enterpriseId())
            .contains("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(externalVerification.phoneNumbers().getOrNull()).containsExactly("+13125550142")
        assertThat(externalVerification.rejectionReason())
            .contains("The invoice does not show the phone numbers.")
        assertThat(externalVerification.reviewedAt())
            .contains(OffsetDateTime.parse("2026-10-06T14:03:10Z"))
        assertThat(externalVerification.status()).contains(ExternalVerificationStatus.PENDING)
        assertThat(externalVerification.submittedAt())
            .contains(OffsetDateTime.parse("2026-10-05T09:12:44Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVerification =
            ExternalVerification.builder()
                .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .addPhoneNumber("+13125550142")
                .rejectionReason("The invoice does not show the phone numbers.")
                .reviewedAt(OffsetDateTime.parse("2026-10-06T14:03:10Z"))
                .status(ExternalVerificationStatus.PENDING)
                .submittedAt(OffsetDateTime.parse("2026-10-05T09:12:44Z"))
                .build()

        val roundtrippedExternalVerification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVerification),
                jacksonTypeRef<ExternalVerification>(),
            )

        assertThat(roundtrippedExternalVerification).isEqualTo(externalVerification)
    }
}
