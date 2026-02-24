// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import com.telnyx.sdk.models.numberorders.NumberOrderCreateParams
import com.telnyx.sdk.models.numberorders.NumberOrderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberOrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberOrderService = client.numberOrders()

        val numberOrder =
            numberOrderService.create(
                NumberOrderCreateParams.builder()
                    .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                    .connectionId("346789098765567")
                    .customerReference("MY REF 001")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                    .addPhoneNumber(
                        NumberOrderCreateParams.PhoneNumber.builder()
                            .phoneNumber("+19705555098")
                            .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                            .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                            .build()
                    )
                    .addPhoneNumber(
                        NumberOrderCreateParams.PhoneNumber.builder()
                            .phoneNumber("+492111609539")
                            .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                            .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                            .build()
                    )
                    .build()
            )

        numberOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberOrderService = client.numberOrders()

        val numberOrder = numberOrderService.retrieve("number_order_id")

        numberOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberOrderService = client.numberOrders()

        val numberOrder =
            numberOrderService.update(
                NumberOrderUpdateParams.builder()
                    .numberOrderId("number_order_id")
                    .customerReference("MY REF 001")
                    .addRegulatoryRequirement(
                        UpdateRegulatoryRequirement.builder()
                            .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .build()
            )

        numberOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberOrderService = client.numberOrders()

        val page = numberOrderService.list()

        page.response().validate()
    }
}
