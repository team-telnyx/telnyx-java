// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.texml().accounts()

        val response =
            accountService.retrieveRecordingsJson(
                AccountRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .dateCreated(OffsetDateTime.parse("2023-05-22T00:00:00Z"))
                    .page(0L)
                    .pageSize(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTranscriptionsJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.texml().accounts()

        val response =
            accountService.retrieveTranscriptionsJson(
                AccountRetrieveTranscriptionsJsonParams.builder()
                    .accountSid("account_sid")
                    .pageSize(0L)
                    .pageToken("PageToken")
                    .build()
            )

        response.validate()
    }
}
