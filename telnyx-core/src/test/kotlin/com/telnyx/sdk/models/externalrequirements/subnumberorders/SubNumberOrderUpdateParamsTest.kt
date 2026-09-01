// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalrequirements.subnumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderUpdateParamsTest {

    @Test
    fun create() {
        SubNumberOrderUpdateParams.builder()
            .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .requirement(
                SubNumberOrderUpdateParams.Requirement.builder()
                    .firstName("Jane")
                    .lastName("Doe")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrderUpdateParams.builder()
                .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requirement(
                    SubNumberOrderUpdateParams.Requirement.builder()
                        .firstName("Jane")
                        .lastName("Doe")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubNumberOrderUpdateParams.builder()
                .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requirement(
                    SubNumberOrderUpdateParams.Requirement.builder()
                        .firstName("Jane")
                        .lastName("Doe")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requirement())
            .isEqualTo(
                SubNumberOrderUpdateParams.Requirement.builder()
                    .firstName("Jane")
                    .lastName("Doe")
                    .build()
            )
    }
}
