// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val associatedPhoneNumberService = client.portingOrders().associatedPhoneNumbers()

        val associatedPhoneNumber =
            associatedPhoneNumberService.create(
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

        associatedPhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val associatedPhoneNumberService = client.portingOrders().associatedPhoneNumbers()

        val page = associatedPhoneNumberService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val associatedPhoneNumberService = client.portingOrders().associatedPhoneNumbers()

        val associatedPhoneNumber =
            associatedPhoneNumberService.delete(
                AssociatedPhoneNumberDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        associatedPhoneNumber.validate()
    }
}
