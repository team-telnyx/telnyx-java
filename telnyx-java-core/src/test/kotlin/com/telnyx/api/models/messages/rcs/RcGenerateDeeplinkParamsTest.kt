// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages.rcs

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcGenerateDeeplinkParamsTest {

    @Test
    fun create() {
        RcGenerateDeeplinkParams.builder()
            .agentId("agent_id")
            .body("body")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RcGenerateDeeplinkParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RcGenerateDeeplinkParams.builder()
                .agentId("agent_id")
                .body("body")
                .phoneNumber("phone_number")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("body", "body")
                    .put("phone_number", "phone_number")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RcGenerateDeeplinkParams.builder().agentId("agent_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
