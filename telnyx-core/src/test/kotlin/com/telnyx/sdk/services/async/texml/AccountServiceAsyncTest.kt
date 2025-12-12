// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.texml().accounts()

        val responseFuture =
            accountServiceAsync.retrieveRecordingsJson(
                AccountRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .dateCreated(OffsetDateTime.parse("2023-05-22T00:00:00Z"))
                    .page(0L)
                    .pageSize(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTranscriptionsJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.texml().accounts()

        val responseFuture =
            accountServiceAsync.retrieveTranscriptionsJson(
                AccountRetrieveTranscriptionsJsonParams.builder()
                    .accountSid("account_sid")
                    .pageSize(0L)
                    .pageToken("PageToken")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
