// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import com.telnyx.sdk.core.http.QueryParams
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
            .pageNumber(0L)
            .pageSize(0L)
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
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[alias]", "LucyCredential")
                    .put("filter[type]", "ios")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
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
