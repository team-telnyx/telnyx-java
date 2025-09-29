// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordRetrieveResponseTest {

    @Test
    fun create() {
        val customerServiceRecordRetrieveResponse =
            CustomerServiceRecordRetrieveResponse.builder()
                .data(
                    CustomerServiceRecord.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .errorMessage("CSR information not available.")
                        .phoneNumber("+12065551212")
                        .recordType("customer_service_record")
                        .result(
                            CustomerServiceRecord.Result.builder()
                                .address(
                                    CustomerServiceRecord.Result.Address.builder()
                                        .administrativeArea("NY")
                                        .fullAddress("123 Main St; New York; NY; 10001")
                                        .locality("New York")
                                        .postalCode("10001")
                                        .streetAddress("123 Main St")
                                        .build()
                                )
                                .admin(
                                    CustomerServiceRecord.Result.Admin.builder()
                                        .accountNumber("1234567890")
                                        .authorizedPersonName("John Doe")
                                        .billingPhoneNumber("+12065551212")
                                        .name("John Doe")
                                        .build()
                                )
                                .addAssociatedPhoneNumber("+12065551212")
                                .carrierName("ABC CARRIER, INC.")
                                .build()
                        )
                        .status(CustomerServiceRecord.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(customerServiceRecordRetrieveResponse.data())
            .contains(
                CustomerServiceRecord.builder()
                    .id("f1486bae-f067-460c-ad43-73a92848f902")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .errorMessage("CSR information not available.")
                    .phoneNumber("+12065551212")
                    .recordType("customer_service_record")
                    .result(
                        CustomerServiceRecord.Result.builder()
                            .address(
                                CustomerServiceRecord.Result.Address.builder()
                                    .administrativeArea("NY")
                                    .fullAddress("123 Main St; New York; NY; 10001")
                                    .locality("New York")
                                    .postalCode("10001")
                                    .streetAddress("123 Main St")
                                    .build()
                            )
                            .admin(
                                CustomerServiceRecord.Result.Admin.builder()
                                    .accountNumber("1234567890")
                                    .authorizedPersonName("John Doe")
                                    .billingPhoneNumber("+12065551212")
                                    .name("John Doe")
                                    .build()
                            )
                            .addAssociatedPhoneNumber("+12065551212")
                            .carrierName("ABC CARRIER, INC.")
                            .build()
                    )
                    .status(CustomerServiceRecord.Status.COMPLETED)
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecordRetrieveResponse =
            CustomerServiceRecordRetrieveResponse.builder()
                .data(
                    CustomerServiceRecord.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .errorMessage("CSR information not available.")
                        .phoneNumber("+12065551212")
                        .recordType("customer_service_record")
                        .result(
                            CustomerServiceRecord.Result.builder()
                                .address(
                                    CustomerServiceRecord.Result.Address.builder()
                                        .administrativeArea("NY")
                                        .fullAddress("123 Main St; New York; NY; 10001")
                                        .locality("New York")
                                        .postalCode("10001")
                                        .streetAddress("123 Main St")
                                        .build()
                                )
                                .admin(
                                    CustomerServiceRecord.Result.Admin.builder()
                                        .accountNumber("1234567890")
                                        .authorizedPersonName("John Doe")
                                        .billingPhoneNumber("+12065551212")
                                        .name("John Doe")
                                        .build()
                                )
                                .addAssociatedPhoneNumber("+12065551212")
                                .carrierName("ABC CARRIER, INC.")
                                .build()
                        )
                        .status(CustomerServiceRecord.Status.COMPLETED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecordRetrieveResponse),
                jacksonTypeRef<CustomerServiceRecordRetrieveResponse>(),
            )

        assertThat(roundtrippedCustomerServiceRecordRetrieveResponse)
            .isEqualTo(customerServiceRecordRetrieveResponse)
    }
}
