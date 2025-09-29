// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SimCardStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardUpdateResponseTest {

    @Test
    fun create() {
        val simCardUpdateResponse =
            SimCardUpdateResponse.builder()
                .data(
                    SimCard.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionsInProgress(true)
                        .authorizedImeis(
                            listOf("106516771852751", "534051870479563", "508821468377961")
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .currentBillingPeriodConsumedData(
                            SimCard.CurrentBillingPeriodConsumedData.builder()
                                .amount("2049.0")
                                .unit("MB")
                                .build()
                        )
                        .currentDeviceLocation(
                            SimCard.CurrentDeviceLocation.builder()
                                .accuracy(1250L)
                                .accuracyUnit("m")
                                .latitude("41.143")
                                .longitude("-8.605")
                                .build()
                        )
                        .currentImei("457032284023794")
                        .currentMcc("410")
                        .currentMnc("260")
                        .dataLimit(
                            SimCard.DataLimit.builder()
                                .amount("2048.1")
                                .unit(SimCard.DataLimit.Unit.MB)
                                .build()
                        )
                        .eid(null)
                        .esimInstallationStatus(SimCard.EsimInstallationStatus.RELEASED)
                        .iccid("89310410106543789301")
                        .imsi("081932214823362973")
                        .ipv4("192.168.0.0")
                        .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                        .liveDataSession(SimCard.LiveDataSession.CONNECTED)
                        .msisdn("+13109976224")
                        .pinPukCodes(
                            SimCard.PinPukCodes.builder()
                                .pin1("1234")
                                .pin2("5678")
                                .puk1("12345678")
                                .puk2("87654321")
                                .build()
                        )
                        .recordType("sim_card")
                        .addResourcesWithInProgressAction(JsonValue.from(mapOf<String, Any>()))
                        .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            SimCardStatus.builder()
                                .reason(
                                    "The SIM card is active, ready to connect to networks and consume data."
                                )
                                .value(SimCardStatus.Value.ENABLED)
                                .build()
                        )
                        .tags(listOf("personal", "customers", "active-customers"))
                        .type(SimCard.Type.PHYSICAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .version("4.3")
                        .build()
                )
                .build()

        assertThat(simCardUpdateResponse.data())
            .contains(
                SimCard.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionsInProgress(true)
                    .authorizedImeis(
                        listOf("106516771852751", "534051870479563", "508821468377961")
                    )
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .currentBillingPeriodConsumedData(
                        SimCard.CurrentBillingPeriodConsumedData.builder()
                            .amount("2049.0")
                            .unit("MB")
                            .build()
                    )
                    .currentDeviceLocation(
                        SimCard.CurrentDeviceLocation.builder()
                            .accuracy(1250L)
                            .accuracyUnit("m")
                            .latitude("41.143")
                            .longitude("-8.605")
                            .build()
                    )
                    .currentImei("457032284023794")
                    .currentMcc("410")
                    .currentMnc("260")
                    .dataLimit(
                        SimCard.DataLimit.builder()
                            .amount("2048.1")
                            .unit(SimCard.DataLimit.Unit.MB)
                            .build()
                    )
                    .eid(null)
                    .esimInstallationStatus(SimCard.EsimInstallationStatus.RELEASED)
                    .iccid("89310410106543789301")
                    .imsi("081932214823362973")
                    .ipv4("192.168.0.0")
                    .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                    .liveDataSession(SimCard.LiveDataSession.CONNECTED)
                    .msisdn("+13109976224")
                    .pinPukCodes(
                        SimCard.PinPukCodes.builder()
                            .pin1("1234")
                            .pin2("5678")
                            .puk1("12345678")
                            .puk2("87654321")
                            .build()
                    )
                    .recordType("sim_card")
                    .addResourcesWithInProgressAction(JsonValue.from(mapOf<String, Any>()))
                    .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(
                        SimCardStatus.builder()
                            .reason(
                                "The SIM card is active, ready to connect to networks and consume data."
                            )
                            .value(SimCardStatus.Value.ENABLED)
                            .build()
                    )
                    .tags(listOf("personal", "customers", "active-customers"))
                    .type(SimCard.Type.PHYSICAL)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .version("4.3")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardUpdateResponse =
            SimCardUpdateResponse.builder()
                .data(
                    SimCard.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionsInProgress(true)
                        .authorizedImeis(
                            listOf("106516771852751", "534051870479563", "508821468377961")
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .currentBillingPeriodConsumedData(
                            SimCard.CurrentBillingPeriodConsumedData.builder()
                                .amount("2049.0")
                                .unit("MB")
                                .build()
                        )
                        .currentDeviceLocation(
                            SimCard.CurrentDeviceLocation.builder()
                                .accuracy(1250L)
                                .accuracyUnit("m")
                                .latitude("41.143")
                                .longitude("-8.605")
                                .build()
                        )
                        .currentImei("457032284023794")
                        .currentMcc("410")
                        .currentMnc("260")
                        .dataLimit(
                            SimCard.DataLimit.builder()
                                .amount("2048.1")
                                .unit(SimCard.DataLimit.Unit.MB)
                                .build()
                        )
                        .eid(null)
                        .esimInstallationStatus(SimCard.EsimInstallationStatus.RELEASED)
                        .iccid("89310410106543789301")
                        .imsi("081932214823362973")
                        .ipv4("192.168.0.0")
                        .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                        .liveDataSession(SimCard.LiveDataSession.CONNECTED)
                        .msisdn("+13109976224")
                        .pinPukCodes(
                            SimCard.PinPukCodes.builder()
                                .pin1("1234")
                                .pin2("5678")
                                .puk1("12345678")
                                .puk2("87654321")
                                .build()
                        )
                        .recordType("sim_card")
                        .addResourcesWithInProgressAction(JsonValue.from(mapOf<String, Any>()))
                        .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            SimCardStatus.builder()
                                .reason(
                                    "The SIM card is active, ready to connect to networks and consume data."
                                )
                                .value(SimCardStatus.Value.ENABLED)
                                .build()
                        )
                        .tags(listOf("personal", "customers", "active-customers"))
                        .type(SimCard.Type.PHYSICAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .version("4.3")
                        .build()
                )
                .build()

        val roundtrippedSimCardUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardUpdateResponse),
                jacksonTypeRef<SimCardUpdateResponse>(),
            )

        assertThat(roundtrippedSimCardUpdateResponse).isEqualTo(simCardUpdateResponse)
    }
}
