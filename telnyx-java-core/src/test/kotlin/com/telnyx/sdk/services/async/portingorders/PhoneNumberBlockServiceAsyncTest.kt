// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhoneNumberBlockServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberBlockServiceAsync = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlockFuture =
            phoneNumberBlockServiceAsync.create(
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

        val phoneNumberBlock = phoneNumberBlockFuture.get()
        phoneNumberBlock.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberBlockServiceAsync = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlocksFuture =
            phoneNumberBlockServiceAsync.list(
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
                            .value(PhoneNumberBlockListParams.Sort.Value_.CREATED_AT_DESC)
                            .build()
                    )
                    .build()
            )

        val phoneNumberBlocks = phoneNumberBlocksFuture.get()
        phoneNumberBlocks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val phoneNumberBlockServiceAsync = client.portingOrders().phoneNumberBlocks()

        val phoneNumberBlockFuture =
            phoneNumberBlockServiceAsync.delete(
                PhoneNumberBlockDeleteParams.builder()
                    .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val phoneNumberBlock = phoneNumberBlockFuture.get()
        phoneNumberBlock.validate()
    }
}
