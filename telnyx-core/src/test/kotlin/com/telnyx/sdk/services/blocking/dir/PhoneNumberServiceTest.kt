// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.dir().phoneNumbers()

        val page = phoneNumberService.list("16635d38-75a6-4481-82e8-69af60e05011")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.dir().phoneNumbers()

        val response =
            phoneNumberService.add(
                PhoneNumberAddParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addDocument(
                        PhoneNumberAddParams.Document.builder()
                            .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                            .documentType(
                                PhoneNumberAddParams.Document.DocumentType.LETTER_OF_AUTHORIZATION
                            )
                            .description(
                                "LOA authorising Telnyx to register these numbers under the DIR."
                            )
                            .build()
                    )
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.dir().phoneNumbers()

        val phoneNumber =
            phoneNumberService.remove(
                PhoneNumberRemoveParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addPhoneNumber("+19493253498")
                    .build()
            )

        phoneNumber.validate()
    }
}
