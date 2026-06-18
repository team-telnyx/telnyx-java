// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.infringementclaims

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfringementClaimContestParamsTest {

    @Test
    fun create() {
        InfringementClaimContestParams.builder()
            .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
            .contestNotes(
                "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
            )
            .addDocument(
                InfringementClaimContestParams.Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(
                        InfringementClaimContestParams.Document.DocumentType.TRADEMARK_REGISTRATION
                    )
                    .description("USPTO trademark certificate.")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InfringementClaimContestParams.builder()
                .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .contestNotes(
                    "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InfringementClaimContestParams.builder()
                .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .contestNotes(
                    "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
                )
                .addDocument(
                    InfringementClaimContestParams.Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(
                            InfringementClaimContestParams.Document.DocumentType
                                .TRADEMARK_REGISTRATION
                        )
                        .description("USPTO trademark certificate.")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.contestNotes())
            .isEqualTo(
                "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
            )
        assertThat(body.documents().getOrNull())
            .containsExactly(
                InfringementClaimContestParams.Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(
                        InfringementClaimContestParams.Document.DocumentType.TRADEMARK_REGISTRATION
                    )
                    .description("USPTO trademark certificate.")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InfringementClaimContestParams.builder()
                .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                .contestNotes(
                    "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
                )
                .build()

        val body = params._body()

        assertThat(body.contestNotes())
            .isEqualTo(
                "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
            )
    }
}
