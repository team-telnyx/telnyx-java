// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.list

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRetrieveAllResponseTest {

    @Test
    fun create() {
        val listRetrieveAllResponse =
            ListRetrieveAllResponse.builder()
                .addData(
                    ListRetrieveAllResponse.Data.builder()
                        .numberOfChannels(7L)
                        .addNumber(
                            ListRetrieveAllResponse.Data.Number.builder()
                                .country("FR")
                                .number("+15554441234")
                                .build()
                        )
                        .zoneId("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
                        .zoneName("Euro channel zone")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(listRetrieveAllResponse.data().getOrNull())
            .containsExactly(
                ListRetrieveAllResponse.Data.builder()
                    .numberOfChannels(7L)
                    .addNumber(
                        ListRetrieveAllResponse.Data.Number.builder()
                            .country("FR")
                            .number("+15554441234")
                            .build()
                    )
                    .zoneId("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
                    .zoneName("Euro channel zone")
                    .build()
            )
        assertThat(listRetrieveAllResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listRetrieveAllResponse =
            ListRetrieveAllResponse.builder()
                .addData(
                    ListRetrieveAllResponse.Data.builder()
                        .numberOfChannels(7L)
                        .addNumber(
                            ListRetrieveAllResponse.Data.Number.builder()
                                .country("FR")
                                .number("+15554441234")
                                .build()
                        )
                        .zoneId("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
                        .zoneName("Euro channel zone")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedListRetrieveAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listRetrieveAllResponse),
                jacksonTypeRef<ListRetrieveAllResponse>(),
            )

        assertThat(roundtrippedListRetrieveAllResponse).isEqualTo(listRetrieveAllResponse)
    }
}
