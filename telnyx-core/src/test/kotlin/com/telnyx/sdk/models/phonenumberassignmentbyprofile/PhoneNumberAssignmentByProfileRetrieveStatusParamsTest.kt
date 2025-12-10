// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberassignmentbyprofile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileRetrieveStatusParamsTest {

    @Test
    fun create() {
        PhoneNumberAssignmentByProfileRetrieveStatusParams.builder().taskId("taskId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberAssignmentByProfileRetrieveStatusParams.builder().taskId("taskId").build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
