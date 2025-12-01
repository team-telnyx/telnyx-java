// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberListResponseTest {

    @Test
    fun create() {
        val portingPhoneNumberListResponse =
            PortingPhoneNumberListResponse.builder()
                .addData(
                    PortingPhoneNumberListResponse.Data.builder()
                        .activationStatus(
                            PortingPhoneNumberListResponse.Data.ActivationStatus.ACTIVE
                        )
                        .phoneNumber("13035550987")
                        .phoneNumberType(PortingPhoneNumberListResponse.Data.PhoneNumberType.LOCAL)
                        .portabilityStatus(
                            PortingPhoneNumberListResponse.Data.PortabilityStatus.CONFIRMED
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .portingOrderStatus(
                            PortingPhoneNumberListResponse.Data.PortingOrderStatus.IN_PROCESS
                        )
                        .recordType("porting_phone_number")
                        .requirementsStatus(
                            PortingPhoneNumberListResponse.Data.RequirementsStatus.APPROVED
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

        assertThat(portingPhoneNumberListResponse.data().getOrNull())
            .containsExactly(
                PortingPhoneNumberListResponse.Data.builder()
                    .activationStatus(PortingPhoneNumberListResponse.Data.ActivationStatus.ACTIVE)
                    .phoneNumber("13035550987")
                    .phoneNumberType(PortingPhoneNumberListResponse.Data.PhoneNumberType.LOCAL)
                    .portabilityStatus(
                        PortingPhoneNumberListResponse.Data.PortabilityStatus.CONFIRMED
                    )
                    .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                    .portingOrderStatus(
                        PortingPhoneNumberListResponse.Data.PortingOrderStatus.IN_PROCESS
                    )
                    .recordType("porting_phone_number")
                    .requirementsStatus(
                        PortingPhoneNumberListResponse.Data.RequirementsStatus.APPROVED
                    )
                    .supportKey("sr_a12345")
                    .build()
            )
        assertThat(portingPhoneNumberListResponse.meta())
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
        val portingPhoneNumberListResponse =
            PortingPhoneNumberListResponse.builder()
                .addData(
                    PortingPhoneNumberListResponse.Data.builder()
                        .activationStatus(
                            PortingPhoneNumberListResponse.Data.ActivationStatus.ACTIVE
                        )
                        .phoneNumber("13035550987")
                        .phoneNumberType(PortingPhoneNumberListResponse.Data.PhoneNumberType.LOCAL)
                        .portabilityStatus(
                            PortingPhoneNumberListResponse.Data.PortabilityStatus.CONFIRMED
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .portingOrderStatus(
                            PortingPhoneNumberListResponse.Data.PortingOrderStatus.IN_PROCESS
                        )
                        .recordType("porting_phone_number")
                        .requirementsStatus(
                            PortingPhoneNumberListResponse.Data.RequirementsStatus.APPROVED
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

        val roundtrippedPortingPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberListResponse),
                jacksonTypeRef<PortingPhoneNumberListResponse>(),
            )

        assertThat(roundtrippedPortingPhoneNumberListResponse)
            .isEqualTo(portingPhoneNumberListResponse)
    }
}
