// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotification
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationListParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
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
                    .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
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

        val simCardDataUsageNotifications =
            simCardDataUsageNotificationService.list(
                SimCardDataUsageNotificationListParams.builder()
                    .filterSimCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        simCardDataUsageNotifications.validate()
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
