// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarCreateParamsTest {

    @Test
    fun create() {
        AvatarCreateParams.builder()
            .imageFile("Example data".byteInputStream())
            .name("Customer portrait")
            .build()
    }

    @Test
    fun body() {
        val params =
            AvatarCreateParams.builder()
                .imageFile("Example data".byteInputStream())
                .name("Customer portrait")
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
                        "image_file" to MultipartField.of("Example data".byteInputStream()),
                        "name" to MultipartField.of("Customer portrait"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
