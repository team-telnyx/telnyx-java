// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.Metadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutListResponseTest {

    @Test
    fun create() {
        val portoutListResponse =
            PortoutListResponse.builder()
                .addData(
                    PortoutDetails.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .alreadyPorted(false)
                        .authorizedName("McPortersen")
                        .carrierName("test")
                        .city("Chicago")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .currentCarrier("telnyx")
                        .endUserName("McPortersen")
                        .focDate("2018-02-02T22:25:27.521Z")
                        .hostMessaging(false)
                        .insertedAt("2018-02-02T22:25:27.521Z")
                        .addLsr("https://example.com/files/lsr.pdf")
                        .addPhoneNumber("+35312345678")
                        .pon("00000000")
                        .reason(null)
                        .recordType("portout")
                        .rejectionCode(1002L)
                        .requestedFocDate("2018-02-02T22:25:27.521Z")
                        .serviceAddress("000 Example Street")
                        .spid("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .state("IL")
                        .status(PortoutDetails.Status.REJECTED)
                        .supportKey("PO_764725")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .userId("7865816a-ee85-4e50-b19e-52983dcc6d4a")
                        .vendor("0e66ed3b-37e6-4fed-93d6-a30ce2493661")
                        .zip("00000")
                        .build()
                )
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        assertThat(portoutListResponse.data().getOrNull())
            .containsExactly(
                PortoutDetails.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .alreadyPorted(false)
                    .authorizedName("McPortersen")
                    .carrierName("test")
                    .city("Chicago")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .currentCarrier("telnyx")
                    .endUserName("McPortersen")
                    .focDate("2018-02-02T22:25:27.521Z")
                    .hostMessaging(false)
                    .insertedAt("2018-02-02T22:25:27.521Z")
                    .addLsr("https://example.com/files/lsr.pdf")
                    .addPhoneNumber("+35312345678")
                    .pon("00000000")
                    .reason(null)
                    .recordType("portout")
                    .rejectionCode(1002L)
                    .requestedFocDate("2018-02-02T22:25:27.521Z")
                    .serviceAddress("000 Example Street")
                    .spid("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .state("IL")
                    .status(PortoutDetails.Status.REJECTED)
                    .supportKey("PO_764725")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .userId("7865816a-ee85-4e50-b19e-52983dcc6d4a")
                    .vendor("0e66ed3b-37e6-4fed-93d6-a30ce2493661")
                    .zip("00000")
                    .build()
            )
        assertThat(portoutListResponse.meta())
            .contains(
                Metadata.builder()
                    .pageNumber(3.0)
                    .pageSize(1.0)
                    .totalPages(13.0)
                    .totalResults(13.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portoutListResponse =
            PortoutListResponse.builder()
                .addData(
                    PortoutDetails.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .alreadyPorted(false)
                        .authorizedName("McPortersen")
                        .carrierName("test")
                        .city("Chicago")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .currentCarrier("telnyx")
                        .endUserName("McPortersen")
                        .focDate("2018-02-02T22:25:27.521Z")
                        .hostMessaging(false)
                        .insertedAt("2018-02-02T22:25:27.521Z")
                        .addLsr("https://example.com/files/lsr.pdf")
                        .addPhoneNumber("+35312345678")
                        .pon("00000000")
                        .reason(null)
                        .recordType("portout")
                        .rejectionCode(1002L)
                        .requestedFocDate("2018-02-02T22:25:27.521Z")
                        .serviceAddress("000 Example Street")
                        .spid("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .state("IL")
                        .status(PortoutDetails.Status.REJECTED)
                        .supportKey("PO_764725")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .userId("7865816a-ee85-4e50-b19e-52983dcc6d4a")
                        .vendor("0e66ed3b-37e6-4fed-93d6-a30ce2493661")
                        .zip("00000")
                        .build()
                )
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        val roundtrippedPortoutListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portoutListResponse),
                jacksonTypeRef<PortoutListResponse>(),
            )

        assertThat(roundtrippedPortoutListResponse).isEqualTo(portoutListResponse)
    }
}
