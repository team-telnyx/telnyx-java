// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordTest {

    @Test
    fun create() {
        val customerServiceRecord =
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
                .webhookUrl("https://example.com/webhook")
                .build()

        assertThat(customerServiceRecord.id()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(customerServiceRecord.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(customerServiceRecord.errorMessage()).contains("CSR information not available.")
        assertThat(customerServiceRecord.phoneNumber()).contains("+12065551212")
        assertThat(customerServiceRecord.recordType()).contains("customer_service_record")
        assertThat(customerServiceRecord.result())
            .contains(
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
        assertThat(customerServiceRecord.status()).contains(CustomerServiceRecord.Status.COMPLETED)
        assertThat(customerServiceRecord.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(customerServiceRecord.webhookUrl()).contains("https://example.com/webhook")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecord =
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
                .webhookUrl("https://example.com/webhook")
                .build()

        val roundtrippedCustomerServiceRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecord),
                jacksonTypeRef<CustomerServiceRecord>(),
            )

        assertThat(roundtrippedCustomerServiceRecord).isEqualTo(customerServiceRecord)
    }
}
