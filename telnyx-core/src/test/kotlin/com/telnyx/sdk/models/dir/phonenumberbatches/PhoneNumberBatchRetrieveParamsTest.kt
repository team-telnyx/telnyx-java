// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchRetrieveParamsTest {

    @Test
    fun create() {
        PhoneNumberBatchRetrieveParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberBatchRetrieveParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        assertThat(params._pathParam(1)).isEqualTo("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
