// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceRetrieveFieldsResponseTest {

    @Test
    fun create() {
        val voiceRetrieveFieldsResponse =
            VoiceRetrieveFieldsResponse.builder()
                .billing(listOf("billable_time", "cost", "rate", "billing_group_id"))
                .interactionData(
                    listOf(
                        "origination_number",
                        "terminating_number",
                        "start_timestamp_utc",
                        "start_timestamp",
                        "answer_timestamp",
                        "end_timestamp",
                        "direction",
                    )
                )
                .numberInformation(
                    listOf(
                        "origination_city",
                        "origination_state",
                        "origination_lata",
                        "origination_country",
                        "terminating_city",
                        "terminating_state",
                    )
                )
                .telephonyData(
                    listOf(
                        "route",
                        "connection_id",
                        "hangup_code",
                        "pdd",
                        "tags",
                        "sip_call_id",
                        "mos",
                    )
                )
                .build()

        assertThat(voiceRetrieveFieldsResponse.billing().getOrNull())
            .containsExactly("billable_time", "cost", "rate", "billing_group_id")
        assertThat(voiceRetrieveFieldsResponse.interactionData().getOrNull())
            .containsExactly(
                "origination_number",
                "terminating_number",
                "start_timestamp_utc",
                "start_timestamp",
                "answer_timestamp",
                "end_timestamp",
                "direction",
            )
        assertThat(voiceRetrieveFieldsResponse.numberInformation().getOrNull())
            .containsExactly(
                "origination_city",
                "origination_state",
                "origination_lata",
                "origination_country",
                "terminating_city",
                "terminating_state",
            )
        assertThat(voiceRetrieveFieldsResponse.telephonyData().getOrNull())
            .containsExactly(
                "route",
                "connection_id",
                "hangup_code",
                "pdd",
                "tags",
                "sip_call_id",
                "mos",
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceRetrieveFieldsResponse =
            VoiceRetrieveFieldsResponse.builder()
                .billing(listOf("billable_time", "cost", "rate", "billing_group_id"))
                .interactionData(
                    listOf(
                        "origination_number",
                        "terminating_number",
                        "start_timestamp_utc",
                        "start_timestamp",
                        "answer_timestamp",
                        "end_timestamp",
                        "direction",
                    )
                )
                .numberInformation(
                    listOf(
                        "origination_city",
                        "origination_state",
                        "origination_lata",
                        "origination_country",
                        "terminating_city",
                        "terminating_state",
                    )
                )
                .telephonyData(
                    listOf(
                        "route",
                        "connection_id",
                        "hangup_code",
                        "pdd",
                        "tags",
                        "sip_call_id",
                        "mos",
                    )
                )
                .build()

        val roundtrippedVoiceRetrieveFieldsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceRetrieveFieldsResponse),
                jacksonTypeRef<VoiceRetrieveFieldsResponse>(),
            )

        assertThat(roundtrippedVoiceRetrieveFieldsResponse).isEqualTo(voiceRetrieveFieldsResponse)
    }
}
