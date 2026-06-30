// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderUpdateParamsTest {

    @Test
    fun create() {
        SubNumberOrderUpdateParams.builder()
            .subNumberOrderId("sub_number_order_id")
            .addRegulatoryRequirement(
                UpdateRegulatoryRequirement.builder()
                    .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                    .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrderUpdateParams.builder().subNumberOrderId("sub_number_order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_number_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubNumberOrderUpdateParams.builder()
                .subNumberOrderId("sub_number_order_id")
                .addRegulatoryRequirement(
                    UpdateRegulatoryRequirement.builder()
                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.regulatoryRequirements().getOrNull())
            .containsExactly(
                UpdateRegulatoryRequirement.builder()
                    .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                    .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubNumberOrderUpdateParams.builder().subNumberOrderId("sub_number_order_id").build()

        val body = params._body()
    }
}
