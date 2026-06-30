// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryListParamsTest {

    @Test
    fun create() {
        WebhookDeliveryListParams.builder()
            .filter(
                WebhookDeliveryListParams.Filter.builder()
                    .attempts(
                        WebhookDeliveryListParams.Filter.Attempts.builder()
                            .contains("https://fallback.example.com/webhooks")
                            .build()
                    )
                    .eventType("call_initiated,call.initiated")
                    .finishedAt(
                        WebhookDeliveryListParams.Filter.FinishedAt.builder()
                            .gte("2019-03-29T11:10:00Z")
                            .lte("2019-03-29T11:10:00Z")
                            .build()
                    )
                    .startedAt(
                        WebhookDeliveryListParams.Filter.StartedAt.builder()
                            .gte("2019-03-29T11:10:00Z")
                            .lte("2019-03-29T11:10:00Z")
                            .build()
                    )
                    .status(
                        WebhookDeliveryListParams.Filter.Status.builder()
                            .eq(WebhookDeliveryListParams.Filter.Status.Eq.DELIVERED)
                            .build()
                    )
                    .webhook(
                        WebhookDeliveryListParams.Filter.Webhook.builder()
                            .contains("call.initiated")
                            .build()
                    )
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WebhookDeliveryListParams.builder()
                .filter(
                    WebhookDeliveryListParams.Filter.builder()
                        .attempts(
                            WebhookDeliveryListParams.Filter.Attempts.builder()
                                .contains("https://fallback.example.com/webhooks")
                                .build()
                        )
                        .eventType("call_initiated,call.initiated")
                        .finishedAt(
                            WebhookDeliveryListParams.Filter.FinishedAt.builder()
                                .gte("2019-03-29T11:10:00Z")
                                .lte("2019-03-29T11:10:00Z")
                                .build()
                        )
                        .startedAt(
                            WebhookDeliveryListParams.Filter.StartedAt.builder()
                                .gte("2019-03-29T11:10:00Z")
                                .lte("2019-03-29T11:10:00Z")
                                .build()
                        )
                        .status(
                            WebhookDeliveryListParams.Filter.Status.builder()
                                .eq(WebhookDeliveryListParams.Filter.Status.Eq.DELIVERED)
                                .build()
                        )
                        .webhook(
                            WebhookDeliveryListParams.Filter.Webhook.builder()
                                .contains("call.initiated")
                                .build()
                        )
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[attempts][contains]", "https://fallback.example.com/webhooks")
                    .put("filter[event_type]", "call_initiated,call.initiated")
                    .put("filter[finished_at][gte]", "2019-03-29T11:10:00Z")
                    .put("filter[finished_at][lte]", "2019-03-29T11:10:00Z")
                    .put("filter[started_at][gte]", "2019-03-29T11:10:00Z")
                    .put("filter[started_at][lte]", "2019-03-29T11:10:00Z")
                    .put("filter[status][eq]", "delivered")
                    .put("filter[webhook][contains]", "call.initiated")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookDeliveryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
