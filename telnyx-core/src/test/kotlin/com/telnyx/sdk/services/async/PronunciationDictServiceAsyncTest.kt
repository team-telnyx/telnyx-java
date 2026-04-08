// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PronunciationDictServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pronunciationDictServiceAsync = client.pronunciationDicts()

        val pronunciationDictFuture =
            pronunciationDictServiceAsync.create(
                PronunciationDictCreateParams.builder()
                    .addItem(
                        PronunciationDictCreateParams.Item.Alias.builder()
                            .alias("tel-nicks")
                            .text("Telnyx")
                            .build()
                    )
                    .name("Brand Names")
                    .build()
            )

        val pronunciationDict = pronunciationDictFuture.get()
        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pronunciationDictServiceAsync = client.pronunciationDicts()

        val pronunciationDictFuture =
            pronunciationDictServiceAsync.retrieve("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")

        val pronunciationDict = pronunciationDictFuture.get()
        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pronunciationDictServiceAsync = client.pronunciationDicts()

        val pronunciationDictFuture =
            pronunciationDictServiceAsync.update(
                PronunciationDictUpdateParams.builder()
                    .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                    .addItem(
                        PronunciationDictUpdateParams.Item.Alias.builder()
                            .alias("tel-nicks")
                            .text("Telnyx")
                            .build()
                    )
                    .name("Updated Brand Names")
                    .build()
            )

        val pronunciationDict = pronunciationDictFuture.get()
        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pronunciationDictServiceAsync = client.pronunciationDicts()

        val pageFuture = pronunciationDictServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pronunciationDictServiceAsync = client.pronunciationDicts()

        val future = pronunciationDictServiceAsync.delete("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")

        val response = future.get()
    }
}
