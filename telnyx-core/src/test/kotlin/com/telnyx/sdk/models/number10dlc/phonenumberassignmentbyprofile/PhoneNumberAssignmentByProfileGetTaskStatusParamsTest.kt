// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileGetTaskStatusParamsTest {

    @Test
    fun create() {
        PhoneNumberAssignmentByProfileGetTaskStatusParams.builder().taskId("taskId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberAssignmentByProfileGetTaskStatusParams.builder().taskId("taskId").build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
