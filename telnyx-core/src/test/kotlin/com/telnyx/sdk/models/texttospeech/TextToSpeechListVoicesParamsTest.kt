// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechListVoicesParamsTest {

    @Test
    fun create() {
        TextToSpeechListVoicesParams.builder()
            .apiKey("api_key")
            .provider(TextToSpeechListVoicesParams.Provider.AWS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TextToSpeechListVoicesParams.builder()
                .apiKey("api_key")
                .provider(TextToSpeechListVoicesParams.Provider.AWS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("api_key", "api_key").put("provider", "aws").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TextToSpeechListVoicesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
