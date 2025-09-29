// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.SimCardStatus
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardTest {

    @Test
    fun create() {
        val simCard =
            SimCard.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionsInProgress(true)
                .authorizedImeis(listOf("106516771852751", "534051870479563", "508821468377961"))
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

        assertThat(simCard.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCard.actionsInProgress()).contains(true)
        assertThat(simCard.authorizedImeis().getOrNull())
            .containsExactly("106516771852751", "534051870479563", "508821468377961")
        assertThat(simCard.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCard.currentBillingPeriodConsumedData())
            .contains(
                SimCard.CurrentBillingPeriodConsumedData.builder()
                    .amount("2049.0")
                    .unit("MB")
                    .build()
            )
        assertThat(simCard.currentDeviceLocation())
            .contains(
                SimCard.CurrentDeviceLocation.builder()
                    .accuracy(1250L)
                    .accuracyUnit("m")
                    .latitude("41.143")
                    .longitude("-8.605")
                    .build()
            )
        assertThat(simCard.currentImei()).contains("457032284023794")
        assertThat(simCard.currentMcc()).contains("410")
        assertThat(simCard.currentMnc()).contains("260")
        assertThat(simCard.dataLimit())
            .contains(
                SimCard.DataLimit.builder().amount("2048.1").unit(SimCard.DataLimit.Unit.MB).build()
            )
        assertThat(simCard.eid()).isEmpty
        assertThat(simCard.esimInstallationStatus())
            .contains(SimCard.EsimInstallationStatus.RELEASED)
        assertThat(simCard.iccid()).contains("89310410106543789301")
        assertThat(simCard.imsi()).contains("081932214823362973")
        assertThat(simCard.ipv4()).contains("192.168.0.0")
        assertThat(simCard.ipv6()).contains("2001:cdba:0000:0000:0000:0000:3257:9652")
        assertThat(simCard.liveDataSession()).contains(SimCard.LiveDataSession.CONNECTED)
        assertThat(simCard.msisdn()).contains("+13109976224")
        assertThat(simCard.pinPukCodes())
            .contains(
                SimCard.PinPukCodes.builder()
                    .pin1("1234")
                    .pin2("5678")
                    .puk1("12345678")
                    .puk2("87654321")
                    .build()
            )
        assertThat(simCard.recordType()).contains("sim_card")
        assertThat(simCard.resourcesWithInProgressActions().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(simCard.simCardGroupId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCard.status())
            .contains(
                SimCardStatus.builder()
                    .reason(
                        "The SIM card is active, ready to connect to networks and consume data."
                    )
                    .value(SimCardStatus.Value.ENABLED)
                    .build()
            )
        assertThat(simCard.tags().getOrNull())
            .containsExactly("personal", "customers", "active-customers")
        assertThat(simCard.type()).contains(SimCard.Type.PHYSICAL)
        assertThat(simCard.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCard.version()).contains("4.3")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCard =
            SimCard.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionsInProgress(true)
                .authorizedImeis(listOf("106516771852751", "534051870479563", "508821468377961"))
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

        val roundtrippedSimCard =
            jsonMapper.readValue(jsonMapper.writeValueAsString(simCard), jacksonTypeRef<SimCard>())

        assertThat(roundtrippedSimCard).isEqualTo(simCard)
    }
}
