// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationRetrieveParamsTest {

    @Test
    fun create() {
        MigrationRetrieveParams.builder().id("").build()
    }

    @Test
    fun pathParams() {
        val params = MigrationRetrieveParams.builder().id("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
