// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordListResponseTest {

    @Test
    fun create() {
        val customerServiceRecordListResponse =
            CustomerServiceRecordListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(customerServiceRecordListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(customerServiceRecordListResponse.meta())
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
        val customerServiceRecordListResponse =
            CustomerServiceRecordListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecordListResponse),
                jacksonTypeRef<CustomerServiceRecordListResponse>(),
            )

        assertThat(roundtrippedCustomerServiceRecordListResponse)
            .isEqualTo(customerServiceRecordListResponse)
    }
}
