// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationNumberSource
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationOwnershipStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListParamsTest {

    @Test
    fun create() {
        NumberListParams.builder()
            .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterOwnershipStatus(ReputationOwnershipStatus.VERIFIED)
            .filterPhoneNumberContains("+16035551234")
            .filterPhoneNumberEq("+16035551234")
            .filterSource(ReputationNumberSource.EXTERNAL)
            .pageNumber(1L)
            .pageSize(20L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberListParams.builder()
                .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterOwnershipStatus(ReputationOwnershipStatus.VERIFIED)
                .filterPhoneNumberContains("+16035551234")
                .filterPhoneNumberEq("+16035551234")
                .filterSource(ReputationNumberSource.EXTERNAL)
                .pageNumber(1L)
                .pageSize(20L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[enterprise_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[ownership_status]", "verified")
                    .put("filter[phone_number][contains]", "+16035551234")
                    .put("filter[phone_number][eq]", "+16035551234")
                    .put("filter[source]", "external")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
