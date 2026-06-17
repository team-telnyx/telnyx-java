// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfringementClaimServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val infringementClaimService = client.infringementClaims()

        val infringementClaimWrapped =
            infringementClaimService.retrieve("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")

        infringementClaimWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun contest() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val infringementClaimService = client.infringementClaims()

        val infringementClaimWrapped =
            infringementClaimService.contest(
                InfringementClaimContestParams.builder()
                    .claimId("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")
                    .contestNotes(
                        "We own the trademark outright; our registration precedes the claimant by three years. See attached certificate."
                    )
                    .addDocument(
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.TRADEMARK_REGISTRATION)
                            .description("USPTO trademark certificate.")
                            .build()
                    )
                    .build()
            )

        infringementClaimWrapped.validate()
    }
}
