// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccessIpRangeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpRangeService = client.accessIpRanges()

        val accessIpRange =
            accessIpRangeService.create(
                AccessIpRangeCreateParams.builder()
                    .cidrBlock("cidr_block")
                    .description("description")
                    .build()
            )

        accessIpRange.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpRangeService = client.accessIpRanges()

        val page = accessIpRangeService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpRangeService = client.accessIpRanges()

        val accessIpRange = accessIpRangeService.delete("access_ip_range_id")

        accessIpRange.validate()
    }
}
