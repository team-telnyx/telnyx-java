// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.portouts.PortoutListParams
import com.telnyx.api.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.api.models.portouts.PortoutUpdateStatusParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortoutServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val portoutFuture = portoutServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val portout = portoutFuture.get()
        portout.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val portoutsFuture =
            portoutServiceAsync.list(
                PortoutListParams.builder()
                    .filter(
                        PortoutListParams.Filter.builder()
                            .carrierName("carrier_name")
                            .countryCode("US")
                            .addCountryCodeIn("CA")
                            .addCountryCodeIn("US")
                            .focDate(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                            .insertedAt(
                                PortoutListParams.Filter.InsertedAt.builder()
                                    .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                    .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                    .build()
                            )
                            .phoneNumber("+13035551212")
                            .pon("pon")
                            .portedOutAt(
                                PortoutListParams.Filter.PortedOutAt.builder()
                                    .gte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                    .lte(OffsetDateTime.parse("2024-09-04T00:00:00.000Z"))
                                    .build()
                            )
                            .spid("spid")
                            .status(PortoutListParams.Filter.Status.PENDING)
                            .addStatusIn(PortoutListParams.Filter.StatusIn.PENDING)
                            .supportKey("PO_abc123")
                            .build()
                    )
                    .page(PortoutListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val portouts = portoutsFuture.get()
        portouts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRejectionCodes() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val responseFuture =
            portoutServiceAsync.listRejectionCodes(
                PortoutListRejectionCodesParams.builder()
                    .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                    .filter(PortoutListRejectionCodesParams.Filter.builder().code(1002L).build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val responseFuture =
            portoutServiceAsync.updateStatus(
                PortoutUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                    .reason("I do not recognize this transaction")
                    .hostMessaging(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
