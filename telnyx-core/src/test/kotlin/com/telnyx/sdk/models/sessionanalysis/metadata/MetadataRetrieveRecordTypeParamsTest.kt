// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataRetrieveRecordTypeParamsTest {

    @Test
    fun create() {
        MetadataRetrieveRecordTypeParams.builder().recordType("record_type").build()
    }

    @Test
    fun pathParams() {
        val params = MetadataRetrieveRecordTypeParams.builder().recordType("record_type").build()

        assertThat(params._pathParam(0)).isEqualTo("record_type")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
