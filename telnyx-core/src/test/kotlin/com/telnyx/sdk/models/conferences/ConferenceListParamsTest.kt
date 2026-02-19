// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceListParamsTest {

    @Test
    fun create() {
        ConferenceListParams.builder()
            .filter(
                ConferenceListParams.Filter.builder()
                    .applicationName(
                        ConferenceListParams.Filter.ApplicationName.builder()
                            .contains("contains")
                            .build()
                    )
                    .applicationSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .connectionId("connection_id")
                    .failed(false)
                    .from("+12025550142")
                    .legId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .occurredAt(
                        ConferenceListParams.Filter.OccurredAt.builder()
                            .eq("2019-03-29T11:10:00Z")
                            .gt("2019-03-29T11:10:00Z")
                            .gte("2019-03-29T11:10:00Z")
                            .lt("2019-03-29T11:10:00Z")
                            .lte("2019-03-29T11:10:00Z")
                            .build()
                    )
                    .outboundOutboundVoiceProfileId("outbound.outbound_voice_profile_id")
                    .product(ConferenceListParams.Filter.Product.TEXML)
                    .status(ConferenceListParams.Filter.Status.INIT)
                    .to("+12025550142")
                    .type(ConferenceListParams.Filter.Type.WEBHOOK)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .region(ConferenceListParams.Region.AUSTRALIA)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConferenceListParams.builder()
                .filter(
                    ConferenceListParams.Filter.builder()
                        .applicationName(
                            ConferenceListParams.Filter.ApplicationName.builder()
                                .contains("contains")
                                .build()
                        )
                        .applicationSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .connectionId("connection_id")
                        .failed(false)
                        .from("+12025550142")
                        .legId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .occurredAt(
                            ConferenceListParams.Filter.OccurredAt.builder()
                                .eq("2019-03-29T11:10:00Z")
                                .gt("2019-03-29T11:10:00Z")
                                .gte("2019-03-29T11:10:00Z")
                                .lt("2019-03-29T11:10:00Z")
                                .lte("2019-03-29T11:10:00Z")
                                .build()
                        )
                        .outboundOutboundVoiceProfileId("outbound.outbound_voice_profile_id")
                        .product(ConferenceListParams.Filter.Product.TEXML)
                        .status(ConferenceListParams.Filter.Status.INIT)
                        .to("+12025550142")
                        .type(ConferenceListParams.Filter.Type.WEBHOOK)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .region(ConferenceListParams.Region.AUSTRALIA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[application_name][contains]", "contains")
                    .put("filter[application_session_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[connection_id]", "connection_id")
                    .put("filter[failed]", "false")
                    .put("filter[from]", "+12025550142")
                    .put("filter[leg_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[name]", "name")
                    .put("filter[occurred_at][eq]", "2019-03-29T11:10:00Z")
                    .put("filter[occurred_at][gt]", "2019-03-29T11:10:00Z")
                    .put("filter[occurred_at][gte]", "2019-03-29T11:10:00Z")
                    .put("filter[occurred_at][lt]", "2019-03-29T11:10:00Z")
                    .put("filter[occurred_at][lte]", "2019-03-29T11:10:00Z")
                    .put(
                        "filter[outbound.outbound_voice_profile_id]",
                        "outbound.outbound_voice_profile_id",
                    )
                    .put("filter[product]", "texml")
                    .put("filter[status]", "init")
                    .put("filter[to]", "+12025550142")
                    .put("filter[type]", "webhook")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("region", "Australia")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConferenceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
