// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.sqldbs.SqldbCreateParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SqldbServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sqldbService = client.storage().sqldbs()

        val sqlDatabaseResponseWrapper =
            sqldbService.create(SqldbCreateParams.builder().name("my-database").build())

        sqlDatabaseResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sqldbService = client.storage().sqldbs()

        val sqlDatabaseResponseWrapper =
            sqldbService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        sqlDatabaseResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sqldbService = client.storage().sqldbs()

        val page = sqldbService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sqldbService = client.storage().sqldbs()

        sqldbService.delete(
            SqldbDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .force(true)
                .build()
        )
    }
}
