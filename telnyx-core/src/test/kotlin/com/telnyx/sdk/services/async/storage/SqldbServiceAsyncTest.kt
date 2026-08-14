// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.sqldbs.SqldbCreateParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SqldbServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sqldbServiceAsync = client.storage().sqldbs()

        val sqlDatabaseResponseWrapperFuture =
            sqldbServiceAsync.create(SqldbCreateParams.builder().name("my-database").build())

        val sqlDatabaseResponseWrapper = sqlDatabaseResponseWrapperFuture.get()
        sqlDatabaseResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sqldbServiceAsync = client.storage().sqldbs()

        val sqlDatabaseResponseWrapperFuture =
            sqldbServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val sqlDatabaseResponseWrapper = sqlDatabaseResponseWrapperFuture.get()
        sqlDatabaseResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sqldbServiceAsync = client.storage().sqldbs()

        val pageFuture = sqldbServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sqldbServiceAsync = client.storage().sqldbs()

        val future =
            sqldbServiceAsync.delete(
                SqldbDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .force(true)
                    .build()
            )

        val response = future.get()
    }
}
