// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientListParamsTest {

    @Test
    fun create() {
        RecipientListParams.builder()
            .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .kind(RecipientListParams.Kind.TO)
            .pageCursor("page_cursor")
            .pageSize(1L)
            .status(RecipientListParams.Status.QUEUED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RecipientListParams.builder().emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RecipientListParams.builder()
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .kind(RecipientListParams.Kind.TO)
                .pageCursor("page_cursor")
                .pageSize(1L)
                .status(RecipientListParams.Status.QUEUED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("kind", "to")
                    .put("page_cursor", "page_cursor")
                    .put("page_size", "1")
                    .put("status", "queued")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RecipientListParams.builder().emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
