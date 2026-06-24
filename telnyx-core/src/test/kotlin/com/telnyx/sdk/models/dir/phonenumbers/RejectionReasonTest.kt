// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RejectionReasonTest {

    @Test
    fun create() {
        val rejectionReason =
            RejectionReason.builder()
                .code("documentation_incomplete")
                .detail("Provided documents do not establish business identity.")
                .message("Please re-upload a clearer scan of the certificate.")
                .title("Documentation incomplete")
                .build()

        assertThat(rejectionReason.code()).contains("documentation_incomplete")
        assertThat(rejectionReason.detail())
            .contains("Provided documents do not establish business identity.")
        assertThat(rejectionReason.message())
            .contains("Please re-upload a clearer scan of the certificate.")
        assertThat(rejectionReason.title()).contains("Documentation incomplete")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rejectionReason =
            RejectionReason.builder()
                .code("documentation_incomplete")
                .detail("Provided documents do not establish business identity.")
                .message("Please re-upload a clearer scan of the certificate.")
                .title("Documentation incomplete")
                .build()

        val roundtrippedRejectionReason =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rejectionReason),
                jacksonTypeRef<RejectionReason>(),
            )

        assertThat(roundtrippedRejectionReason).isEqualTo(rejectionReason)
    }
}
