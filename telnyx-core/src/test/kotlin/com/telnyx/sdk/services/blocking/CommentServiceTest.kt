// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.comments.CommentListParams
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

        val comment = commentService.create()

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
