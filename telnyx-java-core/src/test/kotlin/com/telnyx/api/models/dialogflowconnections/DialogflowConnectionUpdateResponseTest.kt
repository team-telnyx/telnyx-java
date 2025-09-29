// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dialogflowconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionUpdateResponseTest {

    @Test
    fun create() {
        val dialogflowConnectionUpdateResponse =
            DialogflowConnectionUpdateResponse.builder()
                .data(
                    DialogflowConnectionUpdateResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        assertThat(dialogflowConnectionUpdateResponse.data())
            .isEqualTo(
                DialogflowConnectionUpdateResponse.Data.builder()
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
        val dialogflowConnectionUpdateResponse =
            DialogflowConnectionUpdateResponse.builder()
                .data(
                    DialogflowConnectionUpdateResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        val roundtrippedDialogflowConnectionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialogflowConnectionUpdateResponse),
                jacksonTypeRef<DialogflowConnectionUpdateResponse>(),
            )

        assertThat(roundtrippedDialogflowConnectionUpdateResponse)
            .isEqualTo(dialogflowConnectionUpdateResponse)
    }
}
