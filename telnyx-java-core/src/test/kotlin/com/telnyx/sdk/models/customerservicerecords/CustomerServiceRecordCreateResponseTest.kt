// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordCreateResponseTest {

    @Test
    fun create() {
        val customerServiceRecordCreateResponse =
            CustomerServiceRecordCreateResponse.builder()
                .data(
                    CustomerServiceRecord.builder()
                        .id("db7cebdb-21a8-4e89-8f51-e03ba6b799bb")
                        .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .errorMessage(null)
                        .phoneNumber("+2003271000")
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
                        .status(CustomerServiceRecord.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .build()

        assertThat(customerServiceRecordCreateResponse.data())
            .contains(
                CustomerServiceRecord.builder()
                    .id("db7cebdb-21a8-4e89-8f51-e03ba6b799bb")
                    .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                    .errorMessage(null)
                    .phoneNumber("+2003271000")
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
                    .status(CustomerServiceRecord.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                    .webhookUrl("https://example.com/webhook")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecordCreateResponse =
            CustomerServiceRecordCreateResponse.builder()
                .data(
                    CustomerServiceRecord.builder()
                        .id("db7cebdb-21a8-4e89-8f51-e03ba6b799bb")
                        .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .errorMessage(null)
                        .phoneNumber("+2003271000")
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
                        .status(CustomerServiceRecord.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecordCreateResponse),
                jacksonTypeRef<CustomerServiceRecordCreateResponse>(),
            )

        assertThat(roundtrippedCustomerServiceRecordCreateResponse)
            .isEqualTo(customerServiceRecordCreateResponse)
    }
}
