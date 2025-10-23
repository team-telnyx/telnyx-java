// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles.autorespconfigs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutorespConfigDeleteResponseTest {

    @Test
    fun create() {
        val autorespConfigDeleteResponse = AutorespConfigDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autorespConfigDeleteResponse = AutorespConfigDeleteResponse.builder().build()

        val roundtrippedAutorespConfigDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autorespConfigDeleteResponse),
                jacksonTypeRef<AutorespConfigDeleteResponse>(),
            )

        assertThat(roundtrippedAutorespConfigDeleteResponse).isEqualTo(autorespConfigDeleteResponse)
    }
}
