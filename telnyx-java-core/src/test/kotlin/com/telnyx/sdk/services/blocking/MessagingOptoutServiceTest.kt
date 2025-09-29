// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingOptoutServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingOptoutService = client.messagingOptouts()

        val messagingOptouts =
            messagingOptoutService.list(
                MessagingOptoutListParams.builder()
                    .createdAt(
                        MessagingOptoutListParams.CreatedAt.builder()
                            .gte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .lte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .filter(
                        MessagingOptoutListParams.Filter.builder()
                            .from("from")
                            .messagingProfileId("messaging_profile_id")
                            .build()
                    )
                    .page(MessagingOptoutListParams.Page.builder().number(1L).size(1L).build())
                    .redactionEnabled("redaction_enabled")
                    .build()
            )

        messagingOptouts.validate()
    }
}
