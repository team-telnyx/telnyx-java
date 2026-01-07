// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.comments.CommentListParams
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
        val commentServiceAsync = client.comments()

        val commentFuture = commentServiceAsync.create()

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentServiceAsync = client.comments()

        val commentFuture = commentServiceAsync.retrieve("id")

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
        val commentServiceAsync = client.comments()

        val commentsFuture =
            commentServiceAsync.list(
                CommentListParams.builder()
                    .filter(
                        CommentListParams.Filter.builder()
                            .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .commentRecordType(
                                CommentListParams.Filter.CommentRecordType.SUB_NUMBER_ORDER
                            )
                            .build()
                    )
                    .build()
            )

        val comments = commentsFuture.get()
        comments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun markAsRead() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentServiceAsync = client.comments()

        val responseFuture = commentServiceAsync.markAsRead("id")

        val response = responseFuture.get()
        response.validate()
    }
}
