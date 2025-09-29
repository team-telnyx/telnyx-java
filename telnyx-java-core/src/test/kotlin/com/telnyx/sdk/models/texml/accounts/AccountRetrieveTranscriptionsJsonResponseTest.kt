// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveTranscriptionsJsonResponseTest {

    @Test
    fun create() {
        val accountRetrieveTranscriptionsJsonResponse =
            AccountRetrieveTranscriptionsJsonResponse.builder()
                .end(1L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=KRWXZPO&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=MZQTDUHX&PageSize=1"
                )
                .start(0L)
                .addTranscription(
                    AccountRetrieveTranscriptionsJsonResponse.Transcription.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .apiVersion("2010-04-01")
                        .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .duration("12")
                        .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .status(
                            AccountRetrieveTranscriptionsJsonResponse.Transcription.Status.COMPLETED
                        )
                        .transcriptionText("Good morning, how may I help you?")
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                        )
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=YTBNAXPI&PageSize=1"
                )
                .build()

        assertThat(accountRetrieveTranscriptionsJsonResponse.end()).contains(1L)
        assertThat(accountRetrieveTranscriptionsJsonResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?Page=0&PageSize=1"
            )
        assertThat(accountRetrieveTranscriptionsJsonResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=KRWXZPO&PageSize=1"
            )
        assertThat(accountRetrieveTranscriptionsJsonResponse.page()).contains(0L)
        assertThat(accountRetrieveTranscriptionsJsonResponse.pageSize()).contains(20L)
        assertThat(accountRetrieveTranscriptionsJsonResponse.previousPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=MZQTDUHX&PageSize=1"
            )
        assertThat(accountRetrieveTranscriptionsJsonResponse.start()).contains(0L)
        assertThat(accountRetrieveTranscriptionsJsonResponse.transcriptions().getOrNull())
            .containsExactly(
                AccountRetrieveTranscriptionsJsonResponse.Transcription.builder()
                    .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                    .apiVersion("2010-04-01")
                    .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .duration("12")
                    .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                    .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                    .status(
                        AccountRetrieveTranscriptionsJsonResponse.Transcription.Status.COMPLETED
                    )
                    .transcriptionText("Good morning, how may I help you?")
                    .uri(
                        "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                    )
                    .build()
            )
        assertThat(accountRetrieveTranscriptionsJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=YTBNAXPI&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountRetrieveTranscriptionsJsonResponse =
            AccountRetrieveTranscriptionsJsonResponse.builder()
                .end(1L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=KRWXZPO&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=MZQTDUHX&PageSize=1"
                )
                .start(0L)
                .addTranscription(
                    AccountRetrieveTranscriptionsJsonResponse.Transcription.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .apiVersion("2010-04-01")
                        .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .duration("12")
                        .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .status(
                            AccountRetrieveTranscriptionsJsonResponse.Transcription.Status.COMPLETED
                        )
                        .transcriptionText("Good morning, how may I help you?")
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                        )
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=YTBNAXPI&PageSize=1"
                )
                .build()

        val roundtrippedAccountRetrieveTranscriptionsJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountRetrieveTranscriptionsJsonResponse),
                jacksonTypeRef<AccountRetrieveTranscriptionsJsonResponse>(),
            )

        assertThat(roundtrippedAccountRetrieveTranscriptionsJsonResponse)
            .isEqualTo(accountRetrieveTranscriptionsJsonResponse)
    }
}
