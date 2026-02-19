// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portouts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portouts.comments.CommentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.portouts().comments()

        val commentFuture =
            commentServiceAsync.create(
                CommentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentBody("body")
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.portouts().comments()

        val commentsFuture = commentServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val comments = commentsFuture.get()
        comments.validate()
    }
}
