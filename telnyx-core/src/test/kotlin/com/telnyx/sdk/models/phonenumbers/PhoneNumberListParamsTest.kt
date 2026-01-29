// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListParamsTest {

    @Test
    fun create() {
        PhoneNumberListParams.builder()
            .filter(
                PhoneNumberListParams.Filter.builder()
                    .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .connectionId("1521916448077776306")
                    .countryIsoAlpha2("US")
                    .customerReference("customer_reference")
                    .emergencyAddressId("9102160989215728032")
                    .numberType(
                        PhoneNumberListParams.Filter.NumberType.builder()
                            .eq(PhoneNumberListParams.Filter.NumberType.Eq.LOCAL)
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .source(PhoneNumberListParams.Filter.Source.PORTED)
                    .status(PhoneNumberListParams.Filter.Status.ACTIVE)
                    .tag("tag")
                    .voiceConnectionName(
                        PhoneNumberListParams.Filter.VoiceConnectionName.builder()
                            .contains("test")
                            .endsWith("test")
                            .eq("test")
                            .startsWith("test")
                            .build()
                    )
                    .voiceUsagePaymentMethod(
                        PhoneNumberListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                    )
                    .withoutTags(PhoneNumberListParams.Filter.WithoutTags.TRUE)
                    .build()
            )
            .handleMessagingProfileError(PhoneNumberListParams.HandleMessagingProfileError.FALSE)
            .pageNumber(0L)
            .pageSize(0L)
            .sort(PhoneNumberListParams.Sort.CONNECTION_NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberListParams.builder()
                .filter(
                    PhoneNumberListParams.Filter.builder()
                        .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                        .connectionId("1521916448077776306")
                        .countryIsoAlpha2("US")
                        .customerReference("customer_reference")
                        .emergencyAddressId("9102160989215728032")
                        .numberType(
                            PhoneNumberListParams.Filter.NumberType.builder()
                                .eq(PhoneNumberListParams.Filter.NumberType.Eq.LOCAL)
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .source(PhoneNumberListParams.Filter.Source.PORTED)
                        .status(PhoneNumberListParams.Filter.Status.ACTIVE)
                        .tag("tag")
                        .voiceConnectionName(
                            PhoneNumberListParams.Filter.VoiceConnectionName.builder()
                                .contains("test")
                                .endsWith("test")
                                .eq("test")
                                .startsWith("test")
                                .build()
                        )
                        .voiceUsagePaymentMethod(
                            PhoneNumberListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                        )
                        .withoutTags(PhoneNumberListParams.Filter.WithoutTags.TRUE)
                        .build()
                )
                .handleMessagingProfileError(
                    PhoneNumberListParams.HandleMessagingProfileError.FALSE
                )
                .pageNumber(0L)
                .pageSize(0L)
                .sort(PhoneNumberListParams.Sort.CONNECTION_NAME)
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
                    .put("filter[without_tags]", "true")
                    .put("handle_messaging_profile_error", "false")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "connection_name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
