// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PronunciationDictServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val pronunciationDictService = client.pronunciationDicts()

        val pronunciationDict =
            pronunciationDictService.create(
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

        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val pronunciationDictService = client.pronunciationDicts()

        val pronunciationDict =
            pronunciationDictService.retrieve("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")

        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val pronunciationDictService = client.pronunciationDicts()

        val pronunciationDict =
            pronunciationDictService.update(
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

        pronunciationDict.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val pronunciationDictService = client.pronunciationDicts()

        val page = pronunciationDictService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val pronunciationDictService = client.pronunciationDicts()

        pronunciationDictService.delete("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
    }
}
