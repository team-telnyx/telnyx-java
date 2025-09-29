// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.mobilepushcredentials

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePushCredentialListParamsTest {

    @Test
    fun create() {
        MobilePushCredentialListParams.builder()
            .filter(
                MobilePushCredentialListParams.Filter.builder()
                    .alias("LucyCredential")
                    .type(MobilePushCredentialListParams.Filter.Type.IOS)
                    .build()
            )
            .page(MobilePushCredentialListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MobilePushCredentialListParams.builder()
                .filter(
                    MobilePushCredentialListParams.Filter.builder()
                        .alias("LucyCredential")
                        .type(MobilePushCredentialListParams.Filter.Type.IOS)
                        .build()
                )
                .page(MobilePushCredentialListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[alias]", "LucyCredential")
                    .put("filter[type]", "ios")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MobilePushCredentialListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
