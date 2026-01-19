// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberlookup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupRetrieveResponseTest {

    @Test
    fun create() {
        val numberLookupRetrieveResponse =
            NumberLookupRetrieveResponse.builder()
                .data(
                    NumberLookupRetrieveResponse.Data.builder()
                        .callerName(
                            NumberLookupRetrieveResponse.Data.CallerName.builder()
                                .callerName("TELNYX LLC")
                                .errorCode("10001")
                                .build()
                        )
                        .carrier(
                            NumberLookupRetrieveResponse.Data.Carrier.builder()
                                .errorCode(null)
                                .mobileCountryCode("US")
                                .mobileNetworkCode("0866")
                                .name("Telnyx/4")
                                .normalizedCarrier("AT&T")
                                .type(NumberLookupRetrieveResponse.Data.Carrier.Type.VOIP)
                                .build()
                        )
                        .countryCode("US")
                        .fraud(null)
                        .nationalFormat("(0312) 945-7420")
                        .phoneNumber("+13129457420")
                        .portability(
                            NumberLookupRetrieveResponse.Data.Portability.builder()
                                .altspid("073H")
                                .altspidCarrierName("Telnyx/4")
                                .altspidCarrierType("3")
                                .city("WAUKEGAN")
                                .lineType("voip")
                                .lrn("2245701999")
                                .ocn("073H")
                                .portedDate("2017-10-20")
                                .portedStatus(
                                    NumberLookupRetrieveResponse.Data.Portability.PortedStatus.Y
                                )
                                .spid("073H")
                                .spidCarrierName("Telnyx/4")
                                .spidCarrierType("3")
                                .state("Illinois")
                                .build()
                        )
                        .recordType("number_lookup")
                        .build()
                )
                .build()

        assertThat(numberLookupRetrieveResponse.data())
            .contains(
                NumberLookupRetrieveResponse.Data.builder()
                    .callerName(
                        NumberLookupRetrieveResponse.Data.CallerName.builder()
                            .callerName("TELNYX LLC")
                            .errorCode("10001")
                            .build()
                    )
                    .carrier(
                        NumberLookupRetrieveResponse.Data.Carrier.builder()
                            .errorCode(null)
                            .mobileCountryCode("US")
                            .mobileNetworkCode("0866")
                            .name("Telnyx/4")
                            .normalizedCarrier("AT&T")
                            .type(NumberLookupRetrieveResponse.Data.Carrier.Type.VOIP)
                            .build()
                    )
                    .countryCode("US")
                    .fraud(null)
                    .nationalFormat("(0312) 945-7420")
                    .phoneNumber("+13129457420")
                    .portability(
                        NumberLookupRetrieveResponse.Data.Portability.builder()
                            .altspid("073H")
                            .altspidCarrierName("Telnyx/4")
                            .altspidCarrierType("3")
                            .city("WAUKEGAN")
                            .lineType("voip")
                            .lrn("2245701999")
                            .ocn("073H")
                            .portedDate("2017-10-20")
                            .portedStatus(
                                NumberLookupRetrieveResponse.Data.Portability.PortedStatus.Y
                            )
                            .spid("073H")
                            .spidCarrierName("Telnyx/4")
                            .spidCarrierType("3")
                            .state("Illinois")
                            .build()
                    )
                    .recordType("number_lookup")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberLookupRetrieveResponse =
            NumberLookupRetrieveResponse.builder()
                .data(
                    NumberLookupRetrieveResponse.Data.builder()
                        .callerName(
                            NumberLookupRetrieveResponse.Data.CallerName.builder()
                                .callerName("TELNYX LLC")
                                .errorCode("10001")
                                .build()
                        )
                        .carrier(
                            NumberLookupRetrieveResponse.Data.Carrier.builder()
                                .errorCode(null)
                                .mobileCountryCode("US")
                                .mobileNetworkCode("0866")
                                .name("Telnyx/4")
                                .normalizedCarrier("AT&T")
                                .type(NumberLookupRetrieveResponse.Data.Carrier.Type.VOIP)
                                .build()
                        )
                        .countryCode("US")
                        .fraud(null)
                        .nationalFormat("(0312) 945-7420")
                        .phoneNumber("+13129457420")
                        .portability(
                            NumberLookupRetrieveResponse.Data.Portability.builder()
                                .altspid("073H")
                                .altspidCarrierName("Telnyx/4")
                                .altspidCarrierType("3")
                                .city("WAUKEGAN")
                                .lineType("voip")
                                .lrn("2245701999")
                                .ocn("073H")
                                .portedDate("2017-10-20")
                                .portedStatus(
                                    NumberLookupRetrieveResponse.Data.Portability.PortedStatus.Y
                                )
                                .spid("073H")
                                .spidCarrierName("Telnyx/4")
                                .spidCarrierType("3")
                                .state("Illinois")
                                .build()
                        )
                        .recordType("number_lookup")
                        .build()
                )
                .build()

        val roundtrippedNumberLookupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberLookupRetrieveResponse),
                jacksonTypeRef<NumberLookupRetrieveResponse>(),
            )

        assertThat(roundtrippedNumberLookupRetrieveResponse).isEqualTo(numberLookupRetrieveResponse)
    }
}
