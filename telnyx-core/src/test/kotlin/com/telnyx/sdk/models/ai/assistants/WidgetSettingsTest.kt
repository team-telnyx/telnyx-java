// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WidgetSettingsTest {

    @Test
    fun create() {
        val widgetSettings =
            WidgetSettings.builder()
                .agentThinkingText("agent_thinking_text")
                .audioVisualizerConfig(
                    WidgetSettings.AudioVisualizerConfig.builder()
                        .color(WidgetSettings.AudioVisualizerConfig.Color.VERDANT)
                        .preset("preset")
                        .build()
                )
                .defaultState(WidgetSettings.DefaultState.EXPANDED)
                .giveFeedbackUrl("give_feedback_url")
                .logoIconUrl("logo_icon_url")
                .position(WidgetSettings.Position.FIXED)
                .reportIssueUrl("report_issue_url")
                .speakToInterruptText("speak_to_interrupt_text")
                .startCallText("start_call_text")
                .theme(WidgetSettings.Theme.LIGHT)
                .viewHistoryUrl("view_history_url")
                .build()

        assertThat(widgetSettings.agentThinkingText()).contains("agent_thinking_text")
        assertThat(widgetSettings.audioVisualizerConfig())
            .contains(
                WidgetSettings.AudioVisualizerConfig.builder()
                    .color(WidgetSettings.AudioVisualizerConfig.Color.VERDANT)
                    .preset("preset")
                    .build()
            )
        assertThat(widgetSettings.defaultState()).contains(WidgetSettings.DefaultState.EXPANDED)
        assertThat(widgetSettings.giveFeedbackUrl()).contains("give_feedback_url")
        assertThat(widgetSettings.logoIconUrl()).contains("logo_icon_url")
        assertThat(widgetSettings.position()).contains(WidgetSettings.Position.FIXED)
        assertThat(widgetSettings.reportIssueUrl()).contains("report_issue_url")
        assertThat(widgetSettings.speakToInterruptText()).contains("speak_to_interrupt_text")
        assertThat(widgetSettings.startCallText()).contains("start_call_text")
        assertThat(widgetSettings.theme()).contains(WidgetSettings.Theme.LIGHT)
        assertThat(widgetSettings.viewHistoryUrl()).contains("view_history_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val widgetSettings =
            WidgetSettings.builder()
                .agentThinkingText("agent_thinking_text")
                .audioVisualizerConfig(
                    WidgetSettings.AudioVisualizerConfig.builder()
                        .color(WidgetSettings.AudioVisualizerConfig.Color.VERDANT)
                        .preset("preset")
                        .build()
                )
                .defaultState(WidgetSettings.DefaultState.EXPANDED)
                .giveFeedbackUrl("give_feedback_url")
                .logoIconUrl("logo_icon_url")
                .position(WidgetSettings.Position.FIXED)
                .reportIssueUrl("report_issue_url")
                .speakToInterruptText("speak_to_interrupt_text")
                .startCallText("start_call_text")
                .theme(WidgetSettings.Theme.LIGHT)
                .viewHistoryUrl("view_history_url")
                .build()

        val roundtrippedWidgetSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(widgetSettings),
                jacksonTypeRef<WidgetSettings>(),
            )

        assertThat(roundtrippedWidgetSettings).isEqualTo(widgetSettings)
    }
}
