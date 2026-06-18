// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupRetrieveResponseTest {

    @Test
    fun create() {
        val billingGroupRetrieveResponse =
            BillingGroupRetrieveResponse.builder()
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

        assertThat(billingGroupRetrieveResponse.data())
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
        val billingGroupRetrieveResponse =
            BillingGroupRetrieveResponse.builder()
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

        val roundtrippedBillingGroupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingGroupRetrieveResponse),
                jacksonTypeRef<BillingGroupRetrieveResponse>(),
            )

        assertThat(roundtrippedBillingGroupRetrieveResponse).isEqualTo(billingGroupRetrieveResponse)
    }
}
