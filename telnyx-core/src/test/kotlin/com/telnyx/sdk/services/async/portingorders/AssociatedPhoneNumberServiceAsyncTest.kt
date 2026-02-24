// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val associatedPhoneNumberServiceAsync = client.portingOrders().associatedPhoneNumbers()

        val associatedPhoneNumberFuture =
            associatedPhoneNumberServiceAsync.create(
                AssociatedPhoneNumberCreateParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .action(AssociatedPhoneNumberCreateParams.Action.KEEP)
                    .phoneNumberRange(
                        AssociatedPhoneNumberCreateParams.PhoneNumberRange.builder()
                            .endAt("+441234567899")
                            .startAt("+441234567890")
                            .build()
                    )
                    .build()
            )

        val associatedPhoneNumber = associatedPhoneNumberFuture.get()
        associatedPhoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val associatedPhoneNumberServiceAsync = client.portingOrders().associatedPhoneNumbers()

        val pageFuture =
            associatedPhoneNumberServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val associatedPhoneNumberServiceAsync = client.portingOrders().associatedPhoneNumbers()

        val associatedPhoneNumberFuture =
            associatedPhoneNumberServiceAsync.delete(
                AssociatedPhoneNumberDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val associatedPhoneNumber = associatedPhoneNumberFuture.get()
        associatedPhoneNumber.validate()
    }
}
