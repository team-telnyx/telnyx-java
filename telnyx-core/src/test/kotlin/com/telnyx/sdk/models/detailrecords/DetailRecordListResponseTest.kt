// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DetailRecordListResponseTest {

    @Test
    fun ofMessageDetailRecord() {
        val messageDetailRecord =
            DetailRecordListResponse.MessageDetailRecord.builder()
                .recordType("message_detail_record")
                .carrier("T-Mobile USA")
                .carrierFee("0.003")
                .cld("+1555123456")
                .cli("+1555123456")
                .completedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .cost("0.003")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .currency("USD")
                .deliveryStatus("success: webhook succeeded")
                .deliveryStatusFailoverUrl("https://api.example.com/sms/telnyx/inbound")
                .deliveryStatusWebhookUrl("https://api.example.com/sms/telnyx/inbound")
                .direction(DetailRecordListResponse.MessageDetailRecord.Direction.OUTBOUND)
                .addError("40001")
                .fteu(false)
                .mcc("204")
                .messageType(DetailRecordListResponse.MessageDetailRecord.MessageType.SMS)
                .mnc("01")
                .onNet(true)
                .parts(2L)
                .profileId("30ef55db-c4a2-4c4a-9804-a68077973d07")
                .profileName("My Messaging Profile")
                .rate("0.003")
                .sentAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .sourceCountryCode("US")
                .status(DetailRecordListResponse.MessageDetailRecord.Status.DELIVERED)
                .tags("tag1,tag2,tag3")
                .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .uuid("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofMessageDetailRecord(messageDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).contains(messageDetailRecord)
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofMessageDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofMessageDetailRecord(
                DetailRecordListResponse.MessageDetailRecord.builder()
                    .recordType("message_detail_record")
                    .carrier("T-Mobile USA")
                    .carrierFee("0.003")
                    .cld("+1555123456")
                    .cli("+1555123456")
                    .completedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .cost("0.003")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .currency("USD")
                    .deliveryStatus("success: webhook succeeded")
                    .deliveryStatusFailoverUrl("https://api.example.com/sms/telnyx/inbound")
                    .deliveryStatusWebhookUrl("https://api.example.com/sms/telnyx/inbound")
                    .direction(DetailRecordListResponse.MessageDetailRecord.Direction.OUTBOUND)
                    .addError("40001")
                    .fteu(false)
                    .mcc("204")
                    .messageType(DetailRecordListResponse.MessageDetailRecord.MessageType.SMS)
                    .mnc("01")
                    .onNet(true)
                    .parts(2L)
                    .profileId("30ef55db-c4a2-4c4a-9804-a68077973d07")
                    .profileName("My Messaging Profile")
                    .rate("0.003")
                    .sentAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .sourceCountryCode("US")
                    .status(DetailRecordListResponse.MessageDetailRecord.Status.DELIVERED)
                    .tags("tag1,tag2,tag3")
                    .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .uuid("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofConferenceDetailRecord() {
        val conferenceDetailRecord =
            DetailRecordListResponse.ConferenceDetailRecord.builder()
                .recordType("conference_detail_record")
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .callSec(100L)
                .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .connectionId("1583941447772537867")
                .endedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .expiresAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .isTelnyxBillable(false)
                .name("My Conference")
                .participantCallSec(100L)
                .participantCount(5L)
                .region("ch1")
                .startedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofConferenceDetailRecord(conferenceDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord())
            .contains(conferenceDetailRecord)
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofConferenceDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofConferenceDetailRecord(
                DetailRecordListResponse.ConferenceDetailRecord.builder()
                    .recordType("conference_detail_record")
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .callSec(100L)
                    .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .connectionId("1583941447772537867")
                    .endedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .expiresAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .isTelnyxBillable(false)
                    .name("My Conference")
                    .participantCallSec(100L)
                    .participantCount(5L)
                    .region("ch1")
                    .startedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofConferenceParticipantDetailRecord() {
        val conferenceParticipantDetailRecord =
            DetailRecordListResponse.ConferenceParticipantDetailRecord.builder()
                .recordType("conference_participant_detail_record")
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .billedSec(120L)
                .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .callSec(100L)
                .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .conferenceId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .cost("0.004")
                .currency("USD")
                .destinationNumber("+18005550199")
                .isTelnyxBillable(true)
                .joinedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .leftAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .originatingNumber("+18005550199")
                .rate("0.002")
                .rateMeasuredIn("minutes")
                .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofConferenceParticipantDetailRecord(
                conferenceParticipantDetailRecord
            )

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord())
            .contains(conferenceParticipantDetailRecord)
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofConferenceParticipantDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofConferenceParticipantDetailRecord(
                DetailRecordListResponse.ConferenceParticipantDetailRecord.builder()
                    .recordType("conference_participant_detail_record")
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .billedSec(120L)
                    .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .callSec(100L)
                    .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .conferenceId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .cost("0.004")
                    .currency("USD")
                    .destinationNumber("+18005550199")
                    .isTelnyxBillable(true)
                    .joinedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .leftAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .originatingNumber("+18005550199")
                    .rate("0.002")
                    .rateMeasuredIn("minutes")
                    .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofAmdDetailRecord() {
        val amdDetailRecord =
            DetailRecordListResponse.AmdDetailRecord.builder()
                .recordType("amd_detail_record")
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .billingGroupId("01977831-abdd-4894-84f3-244385621424")
                .billingGroupName("Billing group name")
                .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .connectionId("1684947189014463919")
                .connectionName("Name of the connection with id specified in connection_id field")
                .cost("0.004")
                .currency("USD")
                .feature(DetailRecordListResponse.AmdDetailRecord.Feature.PREMIUM)
                .invokedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .isTelnyxBillable(true)
                .rate("0.002")
                .rateMeasuredIn("invocations")
                .tags("tag1,tag2")
                .build()

        val detailRecordListResponse = DetailRecordListResponse.ofAmdDetailRecord(amdDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).contains(amdDetailRecord)
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofAmdDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofAmdDetailRecord(
                DetailRecordListResponse.AmdDetailRecord.builder()
                    .recordType("amd_detail_record")
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .billingGroupId("01977831-abdd-4894-84f3-244385621424")
                    .billingGroupName("Billing group name")
                    .callLegId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .callSessionId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .connectionId("1684947189014463919")
                    .connectionName(
                        "Name of the connection with id specified in connection_id field"
                    )
                    .cost("0.004")
                    .currency("USD")
                    .feature(DetailRecordListResponse.AmdDetailRecord.Feature.PREMIUM)
                    .invokedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .isTelnyxBillable(true)
                    .rate("0.002")
                    .rateMeasuredIn("invocations")
                    .tags("tag1,tag2")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofVerifyDetailRecord() {
        val verifyDetailRecord =
            DetailRecordListResponse.VerifyDetailRecord.builder()
                .recordType("verification_detail_record")
                .id("0add777f-1549-46f7-84e9-ad7350f6aa97")
                .createdAt(OffsetDateTime.parse("2021-07-08T00:00:41.000000+00:00"))
                .currency("USD")
                .deliveryStatus("pending")
                .destinationPhoneNumber("+13124515883")
                .rate("0.002")
                .rateMeasuredIn("number of occurrences")
                .updatedAt(OffsetDateTime.parse("2021-07-08T00:00:41.000000+00:00"))
                .verificationStatus("pending")
                .verifyChannelId("5b7a8365-91f3-420a-befc-498d1efd6c20")
                .verifyChannelType(
                    DetailRecordListResponse.VerifyDetailRecord.VerifyChannelType.SMS
                )
                .verifyProfileId("49000176-1ab2-8bc1-352e-4009f6c37f82")
                .verifyUsageFee("0.002")
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofVerifyDetailRecord(verifyDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).contains(verifyDetailRecord)
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofVerifyDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofVerifyDetailRecord(
                DetailRecordListResponse.VerifyDetailRecord.builder()
                    .recordType("verification_detail_record")
                    .id("0add777f-1549-46f7-84e9-ad7350f6aa97")
                    .createdAt(OffsetDateTime.parse("2021-07-08T00:00:41.000000+00:00"))
                    .currency("USD")
                    .deliveryStatus("pending")
                    .destinationPhoneNumber("+13124515883")
                    .rate("0.002")
                    .rateMeasuredIn("number of occurrences")
                    .updatedAt(OffsetDateTime.parse("2021-07-08T00:00:41.000000+00:00"))
                    .verificationStatus("pending")
                    .verifyChannelId("5b7a8365-91f3-420a-befc-498d1efd6c20")
                    .verifyChannelType(
                        DetailRecordListResponse.VerifyDetailRecord.VerifyChannelType.SMS
                    )
                    .verifyProfileId("49000176-1ab2-8bc1-352e-4009f6c37f82")
                    .verifyUsageFee("0.002")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofSimCardUsageDetailRecord() {
        val simCardUsageDetailRecord =
            DetailRecordListResponse.SimCardUsageDetailRecord.builder()
                .recordType("sim_card_usage")
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .closedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .currency("USD")
                .dataCost(0.029283)
                .dataRate("0.06000")
                .dataUnit("MB")
                .downlinkData(0.124)
                .imsi("311210393720093")
                .ipAddress("100.64.1.2")
                .mcc("204")
                .mnc("69")
                .phoneNumber("+15188490209")
                .simCardId("7aa66686-b39f-456d-8edc-5b6cffb1432a")
                .simCardTags("mytag")
                .simGroupId("6c07e2e9-cbc0-49ba-ac0d-c59b59646bb1")
                .simGroupName("SIMBillingInfo test - otheraccount")
                .uplinkData(0.7653)
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofSimCardUsageDetailRecord(simCardUsageDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord())
            .contains(simCardUsageDetailRecord)
        assertThat(detailRecordListResponse.mediaStorageDetailRecord()).isEmpty
    }

    @Test
    fun ofSimCardUsageDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofSimCardUsageDetailRecord(
                DetailRecordListResponse.SimCardUsageDetailRecord.builder()
                    .recordType("sim_card_usage")
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .closedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .currency("USD")
                    .dataCost(0.029283)
                    .dataRate("0.06000")
                    .dataUnit("MB")
                    .downlinkData(0.124)
                    .imsi("311210393720093")
                    .ipAddress("100.64.1.2")
                    .mcc("204")
                    .mnc("69")
                    .phoneNumber("+15188490209")
                    .simCardId("7aa66686-b39f-456d-8edc-5b6cffb1432a")
                    .simCardTags("mytag")
                    .simGroupId("6c07e2e9-cbc0-49ba-ac0d-c59b59646bb1")
                    .simGroupName("SIMBillingInfo test - otheraccount")
                    .uplinkData(0.7653)
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }

    @Test
    fun ofMediaStorageDetailRecord() {
        val mediaStorageDetailRecord =
            DetailRecordListResponse.MediaStorageDetailRecord.builder()
                .recordType("media_storage")
                .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .actionType("upload")
                .assetId("a46f4764-4ce4-4391-804c-02f00bc4ff9b")
                .cost("0.004")
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                .currency("USD")
                .linkChannelId("2065f482-64b9-4680-a3a9-c6d3142efdf7")
                .linkChannelType("message")
                .orgId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .rate("0.0001")
                .rateMeasuredIn("events")
                .status("failed")
                .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                .webhookId("b46f4764-4ce4-4391-804c-02f00bc4ff9b")
                .build()

        val detailRecordListResponse =
            DetailRecordListResponse.ofMediaStorageDetailRecord(mediaStorageDetailRecord)

        assertThat(detailRecordListResponse.messageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.conferenceParticipantDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.amdDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.verifyDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.simCardUsageDetailRecord()).isEmpty
        assertThat(detailRecordListResponse.mediaStorageDetailRecord())
            .contains(mediaStorageDetailRecord)
    }

    @Test
    fun ofMediaStorageDetailRecordRoundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.ofMediaStorageDetailRecord(
                DetailRecordListResponse.MediaStorageDetailRecord.builder()
                    .recordType("media_storage")
                    .id("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .actionType("upload")
                    .assetId("a46f4764-4ce4-4391-804c-02f00bc4ff9b")
                    .cost("0.004")
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                    .currency("USD")
                    .linkChannelId("2065f482-64b9-4680-a3a9-c6d3142efdf7")
                    .linkChannelType("message")
                    .orgId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .rate("0.0001")
                    .rateMeasuredIn("events")
                    .status("failed")
                    .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                    .webhookId("b46f4764-4ce4-4391-804c-02f00bc4ff9b")
                    .build()
            )

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
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
        val detailRecordListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DetailRecordListResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { detailRecordListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
