// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.comments.Comment
import com.telnyx.sdk.models.comments.CommentListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.comments()

        val commentFuture =
            commentServiceAsync.create(
                Comment.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .commentBody("Hi there, ....")
                    .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .commentRecordType(Comment.CommentRecordType.SUB_NUMBER_ORDER)
                    .commenter("user@company.com")
                    .commenterType(Comment.CommenterType.USER)
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.comments()

        val commentFuture = commentServiceAsync.retrieve("id")

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsRead() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.comments()

        val responseFuture = commentServiceAsync.markAsRead("id")

        val response = responseFuture.get()
        response.validate()
    }
}
