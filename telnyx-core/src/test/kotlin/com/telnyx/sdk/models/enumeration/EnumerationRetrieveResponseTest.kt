// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enumeration

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumerationRetrieveResponseTest {

    @Test
    fun ofEnumList() {
        val enumList = listOf("string")

        val enumerationRetrieveResponse = EnumerationRetrieveResponse.ofEnumList(enumList)

        assertThat(enumerationRetrieveResponse.enumList()).contains(enumList)
        assertThat(enumerationRetrieveResponse.enumObject()).isEmpty
        assertThat(enumerationRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumListRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumerationRetrieveResponse = EnumerationRetrieveResponse.ofEnumList(listOf("string"))

        val roundtrippedEnumerationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumerationRetrieveResponse),
                jacksonTypeRef<EnumerationRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumerationRetrieveResponse).isEqualTo(enumerationRetrieveResponse)
    }

    @Test
    fun ofEnumObject() {
        val enumObject =
            JsonValue.from("{\"AREIS\": \"AREIS\", \"BANDW\": \"Bandwidth\", \"SINCH\": \"Sinch\"}")

        val enumerationRetrieveResponse = EnumerationRetrieveResponse.ofEnumObject(enumObject)

        assertThat(enumerationRetrieveResponse.enumList()).isEmpty
        assertThat(enumerationRetrieveResponse.enumObject()).contains(enumObject)
        assertThat(enumerationRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumerationRetrieveResponse =
            EnumerationRetrieveResponse.ofEnumObject(
                JsonValue.from(
                    "{\"AREIS\": \"AREIS\", \"BANDW\": \"Bandwidth\", \"SINCH\": \"Sinch\"}"
                )
            )

        val roundtrippedEnumerationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumerationRetrieveResponse),
                jacksonTypeRef<EnumerationRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumerationRetrieveResponse).isEqualTo(enumerationRetrieveResponse)
    }

    @Test
    fun ofEnumPaginated() {
        val enumPaginated =
            JsonValue.from(
                "{\"page\": 1, \"records\": [{\"isin\": \"US68243Q1067\", \"iso2\": \"US\", \"symbol\": \"FLWS\", \"exchange\": \"NASDAQ\", \"displayName\": \"1-800 FLOWERS.COM, Inc.\"}, {\"isin\": \"US88025U1097\", \"iso2\": \"US\", \"symbol\": \"TXG\", \"exchange\": \"NASDAQ\", \"displayName\": \"10X GENOMICS INC CLASS A\"}], \"totalRecords\": 2}"
            )

        val enumerationRetrieveResponse = EnumerationRetrieveResponse.ofEnumPaginated(enumPaginated)

        assertThat(enumerationRetrieveResponse.enumList()).isEmpty
        assertThat(enumerationRetrieveResponse.enumObject()).isEmpty
        assertThat(enumerationRetrieveResponse.enumPaginated()).contains(enumPaginated)
    }

    @Test
    fun ofEnumPaginatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val enumerationRetrieveResponse =
            EnumerationRetrieveResponse.ofEnumPaginated(
                JsonValue.from(
                    "{\"page\": 1, \"records\": [{\"isin\": \"US68243Q1067\", \"iso2\": \"US\", \"symbol\": \"FLWS\", \"exchange\": \"NASDAQ\", \"displayName\": \"1-800 FLOWERS.COM, Inc.\"}, {\"isin\": \"US88025U1097\", \"iso2\": \"US\", \"symbol\": \"TXG\", \"exchange\": \"NASDAQ\", \"displayName\": \"10X GENOMICS INC CLASS A\"}], \"totalRecords\": 2}"
                )
            )

        val roundtrippedEnumerationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enumerationRetrieveResponse),
                jacksonTypeRef<EnumerationRetrieveResponse>(),
            )

        assertThat(roundtrippedEnumerationRetrieveResponse).isEqualTo(enumerationRetrieveResponse)
    }
}
