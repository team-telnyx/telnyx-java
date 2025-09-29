// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBlockListParamsTest {

    @Test
    fun create() {
        PhoneNumberBlockListParams.builder()
            .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter(
                PhoneNumberBlockListParams.Filter.builder()
                    .activationStatus(PhoneNumberBlockListParams.Filter.ActivationStatus.ACTIVE)
                    .addPhoneNumber("+12003151212")
                    .portabilityStatus(
                        PhoneNumberBlockListParams.Filter.PortabilityStatus.CONFIRMED
                    )
                    .addPortingOrderId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                    .status(PhoneNumberBlockListParams.Filter.Status.UnionMember0.IN_PROCESS)
                    .supportKey("sr_a12345")
                    .build()
            )
            .page(PhoneNumberBlockListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                PhoneNumberBlockListParams.Sort.builder()
                    .value(PhoneNumberBlockListParams.Sort.Value.CREATED_AT_DESC)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberBlockListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberBlockListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(
                    PhoneNumberBlockListParams.Filter.builder()
                        .activationStatus(PhoneNumberBlockListParams.Filter.ActivationStatus.ACTIVE)
                        .addPhoneNumber("+12003151212")
                        .portabilityStatus(
                            PhoneNumberBlockListParams.Filter.PortabilityStatus.CONFIRMED
                        )
                        .addPortingOrderId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                        .status(PhoneNumberBlockListParams.Filter.Status.UnionMember0.IN_PROCESS)
                        .supportKey("sr_a12345")
                        .build()
                )
                .page(PhoneNumberBlockListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    PhoneNumberBlockListParams.Sort.builder()
                        .value(PhoneNumberBlockListParams.Sort.Value.CREATED_AT_DESC)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[activation_status]", "Active")
                    .put("filter[phone_number]", listOf("+12003151212").joinToString(","))
                    .put("filter[portability_status]", "confirmed")
                    .put(
                        "filter[porting_order_id]",
                        listOf("f3575e15-32ce-400e-a4c0-dd78800c20b0").joinToString(","),
                    )
                    .put("filter[status]", "in-process")
                    .put("filter[support_key]", "sr_a12345")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "-created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PhoneNumberBlockListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
