// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordingtranscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.Cursor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionListPageResponseTest {

    @Test
    fun create() {
        val recordingTranscriptionListPageResponse =
            RecordingTranscriptionListPageResponse.builder()
                .addData(
                    RecordingTranscription.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .durationMillis(60000)
                        .recordType(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
                        .recordingId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .status(RecordingTranscription.Status.COMPLETED)
                        .transcriptionText("Good morning, how may I help you?")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .meta(
                    RecordingTranscriptionListPageResponse.Meta.builder()
                        .cursors(
                            Cursor.builder()
                                .after(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .before(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .build()
                        )
                        .next(
                            "/v2/recording_transcriptions?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .previous(
                            "/v2/recording_transcriptions?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .build()
                )
                .build()

        assertThat(recordingTranscriptionListPageResponse.data().getOrNull())
            .containsExactly(
                RecordingTranscription.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .durationMillis(60000)
                    .recordType(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
                    .recordingId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(RecordingTranscription.Status.COMPLETED)
                    .transcriptionText("Good morning, how may I help you?")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(recordingTranscriptionListPageResponse.meta())
            .contains(
                RecordingTranscriptionListPageResponse.Meta.builder()
                    .cursors(
                        Cursor.builder()
                            .after(
                                "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                            )
                            .before(
                                "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                            )
                            .build()
                    )
                    .next(
                        "/v2/recording_transcriptions?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                    )
                    .previous(
                        "/v2/recording_transcriptions?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingTranscriptionListPageResponse =
            RecordingTranscriptionListPageResponse.builder()
                .addData(
                    RecordingTranscription.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .durationMillis(60000)
                        .recordType(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
                        .recordingId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .status(RecordingTranscription.Status.COMPLETED)
                        .transcriptionText("Good morning, how may I help you?")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .meta(
                    RecordingTranscriptionListPageResponse.Meta.builder()
                        .cursors(
                            Cursor.builder()
                                .after(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .before(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .build()
                        )
                        .next(
                            "/v2/recording_transcriptions?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .previous(
                            "/v2/recording_transcriptions?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .build()
                )
                .build()

        val roundtrippedRecordingTranscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingTranscriptionListPageResponse),
                jacksonTypeRef<RecordingTranscriptionListPageResponse>(),
            )

        assertThat(roundtrippedRecordingTranscriptionListPageResponse)
            .isEqualTo(recordingTranscriptionListPageResponse)
    }
}
