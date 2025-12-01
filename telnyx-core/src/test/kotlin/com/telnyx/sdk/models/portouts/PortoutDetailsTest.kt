// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutDetailsTest {

    @Test
    fun create() {
        val portoutDetails =
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

        assertThat(portoutDetails.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portoutDetails.alreadyPorted()).contains(false)
        assertThat(portoutDetails.authorizedName()).contains("McPortersen")
        assertThat(portoutDetails.carrierName()).contains("test")
        assertThat(portoutDetails.city()).contains("Chicago")
        assertThat(portoutDetails.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(portoutDetails.currentCarrier()).contains("telnyx")
        assertThat(portoutDetails.endUserName()).contains("McPortersen")
        assertThat(portoutDetails.focDate()).contains("2018-02-02T22:25:27.521Z")
        assertThat(portoutDetails.hostMessaging()).contains(false)
        assertThat(portoutDetails.insertedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(portoutDetails.lsr().getOrNull())
            .containsExactly("https://example.com/files/lsr.pdf")
        assertThat(portoutDetails.phoneNumbers().getOrNull()).containsExactly("+35312345678")
        assertThat(portoutDetails.pon()).contains("00000000")
        assertThat(portoutDetails.reason()).isEmpty
        assertThat(portoutDetails.recordType()).contains("portout")
        assertThat(portoutDetails.rejectionCode()).contains(1002L)
        assertThat(portoutDetails.requestedFocDate()).contains("2018-02-02T22:25:27.521Z")
        assertThat(portoutDetails.serviceAddress()).contains("000 Example Street")
        assertThat(portoutDetails.spid()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portoutDetails.state()).contains("IL")
        assertThat(portoutDetails.status()).contains(PortoutDetails.Status.REJECTED)
        assertThat(portoutDetails.supportKey()).contains("PO_764725")
        assertThat(portoutDetails.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(portoutDetails.userId()).contains("7865816a-ee85-4e50-b19e-52983dcc6d4a")
        assertThat(portoutDetails.vendor()).contains("0e66ed3b-37e6-4fed-93d6-a30ce2493661")
        assertThat(portoutDetails.zip()).contains("00000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portoutDetails =
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

        val roundtrippedPortoutDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portoutDetails),
                jacksonTypeRef<PortoutDetails>(),
            )

        assertThat(roundtrippedPortoutDetails).isEqualTo(portoutDetails)
    }
}
