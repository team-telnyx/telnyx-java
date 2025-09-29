// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordVerifyPhoneNumberCoverageResponseTest {

    @Test
    fun create() {
        val customerServiceRecordVerifyPhoneNumberCoverageResponse =
            CustomerServiceRecordVerifyPhoneNumberCoverageResponse.builder()
                .addData(
                    CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data.builder()
                        .addAdditionalDataRequired(
                            CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data
                                .AdditionalDataRequired
                                .NAME
                        )
                        .hasCsrCoverage(true)
                        .phoneNumber("+12223334444")
                        .reason("The phone number '+19999999999' is invalid.")
                        .recordType("customer_service_record_phone_number_coverage")
                        .build()
                )
                .build()

        assertThat(customerServiceRecordVerifyPhoneNumberCoverageResponse.data().getOrNull())
            .containsExactly(
                CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data.builder()
                    .addAdditionalDataRequired(
                        CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data
                            .AdditionalDataRequired
                            .NAME
                    )
                    .hasCsrCoverage(true)
                    .phoneNumber("+12223334444")
                    .reason("The phone number '+19999999999' is invalid.")
                    .recordType("customer_service_record_phone_number_coverage")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecordVerifyPhoneNumberCoverageResponse =
            CustomerServiceRecordVerifyPhoneNumberCoverageResponse.builder()
                .addData(
                    CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data.builder()
                        .addAdditionalDataRequired(
                            CustomerServiceRecordVerifyPhoneNumberCoverageResponse.Data
                                .AdditionalDataRequired
                                .NAME
                        )
                        .hasCsrCoverage(true)
                        .phoneNumber("+12223334444")
                        .reason("The phone number '+19999999999' is invalid.")
                        .recordType("customer_service_record_phone_number_coverage")
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordVerifyPhoneNumberCoverageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    customerServiceRecordVerifyPhoneNumberCoverageResponse
                ),
                jacksonTypeRef<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>(),
            )

        assertThat(roundtrippedCustomerServiceRecordVerifyPhoneNumberCoverageResponse)
            .isEqualTo(customerServiceRecordVerifyPhoneNumberCoverageResponse)
    }
}
