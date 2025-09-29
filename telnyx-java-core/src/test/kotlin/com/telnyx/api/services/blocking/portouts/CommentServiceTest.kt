// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portouts

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.portouts.comments.CommentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentService = client.portouts().comments()

        val comment =
            commentService.create(
                CommentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body("body")
                    .build()
            )

        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentService = client.portouts().comments()

        val comments = commentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        comments.validate()
    }
}
