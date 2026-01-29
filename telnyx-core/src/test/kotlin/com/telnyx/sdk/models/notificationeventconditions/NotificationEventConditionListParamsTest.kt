// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationeventconditions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventConditionListParamsTest {

    @Test
    fun create() {
        NotificationEventConditionListParams.builder()
            .filter(
                NotificationEventConditionListParams.Filter.builder()
                    .associatedRecordType(
                        NotificationEventConditionListParams.Filter.AssociatedRecordType.builder()
                            .eq(
                                NotificationEventConditionListParams.Filter.AssociatedRecordType.Eq
                                    .PHONE_NUMBER
                            )
                            .build()
                    )
                    .channelTypeId(
                        NotificationEventConditionListParams.Filter.ChannelTypeId.builder()
                            .eq(
                                NotificationEventConditionListParams.Filter.ChannelTypeId.Eq.WEBHOOK
                            )
                            .build()
                    )
                    .notificationChannel(
                        NotificationEventConditionListParams.Filter.NotificationChannel.builder()
                            .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .build()
                    )
                    .notificationEventConditionId(
                        NotificationEventConditionListParams.Filter.NotificationEventConditionId
                            .builder()
                            .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                            .build()
                    )
                    .notificationProfileId(
                        NotificationEventConditionListParams.Filter.NotificationProfileId.builder()
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
            .page(NotificationEventConditionListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NotificationEventConditionListParams.builder()
                .filter(
                    NotificationEventConditionListParams.Filter.builder()
                        .associatedRecordType(
                            NotificationEventConditionListParams.Filter.AssociatedRecordType
                                .builder()
                                .eq(
                                    NotificationEventConditionListParams.Filter.AssociatedRecordType
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
                            NotificationEventConditionListParams.Filter.NotificationEventConditionId
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
                    NotificationEventConditionListParams.Page.builder().number(1L).size(1L).build()
                )
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
        val params = NotificationEventConditionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
