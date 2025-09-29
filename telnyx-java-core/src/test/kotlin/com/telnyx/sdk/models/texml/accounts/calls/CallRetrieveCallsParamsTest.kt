// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveCallsParamsTest {

    @Test
    fun create() {
        CallRetrieveCallsParams.builder()
            .accountSid("account_sid")
            .endTime("EndTime")
            .endTimeGt("EndTime_gt")
            .endTimeLt("EndTime_lt")
            .from("From")
            .page(0L)
            .pageSize(0L)
            .pageToken("PageToken")
            .startTime("StartTime")
            .startTimeGt("StartTime_gt")
            .startTimeLt("StartTime_lt")
            .status(CallRetrieveCallsParams.Status.CANCELED)
            .to("To")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CallRetrieveCallsParams.builder().accountSid("account_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CallRetrieveCallsParams.builder()
                .accountSid("account_sid")
                .endTime("EndTime")
                .endTimeGt("EndTime_gt")
                .endTimeLt("EndTime_lt")
                .from("From")
                .page(0L)
                .pageSize(0L)
                .pageToken("PageToken")
                .startTime("StartTime")
                .startTimeGt("StartTime_gt")
                .startTimeLt("StartTime_lt")
                .status(CallRetrieveCallsParams.Status.CANCELED)
                .to("To")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("EndTime", "EndTime")
                    .put("EndTime_gt", "EndTime_gt")
                    .put("EndTime_lt", "EndTime_lt")
                    .put("From", "From")
                    .put("Page", "0")
                    .put("PageSize", "0")
                    .put("PageToken", "PageToken")
                    .put("StartTime", "StartTime")
                    .put("StartTime_gt", "StartTime_gt")
                    .put("StartTime_lt", "StartTime_lt")
                    .put("Status", "canceled")
                    .put("To", "To")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CallRetrieveCallsParams.builder().accountSid("account_sid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
