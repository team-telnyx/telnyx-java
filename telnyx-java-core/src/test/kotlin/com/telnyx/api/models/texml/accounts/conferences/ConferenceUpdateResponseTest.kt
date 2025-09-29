// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceUpdateResponseTest {

    @Test
    fun create() {
        val conferenceUpdateResponse =
            ConferenceUpdateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSidEndingConference("call_sid_ending_conference")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .friendlyName("weekly_review_call")
                .reasonConferenceEnded(
                    ConferenceUpdateResponse.ReasonConferenceEnded
                        .PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT
                )
                .region("dc2")
                .sid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .status(ConferenceUpdateResponse.Status.IN_PROGRESS)
                .subresourceUris(
                    ConferenceUpdateResponse.SubresourceUris.builder()
                        .putAdditionalProperty("participants", JsonValue.from("bar"))
                        .putAdditionalProperty("recordings", JsonValue.from("bar"))
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
                )
                .build()

        assertThat(conferenceUpdateResponse.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(conferenceUpdateResponse.apiVersion()).contains("v2/texml")
        assertThat(conferenceUpdateResponse.callSidEndingConference())
            .contains("call_sid_ending_conference")
        assertThat(conferenceUpdateResponse.dateCreated())
            .contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(conferenceUpdateResponse.dateUpdated())
            .contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(conferenceUpdateResponse.friendlyName()).contains("weekly_review_call")
        assertThat(conferenceUpdateResponse.reasonConferenceEnded())
            .contains(
                ConferenceUpdateResponse.ReasonConferenceEnded
                    .PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT
            )
        assertThat(conferenceUpdateResponse.region()).contains("dc2")
        assertThat(conferenceUpdateResponse.sid()).contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(conferenceUpdateResponse.status())
            .contains(ConferenceUpdateResponse.Status.IN_PROGRESS)
        assertThat(conferenceUpdateResponse.subresourceUris())
            .contains(
                ConferenceUpdateResponse.SubresourceUris.builder()
                    .putAdditionalProperty("participants", JsonValue.from("bar"))
                    .putAdditionalProperty("recordings", JsonValue.from("bar"))
                    .build()
            )
        assertThat(conferenceUpdateResponse.uri())
            .contains(
                "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceUpdateResponse =
            ConferenceUpdateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSidEndingConference("call_sid_ending_conference")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .friendlyName("weekly_review_call")
                .reasonConferenceEnded(
                    ConferenceUpdateResponse.ReasonConferenceEnded
                        .PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT
                )
                .region("dc2")
                .sid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .status(ConferenceUpdateResponse.Status.IN_PROGRESS)
                .subresourceUris(
                    ConferenceUpdateResponse.SubresourceUris.builder()
                        .putAdditionalProperty("participants", JsonValue.from("bar"))
                        .putAdditionalProperty("recordings", JsonValue.from("bar"))
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1.json"
                )
                .build()

        val roundtrippedConferenceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceUpdateResponse),
                jacksonTypeRef<ConferenceUpdateResponse>(),
            )

        assertThat(roundtrippedConferenceUpdateResponse).isEqualTo(conferenceUpdateResponse)
    }
}
