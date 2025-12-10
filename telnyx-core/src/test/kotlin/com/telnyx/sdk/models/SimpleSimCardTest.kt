// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimpleSimCardTest {

    @Test
    fun create() {
        val simpleSimCard =
            SimpleSimCard.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionsInProgress(true)
                .authorizedImeis(listOf("106516771852751", "534051870479563", "508821468377961"))
                .createdAt("2018-02-02T22:25:27.521Z")
                .currentBillingPeriodConsumedData(
                    SimpleSimCard.CurrentBillingPeriodConsumedData.builder()
                        .amount("2049.0")
                        .unit("MB")
                        .build()
                )
                .dataLimit(
                    SimpleSimCard.DataLimit.builder()
                        .amount("2048.0")
                        .unit(SimpleSimCard.DataLimit.Unit.MB)
                        .build()
                )
                .eid(null)
                .esimInstallationStatus(SimpleSimCard.EsimInstallationStatus.RELEASED)
                .iccid("89310410106543789301")
                .imsi("081932214823362973")
                .msisdn("+13109976224")
                .recordType("sim_card")
                .addResourcesWithInProgressAction(JsonValue.from(mapOf<String, Any>()))
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(
                    SimCardStatus.builder()
                        .reason(
                            "The SIM card is active, ready to connect to networks and consume data."
                        )
                        .value(SimCardStatus.Value_.ENABLED)
                        .build()
                )
                .tags(listOf("personal", "customers", "active-customers"))
                .type(SimpleSimCard.Type.PHYSICAL)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .version("4.3")
                .build()

        assertThat(simpleSimCard.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simpleSimCard.actionsInProgress()).contains(true)
        assertThat(simpleSimCard.authorizedImeis().getOrNull())
            .containsExactly("106516771852751", "534051870479563", "508821468377961")
        assertThat(simpleSimCard.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simpleSimCard.currentBillingPeriodConsumedData())
            .contains(
                SimpleSimCard.CurrentBillingPeriodConsumedData.builder()
                    .amount("2049.0")
                    .unit("MB")
                    .build()
            )
        assertThat(simpleSimCard.dataLimit())
            .contains(
                SimpleSimCard.DataLimit.builder()
                    .amount("2048.0")
                    .unit(SimpleSimCard.DataLimit.Unit.MB)
                    .build()
            )
        assertThat(simpleSimCard.eid()).isEmpty
        assertThat(simpleSimCard.esimInstallationStatus())
            .contains(SimpleSimCard.EsimInstallationStatus.RELEASED)
        assertThat(simpleSimCard.iccid()).contains("89310410106543789301")
        assertThat(simpleSimCard.imsi()).contains("081932214823362973")
        assertThat(simpleSimCard.msisdn()).contains("+13109976224")
        assertThat(simpleSimCard.recordType()).contains("sim_card")
        assertThat(simpleSimCard.resourcesWithInProgressActions().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(simpleSimCard.simCardGroupId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simpleSimCard.status())
            .contains(
                SimCardStatus.builder()
                    .reason(
                        "The SIM card is active, ready to connect to networks and consume data."
                    )
                    .value(SimCardStatus.Value_.ENABLED)
                    .build()
            )
        assertThat(simpleSimCard.tags().getOrNull())
            .containsExactly("personal", "customers", "active-customers")
        assertThat(simpleSimCard.type()).contains(SimpleSimCard.Type.PHYSICAL)
        assertThat(simpleSimCard.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simpleSimCard.version()).contains("4.3")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simpleSimCard =
            SimpleSimCard.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionsInProgress(true)
                .authorizedImeis(listOf("106516771852751", "534051870479563", "508821468377961"))
                .createdAt("2018-02-02T22:25:27.521Z")
                .currentBillingPeriodConsumedData(
                    SimpleSimCard.CurrentBillingPeriodConsumedData.builder()
                        .amount("2049.0")
                        .unit("MB")
                        .build()
                )
                .dataLimit(
                    SimpleSimCard.DataLimit.builder()
                        .amount("2048.0")
                        .unit(SimpleSimCard.DataLimit.Unit.MB)
                        .build()
                )
                .eid(null)
                .esimInstallationStatus(SimpleSimCard.EsimInstallationStatus.RELEASED)
                .iccid("89310410106543789301")
                .imsi("081932214823362973")
                .msisdn("+13109976224")
                .recordType("sim_card")
                .addResourcesWithInProgressAction(JsonValue.from(mapOf<String, Any>()))
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(
                    SimCardStatus.builder()
                        .reason(
                            "The SIM card is active, ready to connect to networks and consume data."
                        )
                        .value(SimCardStatus.Value_.ENABLED)
                        .build()
                )
                .tags(listOf("personal", "customers", "active-customers"))
                .type(SimpleSimCard.Type.PHYSICAL)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .version("4.3")
                .build()

        val roundtrippedSimpleSimCard =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simpleSimCard),
                jacksonTypeRef<SimpleSimCard>(),
            )

        assertThat(roundtrippedSimpleSimCard).isEqualTo(simpleSimCard)
    }
}
