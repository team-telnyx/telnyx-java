// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainListParamsTest {

    @Test
    fun create() {
        EmailDomainListParams.builder()
            .filterDomain("filter[domain]")
            .filterProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterStatus(EmailDomainStatus.PENDING)
            .filterType(EmailDomainType.CUSTOM)
            .filterUsableForInbound(true)
            .filterUsableForSending(true)
            .pageAfter("page[after]")
            .pageBefore("page[before]")
            .pageNumber(1L)
            .pageSize(1L)
            .sort(EmailDomainListParams.Sort.CREATED_AT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailDomainListParams.builder()
                .filterDomain("filter[domain]")
                .filterProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterStatus(EmailDomainStatus.PENDING)
                .filterType(EmailDomainType.CUSTOM)
                .filterUsableForInbound(true)
                .filterUsableForSending(true)
                .pageAfter("page[after]")
                .pageBefore("page[before]")
                .pageNumber(1L)
                .pageSize(1L)
                .sort(EmailDomainListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[domain]", "filter[domain]")
                    .put("filter[profile_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[status]", "pending")
                    .put("filter[type]", "custom")
                    .put("filter[usable_for_inbound]", "true")
                    .put("filter[usable_for_sending]", "true")
                    .put("page[after]", "page[after]")
                    .put("page[before]", "page[before]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailDomainListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
