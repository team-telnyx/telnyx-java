// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccessIpRangeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpRangeServiceAsync = client.accessIpRanges()

        val accessIpRangeFuture =
            accessIpRangeServiceAsync.create(
                AccessIpRangeCreateParams.builder()
                    .cidrBlock("cidr_block")
                    .description("description")
                    .build()
            )

        val accessIpRange = accessIpRangeFuture.get()
        accessIpRange.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpRangeServiceAsync = client.accessIpRanges()

        val pageFuture = accessIpRangeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpRangeServiceAsync = client.accessIpRanges()

        val accessIpRangeFuture = accessIpRangeServiceAsync.delete("access_ip_range_id")

        val accessIpRange = accessIpRangeFuture.get()
        accessIpRange.validate()
    }
}
