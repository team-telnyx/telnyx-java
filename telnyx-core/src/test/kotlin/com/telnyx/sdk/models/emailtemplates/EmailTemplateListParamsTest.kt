// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateListParamsTest {

    @Test
    fun create() {
        EmailTemplateListParams.builder()
            .filterAutoescape(EmailTemplateListParams.FilterAutoescape.TRUE)
            .filterContentType(EmailTemplateListParams.FilterContentType.HTML_AND_TEXT)
            .filterQuery("filter[query]")
            .filterStrictVariables(EmailTemplateListParams.FilterStrictVariables.TRUE)
            .pageCursor("page_cursor")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailTemplateListParams.builder()
                .filterAutoescape(EmailTemplateListParams.FilterAutoescape.TRUE)
                .filterContentType(EmailTemplateListParams.FilterContentType.HTML_AND_TEXT)
                .filterQuery("filter[query]")
                .filterStrictVariables(EmailTemplateListParams.FilterStrictVariables.TRUE)
                .pageCursor("page_cursor")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[autoescape]", "true")
                    .put("filter[content_type]", "html_and_text")
                    .put("filter[query]", "filter[query]")
                    .put("filter[strict_variables]", "true")
                    .put("page_cursor", "page_cursor")
                    .put("page_size", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailTemplateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
