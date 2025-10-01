// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateConferenceTest {

    @Test
    fun create() {
        val updateConference =
            UpdateConference.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addWhisperCallControlId(
                    "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                )
                .addWhisperCallControlId(
                    "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                )
                .build()

        assertThat(updateConference.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(updateConference.supervisorRole())
            .isEqualTo(UpdateConference.SupervisorRole.WHISPER)
        assertThat(updateConference.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(updateConference.whisperCallControlIds().getOrNull())
            .containsExactly(
                "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ",
                "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw",
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateConference =
            UpdateConference.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addWhisperCallControlId(
                    "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                )
                .addWhisperCallControlId(
                    "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                )
                .build()

        val roundtrippedUpdateConference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateConference),
                jacksonTypeRef<UpdateConference>(),
            )

        assertThat(roundtrippedUpdateConference).isEqualTo(updateConference)
    }
}
