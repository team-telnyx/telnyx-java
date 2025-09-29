// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderTest {

    @Test
    fun create() {
        val messagingHostedNumberOrder =
            MessagingHostedNumberOrder.builder()
                .id("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
                .addPhoneNumber(
                    HostedNumber.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .phoneNumber("+18665550001")
                        .recordType("messaging_hosted_number")
                        .status(HostedNumber.Status.PENDING)
                        .build()
                )
                .addPhoneNumber(
                    HostedNumber.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .phoneNumber("+18665550002")
                        .recordType("messaging_hosted_number")
                        .status(HostedNumber.Status.PENDING)
                        .build()
                )
                .recordType("messaging_hosted_number_order")
                .status(MessagingHostedNumberOrder.Status.PENDING)
                .build()

        assertThat(messagingHostedNumberOrder.id()).contains("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
        assertThat(messagingHostedNumberOrder.messagingProfileId())
            .contains("dc8f39ac-953d-4520-b93b-786ae87db0da")
        assertThat(messagingHostedNumberOrder.phoneNumbers().getOrNull())
            .containsExactly(
                HostedNumber.builder()
                    .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                    .phoneNumber("+18665550001")
                    .recordType("messaging_hosted_number")
                    .status(HostedNumber.Status.PENDING)
                    .build(),
                HostedNumber.builder()
                    .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                    .phoneNumber("+18665550002")
                    .recordType("messaging_hosted_number")
                    .status(HostedNumber.Status.PENDING)
                    .build(),
            )
        assertThat(messagingHostedNumberOrder.recordType())
            .contains("messaging_hosted_number_order")
        assertThat(messagingHostedNumberOrder.status())
            .contains(MessagingHostedNumberOrder.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingHostedNumberOrder =
            MessagingHostedNumberOrder.builder()
                .id("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
                .addPhoneNumber(
                    HostedNumber.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .phoneNumber("+18665550001")
                        .recordType("messaging_hosted_number")
                        .status(HostedNumber.Status.PENDING)
                        .build()
                )
                .addPhoneNumber(
                    HostedNumber.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .phoneNumber("+18665550002")
                        .recordType("messaging_hosted_number")
                        .status(HostedNumber.Status.PENDING)
                        .build()
                )
                .recordType("messaging_hosted_number_order")
                .status(MessagingHostedNumberOrder.Status.PENDING)
                .build()

        val roundtrippedMessagingHostedNumberOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingHostedNumberOrder),
                jacksonTypeRef<MessagingHostedNumberOrder>(),
            )

        assertThat(roundtrippedMessagingHostedNumberOrder).isEqualTo(messagingHostedNumberOrder)
    }
}
