// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.dir().phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list("16635d38-75a6-4481-82e8-69af60e05011")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.dir().phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.add(
                PhoneNumberAddParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addDocument(
                        Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(Document.DocumentType.LETTER_OF_AUTHORIZATION)
                            .description(
                                "LOA authorising Telnyx to register these numbers under the DIR."
                            )
                            .build()
                    )
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.dir().phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.remove(
                PhoneNumberRemoveParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addPhoneNumber("+19493253498")
                    .build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }
}
