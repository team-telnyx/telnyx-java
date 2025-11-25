// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CampaignStatusUpdateWebhookEventTest {

    @Test
    fun ofCampaignStatusUpdateEvent() {
        val campaignStatusUpdateEvent =
            CampaignStatusUpdateWebhookEvent.CampaignStatusUpdateEvent.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .createDate("createDate")
                .cspId("cspId")
                .isTMobileRegistered(true)
                .build()

        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.ofCampaignStatusUpdateEvent(campaignStatusUpdateEvent)

        assertThat(campaignStatusUpdateWebhookEvent.campaignStatusUpdateEvent())
            .contains(campaignStatusUpdateEvent)
        assertThat(campaignStatusUpdateWebhookEvent.suspended()).isEmpty
    }

    @Test
    fun ofCampaignStatusUpdateEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.ofCampaignStatusUpdateEvent(
                CampaignStatusUpdateWebhookEvent.CampaignStatusUpdateEvent.builder()
                    .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .createDate("createDate")
                    .cspId("cspId")
                    .isTMobileRegistered(true)
                    .build()
            )

        val roundtrippedCampaignStatusUpdateWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignStatusUpdateWebhookEvent),
                jacksonTypeRef<CampaignStatusUpdateWebhookEvent>(),
            )

        assertThat(roundtrippedCampaignStatusUpdateWebhookEvent)
            .isEqualTo(campaignStatusUpdateWebhookEvent)
    }

    @Test
    fun ofSuspended() {
        val suspended =
            CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.builder()
                .campaignId("4b30019a-9dca-a78d-1124-b080d7dedecc")
                .description("Campaign has been marked as dormant")
                .status(CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.Status.DORMANT)
                .type(CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.Type.TELNYX_EVENT)
                .build()

        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.ofSuspended(suspended)

        assertThat(campaignStatusUpdateWebhookEvent.campaignStatusUpdateEvent()).isEmpty
        assertThat(campaignStatusUpdateWebhookEvent.suspended()).contains(suspended)
    }

    @Test
    fun ofSuspendedRoundtrip() {
        val jsonMapper = jsonMapper()
        val campaignStatusUpdateWebhookEvent =
            CampaignStatusUpdateWebhookEvent.ofSuspended(
                CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.builder()
                    .campaignId("4b30019a-9dca-a78d-1124-b080d7dedecc")
                    .description("Campaign has been marked as dormant")
                    .status(CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.Status.DORMANT)
                    .type(CampaignStatusUpdateWebhookEvent.CampaignSuspendedEvent.Type.TELNYX_EVENT)
                    .build()
            )

        val roundtrippedCampaignStatusUpdateWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignStatusUpdateWebhookEvent),
                jacksonTypeRef<CampaignStatusUpdateWebhookEvent>(),
            )

        assertThat(roundtrippedCampaignStatusUpdateWebhookEvent)
            .isEqualTo(campaignStatusUpdateWebhookEvent)
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
        val campaignStatusUpdateWebhookEvent =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<CampaignStatusUpdateWebhookEvent>())

        val e =
            assertThrows<TelnyxInvalidDataException> { campaignStatusUpdateWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
