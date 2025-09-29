// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.callevents.CallEventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallEventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callEventServiceAsync = client.callEvents()

        val callEventsFuture =
            callEventServiceAsync.list(
                CallEventListParams.builder()
                    .filter(
                        CallEventListParams.Filter.builder()
                            .applicationName(
                                CallEventListParams.Filter.ApplicationName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .applicationSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .connectionId("connection_id")
                            .failed(false)
                            .from("+12025550142")
                            .legId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .occurredAt(
                                CallEventListParams.Filter.OccurredAt.builder()
                                    .eq("2019-03-29T11:10:00Z")
                                    .gt("2019-03-29T11:10:00Z")
                                    .gte("2019-03-29T11:10:00Z")
                                    .lt("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .outboundOutboundVoiceProfileId("outbound.outbound_voice_profile_id")
                            .product(CallEventListParams.Filter.Product.TEXML)
                            .status(CallEventListParams.Filter.Status.INIT)
                            .to("+12025550142")
                            .type(CallEventListParams.Filter.Type.WEBHOOK)
                            .build()
                    )
                    .page(
                        CallEventListParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        val callEvents = callEventsFuture.get()
        callEvents.validate()
    }
}
