// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
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
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
