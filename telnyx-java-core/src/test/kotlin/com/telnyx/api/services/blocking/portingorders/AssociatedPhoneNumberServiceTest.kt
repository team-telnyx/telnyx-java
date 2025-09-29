// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssociatedPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val associatedPhoneNumberService = client.portingOrders().associatedPhoneNumbers()

        val associatedPhoneNumbers =
            associatedPhoneNumberService.list(
                AssociatedPhoneNumberListParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(
                        AssociatedPhoneNumberListParams.Filter.builder()
                            .action(AssociatedPhoneNumberListParams.Filter.Action.KEEP)
                            .phoneNumber("+441234567890")
                            .build()
                    )
                    .page(
                        AssociatedPhoneNumberListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .sort(
                        AssociatedPhoneNumberListParams.Sort.builder()
                            .value(AssociatedPhoneNumberListParams.Sort.Value.CREATED_AT_DESC)
                            .build()
                    )
                    .build()
            )

        associatedPhoneNumbers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
