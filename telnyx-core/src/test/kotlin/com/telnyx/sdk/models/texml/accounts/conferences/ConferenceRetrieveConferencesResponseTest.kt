// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveConferencesResponseTest {

    @Test
    fun create() {
        val conferenceRetrieveConferencesResponse =
            ConferenceRetrieveConferencesResponse.builder()
                .addConference(
                    ConferenceRetrieveConferencesResponse.Conference.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .apiVersion("v2/texml")
                        .callSidEndingConference(
                            "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ"
                        )
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .friendlyName("weekly_review_call")
                        .reasonConferenceEnded(
                            ConferenceRetrieveConferencesResponse.Conference.ReasonConferenceEnded
                                .TIME_EXCEEDED
                        )
                        .region("dc2")
                        .sid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                        .status(ConferenceRetrieveConferencesResponse.Conference.Status.IN_PROGRESS)
                        .subresourceUris(
                            ConferenceRetrieveConferencesResponse.Conference.SubresourceUris
                                .builder()
                                .putAdditionalProperty("participants", JsonValue.from("bar"))
                                .putAdditionalProperty("recordings", JsonValue.from("bar"))
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
                        )
                        .build()
                )
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(conferenceRetrieveConferencesResponse.conferences().getOrNull())
            .containsExactly(
                ConferenceRetrieveConferencesResponse.Conference.builder()
                    .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                    .apiVersion("v2/texml")
                    .callSidEndingConference(
                        "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ"
                    )
                    .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .friendlyName("weekly_review_call")
                    .reasonConferenceEnded(
                        ConferenceRetrieveConferencesResponse.Conference.ReasonConferenceEnded
                            .TIME_EXCEEDED
                    )
                    .region("dc2")
                    .sid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                    .status(ConferenceRetrieveConferencesResponse.Conference.Status.IN_PROGRESS)
                    .subresourceUris(
                        ConferenceRetrieveConferencesResponse.Conference.SubresourceUris.builder()
                            .putAdditionalProperty("participants", JsonValue.from("bar"))
                            .putAdditionalProperty("recordings", JsonValue.from("bar"))
                            .build()
                    )
                    .uri(
                        "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
                    )
                    .build()
            )
        assertThat(conferenceRetrieveConferencesResponse.end()).contains(0L)
        assertThat(conferenceRetrieveConferencesResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
            )
        assertThat(conferenceRetrieveConferencesResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
            )
        assertThat(conferenceRetrieveConferencesResponse.page()).contains(0L)
        assertThat(conferenceRetrieveConferencesResponse.pageSize()).contains(1L)
        assertThat(conferenceRetrieveConferencesResponse.start()).contains(0L)
        assertThat(conferenceRetrieveConferencesResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceRetrieveConferencesResponse =
            ConferenceRetrieveConferencesResponse.builder()
                .addConference(
                    ConferenceRetrieveConferencesResponse.Conference.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .apiVersion("v2/texml")
                        .callSidEndingConference(
                            "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ"
                        )
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .friendlyName("weekly_review_call")
                        .reasonConferenceEnded(
                            ConferenceRetrieveConferencesResponse.Conference.ReasonConferenceEnded
                                .TIME_EXCEEDED
                        )
                        .region("dc2")
                        .sid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                        .status(ConferenceRetrieveConferencesResponse.Conference.Status.IN_PROGRESS)
                        .subresourceUris(
                            ConferenceRetrieveConferencesResponse.Conference.SubresourceUris
                                .builder()
                                .putAdditionalProperty("participants", JsonValue.from("bar"))
                                .putAdditionalProperty("recordings", JsonValue.from("bar"))
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
                        )
                        .build()
                )
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1"
                )
                .build()

        val roundtrippedConferenceRetrieveConferencesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceRetrieveConferencesResponse),
                jacksonTypeRef<ConferenceRetrieveConferencesResponse>(),
            )

        assertThat(roundtrippedConferenceRetrieveConferencesResponse)
            .isEqualTo(conferenceRetrieveConferencesResponse)
    }
}
