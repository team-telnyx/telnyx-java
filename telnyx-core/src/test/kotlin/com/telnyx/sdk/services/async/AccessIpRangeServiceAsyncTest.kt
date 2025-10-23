// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessIpRangeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpRangeServiceAsync = client.accessIpRanges()

        val accessIpRangesFuture =
            accessIpRangeServiceAsync.list(
                AccessIpRangeListParams.builder()
                    .filter(
                        AccessIpRangeListParams.Filter.builder()
                            .cidrBlock("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .page(AccessIpRangeListParams.Page.builder().number(0L).size(250L).build())
                    .build()
            )

        val accessIpRanges = accessIpRangesFuture.get()
        accessIpRanges.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpRangeServiceAsync = client.accessIpRanges()

        val accessIpRangeFuture = accessIpRangeServiceAsync.delete("access_ip_range_id")

        val accessIpRange = accessIpRangeFuture.get()
        accessIpRange.validate()
    }
}
