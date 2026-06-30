// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotification
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardDataUsageNotificationServiceAsync = client.simCardDataUsageNotifications()

        val simCardDataUsageNotificationFuture =
            simCardDataUsageNotificationServiceAsync.create(
                SimCardDataUsageNotificationCreateParams.builder()
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .threshold(
                        SimCardDataUsageNotificationCreateParams.Threshold.builder()
                            .amount("2048.1")
                            .unit(SimCardDataUsageNotificationCreateParams.Threshold.Unit.MB)
                            .build()
                    )
                    .build()
            )

        val simCardDataUsageNotification = simCardDataUsageNotificationFuture.get()
        simCardDataUsageNotification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardDataUsageNotificationServiceAsync = client.simCardDataUsageNotifications()

        val simCardDataUsageNotificationFuture =
            simCardDataUsageNotificationServiceAsync.retrieve(
                "6a09cdc3-8948-47f0-aa62-74ac943d6c58"
            )

        val simCardDataUsageNotification = simCardDataUsageNotificationFuture.get()
        simCardDataUsageNotification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardDataUsageNotificationServiceAsync = client.simCardDataUsageNotifications()

        val simCardDataUsageNotificationFuture =
            simCardDataUsageNotificationServiceAsync.update(
                SimCardDataUsageNotificationUpdateParams.builder()
                    .simCardDataUsageNotificationId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .simCardDataUsageNotification(
                        SimCardDataUsageNotification.builder()
                            .id("79228acc-3f08-4e70-ac68-cb5aae8b537a")
                            .createdAt("2018-02-02T22:25:27.521Z")
                            .recordType("sim_card_data_usage_notification")
                            .simCardId("b34c1683-cd85-4493-b9a5-315eb4bc5e19")
                            .threshold(
                                SimCardDataUsageNotification.Threshold.builder()
                                    .amount("2048.0")
                                    .unit(SimCardDataUsageNotification.Threshold.Unit.MB)
                                    .build()
                            )
                            .updatedAt("2018-02-02T22:25:27.521Z")
                            .build()
                    )
                    .build()
            )

        val simCardDataUsageNotification = simCardDataUsageNotificationFuture.get()
        simCardDataUsageNotification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardDataUsageNotificationServiceAsync = client.simCardDataUsageNotifications()

        val pageFuture = simCardDataUsageNotificationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardDataUsageNotificationServiceAsync = client.simCardDataUsageNotifications()

        val simCardDataUsageNotificationFuture =
            simCardDataUsageNotificationServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val simCardDataUsageNotification = simCardDataUsageNotificationFuture.get()
        simCardDataUsageNotification.validate()
    }
}
