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
        val list = listOf(EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("string"))

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
                listOf(EnumRetrieveResponse.UnnamedSchemaWithArrayParent0.ofString("string"))
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
            JsonValue.from("{\"AREIS\": \"AREIS\", \"BANDW\": \"Bandwidth\", \"SINCH\": \"Sinch\"}")

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
                    "{\"AREIS\": \"AREIS\", \"BANDW\": \"Bandwidth\", \"SINCH\": \"Sinch\"}"
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
                "{\"page\": 1, \"records\": [{\"isin\": \"US68243Q1067\", \"iso2\": \"US\", \"symbol\": \"FLWS\", \"exchange\": \"NASDAQ\", \"displayName\": \"1-800 FLOWERS.COM, Inc.\"}, {\"isin\": \"US88025U1097\", \"iso2\": \"US\", \"symbol\": \"TXG\", \"exchange\": \"NASDAQ\", \"displayName\": \"10X GENOMICS INC CLASS A\"}], \"totalRecords\": 2}"
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
                    "{\"page\": 1, \"records\": [{\"isin\": \"US68243Q1067\", \"iso2\": \"US\", \"symbol\": \"FLWS\", \"exchange\": \"NASDAQ\", \"displayName\": \"1-800 FLOWERS.COM, Inc.\"}, {\"isin\": \"US88025U1097\", \"iso2\": \"US\", \"symbol\": \"TXG\", \"exchange\": \"NASDAQ\", \"displayName\": \"10X GENOMICS INC CLASS A\"}], \"totalRecords\": 2}"
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
