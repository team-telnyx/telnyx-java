// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.telnyx.sdk.models.dir.Document
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAddParamsTest {

    @Test
    fun create() {
        PhoneNumberAddParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .addDocument(
                Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                    .description("LOA authorising Telnyx to register these numbers under the DIR.")
                    .build()
            )
            .addPhoneNumber("+19493253498")
            .addPhoneNumber("+12134445566")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberAddParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addDocument(
                    Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                        .build()
                )
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberAddParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addDocument(
                    Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                        .description(
                            "LOA authorising Telnyx to register these numbers under the DIR."
                        )
                        .build()
                )
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .build()

        val body = params._body()

        assertThat(body.documents())
            .containsExactly(
                Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                    .description("LOA authorising Telnyx to register these numbers under the DIR.")
                    .build()
            )
        assertThat(body.phoneNumbers()).containsExactly("+19493253498", "+12134445566")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhoneNumberAddParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .addDocument(
                    Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                        .build()
                )
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .build()

        val body = params._body()

        assertThat(body.documents())
            .containsExactly(
                Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                    .build()
            )
        assertThat(body.phoneNumbers()).containsExactly("+19493253498", "+12134445566")
    }
}
