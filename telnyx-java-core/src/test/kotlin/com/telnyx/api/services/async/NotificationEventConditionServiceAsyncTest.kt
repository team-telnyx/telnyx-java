// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.notificationeventconditions.NotificationEventConditionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationEventConditionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationEventConditionServiceAsync = client.notificationEventConditions()

        val notificationEventConditionsFuture =
            notificationEventConditionServiceAsync.list(
                NotificationEventConditionListParams.builder()
                    .filter(
                        NotificationEventConditionListParams.Filter.builder()
                            .associatedRecordType(
                                NotificationEventConditionListParams.Filter.AssociatedRecordType
                                    .builder()
                                    .eq(
                                        NotificationEventConditionListParams.Filter
                                            .AssociatedRecordType
                                            .Eq
                                            .PHONE_NUMBER
                                    )
                                    .build()
                            )
                            .channelTypeId(
                                NotificationEventConditionListParams.Filter.ChannelTypeId.builder()
                                    .eq(
                                        NotificationEventConditionListParams.Filter.ChannelTypeId.Eq
                                            .WEBHOOK
                                    )
                                    .build()
                            )
                            .notificationChannel(
                                NotificationEventConditionListParams.Filter.NotificationChannel
                                    .builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationEventConditionId(
                                NotificationEventConditionListParams.Filter
                                    .NotificationEventConditionId
                                    .builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationProfileId(
                                NotificationEventConditionListParams.Filter.NotificationProfileId
                                    .builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .status(
                                NotificationEventConditionListParams.Filter.Status.builder()
                                    .eq(
                                        NotificationEventConditionListParams.Filter.Status.Eq
                                            .ENABLE_RECEIVED
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .page(
                        NotificationEventConditionListParams.Page.builder()
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        val notificationEventConditions = notificationEventConditionsFuture.get()
        notificationEventConditions.validate()
    }
}
