// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.core.JsonValue
import com.telnyx.api.models.roomcompositions.RoomCompositionCreateParams
import com.telnyx.api.models.roomcompositions.RoomCompositionListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomCompositionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionServiceAsync = client.roomCompositions()

        val roomCompositionFuture =
            roomCompositionServiceAsync.create(
                RoomCompositionCreateParams.builder()
                    .format("mp4")
                    .resolution("800x600")
                    .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777b0")
                    .videoLayout(
                        RoomCompositionCreateParams.VideoLayout.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "height" to 360,
                                        "max_columns" to 3,
                                        "max_rows" to 3,
                                        "video_sources" to
                                            listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                        "width" to 480,
                                        "x_pos" to 100,
                                        "y_pos" to 100,
                                        "z_pos" to 1,
                                    )
                                ),
                            )
                            .build()
                    )
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val roomComposition = roomCompositionFuture.get()
        roomComposition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionServiceAsync = client.roomCompositions()

        val roomCompositionFuture =
            roomCompositionServiceAsync.retrieve("5219b3af-87c6-4c08-9b58-5a533d893e21")

        val roomComposition = roomCompositionFuture.get()
        roomComposition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionServiceAsync = client.roomCompositions()

        val roomCompositionsFuture =
            roomCompositionServiceAsync.list(
                RoomCompositionListParams.builder()
                    .filter(
                        RoomCompositionListParams.Filter.builder()
                            .dateCreatedAt(
                                RoomCompositionListParams.Filter.DateCreatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .sessionId("92e7d459-bcc5-4386-9f5f-6dd14a82588d")
                            .status(RoomCompositionListParams.Filter.Status.COMPLETED)
                            .build()
                    )
                    .page(RoomCompositionListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val roomCompositions = roomCompositionsFuture.get()
        roomCompositions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionServiceAsync = client.roomCompositions()

        val future = roomCompositionServiceAsync.delete("5219b3af-87c6-4c08-9b58-5a533d893e21")

        val response = future.get()
    }
}
