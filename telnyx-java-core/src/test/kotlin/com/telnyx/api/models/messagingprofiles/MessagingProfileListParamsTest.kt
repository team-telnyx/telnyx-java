// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListParamsTest {

    @Test
    fun create() {
        MessagingProfileListParams.builder()
            .filter(MessagingProfileListParams.Filter.builder().name("name").build())
            .page(MessagingProfileListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessagingProfileListParams.builder()
                .filter(MessagingProfileListParams.Filter.builder().name("name").build())
                .page(MessagingProfileListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "name")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessagingProfileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
