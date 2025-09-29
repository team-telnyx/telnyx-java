// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingoptouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingOptoutListResponseTest {

    @Test
    fun create() {
        val messagingOptoutListResponse =
            MessagingOptoutListResponse.builder()
                .addData(
                    MessagingOptoutListResponse.Data.builder()
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

        assertThat(messagingOptoutListResponse.data().getOrNull())
            .containsExactly(
                MessagingOptoutListResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .from("from")
                    .keyword("STOP")
                    .messagingProfileId("messaging_profile_id")
                    .to("+E.164")
                    .build()
            )
        assertThat(messagingOptoutListResponse.meta())
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
        val messagingOptoutListResponse =
            MessagingOptoutListResponse.builder()
                .addData(
                    MessagingOptoutListResponse.Data.builder()
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

        val roundtrippedMessagingOptoutListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingOptoutListResponse),
                jacksonTypeRef<MessagingOptoutListResponse>(),
            )

        assertThat(roundtrippedMessagingOptoutListResponse).isEqualTo(messagingOptoutListResponse)
    }
}
