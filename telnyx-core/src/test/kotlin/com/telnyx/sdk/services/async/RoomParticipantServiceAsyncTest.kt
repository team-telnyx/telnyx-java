// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomParticipantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomParticipantServiceAsync = client.roomParticipants()

        val roomParticipantFuture =
            roomParticipantServiceAsync.retrieve("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val roomParticipant = roomParticipantFuture.get()
        roomParticipant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomParticipantServiceAsync = client.roomParticipants()

        val roomParticipantsFuture =
            roomParticipantServiceAsync.list(
                RoomParticipantListParams.builder()
                    .filter(
                        RoomParticipantListParams.Filter.builder()
                            .context("Alice")
                            .dateJoinedAt(
                                RoomParticipantListParams.Filter.DateJoinedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateLeftAt(
                                RoomParticipantListParams.Filter.DateLeftAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateUpdatedAt(
                                RoomParticipantListParams.Filter.DateUpdatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .build()
                    )
                    .page(RoomParticipantListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val roomParticipants = roomParticipantsFuture.get()
        roomParticipants.validate()
    }
}
