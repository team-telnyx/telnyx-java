// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.otaupdates.OtaUpdateListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OtaUpdateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val otaUpdateService = client.otaUpdates()

        val otaUpdate = otaUpdateService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        otaUpdate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val otaUpdateService = client.otaUpdates()

        val otaUpdates =
            otaUpdateService.list(
                OtaUpdateListParams.builder()
                    .filter(
                        OtaUpdateListParams.Filter.builder()
                            .simCardId("sim_card_id")
                            .status(OtaUpdateListParams.Filter.Status.IN_PROGRESS)
                            .type(OtaUpdateListParams.Filter.Type.SIM_CARD_NETWORK_PREFERENCES)
                            .build()
                    )
                    .page(OtaUpdateListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        otaUpdates.validate()
    }
}
