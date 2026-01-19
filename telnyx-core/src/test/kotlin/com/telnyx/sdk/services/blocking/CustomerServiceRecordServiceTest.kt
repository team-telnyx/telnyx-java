// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceRecordServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordService = client.customerServiceRecords()

        val customerServiceRecord =
            customerServiceRecordService.create(
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

        customerServiceRecord.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordService = client.customerServiceRecords()

        val customerServiceRecord =
            customerServiceRecordService.retrieve("customer_service_record_id")

        customerServiceRecord.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordService = client.customerServiceRecords()

        val page = customerServiceRecordService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verifyPhoneNumberCoverage() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceRecordService = client.customerServiceRecords()

        val response =
            customerServiceRecordService.verifyPhoneNumberCoverage(
                CustomerServiceRecordVerifyPhoneNumberCoverageParams.builder()
                    .addPhoneNumber("+13035553000")
                    .build()
            )

        response.validate()
    }
}
