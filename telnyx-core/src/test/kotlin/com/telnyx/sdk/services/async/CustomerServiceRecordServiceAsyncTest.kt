// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceRecordServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordServiceAsync = client.customerServiceRecords()

        val customerServiceRecordFuture =
            customerServiceRecordServiceAsync.create(
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
            )

        val customerServiceRecord = customerServiceRecordFuture.get()
        customerServiceRecord.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordServiceAsync = client.customerServiceRecords()

        val customerServiceRecordFuture =
            customerServiceRecordServiceAsync.retrieve("customer_service_record_id")

        val customerServiceRecord = customerServiceRecordFuture.get()
        customerServiceRecord.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordServiceAsync = client.customerServiceRecords()

        val pageFuture = customerServiceRecordServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verifyPhoneNumberCoverage() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordServiceAsync = client.customerServiceRecords()

        val responseFuture =
            customerServiceRecordServiceAsync.verifyPhoneNumberCoverage(
                CustomerServiceRecordVerifyPhoneNumberCoverageParams.builder()
                    .addPhoneNumber("+13035553000")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
