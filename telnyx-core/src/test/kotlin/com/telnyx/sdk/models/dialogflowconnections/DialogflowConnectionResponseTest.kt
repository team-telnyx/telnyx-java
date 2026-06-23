// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionResponseTest {

    @Test
    fun create() {
        val dialogflowConnectionResponse =
            DialogflowConnectionResponse.builder()
                .data(
                    DialogflowConnectionResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        assertThat(dialogflowConnectionResponse.data())
            .isEqualTo(
                DialogflowConnectionResponse.Data.builder()
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
        val dialogflowConnectionResponse =
            DialogflowConnectionResponse.builder()
                .data(
                    DialogflowConnectionResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        val roundtrippedDialogflowConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialogflowConnectionResponse),
                jacksonTypeRef<DialogflowConnectionResponse>(),
            )

        assertThat(roundtrippedDialogflowConnectionResponse).isEqualTo(dialogflowConnectionResponse)
    }
}
