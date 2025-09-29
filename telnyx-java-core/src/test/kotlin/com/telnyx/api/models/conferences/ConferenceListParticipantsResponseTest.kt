// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceListParticipantsResponseTest {

    @Test
    fun create() {
        val conferenceListParticipantsResponse =
            ConferenceListParticipantsResponse.builder()
                .addData(
                    ConferenceListParticipantsResponse.Data.builder()
                        .id("dfadada7-af74-47bc-83a4-554275f55f5c")
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("3a15df2d-c801-4729-adf5-b56dd42e2abb")
                        .conference(
                            ConferenceListParticipantsResponse.Data.Conference.builder()
                                .id("41b9acd4-f4da-4ff5-a85c-e07e90b53f46")
                                .name("1")
                                .build()
                        )
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .endConferenceOnExit(true)
                        .muted(false)
                        .onHold(true)
                        .recordType(ConferenceListParticipantsResponse.Data.RecordType.PARTICIPANT)
                        .softEndConferenceOnExit(true)
                        .status(ConferenceListParticipantsResponse.Data.Status.JOINING)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .addWhisperCallControlId(
                            "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                        )
                        .addWhisperCallControlId(
                            "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                        )
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(conferenceListParticipantsResponse.data().getOrNull())
            .containsExactly(
                ConferenceListParticipantsResponse.Data.builder()
                    .id("dfadada7-af74-47bc-83a4-554275f55f5c")
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("3a15df2d-c801-4729-adf5-b56dd42e2abb")
                    .conference(
                        ConferenceListParticipantsResponse.Data.Conference.builder()
                            .id("41b9acd4-f4da-4ff5-a85c-e07e90b53f46")
                            .name("1")
                            .build()
                    )
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .endConferenceOnExit(true)
                    .muted(false)
                    .onHold(true)
                    .recordType(ConferenceListParticipantsResponse.Data.RecordType.PARTICIPANT)
                    .softEndConferenceOnExit(true)
                    .status(ConferenceListParticipantsResponse.Data.Status.JOINING)
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .addWhisperCallControlId(
                        "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                    )
                    .addWhisperCallControlId(
                        "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                    )
                    .build()
            )
        assertThat(conferenceListParticipantsResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceListParticipantsResponse =
            ConferenceListParticipantsResponse.builder()
                .addData(
                    ConferenceListParticipantsResponse.Data.builder()
                        .id("dfadada7-af74-47bc-83a4-554275f55f5c")
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("3a15df2d-c801-4729-adf5-b56dd42e2abb")
                        .conference(
                            ConferenceListParticipantsResponse.Data.Conference.builder()
                                .id("41b9acd4-f4da-4ff5-a85c-e07e90b53f46")
                                .name("1")
                                .build()
                        )
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .endConferenceOnExit(true)
                        .muted(false)
                        .onHold(true)
                        .recordType(ConferenceListParticipantsResponse.Data.RecordType.PARTICIPANT)
                        .softEndConferenceOnExit(true)
                        .status(ConferenceListParticipantsResponse.Data.Status.JOINING)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .addWhisperCallControlId(
                            "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                        )
                        .addWhisperCallControlId(
                            "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                        )
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedConferenceListParticipantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceListParticipantsResponse),
                jacksonTypeRef<ConferenceListParticipantsResponse>(),
            )

        assertThat(roundtrippedConferenceListParticipantsResponse)
            .isEqualTo(conferenceListParticipantsResponse)
    }
}
