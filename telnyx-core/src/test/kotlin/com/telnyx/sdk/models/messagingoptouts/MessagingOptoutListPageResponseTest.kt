// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingOptoutListPageResponseTest {

    @Test
    fun create() {
        val messagingOptoutListPageResponse =
            MessagingOptoutListPageResponse.builder()
                .addData(
                    MessagingOptoutListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .from("from")
                        .keyword("STOP")
                        .messagingProfileId("messaging_profile_id")
                        .to("+E.164")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingOptoutListPageResponse.data().getOrNull())
            .containsExactly(
                MessagingOptoutListResponse.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .from("from")
                    .keyword("STOP")
                    .messagingProfileId("messaging_profile_id")
                    .to("+E.164")
                    .build()
            )
        assertThat(messagingOptoutListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val messagingOptoutListPageResponse =
            MessagingOptoutListPageResponse.builder()
                .addData(
                    MessagingOptoutListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .from("from")
                        .keyword("STOP")
                        .messagingProfileId("messaging_profile_id")
                        .to("+E.164")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingOptoutListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingOptoutListPageResponse),
                jacksonTypeRef<MessagingOptoutListPageResponse>(),
            )

        assertThat(roundtrippedMessagingOptoutListPageResponse)
            .isEqualTo(messagingOptoutListPageResponse)
    }
}
