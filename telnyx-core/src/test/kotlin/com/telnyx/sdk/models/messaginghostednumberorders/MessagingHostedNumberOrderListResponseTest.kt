// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.HostedNumber
import com.telnyx.sdk.models.MessagingHostedNumberOrder
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderListResponseTest {

    @Test
    fun create() {
        val messagingHostedNumberOrderListResponse =
            MessagingHostedNumberOrderListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingHostedNumberOrderListResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(messagingHostedNumberOrderListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingHostedNumberOrderListResponse =
            MessagingHostedNumberOrderListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingHostedNumberOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingHostedNumberOrderListResponse),
                jacksonTypeRef<MessagingHostedNumberOrderListResponse>(),
            )

        assertThat(roundtrippedMessagingHostedNumberOrderListResponse)
            .isEqualTo(messagingHostedNumberOrderListResponse)
    }
}
