// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolTestResponseTest {

    @Test
    fun create() {
        val toolTestResponse =
            ToolTestResponse.builder()
                .data(
                    ToolTestResponse.Data.builder()
                        .contentType("content_type")
                        .request(
                            ToolTestResponse.Data.Request.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .success(true)
                        .build()
                )
                .build()

        assertThat(toolTestResponse.data())
            .isEqualTo(
                ToolTestResponse.Data.builder()
                    .contentType("content_type")
                    .request(
                        ToolTestResponse.Data.Request.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .response("response")
                    .statusCode(0L)
                    .success(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolTestResponse =
            ToolTestResponse.builder()
                .data(
                    ToolTestResponse.Data.builder()
                        .contentType("content_type")
                        .request(
                            ToolTestResponse.Data.Request.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .success(true)
                        .build()
                )
                .build()

        val roundtrippedToolTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolTestResponse),
                jacksonTypeRef<ToolTestResponse>(),
            )

        assertThat(roundtrippedToolTestResponse).isEqualTo(toolTestResponse)
    }
}
