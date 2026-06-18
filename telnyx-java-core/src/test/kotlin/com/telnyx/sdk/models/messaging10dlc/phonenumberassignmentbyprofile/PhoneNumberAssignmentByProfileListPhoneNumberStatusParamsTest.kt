// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileListPhoneNumberStatusParamsTest {

    @Test
    fun create() {
        PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.builder()
            .taskId("taskId")
            .page(0L)
            .recordsPerPage(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.builder()
                .taskId("taskId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.builder()
                .taskId("taskId")
                .page(0L)
                .recordsPerPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "0").put("recordsPerPage", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.builder()
                .taskId("taskId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
