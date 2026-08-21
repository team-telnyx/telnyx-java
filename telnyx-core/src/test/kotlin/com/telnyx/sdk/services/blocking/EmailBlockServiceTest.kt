// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailBlockServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        val emailBlockResponse =
            emailBlockService.create(
                EmailBlockCreateParams.builder()
                    .to("spammer@bad.tld")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .from("from")
                    .build()
            )

        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        val emailBlockResponse = emailBlockService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        val page = emailBlockService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        val emailBlockResponse = emailBlockService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        val page = emailBlockService.retrieveEvents("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveExport() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailBlockService = client.emailBlocks()

        emailBlockService.retrieveExport(
            EmailBlockRetrieveExportParams.builder()
                .filterCreatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterCreatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterDomainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterReason(EmailBlockRetrieveExportParams.FilterReason.HARD_BOUNCE)
                .pageNumber(1L)
                .pageSize(1L)
                .sort(EmailBlockRetrieveExportParams.Sort.CREATED_AT)
                .build()
        )
    }
}
