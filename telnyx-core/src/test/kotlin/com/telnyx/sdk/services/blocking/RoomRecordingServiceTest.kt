// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteBulkParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomRecordingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingService = client.roomRecordings()

        val roomRecording = roomRecordingService.retrieve("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        roomRecording.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingService = client.roomRecordings()

        val page = roomRecordingService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingService = client.roomRecordings()

        roomRecordingService.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBulk() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingService = client.roomRecordings()

        val response =
            roomRecordingService.deleteBulk(
                RoomRecordingDeleteBulkParams.builder()
                    .filter(
                        RoomRecordingDeleteBulkParams.Filter.builder()
                            .dateEndedAt(
                                RoomRecordingDeleteBulkParams.Filter.DateEndedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateStartedAt(
                                RoomRecordingDeleteBulkParams.Filter.DateStartedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .durationSecs(20L)
                            .participantId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .status("completed")
                            .type("audio")
                            .build()
                    )
                    .page(RoomRecordingDeleteBulkParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        response.validate()
    }
}
