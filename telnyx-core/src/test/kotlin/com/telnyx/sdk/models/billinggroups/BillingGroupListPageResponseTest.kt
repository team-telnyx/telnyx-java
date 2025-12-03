// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupListPageResponseTest {

    @Test
    fun create() {
        val billingGroupListPageResponse =
            BillingGroupListPageResponse.builder()
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

        assertThat(billingGroupListPageResponse.data().getOrNull())
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
        assertThat(billingGroupListPageResponse.meta())
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
        val billingGroupListPageResponse =
            BillingGroupListPageResponse.builder()
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

        val roundtrippedBillingGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingGroupListPageResponse),
                jacksonTypeRef<BillingGroupListPageResponse>(),
            )

        assertThat(roundtrippedBillingGroupListPageResponse).isEqualTo(billingGroupListPageResponse)
    }
}
