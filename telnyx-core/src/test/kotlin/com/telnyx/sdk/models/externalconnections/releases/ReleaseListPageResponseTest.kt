// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseListPageResponseTest {

    @Test
    fun create() {
        val releaseListPageResponse =
            ReleaseListPageResponse.builder()
                .addData(
                    ReleaseListResponse.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseListResponse.Status.PENDING)
                        .addTelephoneNumber(
                            ReleaseListResponse.TelephoneNumber.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(releaseListPageResponse.data().getOrNull())
            .containsExactly(
                ReleaseListResponse.builder()
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .errorMessage("error_message")
                    .status(ReleaseListResponse.Status.PENDING)
                    .addTelephoneNumber(
                        ReleaseListResponse.TelephoneNumber.builder()
                            .numberId("number_id")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
        assertThat(releaseListPageResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
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
        val releaseListPageResponse =
            ReleaseListPageResponse.builder()
                .addData(
                    ReleaseListResponse.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseListResponse.Status.PENDING)
                        .addTelephoneNumber(
                            ReleaseListResponse.TelephoneNumber.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedReleaseListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(releaseListPageResponse),
                jacksonTypeRef<ReleaseListPageResponse>(),
            )

        assertThat(roundtrippedReleaseListPageResponse).isEqualTo(releaseListPageResponse)
    }
}
