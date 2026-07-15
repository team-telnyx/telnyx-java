// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirements

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementRetrieveParamsTest {

    @Test
    fun create() {
        RequirementRetrieveParams.builder()
            .id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RequirementRetrieveParams.builder().id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa").build()

        assertThat(params._pathParam(0)).isEqualTo("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RequirementRetrieveParams.builder()
                .id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa")
                .version(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("version", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RequirementRetrieveParams.builder().id("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
