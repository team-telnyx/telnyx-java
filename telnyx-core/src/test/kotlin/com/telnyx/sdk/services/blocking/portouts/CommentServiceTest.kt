// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portouts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portouts.comments.CommentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.portouts().comments()

        val comment =
            commentService.create(
                CommentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentBody("body")
                    .build()
            )

        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.portouts().comments()

        val comments = commentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        comments.validate()
    }
}
