// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateParamsTest {

    @Test
    fun create() {
        CommentCreateParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .content(
                "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
            )
            .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .content(
                    "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommentCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .content(
                    "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
                )
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.content())
            .isEqualTo(
                "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
            )
        assertThat(body.parentCommentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommentCreateParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .content(
                    "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
                )
                .build()

        val body = params._body()

        assertThat(body.content())
            .isEqualTo(
                "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
            )
    }
}
