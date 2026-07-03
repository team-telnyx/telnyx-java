// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.telnyx.sdk.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyUpdateParamsTest {

    @Test
    fun create() {
        KeyUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .key("key")
            .ttlSecs(1L)
            .body("Example data")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            KeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .body("Example data")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            KeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .ttlSecs(1L)
                .body("Example data")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("ttl_secs", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            KeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .body("Example data")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            KeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .ttlSecs(1L)
                .body("Example data")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            KeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .body("Example data")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }
}
