// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberSlimListParamsTest {

    @Test
    fun create() {
        PhoneNumberSlimListParams.builder()
            .filter(
                PhoneNumberSlimListParams.Filter.builder()
                    .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .connectionId("1521916448077776306")
                    .countryIsoAlpha2("US")
                    .customerReference("customer_reference")
                    .emergencyAddressId("9102160989215728032")
                    .numberType(
                        PhoneNumberSlimListParams.Filter.NumberType.builder()
                            .eq(PhoneNumberSlimListParams.Filter.NumberType.Eq.LOCAL)
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .source(PhoneNumberSlimListParams.Filter.Source.PORTED)
                    .status(PhoneNumberSlimListParams.Filter.Status.ACTIVE)
                    .tag("tag")
                    .voiceConnectionName(
                        PhoneNumberSlimListParams.Filter.VoiceConnectionName.builder()
                            .contains("test")
                            .endsWith("test")
                            .eq("test")
                            .startsWith("test")
                            .build()
                    )
                    .voiceUsagePaymentMethod(
                        PhoneNumberSlimListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                    )
                    .build()
            )
            .includeConnection(true)
            .includeTags(true)
            .page(PhoneNumberSlimListParams.Page.builder().number(1L).size(1L).build())
            .sort(PhoneNumberSlimListParams.Sort.CONNECTION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberSlimListParams.builder()
                .filter(
                    PhoneNumberSlimListParams.Filter.builder()
                        .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                        .connectionId("1521916448077776306")
                        .countryIsoAlpha2("US")
                        .customerReference("customer_reference")
                        .emergencyAddressId("9102160989215728032")
                        .numberType(
                            PhoneNumberSlimListParams.Filter.NumberType.builder()
                                .eq(PhoneNumberSlimListParams.Filter.NumberType.Eq.LOCAL)
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .source(PhoneNumberSlimListParams.Filter.Source.PORTED)
                        .status(PhoneNumberSlimListParams.Filter.Status.ACTIVE)
                        .tag("tag")
                        .voiceConnectionName(
                            PhoneNumberSlimListParams.Filter.VoiceConnectionName.builder()
                                .contains("test")
                                .endsWith("test")
                                .eq("test")
                                .startsWith("test")
                                .build()
                        )
                        .voiceUsagePaymentMethod(
                            PhoneNumberSlimListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                        )
                        .build()
                )
                .includeConnection(true)
                .includeTags(true)
                .page(PhoneNumberSlimListParams.Page.builder().number(1L).size(1L).build())
                .sort(PhoneNumberSlimListParams.Sort.CONNECTION_NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[billing_group_id]", "62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .put("filter[connection_id]", "1521916448077776306")
                    .put("filter[country_iso_alpha2]", "US")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[emergency_address_id]", "9102160989215728032")
                    .put("filter[number_type][eq]", "local")
                    .put("filter[phone_number]", "phone_number")
                    .put("filter[source]", "ported")
                    .put("filter[status]", "active")
                    .put("filter[tag]", "tag")
                    .put("filter[voice.connection_name][contains]", "test")
                    .put("filter[voice.connection_name][ends_with]", "test")
                    .put("filter[voice.connection_name][eq]", "test")
                    .put("filter[voice.connection_name][starts_with]", "test")
                    .put("filter[voice.usage_payment_method]", "channel")
                    .put("include_connection", "true")
                    .put("include_tags", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "connection_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberSlimListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
