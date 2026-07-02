// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.kvs

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.kvs.keys.KeyDeleteParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyListParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyRetrieveParams
import com.telnyx.sdk.models.storage.kvs.keys.KeyUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class KeyServiceAsyncTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.storage().kvs().keys()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val keyFuture =
            keyServiceAsync.retrieve(
                KeyRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .key("key")
                    .build()
            )

        val key = keyFuture.get()
        assertThat(key.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.storage().kvs().keys()

        val future =
            keyServiceAsync.update(
                KeyUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .key("key")
                    .ttlSecs(1L)
                    .body("Example data")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.storage().kvs().keys()

        val keysFuture =
            keyServiceAsync.list(
                KeyListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(1L)
                    .prefix("prefix")
                    .build()
            )

        val keys = keysFuture.get()
        keys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.storage().kvs().keys()

        val future =
            keyServiceAsync.delete(
                KeyDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .key("key")
                    .build()
            )

        val response = future.get()
    }
}
