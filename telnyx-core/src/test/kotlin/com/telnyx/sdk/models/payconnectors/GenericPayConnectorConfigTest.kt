// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class GenericPayConnectorConfigTest {

    @Test
    fun ofBasicAuthenticationAlsoTheValidationDefault() {
        val basicAuthenticationAlsoTheValidationDefault =
            GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.builder()
                .password("P")
                .username("P")
                .token("token")
                .authType(
                    GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.AuthType
                        .BASIC
                )
                .endpointUrl("https://processor.example.com/pay")
                .timeout(1L)
                .build()

        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofBasicAuthenticationAlsoTheValidationDefault(
                basicAuthenticationAlsoTheValidationDefault
            )

        assertThat(genericPayConnectorConfig.basicAuthenticationAlsoTheValidationDefault())
            .contains(basicAuthenticationAlsoTheValidationDefault)
        assertThat(genericPayConnectorConfig.bearerAuthentication()).isEmpty
        assertThat(genericPayConnectorConfig.noProcessorAuthentication()).isEmpty
    }

    @Test
    fun ofBasicAuthenticationAlsoTheValidationDefaultRoundtrip() {
        val jsonMapper = jsonMapper()
        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofBasicAuthenticationAlsoTheValidationDefault(
                GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault.builder()
                    .password("P")
                    .username("P")
                    .token("token")
                    .authType(
                        GenericPayConnectorConfig.BasicAuthenticationAlsoTheValidationDefault
                            .AuthType
                            .BASIC
                    )
                    .endpointUrl("https://processor.example.com/pay")
                    .timeout(1L)
                    .build()
            )

        val roundtrippedGenericPayConnectorConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(genericPayConnectorConfig),
                jacksonTypeRef<GenericPayConnectorConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedGenericPayConnectorConfig))
            .isEqualTo(jsonMapper.writeValueAsString(genericPayConnectorConfig))
    }

    @Test
    fun ofBearerAuthentication() {
        val bearerAuthentication =
            GenericPayConnectorConfig.BearerAuthentication.builder()
                .token("P")
                .endpointUrl("https://processor.example.com/pay")
                .password("password")
                .timeout(1L)
                .username("username")
                .build()

        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofBearerAuthentication(bearerAuthentication)

        assertThat(genericPayConnectorConfig.basicAuthenticationAlsoTheValidationDefault()).isEmpty
        assertThat(genericPayConnectorConfig.bearerAuthentication()).contains(bearerAuthentication)
        assertThat(genericPayConnectorConfig.noProcessorAuthentication()).isEmpty
    }

    @Test
    fun ofBearerAuthenticationRoundtrip() {
        val jsonMapper = jsonMapper()
        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofBearerAuthentication(
                GenericPayConnectorConfig.BearerAuthentication.builder()
                    .token("P")
                    .endpointUrl("https://processor.example.com/pay")
                    .password("password")
                    .timeout(1L)
                    .username("username")
                    .build()
            )

        val roundtrippedGenericPayConnectorConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(genericPayConnectorConfig),
                jacksonTypeRef<GenericPayConnectorConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedGenericPayConnectorConfig))
            .isEqualTo(jsonMapper.writeValueAsString(genericPayConnectorConfig))
    }

    @Test
    fun ofNoProcessorAuthentication() {
        val noProcessorAuthentication =
            GenericPayConnectorConfig.NoProcessorAuthentication.builder()
                .token("token")
                .endpointUrl("https://processor.example.com/pay")
                .password("password")
                .timeout(1L)
                .username("username")
                .build()

        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofNoProcessorAuthentication(noProcessorAuthentication)

        assertThat(genericPayConnectorConfig.basicAuthenticationAlsoTheValidationDefault()).isEmpty
        assertThat(genericPayConnectorConfig.bearerAuthentication()).isEmpty
        assertThat(genericPayConnectorConfig.noProcessorAuthentication())
            .contains(noProcessorAuthentication)
    }

    @Test
    fun ofNoProcessorAuthenticationRoundtrip() {
        val jsonMapper = jsonMapper()
        val genericPayConnectorConfig =
            GenericPayConnectorConfig.ofNoProcessorAuthentication(
                GenericPayConnectorConfig.NoProcessorAuthentication.builder()
                    .token("token")
                    .endpointUrl("https://processor.example.com/pay")
                    .password("password")
                    .timeout(1L)
                    .username("username")
                    .build()
            )

        val roundtrippedGenericPayConnectorConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(genericPayConnectorConfig),
                jacksonTypeRef<GenericPayConnectorConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedGenericPayConnectorConfig))
            .isEqualTo(jsonMapper.writeValueAsString(genericPayConnectorConfig))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val genericPayConnectorConfig =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<GenericPayConnectorConfig>())

        val e = assertThrows<TelnyxInvalidDataException> { genericPayConnectorConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
