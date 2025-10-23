// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListPhoneNumbersParamsTest {

    @Test
    fun create() {
        MessagingProfileListPhoneNumbersParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(MessagingProfileListPhoneNumbersParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessagingProfileListPhoneNumbersParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MessagingProfileListPhoneNumbersParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(
                    MessagingProfileListPhoneNumbersParams.Page.builder()
                        .number(1L)
                        .size(1L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MessagingProfileListPhoneNumbersParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
