// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberListPageResponseTest {

    @Test
    fun create() {
        val portingPhoneNumberListPageResponse =
            PortingPhoneNumberListPageResponse.builder()
                .addData(
                    PortingPhoneNumberListResponse.builder()
                        .activationStatus(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
                        .phoneNumber("13035550987")
                        .phoneNumberType(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
                        .portabilityStatus(
                            PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .portingOrderStatus(
                            PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS
                        )
                        .recordType("porting_phone_number")
                        .requirementsStatus(
                            PortingPhoneNumberListResponse.RequirementsStatus.APPROVED
                        )
                        .supportKey("sr_a12345")
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

        assertThat(portingPhoneNumberListPageResponse.data().getOrNull())
            .containsExactly(
                PortingPhoneNumberListResponse.builder()
                    .activationStatus(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
                    .phoneNumber("13035550987")
                    .phoneNumberType(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
                    .portabilityStatus(PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED)
                    .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                    .portingOrderStatus(
                        PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS
                    )
                    .recordType("porting_phone_number")
                    .requirementsStatus(PortingPhoneNumberListResponse.RequirementsStatus.APPROVED)
                    .supportKey("sr_a12345")
                    .build()
            )
        assertThat(portingPhoneNumberListPageResponse.meta())
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
        val portingPhoneNumberListPageResponse =
            PortingPhoneNumberListPageResponse.builder()
                .addData(
                    PortingPhoneNumberListResponse.builder()
                        .activationStatus(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
                        .phoneNumber("13035550987")
                        .phoneNumberType(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
                        .portabilityStatus(
                            PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .portingOrderStatus(
                            PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS
                        )
                        .recordType("porting_phone_number")
                        .requirementsStatus(
                            PortingPhoneNumberListResponse.RequirementsStatus.APPROVED
                        )
                        .supportKey("sr_a12345")
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

        val roundtrippedPortingPhoneNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberListPageResponse),
                jacksonTypeRef<PortingPhoneNumberListPageResponse>(),
            )

        assertThat(roundtrippedPortingPhoneNumberListPageResponse)
            .isEqualTo(portingPhoneNumberListPageResponse)
    }
}
