// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.detailrecords.DetailRecordListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailRecordServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val detailRecordServiceAsync = client.detailRecords()

        val detailRecordsFuture =
            detailRecordServiceAsync.list(
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

        val detailRecords = detailRecordsFuture.get()
        detailRecords.validate()
    }
}
