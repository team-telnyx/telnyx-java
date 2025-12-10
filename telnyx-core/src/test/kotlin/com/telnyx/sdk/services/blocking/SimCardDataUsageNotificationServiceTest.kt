// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotification
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardDataUsageNotificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardDataUsageNotificationService = client.simCardDataUsageNotifications()

        val simCardDataUsageNotification =
            simCardDataUsageNotificationService.create(
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

        simCardDataUsageNotification.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardDataUsageNotificationService = client.simCardDataUsageNotifications()

        val simCardDataUsageNotification =
            simCardDataUsageNotificationService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardDataUsageNotification.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardDataUsageNotificationService = client.simCardDataUsageNotifications()

        val simCardDataUsageNotification =
            simCardDataUsageNotificationService.update(
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

        simCardDataUsageNotification.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardDataUsageNotificationService = client.simCardDataUsageNotifications()

        val page = simCardDataUsageNotificationService.list()

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
        val simCardDataUsageNotificationService = client.simCardDataUsageNotifications()

        val simCardDataUsageNotification =
            simCardDataUsageNotificationService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardDataUsageNotification.validate()
    }
}
