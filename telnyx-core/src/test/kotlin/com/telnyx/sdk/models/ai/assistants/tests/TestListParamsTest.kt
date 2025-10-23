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
            .page(TestListParams.Page.builder().number(1L).size(1L).build())
            .telnyxConversationChannel("telnyx_conversation_channel")
            .testSuite("test_suite")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TestListParams.builder()
                .destination("destination")
                .page(TestListParams.Page.builder().number(1L).size(1L).build())
                .telnyxConversationChannel("telnyx_conversation_channel")
                .testSuite("test_suite")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("destination", "destination")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
