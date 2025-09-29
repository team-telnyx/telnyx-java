// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessIpRangeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpRangeService = client.accessIpRanges()

        val accessIpRanges =
            accessIpRangeService.list(
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

        accessIpRanges.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpRangeService = client.accessIpRanges()

        val accessIpRange = accessIpRangeService.delete("access_ip_range_id")

        accessIpRange.validate()
    }
}
