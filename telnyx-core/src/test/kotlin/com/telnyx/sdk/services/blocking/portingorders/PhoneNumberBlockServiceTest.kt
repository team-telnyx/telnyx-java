// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberBlockService = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlock =
            phoneNumberBlockService.create(
                PhoneNumberBlockCreateParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addActivationRange(
                        PhoneNumberBlockCreateParams.ActivationRange.builder()
                            .endAt("+4930244999910")
                            .startAt("+4930244999901")
                            .build()
                    )
                    .phoneNumberRange(
                        PhoneNumberBlockCreateParams.PhoneNumberRange.builder()
                            .endAt("+4930244999910")
                            .startAt("+4930244999901")
                            .build()
                    )
                    .build()
            )

        phoneNumberBlock.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberBlockService = client.portingOrders().phoneNumberBlocks()

        val page = phoneNumberBlockService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberBlockService = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlock =
            phoneNumberBlockService.delete(
                PhoneNumberBlockDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        phoneNumberBlock.validate()
    }
}
