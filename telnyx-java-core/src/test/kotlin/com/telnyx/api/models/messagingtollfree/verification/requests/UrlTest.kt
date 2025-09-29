// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlTest {

    @Test
    fun create() {
        val url = Url.builder().url("https://example.com").build()

        assertThat(url.url()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val url = Url.builder().url("https://example.com").build()

        val roundtrippedUrl =
            jsonMapper.readValue(jsonMapper.writeValueAsString(url), jacksonTypeRef<Url>())

        assertThat(roundtrippedUrl).isEqualTo(url)
    }
}
