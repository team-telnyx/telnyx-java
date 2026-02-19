// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.comments.CommentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.portingOrders().comments()

        val comment =
            commentService.create(
                CommentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentBody("Please, let me know when the port completes")
                    .build()
            )

        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.portingOrders().comments()

        val page = commentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }
}
