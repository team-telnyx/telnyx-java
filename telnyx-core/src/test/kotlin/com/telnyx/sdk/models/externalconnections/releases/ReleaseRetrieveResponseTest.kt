// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseRetrieveResponseTest {

    @Test
    fun create() {
        val releaseRetrieveResponse =
            ReleaseRetrieveResponse.builder()
                .data(
                    ReleaseRetrieveResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseRetrieveResponse.Data.Status.PENDING)
                        .addTelephoneNumber(
                            TnReleaseEntry.builder()
                                .numberId("number_id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .build()

        assertThat(releaseRetrieveResponse.data())
            .contains(
                ReleaseRetrieveResponse.Data.builder()
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .errorMessage("error_message")
                    .status(ReleaseRetrieveResponse.Data.Status.PENDING)
                    .addTelephoneNumber(
                        TnReleaseEntry.builder()
                            .numberId("number_id")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val releaseRetrieveResponse =
            ReleaseRetrieveResponse.builder()
                .data(
                    ReleaseRetrieveResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .errorMessage("error_message")
                        .status(ReleaseRetrieveResponse.Data.Status.PENDING)
                        .addTelephoneNumber(
                            TnReleaseEntry.builder()
                                .numberId("number_id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .build()

        val roundtrippedReleaseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(releaseRetrieveResponse),
                jacksonTypeRef<ReleaseRetrieveResponse>(),
            )

        assertThat(roundtrippedReleaseRetrieveResponse).isEqualTo(releaseRetrieveResponse)
    }
}
