// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseListResponseTest {

    @Test
    fun create() {
        val releaseListResponse =
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

        assertThat(releaseListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(releaseListResponse.errorMessage()).contains("error_message")
        assertThat(releaseListResponse.status()).contains(ReleaseListResponse.Status.PENDING)
        assertThat(releaseListResponse.telephoneNumbers().getOrNull())
            .containsExactly(
                ReleaseListResponse.TelephoneNumber.builder()
                    .numberId("number_id")
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(releaseListResponse.tenantId()).contains("ea175aba-f47c-4702-9400-efaa42688048")
        assertThat(releaseListResponse.ticketId()).contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val releaseListResponse =
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

        val roundtrippedReleaseListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(releaseListResponse),
                jacksonTypeRef<ReleaseListResponse>(),
            )

        assertThat(roundtrippedReleaseListResponse).isEqualTo(releaseListResponse)
    }
}
