// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordRetrieveParamsTest {

    @Test
    fun create() {
        CustomerServiceRecordRetrieveParams.builder()
            .customerServiceRecordId("customer_service_record_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerServiceRecordRetrieveParams.builder()
                .customerServiceRecordId("customer_service_record_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_service_record_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
