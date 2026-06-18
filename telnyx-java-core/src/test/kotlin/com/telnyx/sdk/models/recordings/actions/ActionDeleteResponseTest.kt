// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionDeleteResponseTest {

    @Test
    fun create() {
        val actionDeleteResponse =
            ActionDeleteResponse.builder().status(ActionDeleteResponse.Status.OK).build()

        assertThat(actionDeleteResponse.status()).contains(ActionDeleteResponse.Status.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionDeleteResponse =
            ActionDeleteResponse.builder().status(ActionDeleteResponse.Status.OK).build()

        val roundtrippedActionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionDeleteResponse),
                jacksonTypeRef<ActionDeleteResponse>(),
            )

        assertThat(roundtrippedActionDeleteResponse).isEqualTo(actionDeleteResponse)
    }
}
