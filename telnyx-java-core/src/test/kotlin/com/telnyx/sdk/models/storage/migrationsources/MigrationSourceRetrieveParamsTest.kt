// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceRetrieveParamsTest {

    @Test
    fun create() {
        MigrationSourceRetrieveParams.builder().id("").build()
    }

    @Test
    fun pathParams() {
        val params = MigrationSourceRetrieveParams.builder().id("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
