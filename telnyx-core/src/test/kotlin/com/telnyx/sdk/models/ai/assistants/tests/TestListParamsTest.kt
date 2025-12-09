// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListParamsTest {

    @Test
    fun create() {
        TestListParams.builder()
            .destination("destination")
            .pageNumber(0L)
            .pageSize(0L)
            .telnyxConversationChannel("telnyx_conversation_channel")
            .testSuite("test_suite")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TestListParams.builder()
                .destination("destination")
                .pageNumber(0L)
                .pageSize(0L)
                .telnyxConversationChannel("telnyx_conversation_channel")
                .testSuite("test_suite")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("destination", "destination")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("telnyx_conversation_channel", "telnyx_conversation_channel")
                    .put("test_suite", "test_suite")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TestListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
