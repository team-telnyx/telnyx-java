// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordCreateParamsTest {

    @Test
    fun create() {
        CustomerServiceRecordCreateParams.builder()
            .phoneNumber("+13035553000")
            .additionalData(
                CustomerServiceRecordCreateParams.AdditionalData.builder()
                    .accountNumber("123456789")
                    .addressLine1("123 Main St")
                    .authorizedPersonName("John Doe")
                    .billingPhoneNumber("+12065551212")
                    .city("New York")
                    .customerCode("123456789")
                    .name("Entity Inc.")
                    .pin("1234")
                    .state("NY")
                    .zipCode("10001")
                    .build()
            )
            .webhookUrl("https://example.com/webhook")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerServiceRecordCreateParams.builder()
                .phoneNumber("+13035553000")
                .additionalData(
                    CustomerServiceRecordCreateParams.AdditionalData.builder()
                        .accountNumber("123456789")
                        .addressLine1("123 Main St")
                        .authorizedPersonName("John Doe")
                        .billingPhoneNumber("+12065551212")
                        .city("New York")
                        .customerCode("123456789")
                        .name("Entity Inc.")
                        .pin("1234")
                        .state("NY")
                        .zipCode("10001")
                        .build()
                )
                .webhookUrl("https://example.com/webhook")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+13035553000")
        assertThat(body.additionalData())
            .contains(
                CustomerServiceRecordCreateParams.AdditionalData.builder()
                    .accountNumber("123456789")
                    .addressLine1("123 Main St")
                    .authorizedPersonName("John Doe")
                    .billingPhoneNumber("+12065551212")
                    .city("New York")
                    .customerCode("123456789")
                    .name("Entity Inc.")
                    .pin("1234")
                    .state("NY")
                    .zipCode("10001")
                    .build()
            )
        assertThat(body.webhookUrl()).contains("https://example.com/webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerServiceRecordCreateParams.builder().phoneNumber("+13035553000").build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+13035553000")
    }
}
