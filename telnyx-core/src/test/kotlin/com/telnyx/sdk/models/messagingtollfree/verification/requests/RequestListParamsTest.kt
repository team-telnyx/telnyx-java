// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestListParamsTest {

    @Test
    fun create() {
        RequestListParams.builder()
            .page(1L)
            .pageSize(1L)
            .businessName("business_name")
            .dateEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .phoneNumber("phone_number")
            .status(TfVerificationStatus.VERIFIED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RequestListParams.builder()
                .page(1L)
                .pageSize(1L)
                .businessName("business_name")
                .dateEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .phoneNumber("phone_number")
                .status(TfVerificationStatus.VERIFIED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("business_name", "business_name")
                    .put("date_end", "2019-12-27T18:11:19.117Z")
                    .put("date_start", "2019-12-27T18:11:19.117Z")
                    .put("phone_number", "phone_number")
                    .put("status", "Verified")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RequestListParams.builder().page(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1").put("page_size", "1").build())
    }
}
