// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfringementClaimServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val infringementClaimServiceAsync = client.infringementClaims()

        val infringementClaimWrappedFuture =
            infringementClaimServiceAsync.retrieve("e379fbc8-cd83-4bef-a280-a0ac9d00dcf8")

        val infringementClaimWrapped = infringementClaimWrappedFuture.get()
        infringementClaimWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun contest() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val infringementClaimServiceAsync = client.infringementClaims()

        val infringementClaimWrappedFuture =
            infringementClaimServiceAsync.contest(
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

        val infringementClaimWrapped = infringementClaimWrappedFuture.get()
        infringementClaimWrapped.validate()
    }
}
