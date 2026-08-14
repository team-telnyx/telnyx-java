// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionQueryResponseTest {

    @Test
    fun create() {
        val actionQueryResponse =
            ActionQueryResponse.builder()
                .data(
                    ActionQueryResponse.Data.builder()
                        .count(1L)
                        .duration(2.5)
                        .meta(
                            ActionQueryResponse.Data.Meta.builder()
                                .changes(0L)
                                .duration(1.2)
                                .lastRowId(0L)
                                .rowsRead(3L)
                                .rowsWritten(0L)
                                .build()
                        )
                        .addResult(
                            ActionQueryResponse.Data.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .success(true)
                        .build()
                )
                .build()

        assertThat(actionQueryResponse.data())
            .contains(
                ActionQueryResponse.Data.builder()
                    .count(1L)
                    .duration(2.5)
                    .meta(
                        ActionQueryResponse.Data.Meta.builder()
                            .changes(0L)
                            .duration(1.2)
                            .lastRowId(0L)
                            .rowsRead(3L)
                            .rowsWritten(0L)
                            .build()
                    )
                    .addResult(
                        ActionQueryResponse.Data.Result.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .success(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionQueryResponse =
            ActionQueryResponse.builder()
                .data(
                    ActionQueryResponse.Data.builder()
                        .count(1L)
                        .duration(2.5)
                        .meta(
                            ActionQueryResponse.Data.Meta.builder()
                                .changes(0L)
                                .duration(1.2)
                                .lastRowId(0L)
                                .rowsRead(3L)
                                .rowsWritten(0L)
                                .build()
                        )
                        .addResult(
                            ActionQueryResponse.Data.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .success(true)
                        .build()
                )
                .build()

        val roundtrippedActionQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionQueryResponse),
                jacksonTypeRef<ActionQueryResponse>(),
            )

        assertThat(roundtrippedActionQueryResponse).isEqualTo(actionQueryResponse)
    }
}
