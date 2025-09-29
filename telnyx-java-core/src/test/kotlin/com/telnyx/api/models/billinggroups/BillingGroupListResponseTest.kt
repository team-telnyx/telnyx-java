// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.billinggroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupListResponseTest {

    @Test
    fun create() {
        val billingGroupListResponse =
            BillingGroupListResponse.builder()
                .addData(
                    BillingGroup.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .deletedAt(null)
                        .name("My billing group name")
                        .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType(BillingGroup.RecordType.BILLING_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
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

        assertThat(billingGroupListResponse.data().getOrNull())
            .containsExactly(
                BillingGroup.builder()
                    .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .deletedAt(null)
                    .name("My billing group name")
                    .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType(BillingGroup.RecordType.BILLING_GROUP)
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(billingGroupListResponse.meta())
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
        val billingGroupListResponse =
            BillingGroupListResponse.builder()
                .addData(
                    BillingGroup.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .deletedAt(null)
                        .name("My billing group name")
                        .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType(BillingGroup.RecordType.BILLING_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
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

        val roundtrippedBillingGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingGroupListResponse),
                jacksonTypeRef<BillingGroupListResponse>(),
            )

        assertThat(roundtrippedBillingGroupListResponse).isEqualTo(billingGroupListResponse)
    }
}
