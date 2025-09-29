// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rooms.sessions.SessionList0Params
import com.telnyx.sdk.models.rooms.sessions.SessionList1Params
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val session =
            sessionService.retrieve(
                SessionRetrieveParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .includeParticipants(true)
                    .build()
            )

        session.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list0() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val response =
            sessionService.list0(
                SessionList0Params.builder()
                    .filter(
                        SessionList0Params.Filter.builder()
                            .active(true)
                            .dateCreatedAt(
                                SessionList0Params.Filter.DateCreatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateEndedAt(
                                SessionList0Params.Filter.DateEndedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateUpdatedAt(
                                SessionList0Params.Filter.DateUpdatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .build()
                    )
                    .includeParticipants(true)
                    .page(SessionList0Params.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list1() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val response =
            sessionService.list1(
                SessionList1Params.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .filter(
                        SessionList1Params.Filter.builder()
                            .active(true)
                            .dateCreatedAt(
                                SessionList1Params.Filter.DateCreatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateEndedAt(
                                SessionList1Params.Filter.DateEndedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateUpdatedAt(
                                SessionList1Params.Filter.DateUpdatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .build()
                    )
                    .includeParticipants(true)
                    .page(SessionList1Params.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val response =
            sessionService.retrieveParticipants(
                SessionRetrieveParticipantsParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .filter(
                        SessionRetrieveParticipantsParams.Filter.builder()
                            .context("Alice")
                            .dateJoinedAt(
                                SessionRetrieveParticipantsParams.Filter.DateJoinedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateLeftAt(
                                SessionRetrieveParticipantsParams.Filter.DateLeftAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateUpdatedAt(
                                SessionRetrieveParticipantsParams.Filter.DateUpdatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .build()
                    )
                    .page(
                        SessionRetrieveParticipantsParams.Page.builder().number(1L).size(1L).build()
                    )
                    .build()
            )

        response.validate()
    }
}
