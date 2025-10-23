// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantRetrieveParamsTest {

    @Test
    fun create() {
        AssistantRetrieveParams.builder()
            .assistantId("assistant_id")
            .callControlId("call_control_id")
            .fetchDynamicVariablesFromWebhook(true)
            .from("from")
            .to("to")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AssistantRetrieveParams.builder().assistantId("assistant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssistantRetrieveParams.builder()
                .assistantId("assistant_id")
                .callControlId("call_control_id")
                .fetchDynamicVariablesFromWebhook(true)
                .from("from")
                .to("to")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("call_control_id", "call_control_id")
                    .put("fetch_dynamic_variables_from_webhook", "true")
                    .put("from", "from")
                    .put("to", "to")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssistantRetrieveParams.builder().assistantId("assistant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
