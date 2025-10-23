// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUpdateParamsTest {

    @Test
    fun create() {
        ActionUpdateParams.builder()
            .id("id")
            .updateConference(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionUpdateParams.builder()
                .id("id")
                .updateConference(
                    UpdateConference.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionUpdateParams.builder()
                .id("id")
                .updateConference(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionUpdateParams.builder()
                .id("id")
                .updateConference(
                    UpdateConference.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateConference.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                    .build()
            )
    }
}
