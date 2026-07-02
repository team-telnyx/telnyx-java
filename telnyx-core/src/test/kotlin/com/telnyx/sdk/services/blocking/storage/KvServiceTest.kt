// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KvServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val kvService = client.storage().kvs()

        val kvNamespaceResponseWrapper =
            kvService.create(KvCreateParams.builder().name("my-cache").build())

        kvNamespaceResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val kvService = client.storage().kvs()

        val kvNamespaceResponseWrapper = kvService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        kvNamespaceResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val kvService = client.storage().kvs()

        val page = kvService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val kvService = client.storage().kvs()

        val kvNamespaceResponseWrapper = kvService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        kvNamespaceResponseWrapper.validate()
    }
}
