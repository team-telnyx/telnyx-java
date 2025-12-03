// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberBlockServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberBlockService = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlocks =
            phoneNumberBlockService.list(
                PhoneNumberBlockListParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(
                        PhoneNumberBlockListParams.Filter.builder()
                            .activationStatus(
                                PhoneNumberBlockListParams.Filter.ActivationStatus.ACTIVE
                            )
                            .addPhoneNumber("+12003151212")
                            .portabilityStatus(
                                PhoneNumberBlockListParams.Filter.PortabilityStatus.CONFIRMED
                            )
                            .addPortingOrderId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                            .status(
                                PhoneNumberBlockListParams.Filter.Status.UnionMember0.IN_PROCESS
                            )
                            .supportKey("sr_a12345")
                            .build()
                    )
                    .page(PhoneNumberBlockListParams.Page.builder().number(1L).size(1L).build())
                    .sort(
                        PhoneNumberBlockListParams.Sort.builder()
                            .value(PhoneNumberBlockListParams.Sort.Value_.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        phoneNumberBlocks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
