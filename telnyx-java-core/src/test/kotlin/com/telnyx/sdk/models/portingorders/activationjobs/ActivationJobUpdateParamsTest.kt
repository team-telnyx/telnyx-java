// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.activationjobs

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActivationJobUpdateParamsTest {

    @Test
    fun create() {
        ActivationJobUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .activateAt(OffsetDateTime.parse("2019-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActivationJobUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActivationJobUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activateAt(OffsetDateTime.parse("2019-01-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.activateAt()).contains(OffsetDateTime.parse("2019-01-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActivationJobUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
