// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionRetrieveResponseTest {

    @Test
    fun create() {
        val dialogflowConnectionRetrieveResponse =
            DialogflowConnectionRetrieveResponse.builder()
                .data(
                    DialogflowConnectionRetrieveResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        assertThat(dialogflowConnectionRetrieveResponse.data())
            .isEqualTo(
                DialogflowConnectionRetrieveResponse.Data.builder()
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
        val dialogflowConnectionRetrieveResponse =
            DialogflowConnectionRetrieveResponse.builder()
                .data(
                    DialogflowConnectionRetrieveResponse.Data.builder()
                        .connectionId("1234541231")
                        .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                        .environment("development")
                        .recordType("dialogflow_connections")
                        .serviceAccount("****")
                        .build()
                )
                .build()

        val roundtrippedDialogflowConnectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialogflowConnectionRetrieveResponse),
                jacksonTypeRef<DialogflowConnectionRetrieveResponse>(),
            )

        assertThat(roundtrippedDialogflowConnectionRetrieveResponse)
            .isEqualTo(dialogflowConnectionRetrieveResponse)
    }
}
