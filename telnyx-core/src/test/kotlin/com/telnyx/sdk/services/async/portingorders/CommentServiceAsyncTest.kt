// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.comments.CommentCreateParams
import com.telnyx.sdk.models.portingorders.comments.CommentListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentServiceAsync = client.portingOrders().comments()

        val commentFuture =
            commentServiceAsync.create(
                CommentCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body("Please, let me know when the port completes")
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentServiceAsync = client.portingOrders().comments()

        val commentsFuture =
            commentServiceAsync.list(
                CommentListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(CommentListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val comments = commentsFuture.get()
        comments.validate()
    }
}
