// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetappsLocation17904fcfbcTest {

    @Test
    fun create() {
        val netappsLocation17904fcfbc =
            NetappsLocation17904fcfbc.builder()
                .code("chicago-il")
                .name("Chicago IL, US")
                .pop("CH1")
                .region("AMER")
                .site("ORD")
                .build()

        assertThat(netappsLocation17904fcfbc.code()).contains("chicago-il")
        assertThat(netappsLocation17904fcfbc.name()).contains("Chicago IL, US")
        assertThat(netappsLocation17904fcfbc.pop()).contains("CH1")
        assertThat(netappsLocation17904fcfbc.region()).contains("AMER")
        assertThat(netappsLocation17904fcfbc.site()).contains("ORD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val netappsLocation17904fcfbc =
            NetappsLocation17904fcfbc.builder()
                .code("chicago-il")
                .name("Chicago IL, US")
                .pop("CH1")
                .region("AMER")
                .site("ORD")
                .build()

        val roundtrippedNetappsLocation17904fcfbc =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(netappsLocation17904fcfbc),
                jacksonTypeRef<NetappsLocation17904fcfbc>(),
            )

        assertThat(roundtrippedNetappsLocation17904fcfbc).isEqualTo(netappsLocation17904fcfbc)
    }
}
