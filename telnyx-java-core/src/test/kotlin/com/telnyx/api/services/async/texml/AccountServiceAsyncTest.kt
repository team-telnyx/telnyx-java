// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
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
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
