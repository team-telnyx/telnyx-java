// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionCreateResponseTest {

    @Test
    fun create() {
        val dialogflowConnectionCreateResponse =
            DialogflowConnectionCreateResponse.builder()
                .data(
                    DialogflowConnectionCreateResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        assertThat(dialogflowConnectionCreateResponse.data())
            .isEqualTo(
                DialogflowConnectionCreateResponse.Data.builder()
                    .connectionId("1234541231")
                    .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                    .environment("development")
                    .recordType("dialogflow_connections")
                    .serviceAccount("****")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dialogflowConnectionCreateResponse =
            DialogflowConnectionCreateResponse.builder()
                .data(
                    DialogflowConnectionCreateResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        val roundtrippedDialogflowConnectionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialogflowConnectionCreateResponse),
                jacksonTypeRef<DialogflowConnectionCreateResponse>(),
            )

        assertThat(roundtrippedDialogflowConnectionCreateResponse)
            .isEqualTo(dialogflowConnectionCreateResponse)
    }
}
