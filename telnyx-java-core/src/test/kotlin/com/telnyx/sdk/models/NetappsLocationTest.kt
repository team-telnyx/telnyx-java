// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetappsLocationTest {

    @Test
    fun create() {
        val netappsLocation =
            NetappsLocation.builder()
                .code("chicago-il")
                .name("Chicago IL, US")
                .pop("CH1")
                .region("AMER")
                .site("ORD")
                .build()

        assertThat(netappsLocation.code()).contains("chicago-il")
        assertThat(netappsLocation.name()).contains("Chicago IL, US")
        assertThat(netappsLocation.pop()).contains("CH1")
        assertThat(netappsLocation.region()).contains("AMER")
        assertThat(netappsLocation.site()).contains("ORD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val netappsLocation =
            NetappsLocation.builder()
                .code("chicago-il")
                .name("Chicago IL, US")
                .pop("CH1")
                .region("AMER")
                .site("ORD")
                .build()

        val roundtrippedNetappsLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(netappsLocation),
                jacksonTypeRef<NetappsLocation>(),
            )

        assertThat(roundtrippedNetappsLocation).isEqualTo(netappsLocation)
    }
}
