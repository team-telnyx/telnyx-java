// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import java.time.OffsetDateTime
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

        val customerServiceRecordsFuture =
            customerServiceRecordServiceAsync.list(
                CustomerServiceRecordListParams.builder()
                    .filter(
                        CustomerServiceRecordListParams.Filter.builder()
                            .createdAt(
                                CustomerServiceRecordListParams.Filter.CreatedAt.builder()
                                    .gt(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                                    .lt(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                                    .build()
                            )
                            .phoneNumber(
                                CustomerServiceRecordListParams.Filter.PhoneNumber.builder()
                                    .eq("+12441239999")
                                    .addIn("+12441239999")
                                    .build()
                            )
                            .status(
                                CustomerServiceRecordListParams.Filter.Status.builder()
                                    .eq(CustomerServiceRecordListParams.Filter.Status.Eq.PENDING)
                                    .addIn(CustomerServiceRecordListParams.Filter.Status.In.PENDING)
                                    .build()
                            )
                            .build()
                    )
                    .page(
                        CustomerServiceRecordListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .sort(
                        CustomerServiceRecordListParams.Sort.builder()
                            .value(CustomerServiceRecordListParams.Sort.Value_.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        val customerServiceRecords = customerServiceRecordsFuture.get()
        customerServiceRecords.validate()
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
