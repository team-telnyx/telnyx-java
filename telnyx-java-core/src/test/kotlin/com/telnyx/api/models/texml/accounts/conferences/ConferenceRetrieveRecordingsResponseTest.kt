// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveRecordingsResponseTest {

    @Test
    fun create() {
        val conferenceRetrieveRecordingsResponse =
            ConferenceRetrieveRecordingsResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
                )
                .nextPageUri("next_page_uri")
                .page(0L)
                .pageSize(20L)
                .addRecording(
                    ConferenceRetrieveRecordingsResponse.Recording.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                        .channels(1L)
                        .conferenceSid("6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f")
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .duration(5L)
                        .errorCode("error_code")
                        .mediaUrl("https://www.example.com/download.mp3")
                        .sid("136285da-4b74-46f1-a016-fe2982fa77c3")
                        .source(
                            ConferenceRetrieveRecordingsResponse.Recording.Source
                                .START_CONFERENCE_RECORDING_API
                        )
                        .startTime("Fri, 27 Oct 2023 07:41:58 +0000")
                        .status(ConferenceRetrieveRecordingsResponse.Recording.Status.COMPLETED)
                        .subresourceUris(
                            ConferenceRetrieveRecordingsResponse.Recording.SubresourceUris.builder()
                                .putAdditionalProperty("transcriptions", JsonValue.from("bar"))
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/136285da-4b74-46f1-a016-fe2982fa77c3.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
                )
                .build()

        assertThat(conferenceRetrieveRecordingsResponse.end()).contains(0L)
        assertThat(conferenceRetrieveRecordingsResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
            )
        assertThat(conferenceRetrieveRecordingsResponse.nextPageUri()).contains("next_page_uri")
        assertThat(conferenceRetrieveRecordingsResponse.page()).contains(0L)
        assertThat(conferenceRetrieveRecordingsResponse.pageSize()).contains(20L)
        assertThat(conferenceRetrieveRecordingsResponse.recordings().getOrNull())
            .containsExactly(
                ConferenceRetrieveRecordingsResponse.Recording.builder()
                    .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                    .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                    .channels(1L)
                    .conferenceSid("6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f")
                    .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .duration(5L)
                    .errorCode("error_code")
                    .mediaUrl("https://www.example.com/download.mp3")
                    .sid("136285da-4b74-46f1-a016-fe2982fa77c3")
                    .source(
                        ConferenceRetrieveRecordingsResponse.Recording.Source
                            .START_CONFERENCE_RECORDING_API
                    )
                    .startTime("Fri, 27 Oct 2023 07:41:58 +0000")
                    .status(ConferenceRetrieveRecordingsResponse.Recording.Status.COMPLETED)
                    .subresourceUris(
                        ConferenceRetrieveRecordingsResponse.Recording.SubresourceUris.builder()
                            .putAdditionalProperty("transcriptions", JsonValue.from("bar"))
                            .build()
                    )
                    .uri(
                        "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/136285da-4b74-46f1-a016-fe2982fa77c3.json"
                    )
                    .build()
            )
        assertThat(conferenceRetrieveRecordingsResponse.start()).contains(0L)
        assertThat(conferenceRetrieveRecordingsResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceRetrieveRecordingsResponse =
            ConferenceRetrieveRecordingsResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
                )
                .nextPageUri("next_page_uri")
                .page(0L)
                .pageSize(20L)
                .addRecording(
                    ConferenceRetrieveRecordingsResponse.Recording.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                        .channels(1L)
                        .conferenceSid("6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f")
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .duration(5L)
                        .errorCode("error_code")
                        .mediaUrl("https://www.example.com/download.mp3")
                        .sid("136285da-4b74-46f1-a016-fe2982fa77c3")
                        .source(
                            ConferenceRetrieveRecordingsResponse.Recording.Source
                                .START_CONFERENCE_RECORDING_API
                        )
                        .startTime("Fri, 27 Oct 2023 07:41:58 +0000")
                        .status(ConferenceRetrieveRecordingsResponse.Recording.Status.COMPLETED)
                        .subresourceUris(
                            ConferenceRetrieveRecordingsResponse.Recording.SubresourceUris.builder()
                                .putAdditionalProperty("transcriptions", JsonValue.from("bar"))
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/136285da-4b74-46f1-a016-fe2982fa77c3.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20"
                )
                .build()

        val roundtrippedConferenceRetrieveRecordingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceRetrieveRecordingsResponse),
                jacksonTypeRef<ConferenceRetrieveRecordingsResponse>(),
            )

        assertThat(roundtrippedConferenceRetrieveRecordingsResponse)
            .isEqualTo(conferenceRetrieveRecordingsResponse)
    }
}
