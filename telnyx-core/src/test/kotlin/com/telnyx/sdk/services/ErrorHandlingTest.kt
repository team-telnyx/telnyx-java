// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.TelnyxClient
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.BadRequestException
import com.telnyx.sdk.errors.InternalServerException
import com.telnyx.sdk.errors.NotFoundException
import com.telnyx.sdk.errors.PermissionDeniedException
import com.telnyx.sdk.errors.RateLimitException
import com.telnyx.sdk.errors.TelnyxException
import com.telnyx.sdk.errors.UnauthorizedException
import com.telnyx.sdk.errors.UnexpectedStatusCodeException
import com.telnyx.sdk.errors.UnprocessableEntityException
import com.telnyx.sdk.models.numberorders.NumberOrderCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: TelnyxClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun numberOrdersCreate400() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate400WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate401() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate401WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate403() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate403WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate404() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate404WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate422() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate422WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate429() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate429WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate500() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate500WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate999() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreate999WithRawResponse() {
        val numberOrderService = client.numberOrders().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun numberOrdersCreateInvalidJsonBody() {
        val numberOrderService = client.numberOrders()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<TelnyxException> {
                numberOrderService.create(
                    NumberOrderCreateParams.builder()
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+19705555098")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd7")
                                .build()
                        )
                        .addPhoneNumber(
                            NumberOrderCreateParams.PhoneNumber.builder()
                                .phoneNumber("+492111609539")
                                .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                                .requirementGroupId("dbbd94ee-9079-488f-80ba-f566b247fd79")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
