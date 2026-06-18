// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberListParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberListParams.builder()
            .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterPhoneNumber("filter[phone_number]")
            .filterPhoneNumberContains("filter[phone_number][contains]")
            .pageNumber(0L)
            .pageSize(0L)
            .sortPhoneNumber(MessagingHostedNumberListParams.SortPhoneNumber.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessagingHostedNumberListParams.builder()
                .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterPhoneNumber("filter[phone_number]")
                .filterPhoneNumberContains("filter[phone_number][contains]")
                .pageNumber(0L)
                .pageSize(0L)
                .sortPhoneNumber(MessagingHostedNumberListParams.SortPhoneNumber.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[messaging_profile_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[phone_number]", "filter[phone_number]")
                    .put("filter[phone_number][contains]", "filter[phone_number][contains]")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort[phone_number]", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessagingHostedNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
