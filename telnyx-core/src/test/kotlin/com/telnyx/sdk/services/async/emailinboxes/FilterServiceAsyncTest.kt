// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceParams
import com.telnyx.sdk.models.emailinboxes.filters.MutateInboxFiltersRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FilterServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val filterServiceAsync = client.emailInboxes().filters()

        val filtersFuture = filterServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val filters = filtersFuture.get()
        filters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val filterServiceAsync = client.emailInboxes().filters()

        val responseFuture =
            filterServiceAsync.add(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val filterServiceAsync = client.emailInboxes().filters()

        val responseFuture =
            filterServiceAsync.deleteAll(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val filterServiceAsync = client.emailInboxes().filters()

        val responseFuture =
            filterServiceAsync.replace(
                FilterReplaceParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowlist("trusted@example.com")
                    .addAllowlist("@partner.example")
                    .addBlocklist("@spam.example")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
