// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceParams
import com.telnyx.sdk.models.emailinboxes.filters.MutateInboxFiltersRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FilterServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val filterService = client.emailInboxes().filters()

        val filters = filterService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        filters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val filterService = client.emailInboxes().filters()

        val response =
            filterService.add(
                FilterAddParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mutateInboxFiltersRequest(
                        MutateInboxFiltersRequest.builder()
                            .addEntry("@spam.example")
                            .type(MutateInboxFiltersRequest.Type.BLOCKLIST)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val filterService = client.emailInboxes().filters()

        val response =
            filterService.deleteAll(
                FilterDeleteAllParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .mutateInboxFiltersRequest(
                        MutateInboxFiltersRequest.builder()
                            .addEntry("former-partner@example.com")
                            .type(MutateInboxFiltersRequest.Type.ALLOWLIST)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val filterService = client.emailInboxes().filters()

        val response =
            filterService.replace(
                FilterReplaceParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowlist("trusted@example.com")
                    .addAllowlist("@partner.example")
                    .addBlocklist("@spam.example")
                    .build()
            )

        response.validate()
    }
}
