// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofilemetrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileMetricListResponseTest {

    @Test
    fun create() {
        val messagingProfileMetricListResponse =
            MessagingProfileMetricListResponse.builder()
                .addData(
                    MessagingProfileMetricListResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingProfileMetricListResponse.data().getOrNull())
            .containsExactly(
                MessagingProfileMetricListResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(messagingProfileMetricListResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileMetricListResponse =
            MessagingProfileMetricListResponse.builder()
                .addData(
                    MessagingProfileMetricListResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileMetricListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileMetricListResponse),
                jacksonTypeRef<MessagingProfileMetricListResponse>(),
            )

        assertThat(roundtrippedMessagingProfileMetricListResponse)
            .isEqualTo(messagingProfileMetricListResponse)
    }
}
