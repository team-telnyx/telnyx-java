// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationchannels

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelListParamsTest {

    @Test
    fun create() {
        NotificationChannelListParams.builder()
            .filter(
                NotificationChannelListParams.Filter.builder()
                    .associatedRecordType(
                        NotificationChannelListParams.Filter.AssociatedRecordType.builder()
                            .eq(
                                NotificationChannelListParams.Filter.AssociatedRecordType.Eq
                                    .PHONE_NUMBER
                            )
                            .build()
                    )
                    .channelTypeId(
                        NotificationChannelListParams.Filter.ChannelTypeId.builder()
                            .eq(NotificationChannelListParams.Filter.ChannelTypeId.Eq.WEBHOOK)
                            .build()
                    )
                    .notificationChannel(
                        NotificationChannelListParams.Filter.NotificationChannel.builder()
                            .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .build()
                    )
                    .notificationEventConditionId(
                        NotificationChannelListParams.Filter.NotificationEventConditionId.builder()
                            .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .build()
                    )
                    .notificationProfileId(
                        NotificationChannelListParams.Filter.NotificationProfileId.builder()
                            .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .build()
                    )
                    .status(
                        NotificationChannelListParams.Filter.Status.builder()
                            .eq(NotificationChannelListParams.Filter.Status.Eq.ENABLE_RECEIVED)
                            .build()
                    )
                    .build()
            )
            .page(NotificationChannelListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NotificationChannelListParams.builder()
                .filter(
                    NotificationChannelListParams.Filter.builder()
                        .associatedRecordType(
                            NotificationChannelListParams.Filter.AssociatedRecordType.builder()
                                .eq(
                                    NotificationChannelListParams.Filter.AssociatedRecordType.Eq
                                        .PHONE_NUMBER
                                )
                                .build()
                        )
                        .channelTypeId(
                            NotificationChannelListParams.Filter.ChannelTypeId.builder()
                                .eq(NotificationChannelListParams.Filter.ChannelTypeId.Eq.WEBHOOK)
                                .build()
                        )
                        .notificationChannel(
                            NotificationChannelListParams.Filter.NotificationChannel.builder()
                                .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                .build()
                        )
                        .notificationEventConditionId(
                            NotificationChannelListParams.Filter.NotificationEventConditionId
                                .builder()
                                .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                .build()
                        )
                        .notificationProfileId(
                            NotificationChannelListParams.Filter.NotificationProfileId.builder()
                                .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                .build()
                        )
                        .status(
                            NotificationChannelListParams.Filter.Status.builder()
                                .eq(NotificationChannelListParams.Filter.Status.Eq.ENABLE_RECEIVED)
                                .build()
                        )
                        .build()
                )
                .page(NotificationChannelListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[associated_record_type][eq]", "phone_number")
                    .put("filter[channel_type_id][eq]", "webhook")
                    .put("filter[notification_channel][eq]", "12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .put(
                        "filter[notification_event_condition_id][eq]",
                        "12455643-3cf1-4683-ad23-1cd32f7d5e0a",
                    )
                    .put(
                        "filter[notification_profile_id][eq]",
                        "12455643-3cf1-4683-ad23-1cd32f7d5e0a",
                    )
                    .put("filter[status][eq]", "enable-received")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotificationChannelListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
