// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enum_

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumRetrieveResponseTest {

    @Test
    fun ofList() {
        val list =
            listOf(
                EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("BASIC_ACCOUNT"),
                EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("SMALL_ACCOUNT"),
                EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("MEDIUM_ACCOUNT"),
                EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("LARGE_ACCOUNT"),
                EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("KEY_ACCOUNT"),
            )

        val enumRetrieveResponse = EnumRetrieveResponse.ofList(list)

        assertThat(enumRetrieveResponse.list()).contains(list)
        assertThat(enumRetrieveResponse.enumObjectResponse()).isEmpty
        assertThat(enumRetrieveResponse.paginated()).isEmpty
    }

    @Test
    fun ofListRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumRetrieveResponse =
            EnumRetrieveResponse.ofList(
                listOf(
                    EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("BASIC_ACCOUNT"),
                    EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("SMALL_ACCOUNT"),
                    EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("MEDIUM_ACCOUNT"),
                    EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("LARGE_ACCOUNT"),
                    EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("KEY_ACCOUNT"),
                )
            )

        val roundtrippedEnumRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumRetrieveResponse),
                jacksonTypeRef<EnumRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumRetrieveResponse).isEqualTo(enumRetrieveResponse)
    }

    @Test
    fun ofEnumObjectResponse() {
        val enumObjectResponse =
            JsonValue.from(mapOf("AREIS" to "AREIS", "BANDW" to "Bandwidth", "SINCH" to "Sinch"))

        val enumRetrieveResponse = EnumRetrieveResponse.ofEnumObjectResponse(enumObjectResponse)

        assertThat(enumRetrieveResponse.list()).isEmpty
        assertThat(enumRetrieveResponse.enumObjectResponse()).contains(enumObjectResponse)
        assertThat(enumRetrieveResponse.paginated()).isEmpty
    }

    @Test
    fun ofEnumObjectResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumRetrieveResponse =
            EnumRetrieveResponse.ofEnumObjectResponse(
                JsonValue.from(
                    mapOf("AREIS" to "AREIS", "BANDW" to "Bandwidth", "SINCH" to "Sinch")
                )
            )

        val roundtrippedEnumRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumRetrieveResponse),
                jacksonTypeRef<EnumRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumRetrieveResponse).isEqualTo(enumRetrieveResponse)
    }

    @Test
    fun ofPaginated() {
        val paginated =
            JsonValue.from(
                mapOf(
                    "page" to 1,
                    "records" to
                        listOf(
                            mapOf(
                                "isin" to "US68243Q1067",
                                "iso2" to "US",
                                "symbol" to "FLWS",
                                "exchange" to "NASDAQ",
                                "displayName" to "1-800 FLOWERS.COM, Inc.",
                            ),
                            mapOf(
                                "isin" to "US88025U1097",
                                "iso2" to "US",
                                "symbol" to "TXG",
                                "exchange" to "NASDAQ",
                                "displayName" to "10X GENOMICS INC CLASS A",
                            ),
                        ),
                    "totalRecords" to 2,
                )
            )

        val enumRetrieveResponse = EnumRetrieveResponse.ofPaginated(paginated)

        assertThat(enumRetrieveResponse.list()).isEmpty
        assertThat(enumRetrieveResponse.enumObjectResponse()).isEmpty
        assertThat(enumRetrieveResponse.paginated()).contains(paginated)
    }

    @Test
    fun ofPaginatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumRetrieveResponse =
            EnumRetrieveResponse.ofPaginated(
                JsonValue.from(
                    mapOf(
                        "page" to 1,
                        "records" to
                            listOf(
                                mapOf(
                                    "isin" to "US68243Q1067",
                                    "iso2" to "US",
                                    "symbol" to "FLWS",
                                    "exchange" to "NASDAQ",
                                    "displayName" to "1-800 FLOWERS.COM, Inc.",
                                ),
                                mapOf(
                                    "isin" to "US88025U1097",
                                    "iso2" to "US",
                                    "symbol" to "TXG",
                                    "exchange" to "NASDAQ",
                                    "displayName" to "10X GENOMICS INC CLASS A",
                                ),
                            ),
                        "totalRecords" to 2,
                    )
                )
            )

        val roundtrippedEnumRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumRetrieveResponse),
                jacksonTypeRef<EnumRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumRetrieveResponse).isEqualTo(enumRetrieveResponse)
    }
}
