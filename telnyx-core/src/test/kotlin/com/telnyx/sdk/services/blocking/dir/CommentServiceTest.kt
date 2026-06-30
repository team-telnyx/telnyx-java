// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.comments.CommentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.dir().comments()

        val comment =
            commentService.create(
                CommentCreateParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .content(
                        "Re-uploaded the certificate. New document_id: 89450109-ee35-411c-b5bb-14f1d806fca2."
                    )
                    .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.dir().comments()

        val page = commentService.list("16635d38-75a6-4481-82e8-69af60e05011")

        page.response().validate()
    }
}
