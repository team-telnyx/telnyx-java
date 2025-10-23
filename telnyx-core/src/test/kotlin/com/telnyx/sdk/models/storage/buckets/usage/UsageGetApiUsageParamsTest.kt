// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageGetApiUsageParamsTest {

    @Test
    fun create() {
        UsageGetApiUsageParams.builder()
            .bucketName("")
            .filter(
                UsageGetApiUsageParams.Filter.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageGetApiUsageParams.builder()
                .bucketName("")
                .filter(
                    UsageGetApiUsageParams.Filter.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            UsageGetApiUsageParams.builder()
                .bucketName("")
                .filter(
                    UsageGetApiUsageParams.Filter.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[end_time]", "2019-12-27T18:11:19.117Z")
                    .put("filter[start_time]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
