// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextListProvidersParamsTest {

    @Test
    fun create() {
        SpeechToTextListProvidersParams.builder()
            .provider(SpeechToTextListProvidersParams.Provider.DEEPGRAM)
            .serviceType(SttServiceType.STREAMING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SpeechToTextListProvidersParams.builder()
                .provider(SpeechToTextListProvidersParams.Provider.DEEPGRAM)
                .serviceType(SttServiceType.STREAMING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("provider", "deepgram")
                    .put("service_type", "streaming")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpeechToTextListProvidersParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
