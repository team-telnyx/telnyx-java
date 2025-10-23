// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.auditevents.AuditEventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuditEventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventServiceAsync = client.auditEvents()

        val auditEventsFuture =
            auditEventServiceAsync.list(
                AuditEventListParams.builder()
                    .filter(
                        AuditEventListParams.Filter.builder()
                            .createdAfter(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .createdBefore(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .build()
                    )
                    .page(AuditEventListParams.Page.builder().number(1L).size(10L).build())
                    .sort(AuditEventListParams.Sort.DESC)
                    .build()
            )

        val auditEvents = auditEventsFuture.get()
        auditEvents.validate()
    }
}
