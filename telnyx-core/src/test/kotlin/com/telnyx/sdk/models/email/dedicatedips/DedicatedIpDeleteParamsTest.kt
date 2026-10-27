// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedicatedIpDeleteParamsTest {

    @Test
    fun create() {
        DedicatedIpDeleteParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .queryDrain(true)
            .queryForce(true)
            .queryReason("reason")
            .bodyDrain(true)
            .bodyForce(true)
            .bodyReason("No longer needed")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DedicatedIpDeleteParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DedicatedIpDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryDrain(true)
                .queryForce(true)
                .queryReason("reason")
                .bodyDrain(true)
                .bodyForce(true)
                .bodyReason("No longer needed")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("drain", "true")
                    .put("force", "true")
                    .put("reason", "reason")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DedicatedIpDeleteParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DedicatedIpDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryDrain(true)
                .queryForce(true)
                .queryReason("reason")
                .bodyDrain(true)
                .bodyForce(true)
                .bodyReason("No longer needed")
                .build()

        val body = params._body()

        assertThat(body.bodyDrain()).contains(true)
        assertThat(body.bodyForce()).contains(true)
        assertThat(body.bodyReason()).contains("No longer needed")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DedicatedIpDeleteParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
