// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.comments.CommentCreateParams
import com.telnyx.api.models.comments.CommentListParams
import java.time.OffsetDateTime
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
        val commentService = client.comments()

        val comment =
            commentService.create(
                CommentCreateParams.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .body("Hi there, ....")
                    .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .commentRecordType(CommentCreateParams.CommentRecordType.SUB_NUMBER_ORDER)
                    .commenter("user@company.com")
                    .commenterType(CommentCreateParams.CommenterType.USER)
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )

        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentService = client.comments()

        val comment = commentService.retrieve("id")

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
        val commentService = client.comments()

        val comments =
            commentService.list(
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

        comments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun markAsRead() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commentService = client.comments()

        val response = commentService.markAsRead("id")

        response.validate()
    }
}
