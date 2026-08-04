// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailThreadRetrieveParamsTest {

    @Test
    fun create() {
        EmailThreadRetrieveParams.builder()
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageAfter("page[after]")
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailThreadRetrieveParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EmailThreadRetrieveParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageAfter("page[after]")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("inbox_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page[after]", "page[after]")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EmailThreadRetrieveParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("inbox_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
