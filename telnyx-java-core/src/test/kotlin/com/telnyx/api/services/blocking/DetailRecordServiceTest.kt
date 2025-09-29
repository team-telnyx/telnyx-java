// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.detailrecords.DetailRecordListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailRecordServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordService = client.detailRecords()

        val detailRecords =
            detailRecordService.list(
                DetailRecordListParams.builder()
                    .filter(
                        DetailRecordListParams.Filter.builder()
                            .recordType(DetailRecordListParams.Filter.RecordType.AI_VOICE_ASSISTANT)
                            .dateRange(DetailRecordListParams.Filter.DateRange.YESTERDAY)
                            .build()
                    )
                    .page(DetailRecordListParams.Page.builder().number(1).size(1).build())
                    .addSort("string")
                    .build()
            )

        detailRecords.validate()
    }
}
