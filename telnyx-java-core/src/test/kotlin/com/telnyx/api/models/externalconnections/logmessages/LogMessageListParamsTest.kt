// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.logmessages

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageListParamsTest {

    @Test
    fun create() {
        LogMessageListParams.builder()
            .filter(
                LogMessageListParams.Filter.builder()
                    .externalConnectionId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                    .telephoneNumber(
                        LogMessageListParams.Filter.TelephoneNumber.builder()
                            .contains("+123")
                            .eq("+1234567890")
                            .build()
                    )
                    .build()
            )
            .page(LogMessageListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LogMessageListParams.builder()
                .filter(
                    LogMessageListParams.Filter.builder()
                        .externalConnectionId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                        .telephoneNumber(
                            LogMessageListParams.Filter.TelephoneNumber.builder()
                                .contains("+123")
                                .eq("+1234567890")
                                .build()
                        )
                        .build()
                )
                .page(LogMessageListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[external_connection_id]", "67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                    .put("filter[telephone_number][contains]", "+123")
                    .put("filter[telephone_number][eq]", "+1234567890")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogMessageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
