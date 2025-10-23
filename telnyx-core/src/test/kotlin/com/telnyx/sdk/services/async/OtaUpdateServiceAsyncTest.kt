// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.otaupdates.OtaUpdateListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OtaUpdateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val otaUpdateServiceAsync = client.otaUpdates()

        val otaUpdateFuture = otaUpdateServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val otaUpdate = otaUpdateFuture.get()
        otaUpdate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val otaUpdateServiceAsync = client.otaUpdates()

        val otaUpdatesFuture =
            otaUpdateServiceAsync.list(
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

        val otaUpdates = otaUpdatesFuture.get()
        otaUpdates.validate()
    }
}
