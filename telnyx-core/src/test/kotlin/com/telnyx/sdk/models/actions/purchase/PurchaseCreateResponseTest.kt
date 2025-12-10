// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.actions.purchase

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SimCardStatus
import com.telnyx.sdk.models.SimpleSimCard
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PurchaseCreateResponseTest {

    @Test
    fun create() {
        val purchaseCreateResponse =
            PurchaseCreateResponse.builder()
                .addData(
                    SimpleSimCard.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionsInProgress(true)
                        .authorizedImeis(
                            listOf("106516771852751", "534051870479563", "508821468377961")
                        )
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
                        .addResourcesWithInProgressAction(
                            SimpleSimCard.ResourcesWithInProgressAction.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            SimCardStatus.builder()
                                .reason(
                                    "The SIM card is active, ready to connect to networks and consume data."
                                )
                                .value(SimCardStatus.SimCardStatusValue.ENABLED)
                                .build()
                        )
                        .tags(listOf("personal", "customers", "active-customers"))
                        .type(SimpleSimCard.Type.PHYSICAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .version("4.3")
                        .build()
                )
                .addError(
                    PurchaseCreateResponse.Error.builder()
                        .code("code")
                        .title("title")
                        .detail("detail")
                        .meta(
                            PurchaseCreateResponse.Error.Meta.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .source(
                            PurchaseCreateResponse.Error.Source.builder()
                                .parameter("parameter")
                                .pointer("pointer")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(purchaseCreateResponse.data().getOrNull())
            .containsExactly(
                SimpleSimCard.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionsInProgress(true)
                    .authorizedImeis(
                        listOf("106516771852751", "534051870479563", "508821468377961")
                    )
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
                    .addResourcesWithInProgressAction(
                        SimpleSimCard.ResourcesWithInProgressAction.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(
                        SimCardStatus.builder()
                            .reason(
                                "The SIM card is active, ready to connect to networks and consume data."
                            )
                            .value(SimCardStatus.SimCardStatusValue.ENABLED)
                            .build()
                    )
                    .tags(listOf("personal", "customers", "active-customers"))
                    .type(SimpleSimCard.Type.PHYSICAL)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .version("4.3")
                    .build()
            )
        assertThat(purchaseCreateResponse.errors().getOrNull())
            .containsExactly(
                PurchaseCreateResponse.Error.builder()
                    .code("code")
                    .title("title")
                    .detail("detail")
                    .meta(
                        PurchaseCreateResponse.Error.Meta.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .source(
                        PurchaseCreateResponse.Error.Source.builder()
                            .parameter("parameter")
                            .pointer("pointer")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val purchaseCreateResponse =
            PurchaseCreateResponse.builder()
                .addData(
                    SimpleSimCard.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionsInProgress(true)
                        .authorizedImeis(
                            listOf("106516771852751", "534051870479563", "508821468377961")
                        )
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
                        .addResourcesWithInProgressAction(
                            SimpleSimCard.ResourcesWithInProgressAction.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            SimCardStatus.builder()
                                .reason(
                                    "The SIM card is active, ready to connect to networks and consume data."
                                )
                                .value(SimCardStatus.SimCardStatusValue.ENABLED)
                                .build()
                        )
                        .tags(listOf("personal", "customers", "active-customers"))
                        .type(SimpleSimCard.Type.PHYSICAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .version("4.3")
                        .build()
                )
                .addError(
                    PurchaseCreateResponse.Error.builder()
                        .code("code")
                        .title("title")
                        .detail("detail")
                        .meta(
                            PurchaseCreateResponse.Error.Meta.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .source(
                            PurchaseCreateResponse.Error.Source.builder()
                                .parameter("parameter")
                                .pointer("pointer")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPurchaseCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(purchaseCreateResponse),
                jacksonTypeRef<PurchaseCreateResponse>(),
            )

        assertThat(roundtrippedPurchaseCreateResponse).isEqualTo(purchaseCreateResponse)
    }
}
