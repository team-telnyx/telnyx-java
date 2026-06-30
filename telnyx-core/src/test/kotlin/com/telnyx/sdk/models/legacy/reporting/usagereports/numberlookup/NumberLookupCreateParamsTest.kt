// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupCreateParamsTest {

    @Test
    fun create() {
        NumberLookupCreateParams.builder()
            .aggregationType(NumberLookupCreateParams.AggregationType.ALL)
            .endDate(LocalDate.parse("2025-02-10"))
            .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
            .startDate(LocalDate.parse("2025-02-10"))
            .build()
    }

    @Test
    fun body() {
        val params =
            NumberLookupCreateParams.builder()
                .aggregationType(NumberLookupCreateParams.AggregationType.ALL)
                .endDate(LocalDate.parse("2025-02-10"))
                .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                .startDate(LocalDate.parse("2025-02-10"))
                .build()

        val body = params._body()

        assertThat(body.aggregationType()).contains(NumberLookupCreateParams.AggregationType.ALL)
        assertThat(body.endDate()).contains(LocalDate.parse("2025-02-10"))
        assertThat(body.managedAccounts().getOrNull())
            .containsExactly(
                "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "6ba7b810-9dad-11d1-80b4-00c04fd430c8",
            )
        assertThat(body.startDate()).contains(LocalDate.parse("2025-02-10"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NumberLookupCreateParams.builder().build()

        val body = params._body()
    }
}
