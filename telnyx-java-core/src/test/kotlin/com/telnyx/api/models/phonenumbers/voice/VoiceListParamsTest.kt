// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voice

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceListParamsTest {

    @Test
    fun create() {
        VoiceListParams.builder()
            .filter(
                VoiceListParams.Filter.builder()
                    .connectionName(
                        VoiceListParams.Filter.ConnectionName.builder().contains("test").build()
                    )
                    .customerReference("customer_reference")
                    .phoneNumber("phone_number")
                    .voiceUsagePaymentMethod(VoiceListParams.Filter.VoiceUsagePaymentMethod.CHANNEL)
                    .build()
            )
            .page(VoiceListParams.Page.builder().number(1L).size(1L).build())
            .sort(VoiceListParams.Sort.CONNECTION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VoiceListParams.builder()
                .filter(
                    VoiceListParams.Filter.builder()
                        .connectionName(
                            VoiceListParams.Filter.ConnectionName.builder().contains("test").build()
                        )
                        .customerReference("customer_reference")
                        .phoneNumber("phone_number")
                        .voiceUsagePaymentMethod(
                            VoiceListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                        )
                        .build()
                )
                .page(VoiceListParams.Page.builder().number(1L).size(1L).build())
                .sort(VoiceListParams.Sort.CONNECTION_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_name][contains]", "test")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[phone_number]", "phone_number")
                    .put("filter[voice.usage_payment_method]", "channel")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "connection_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VoiceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
