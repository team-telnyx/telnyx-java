// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.roomrecordings.RoomRecordingDeleteBulkParams
import com.telnyx.api.models.roomrecordings.RoomRecordingListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomRecordingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingServiceAsync = client.roomRecordings()

        val roomRecordingFuture =
            roomRecordingServiceAsync.retrieve("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val roomRecording = roomRecordingFuture.get()
        roomRecording.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingServiceAsync = client.roomRecordings()

        val roomRecordingsFuture =
            roomRecordingServiceAsync.list(
                RoomRecordingListParams.builder()
                    .filter(
                        RoomRecordingListParams.Filter.builder()
                            .dateEndedAt(
                                RoomRecordingListParams.Filter.DateEndedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateStartedAt(
                                RoomRecordingListParams.Filter.DateStartedAt.builder()
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
                    .page(RoomRecordingListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val roomRecordings = roomRecordingsFuture.get()
        roomRecordings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingServiceAsync = client.roomRecordings()

        val future = roomRecordingServiceAsync.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBulk() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomRecordingServiceAsync = client.roomRecordings()

        val responseFuture =
            roomRecordingServiceAsync.deleteBulk(
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

        val response = responseFuture.get()
        response.validate()
    }
}
