// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles.autorespconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutorespConfigListResponseTest {

    @Test
    fun create() {
        val autorespConfigListResponse =
            AutorespConfigListResponse.builder()
                .addData(
                    AutoRespConfig.builder()
                        .id("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
                        .countryCode("*")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addKeyword("START")
                        .addKeyword("BEGIN")
                        .op(AutoRespConfig.Op.START)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .respText("Thank you for subscribing to our service.")
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

        assertThat(autorespConfigListResponse.data())
            .containsExactly(
                AutoRespConfig.builder()
                    .id("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
                    .countryCode("*")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addKeyword("START")
                    .addKeyword("BEGIN")
                    .op(AutoRespConfig.Op.START)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .respText("Thank you for subscribing to our service.")
                    .build()
            )
        assertThat(autorespConfigListResponse.meta())
            .isEqualTo(
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
        val autorespConfigListResponse =
            AutorespConfigListResponse.builder()
                .addData(
                    AutoRespConfig.builder()
                        .id("b8f9c1c0-5b5a-4b1e-8c1c-0b5a4b1e8c1c")
                        .countryCode("*")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addKeyword("START")
                        .addKeyword("BEGIN")
                        .op(AutoRespConfig.Op.START)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .respText("Thank you for subscribing to our service.")
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

        val roundtrippedAutorespConfigListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autorespConfigListResponse),
                jacksonTypeRef<AutorespConfigListResponse>(),
            )

        assertThat(roundtrippedAutorespConfigListResponse).isEqualTo(autorespConfigListResponse)
    }
}
