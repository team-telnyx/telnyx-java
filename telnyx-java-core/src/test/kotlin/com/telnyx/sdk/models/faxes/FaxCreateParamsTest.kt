// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxCreateParamsTest {

    @Test
    fun create() {
        FaxCreateParams.builder()
            .connectionId("234423")
            .from("+13125790015")
            .to("+13127367276")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .fromDisplayName("Company Name")
            .mediaName("my_media_uploaded_to_media_storage_api")
            .mediaUrl("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
            .monochrome(true)
            .previewFormat(FaxCreateParams.PreviewFormat.PDF)
            .quality(FaxCreateParams.Quality.HIGH)
            .storeMedia(true)
            .storePreview(true)
            .t38Enabled(true)
            .webhookUrl("https://www.example.com/server-b/")
            .build()
    }

    @Test
    fun body() {
        val params =
            FaxCreateParams.builder()
                .connectionId("234423")
                .from("+13125790015")
                .to("+13127367276")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .fromDisplayName("Company Name")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .mediaUrl("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                .monochrome(true)
                .previewFormat(FaxCreateParams.PreviewFormat.PDF)
                .quality(FaxCreateParams.Quality.HIGH)
                .storeMedia(true)
                .storePreview(true)
                .t38Enabled(true)
                .webhookUrl("https://www.example.com/server-b/")
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
                        "connection_id" to MultipartField.of("234423"),
                        "from" to MultipartField.of("+13125790015"),
                        "to" to MultipartField.of("+13127367276"),
                        "client_state" to MultipartField.of("aGF2ZSBhIG5pY2UgZGF5ID1d"),
                        "from_display_name" to MultipartField.of("Company Name"),
                        "media_name" to MultipartField.of("my_media_uploaded_to_media_storage_api"),
                        "media_url" to
                            MultipartField.of(
                                "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                            ),
                        "monochrome" to MultipartField.of(true),
                        "preview_format" to MultipartField.of(FaxCreateParams.PreviewFormat.PDF),
                        "quality" to MultipartField.of(FaxCreateParams.Quality.HIGH),
                        "store_media" to MultipartField.of(true),
                        "store_preview" to MultipartField.of(true),
                        "t38_enabled" to MultipartField.of(true),
                        "webhook_url" to MultipartField.of("https://www.example.com/server-b/"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FaxCreateParams.builder()
                .connectionId("234423")
                .from("+13125790015")
                .to("+13127367276")
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
                        "connection_id" to MultipartField.of("234423"),
                        "from" to MultipartField.of("+13125790015"),
                        "to" to MultipartField.of("+13127367276"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
