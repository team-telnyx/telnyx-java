// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InexplicitNumberOrderCreateParamsTest {

    @Test
    fun create() {
        InexplicitNumberOrderCreateParams.builder()
            .addOrderingGroup(
                InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                    .countRequested("count_requested")
                    .countryIso(InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US)
                    .phoneNumberType("phone_number_type")
                    .administrativeArea("administrative_area")
                    .addFeature("string")
                    .locality("locality")
                    .nationalDestinationCode("national_destination_code")
                    .phoneNumber(
                        InexplicitNumberOrderCreateParams.OrderingGroup.PhoneNumber.builder()
                            .contains("contains")
                            .endsWith("ends_with")
                            .startsWith("starts_with")
                            .build()
                    )
                    .strategy(InexplicitNumberOrderCreateParams.OrderingGroup.Strategy.ALWAYS)
                    .build()
            )
            .billingGroupId("billing_group_id")
            .connectionId("connection_id")
            .customerReference("customer_reference")
            .messagingProfileId("messaging_profile_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            InexplicitNumberOrderCreateParams.builder()
                .addOrderingGroup(
                    InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                        .countRequested("count_requested")
                        .countryIso(InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US)
                        .phoneNumberType("phone_number_type")
                        .administrativeArea("administrative_area")
                        .addFeature("string")
                        .locality("locality")
                        .nationalDestinationCode("national_destination_code")
                        .phoneNumber(
                            InexplicitNumberOrderCreateParams.OrderingGroup.PhoneNumber.builder()
                                .contains("contains")
                                .endsWith("ends_with")
                                .startsWith("starts_with")
                                .build()
                        )
                        .strategy(InexplicitNumberOrderCreateParams.OrderingGroup.Strategy.ALWAYS)
                        .build()
                )
                .billingGroupId("billing_group_id")
                .connectionId("connection_id")
                .customerReference("customer_reference")
                .messagingProfileId("messaging_profile_id")
                .build()

        val body = params._body()

        assertThat(body.orderingGroups())
            .containsExactly(
                InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                    .countRequested("count_requested")
                    .countryIso(InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US)
                    .phoneNumberType("phone_number_type")
                    .administrativeArea("administrative_area")
                    .addFeature("string")
                    .locality("locality")
                    .nationalDestinationCode("national_destination_code")
                    .phoneNumber(
                        InexplicitNumberOrderCreateParams.OrderingGroup.PhoneNumber.builder()
                            .contains("contains")
                            .endsWith("ends_with")
                            .startsWith("starts_with")
                            .build()
                    )
                    .strategy(InexplicitNumberOrderCreateParams.OrderingGroup.Strategy.ALWAYS)
                    .build()
            )
        assertThat(body.billingGroupId()).contains("billing_group_id")
        assertThat(body.connectionId()).contains("connection_id")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.messagingProfileId()).contains("messaging_profile_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InexplicitNumberOrderCreateParams.builder()
                .addOrderingGroup(
                    InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                        .countRequested("count_requested")
                        .countryIso(InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US)
                        .phoneNumberType("phone_number_type")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.orderingGroups())
            .containsExactly(
                InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                    .countRequested("count_requested")
                    .countryIso(InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US)
                    .phoneNumberType("phone_number_type")
                    .build()
            )
    }
}
