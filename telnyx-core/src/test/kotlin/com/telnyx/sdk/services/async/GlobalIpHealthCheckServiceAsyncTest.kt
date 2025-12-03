// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpHealthCheckServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpHealthCheckServiceAsync = client.globalIpHealthChecks()

        val globalIpHealthCheckFuture =
            globalIpHealthCheckServiceAsync.create(
                GlobalIpHealthCheckCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .healthCheckParams(
                        GlobalIpHealthCheckCreateParams.HealthCheckParams.builder()
                            .putAdditionalProperty("path", JsonValue.from("bar"))
                            .putAdditionalProperty("port", JsonValue.from("bar"))
                            .build()
                    )
                    .healthCheckType("http_status_2xx")
                    .build()
            )

        val globalIpHealthCheck = globalIpHealthCheckFuture.get()
        globalIpHealthCheck.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpHealthCheckServiceAsync = client.globalIpHealthChecks()

        val globalIpHealthCheckFuture =
            globalIpHealthCheckServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpHealthCheck = globalIpHealthCheckFuture.get()
        globalIpHealthCheck.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpHealthCheckServiceAsync = client.globalIpHealthChecks()

        val pageFuture = globalIpHealthCheckServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpHealthCheckServiceAsync = client.globalIpHealthChecks()

        val globalIpHealthCheckFuture =
            globalIpHealthCheckServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpHealthCheck = globalIpHealthCheckFuture.get()
        globalIpHealthCheck.validate()
    }
}
