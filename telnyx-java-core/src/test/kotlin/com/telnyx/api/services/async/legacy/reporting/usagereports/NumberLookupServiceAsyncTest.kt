// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.usagereports

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberLookupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberLookupServiceAsync = client.legacy().reporting().usageReports().numberLookup()

        val future =
            numberLookupServiceAsync.create(
                NumberLookupCreateParams.builder()
                    .aggregationType(NumberLookupCreateParams.AggregationType.ALL)
                    .endDate(LocalDate.parse("2025-02-10"))
                    .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                    .startDate(LocalDate.parse("2025-02-10"))
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberLookupServiceAsync = client.legacy().reporting().usageReports().numberLookup()

        val future = numberLookupServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberLookupServiceAsync = client.legacy().reporting().usageReports().numberLookup()

        val future =
            numberLookupServiceAsync.list(
                NumberLookupListParams.builder().page(0).perPage(0).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberLookupServiceAsync = client.legacy().reporting().usageReports().numberLookup()

        val future = numberLookupServiceAsync.delete("id")

        val response = future.get()
    }
}
