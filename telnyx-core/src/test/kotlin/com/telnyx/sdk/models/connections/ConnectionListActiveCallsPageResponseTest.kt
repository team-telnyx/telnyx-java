// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.Cursor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListActiveCallsPageResponseTest {

    @Test
    fun create() {
        val connectionListActiveCallsPageResponse =
            ConnectionListActiveCallsPageResponse.builder()
                .addData(
                    ConnectionListActiveCallsResponse.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callDuration(50L)
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .recordType(ConnectionListActiveCallsResponse.RecordType.CALL)
                        .build()
                )
                .meta(
                    ConnectionListActiveCallsPageResponse.Meta.builder()
                        .cursors(
                            Cursor.builder()
                                .after(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .before(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .build()
                        )
                        .next(
                            "/v2/connections/1234567890/active_calls?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .previous(
                            "/v2/connections/1234567890/active_calls?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .totalItems(50L)
                        .build()
                )
                .build()

        assertThat(connectionListActiveCallsPageResponse.data().getOrNull())
            .containsExactly(
                ConnectionListActiveCallsResponse.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callDuration(50L)
                    .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                    .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .recordType(ConnectionListActiveCallsResponse.RecordType.CALL)
                    .build()
            )
        assertThat(connectionListActiveCallsPageResponse.meta())
            .contains(
                ConnectionListActiveCallsPageResponse.Meta.builder()
                    .cursors(
                        Cursor.builder()
                            .after(
                                "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                            )
                            .before(
                                "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                            )
                            .build()
                    )
                    .next(
                        "/v2/connections/1234567890/active_calls?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                    )
                    .previous(
                        "/v2/connections/1234567890/active_calls?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                    )
                    .totalItems(50L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListActiveCallsPageResponse =
            ConnectionListActiveCallsPageResponse.builder()
                .addData(
                    ConnectionListActiveCallsResponse.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callDuration(50L)
                        .callLegId("2dc6fc34-f9e0-11ea-b68e-02420a0f7768")
                        .callSessionId("2dc1b3c8-f9e0-11ea-bc5a-02420a0f7768")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .recordType(ConnectionListActiveCallsResponse.RecordType.CALL)
                        .build()
                )
                .meta(
                    ConnectionListActiveCallsPageResponse.Meta.builder()
                        .cursors(
                            Cursor.builder()
                                .after(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .before(
                                    "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                                )
                                .build()
                        )
                        .next(
                            "/v2/connections/1234567890/active_calls?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .previous(
                            "/v2/connections/1234567890/active_calls?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI="
                        )
                        .totalItems(50L)
                        .build()
                )
                .build()

        val roundtrippedConnectionListActiveCallsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListActiveCallsPageResponse),
                jacksonTypeRef<ConnectionListActiveCallsPageResponse>(),
            )

        assertThat(roundtrippedConnectionListActiveCallsPageResponse)
            .isEqualTo(connectionListActiveCallsPageResponse)
    }
}
