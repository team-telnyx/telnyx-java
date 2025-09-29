// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.csvdownloads

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CsvDownloadCreateParamsTest {

    @Test
    fun create() {
        CsvDownloadCreateParams.builder()
            .csvFormat(CsvDownloadCreateParams.CsvFormat.V2)
            .filter(
                CsvDownloadCreateParams.Filter.builder()
                    .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .connectionId("1521916448077776306")
                    .customerReference("customer_reference")
                    .emergencyAddressId("9102160989215728032")
                    .hasBundle("has_bundle")
                    .phoneNumber("phone_number")
                    .status(CsvDownloadCreateParams.Filter.Status.ACTIVE)
                    .tag("tag")
                    .voiceConnectionName(
                        CsvDownloadCreateParams.Filter.VoiceConnectionName.builder()
                            .contains("test")
                            .endsWith("test")
                            .eq("test")
                            .startsWith("test")
                            .build()
                    )
                    .voiceUsagePaymentMethod(
                        CsvDownloadCreateParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CsvDownloadCreateParams.builder()
                .csvFormat(CsvDownloadCreateParams.CsvFormat.V2)
                .filter(
                    CsvDownloadCreateParams.Filter.builder()
                        .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                        .connectionId("1521916448077776306")
                        .customerReference("customer_reference")
                        .emergencyAddressId("9102160989215728032")
                        .hasBundle("has_bundle")
                        .phoneNumber("phone_number")
                        .status(CsvDownloadCreateParams.Filter.Status.ACTIVE)
                        .tag("tag")
                        .voiceConnectionName(
                            CsvDownloadCreateParams.Filter.VoiceConnectionName.builder()
                                .contains("test")
                                .endsWith("test")
                                .eq("test")
                                .startsWith("test")
                                .build()
                        )
                        .voiceUsagePaymentMethod(
                            CsvDownloadCreateParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("csv_format", "V2")
                    .put("filter[billing_group_id]", "62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .put("filter[connection_id]", "1521916448077776306")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[emergency_address_id]", "9102160989215728032")
                    .put("filter[has_bundle]", "has_bundle")
                    .put("filter[phone_number]", "phone_number")
                    .put("filter[status]", "active")
                    .put("filter[tag]", "tag")
                    .put("filter[voice.connection_name][contains]", "test")
                    .put("filter[voice.connection_name][ends_with]", "test")
                    .put("filter[voice.connection_name][eq]", "test")
                    .put("filter[voice.connection_name][starts_with]", "test")
                    .put("filter[voice.usage_payment_method]", "channel")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CsvDownloadCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
