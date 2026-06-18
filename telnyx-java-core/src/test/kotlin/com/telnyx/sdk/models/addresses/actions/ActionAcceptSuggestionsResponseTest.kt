// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAcceptSuggestionsResponseTest {

    @Test
    fun create() {
        val actionAcceptSuggestionsResponse =
            ActionAcceptSuggestionsResponse.builder()
                .data(
                    ActionAcceptSuggestionsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accepted(true)
                        .recordType(
                            ActionAcceptSuggestionsResponse.Data.RecordType.ADDRESS_SUGGESTION
                        )
                        .build()
                )
                .build()

        assertThat(actionAcceptSuggestionsResponse.data())
            .contains(
                ActionAcceptSuggestionsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accepted(true)
                    .recordType(ActionAcceptSuggestionsResponse.Data.RecordType.ADDRESS_SUGGESTION)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionAcceptSuggestionsResponse =
            ActionAcceptSuggestionsResponse.builder()
                .data(
                    ActionAcceptSuggestionsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accepted(true)
                        .recordType(
                            ActionAcceptSuggestionsResponse.Data.RecordType.ADDRESS_SUGGESTION
                        )
                        .build()
                )
                .build()

        val roundtrippedActionAcceptSuggestionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionAcceptSuggestionsResponse),
                jacksonTypeRef<ActionAcceptSuggestionsResponse>(),
            )

        assertThat(roundtrippedActionAcceptSuggestionsResponse)
            .isEqualTo(actionAcceptSuggestionsResponse)
    }
}
