// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.roomcompositions.RoomCompositionCreateParams
import com.telnyx.sdk.models.roomcompositions.RoomCompositionListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomCompositionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionService = client.roomCompositions()

        val roomComposition =
            roomCompositionService.create(
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

        roomComposition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionService = client.roomCompositions()

        val roomComposition =
            roomCompositionService.retrieve("5219b3af-87c6-4c08-9b58-5a533d893e21")

        roomComposition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionService = client.roomCompositions()

        val roomCompositions =
            roomCompositionService.list(
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

        roomCompositions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomCompositionService = client.roomCompositions()

        roomCompositionService.delete("5219b3af-87c6-4c08-9b58-5a533d893e21")
    }
}
