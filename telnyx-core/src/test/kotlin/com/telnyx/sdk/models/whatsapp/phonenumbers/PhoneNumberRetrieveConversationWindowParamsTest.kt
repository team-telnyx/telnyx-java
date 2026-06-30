// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrieveConversationWindowParamsTest {

    @Test
    fun create() {
        PhoneNumberRetrieveConversationWindowParams.builder()
            .phoneNumber("phone_number")
            .destinationNumber("+353894650851")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberRetrieveConversationWindowParams.builder()
                .phoneNumber("phone_number")
                .destinationNumber("+353894650851")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberRetrieveConversationWindowParams.builder()
                .phoneNumber("phone_number")
                .destinationNumber("+353894650851")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("destination_number", "+353894650851").build())
    }
}
