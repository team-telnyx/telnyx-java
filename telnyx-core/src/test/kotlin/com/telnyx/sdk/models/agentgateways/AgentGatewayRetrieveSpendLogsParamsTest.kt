// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayRetrieveSpendLogsParamsTest {

    @Test
    fun create() {
        AgentGatewayRetrieveSpendLogsParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .keyId("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
            .pageNumber(1L)
            .pageSize(1L)
            .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentGatewayRetrieveSpendLogsParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AgentGatewayRetrieveSpendLogsParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .keyId("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
                .pageNumber(1L)
                .pageSize(1L)
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "end",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put(
                        "key_id",
                        "ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be",
                    )
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put(
                        "start",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("team_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AgentGatewayRetrieveSpendLogsParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
