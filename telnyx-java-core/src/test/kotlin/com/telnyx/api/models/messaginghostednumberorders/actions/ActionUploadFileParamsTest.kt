// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders.actions

import com.telnyx.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUploadFileParamsTest {

    @Test
    fun create() {
        ActionUploadFileParams.builder()
            .id("id")
            .bill("some content".byteInputStream())
            .loa("some content".byteInputStream())
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionUploadFileParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionUploadFileParams.builder()
                .id("id")
                .bill("some content".byteInputStream())
                .loa("some content".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "bill" to MultipartField.of("some content".byteInputStream()),
                        "loa" to MultipartField.of("some content".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionUploadFileParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
