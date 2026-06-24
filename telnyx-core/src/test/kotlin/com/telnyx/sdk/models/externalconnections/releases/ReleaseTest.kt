// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseTest {

    @Test
    fun create() {
        val release =
            Release.builder()
                .createdAt("2018-02-02T22:25:27.521Z")
                .errorMessage("error_message")
                .status(Release.Status.PENDING)
                .addTelephoneNumber(
                    TnReleaseEntry.builder()
                        .numberId("number_id")
                        .phoneNumber("phone_number")
                        .build()
                )
                .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .build()

        assertThat(release.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(release.errorMessage()).contains("error_message")
        assertThat(release.status()).contains(Release.Status.PENDING)
        assertThat(release.telephoneNumbers().getOrNull())
            .containsExactly(
                TnReleaseEntry.builder().numberId("number_id").phoneNumber("phone_number").build()
            )
        assertThat(release.tenantId()).contains("ea175aba-f47c-4702-9400-efaa42688048")
        assertThat(release.ticketId()).contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val release =
            Release.builder()
                .createdAt("2018-02-02T22:25:27.521Z")
                .errorMessage("error_message")
                .status(Release.Status.PENDING)
                .addTelephoneNumber(
                    TnReleaseEntry.builder()
                        .numberId("number_id")
                        .phoneNumber("phone_number")
                        .build()
                )
                .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .build()

        val roundtrippedRelease =
            jsonMapper.readValue(jsonMapper.writeValueAsString(release), jacksonTypeRef<Release>())

        assertThat(roundtrippedRelease).isEqualTo(release)
    }
}
