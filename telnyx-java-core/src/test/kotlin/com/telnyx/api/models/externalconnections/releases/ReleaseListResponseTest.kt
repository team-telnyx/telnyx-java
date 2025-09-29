// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseListResponseTest {

    @Test
    fun create() {
        val releaseListResponse =
            ReleaseListResponse.builder()
                .addData(
                    ReleaseListResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseListResponse.Data.Status.PENDING)
                        .addTelephoneNumber(
                            ReleaseListResponse.Data.TelephoneNumber.builder()
                                .numberId("number_id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(releaseListResponse.data().getOrNull())
            .containsExactly(
                ReleaseListResponse.Data.builder()
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .errorMessage("error_message")
                    .status(ReleaseListResponse.Data.Status.PENDING)
                    .addTelephoneNumber(
                        ReleaseListResponse.Data.TelephoneNumber.builder()
                            .numberId("number_id")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
        assertThat(releaseListResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
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
        val releaseListResponse =
            ReleaseListResponse.builder()
                .addData(
                    ReleaseListResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseListResponse.Data.Status.PENDING)
                        .addTelephoneNumber(
                            ReleaseListResponse.Data.TelephoneNumber.builder()
                                .numberId("number_id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedReleaseListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(releaseListResponse),
                jacksonTypeRef<ReleaseListResponse>(),
            )

        assertThat(roundtrippedReleaseListResponse).isEqualTo(releaseListResponse)
    }
}
