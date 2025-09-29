// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.recordings.RecordingListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingServiceAsync = client.recordings()

        val recordingFuture = recordingServiceAsync.retrieve("recording_id")

        val recording = recordingFuture.get()
        recording.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingServiceAsync = client.recordings()

        val recordingsFuture =
            recordingServiceAsync.list(
                RecordingListParams.builder()
                    .filter(
                        RecordingListParams.Filter.builder()
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .conferenceId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .connectionId("175237942907135762")
                            .createdAt(
                                RecordingListParams.Filter.CreatedAt.builder()
                                    .gte("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .from("1234567890")
                            .to("1234567890")
                            .build()
                    )
                    .page(RecordingListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val recordings = recordingsFuture.get()
        recordings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingServiceAsync = client.recordings()

        val recordingFuture = recordingServiceAsync.delete("recording_id")

        val recording = recordingFuture.get()
        recording.validate()
    }
}
