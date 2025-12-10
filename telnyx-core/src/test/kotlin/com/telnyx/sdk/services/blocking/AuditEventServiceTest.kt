// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.auditevents.AuditEventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuditEventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auditEventService = client.auditEvents()

        val auditEvents =
            auditEventService.list(
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

        auditEvents.validate()
    }
}
