// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.messaging

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListParamsTest {

    @Test
    fun create() {
        MessagingListParams.builder()
            .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterPhoneNumber("filter[phone_number]")
            .filterPhoneNumberContains("filter[phone_number][contains]")
            .filterType(MessagingListParams.FilterType.TOLLFREE)
            .pageNumber(0L)
            .pageSize(0L)
            .sortPhoneNumber(MessagingListParams.SortPhoneNumber.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessagingListParams.builder()
                .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterPhoneNumber("filter[phone_number]")
                .filterPhoneNumberContains("filter[phone_number][contains]")
                .filterType(MessagingListParams.FilterType.TOLLFREE)
                .pageNumber(0L)
                .pageSize(0L)
                .sortPhoneNumber(MessagingListParams.SortPhoneNumber.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[messaging_profile_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[phone_number]", "filter[phone_number]")
                    .put("filter[phone_number][contains]", "filter[phone_number][contains]")
                    .put("filter[type]", "tollfree")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort[phone_number]", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessagingListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
