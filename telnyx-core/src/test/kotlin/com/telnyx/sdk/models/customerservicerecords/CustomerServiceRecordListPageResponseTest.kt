// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordListPageResponseTest {

    @Test
    fun create() {
        val customerServiceRecordListPageResponse =
            CustomerServiceRecordListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(customerServiceRecordListPageResponse.data().getOrNull())
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
        assertThat(customerServiceRecordListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecordListPageResponse =
            CustomerServiceRecordListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecordListPageResponse),
                jacksonTypeRef<CustomerServiceRecordListPageResponse>(),
            )

        assertThat(roundtrippedCustomerServiceRecordListPageResponse)
            .isEqualTo(customerServiceRecordListPageResponse)
    }
}
