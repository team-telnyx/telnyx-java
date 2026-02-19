// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ApiError
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionValidateResponseTest {

    @Test
    fun create() {
        val actionValidateResponse =
            ActionValidateResponse.builder()
                .data(
                    ActionValidateResponse.Data.builder()
                        .result(ActionValidateResponse.Data.Result.VALID)
                        .suggested(
                            ActionValidateResponse.Data.Suggested.builder()
                                .administrativeArea("TX")
                                .countryCode("US")
                                .extendedAddress("14th Floor")
                                .locality("Austin")
                                .postalCode("78701")
                                .streetAddress("600 Congress Avenue")
                                .build()
                        )
                        .addError(
                            ApiError.builder()
                                .code("20207")
                                .title("Invalid street address")
                                .detail("detail")
                                .meta(
                                    ApiError.Meta.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .source(
                                    ApiError.Source.builder()
                                        .parameter("parameter")
                                        .pointer("/street_address")
                                        .build()
                                )
                                .build()
                        )
                        .recordType("address_validation")
                        .build()
                )
                .build()

        assertThat(actionValidateResponse.data())
            .contains(
                ActionValidateResponse.Data.builder()
                    .result(ActionValidateResponse.Data.Result.VALID)
                    .suggested(
                        ActionValidateResponse.Data.Suggested.builder()
                            .administrativeArea("TX")
                            .countryCode("US")
                            .extendedAddress("14th Floor")
                            .locality("Austin")
                            .postalCode("78701")
                            .streetAddress("600 Congress Avenue")
                            .build()
                    )
                    .addError(
                        ApiError.builder()
                            .code("20207")
                            .title("Invalid street address")
                            .detail("detail")
                            .meta(
                                ApiError.Meta.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .source(
                                ApiError.Source.builder()
                                    .parameter("parameter")
                                    .pointer("/street_address")
                                    .build()
                            )
                            .build()
                    )
                    .recordType("address_validation")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionValidateResponse =
            ActionValidateResponse.builder()
                .data(
                    ActionValidateResponse.Data.builder()
                        .result(ActionValidateResponse.Data.Result.VALID)
                        .suggested(
                            ActionValidateResponse.Data.Suggested.builder()
                                .administrativeArea("TX")
                                .countryCode("US")
                                .extendedAddress("14th Floor")
                                .locality("Austin")
                                .postalCode("78701")
                                .streetAddress("600 Congress Avenue")
                                .build()
                        )
                        .addError(
                            ApiError.builder()
                                .code("20207")
                                .title("Invalid street address")
                                .detail("detail")
                                .meta(
                                    ApiError.Meta.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .source(
                                    ApiError.Source.builder()
                                        .parameter("parameter")
                                        .pointer("/street_address")
                                        .build()
                                )
                                .build()
                        )
                        .recordType("address_validation")
                        .build()
                )
                .build()

        val roundtrippedActionValidateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionValidateResponse),
                jacksonTypeRef<ActionValidateResponse>(),
            )

        assertThat(roundtrippedActionValidateResponse).isEqualTo(actionValidateResponse)
    }
}
