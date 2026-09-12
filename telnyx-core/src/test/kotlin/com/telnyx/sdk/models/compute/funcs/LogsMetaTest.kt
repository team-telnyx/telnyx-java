// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogsMetaTest {

    @Test
    fun create() {
        val logsMeta = LogsMeta.builder().hasMore(true).partial(true).build()

        assertThat(logsMeta.hasMore()).contains(true)
        assertThat(logsMeta.partial()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logsMeta = LogsMeta.builder().hasMore(true).partial(true).build()

        val roundtrippedLogsMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logsMeta),
                jacksonTypeRef<LogsMeta>(),
            )

        assertThat(roundtrippedLogsMeta).isEqualTo(logsMeta)
    }
}
