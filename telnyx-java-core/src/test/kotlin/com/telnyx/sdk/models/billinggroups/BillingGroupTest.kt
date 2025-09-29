// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupTest {

    @Test
    fun create() {
        val billingGroup =
            BillingGroup.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .deletedAt(null)
                .name("My billing group name")
                .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType(BillingGroup.RecordType.BILLING_GROUP)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(billingGroup.id()).contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(billingGroup.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(billingGroup.deletedAt()).isEmpty
        assertThat(billingGroup.name()).contains("My billing group name")
        assertThat(billingGroup.organizationId()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(billingGroup.recordType()).contains(BillingGroup.RecordType.BILLING_GROUP)
        assertThat(billingGroup.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingGroup =
            BillingGroup.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .deletedAt(null)
                .name("My billing group name")
                .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType(BillingGroup.RecordType.BILLING_GROUP)
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedBillingGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingGroup),
                jacksonTypeRef<BillingGroup>(),
            )

        assertThat(roundtrippedBillingGroup).isEqualTo(billingGroup)
    }
}
