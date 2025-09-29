// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.billinggroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupCreateResponseTest {

    @Test
    fun create() {
        val billingGroupCreateResponse =
            BillingGroupCreateResponse.builder()
                .data(
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
                .build()

        assertThat(billingGroupCreateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingGroupCreateResponse =
            BillingGroupCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedBillingGroupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingGroupCreateResponse),
                jacksonTypeRef<BillingGroupCreateResponse>(),
            )

        assertThat(roundtrippedBillingGroupCreateResponse).isEqualTo(billingGroupCreateResponse)
    }
}
