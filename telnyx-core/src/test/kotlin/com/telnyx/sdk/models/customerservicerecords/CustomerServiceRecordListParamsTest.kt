// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordListParamsTest {

    @Test
    fun create() {
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
                            .addInList("+12441239999")
                            .build()
                    )
                    .status(
                        CustomerServiceRecordListParams.Filter.Status.builder()
                            .eq(CustomerServiceRecordListParams.Filter.Status.Eq.PENDING)
                            .addInList(CustomerServiceRecordListParams.Filter.Status.In.PENDING)
                            .build()
                    )
                    .build()
            )
            .page(CustomerServiceRecordListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                CustomerServiceRecordListParams.Sort.builder()
                    .value(CustomerServiceRecordListParams.Sort.SortValue.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
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
                                .addInList("+12441239999")
                                .build()
                        )
                        .status(
                            CustomerServiceRecordListParams.Filter.Status.builder()
                                .eq(CustomerServiceRecordListParams.Filter.Status.Eq.PENDING)
                                .addInList(CustomerServiceRecordListParams.Filter.Status.In.PENDING)
                                .build()
                        )
                        .build()
                )
                .page(CustomerServiceRecordListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    CustomerServiceRecordListParams.Sort.builder()
                        .value(CustomerServiceRecordListParams.Sort.SortValue.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "2020-01-01T00:00:00Z")
                    .put("filter[created_at][lt]", "2020-01-01T00:00:00Z")
                    .put("filter[phone_number][eq]", "+12441239999")
                    .put("filter[phone_number][in]", listOf("+12441239999").joinToString(","))
                    .put("filter[status][eq]", "pending")
                    .put("filter[status][in]", listOf("pending").joinToString(","))
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerServiceRecordListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
