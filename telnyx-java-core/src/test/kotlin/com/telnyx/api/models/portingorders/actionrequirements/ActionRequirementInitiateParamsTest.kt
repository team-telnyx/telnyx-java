// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actionrequirements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequirementInitiateParamsTest {

    @Test
    fun create() {
        ActionRequirementInitiateParams.builder()
            .portingOrderId("porting_order_id")
            .id("id")
            .params(
                ActionRequirementInitiateParams.Params.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRequirementInitiateParams.builder()
                .portingOrderId("porting_order_id")
                .id("id")
                .params(
                    ActionRequirementInitiateParams.Params.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("porting_order_id")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRequirementInitiateParams.builder()
                .portingOrderId("porting_order_id")
                .id("id")
                .params(
                    ActionRequirementInitiateParams.Params.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.params())
            .isEqualTo(
                ActionRequirementInitiateParams.Params.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .build()
            )
    }
}
