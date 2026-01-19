// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SubNumberOrderRegulatoryRequirementWithValue
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.numberorders.NumberOrderWithPhoneNumbers
import com.telnyx.sdk.models.numberorders.PhoneNumber
import com.telnyx.sdk.models.webhooks.CallAiGatherEndedWebhookEvent
import com.telnyx.sdk.models.webhooks.UnsafeUnwrapWebhookEvent
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/telnyx-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.legacy()).isNotNull()
        assertThat(client.oauth()).isNotNull()
        assertThat(client.oauthClients()).isNotNull()
        assertThat(client.oauthGrants()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.accessIpAddress()).isNotNull()
        assertThat(client.accessIpRanges()).isNotNull()
        assertThat(client.actions()).isNotNull()
        assertThat(client.addresses()).isNotNull()
        assertThat(client.advancedOrders()).isNotNull()
        assertThat(client.ai()).isNotNull()
        assertThat(client.auditEvents()).isNotNull()
        assertThat(client.authenticationProviders()).isNotNull()
        assertThat(client.availablePhoneNumberBlocks()).isNotNull()
        assertThat(client.availablePhoneNumbers()).isNotNull()
        assertThat(client.balance()).isNotNull()
        assertThat(client.billingGroups()).isNotNull()
        assertThat(client.bulkSimCardActions()).isNotNull()
        assertThat(client.bundlePricing()).isNotNull()
        assertThat(client.callControlApplications()).isNotNull()
        assertThat(client.callEvents()).isNotNull()
        assertThat(client.calls()).isNotNull()
        assertThat(client.channelZones()).isNotNull()
        assertThat(client.chargesBreakdown()).isNotNull()
        assertThat(client.chargesSummary()).isNotNull()
        assertThat(client.comments()).isNotNull()
        assertThat(client.conferences()).isNotNull()
        assertThat(client.connections()).isNotNull()
        assertThat(client.countryCoverage()).isNotNull()
        assertThat(client.credentialConnections()).isNotNull()
        assertThat(client.customStorageCredentials()).isNotNull()
        assertThat(client.customerServiceRecords()).isNotNull()
        assertThat(client.detailRecords()).isNotNull()
        assertThat(client.dialogflowConnections()).isNotNull()
        assertThat(client.documentLinks()).isNotNull()
        assertThat(client.documents()).isNotNull()
        assertThat(client.dynamicEmergencyAddresses()).isNotNull()
        assertThat(client.dynamicEmergencyEndpoints()).isNotNull()
        assertThat(client.externalConnections()).isNotNull()
        assertThat(client.faxApplications()).isNotNull()
        assertThat(client.faxes()).isNotNull()
        assertThat(client.fqdnConnections()).isNotNull()
        assertThat(client.fqdns()).isNotNull()
        assertThat(client.globalIpAllowedPorts()).isNotNull()
        assertThat(client.globalIpAssignmentHealth()).isNotNull()
        assertThat(client.globalIpAssignments()).isNotNull()
        assertThat(client.globalIpAssignmentsUsage()).isNotNull()
        assertThat(client.globalIpHealthCheckTypes()).isNotNull()
        assertThat(client.globalIpHealthChecks()).isNotNull()
        assertThat(client.globalIpLatency()).isNotNull()
        assertThat(client.globalIpProtocols()).isNotNull()
        assertThat(client.globalIpUsage()).isNotNull()
        assertThat(client.globalIps()).isNotNull()
        assertThat(client.inboundChannels()).isNotNull()
        assertThat(client.integrationSecrets()).isNotNull()
        assertThat(client.inventoryCoverage()).isNotNull()
        assertThat(client.invoices()).isNotNull()
        assertThat(client.ipConnections()).isNotNull()
        assertThat(client.ips()).isNotNull()
        assertThat(client.ledgerBillingGroupReports()).isNotNull()
        assertThat(client.list()).isNotNull()
        assertThat(client.managedAccounts()).isNotNull()
        assertThat(client.media()).isNotNull()
        assertThat(client.messages()).isNotNull()
        assertThat(client.messaging()).isNotNull()
        assertThat(client.messagingHostedNumberOrders()).isNotNull()
        assertThat(client.messagingHostedNumbers()).isNotNull()
        assertThat(client.messagingNumbersBulkUpdates()).isNotNull()
        assertThat(client.messagingOptouts()).isNotNull()
        assertThat(client.messagingProfiles()).isNotNull()
        assertThat(client.messagingTollfree()).isNotNull()
        assertThat(client.messagingUrlDomains()).isNotNull()
        assertThat(client.mobileNetworkOperators()).isNotNull()
        assertThat(client.mobilePushCredentials()).isNotNull()
        assertThat(client.networkCoverage()).isNotNull()
        assertThat(client.networks()).isNotNull()
        assertThat(client.notificationChannels()).isNotNull()
        assertThat(client.notificationEventConditions()).isNotNull()
        assertThat(client.notificationEvents()).isNotNull()
        assertThat(client.notificationProfiles()).isNotNull()
        assertThat(client.notificationSettings()).isNotNull()
        assertThat(client.numberBlockOrders()).isNotNull()
        assertThat(client.numberLookup()).isNotNull()
        assertThat(client.numberOrderPhoneNumbers()).isNotNull()
        assertThat(client.numberOrders()).isNotNull()
        assertThat(client.numberReservations()).isNotNull()
        assertThat(client.numbersFeatures()).isNotNull()
        assertThat(client.operatorConnect()).isNotNull()
        assertThat(client.otaUpdates()).isNotNull()
        assertThat(client.outboundVoiceProfiles()).isNotNull()
        assertThat(client.payment()).isNotNull()
        assertThat(client.phoneNumberBlocks()).isNotNull()
        assertThat(client.phoneNumbers()).isNotNull()
        assertThat(client.phoneNumbersRegulatoryRequirements()).isNotNull()
        assertThat(client.portabilityChecks()).isNotNull()
        assertThat(client.porting()).isNotNull()
        assertThat(client.portingOrders()).isNotNull()
        assertThat(client.portingPhoneNumbers()).isNotNull()
        assertThat(client.portouts()).isNotNull()
        assertThat(client.privateWirelessGateways()).isNotNull()
        assertThat(client.publicInternetGateways()).isNotNull()
        assertThat(client.queues()).isNotNull()
        assertThat(client.rcsAgents()).isNotNull()
        assertThat(client.recordingTranscriptions()).isNotNull()
        assertThat(client.recordings()).isNotNull()
        assertThat(client.regions()).isNotNull()
        assertThat(client.regulatoryRequirements()).isNotNull()
        assertThat(client.reports()).isNotNull()
        assertThat(client.requirementGroups()).isNotNull()
        assertThat(client.requirementTypes()).isNotNull()
        assertThat(client.requirements()).isNotNull()
        assertThat(client.roomCompositions()).isNotNull()
        assertThat(client.roomParticipants()).isNotNull()
        assertThat(client.roomRecordings()).isNotNull()
        assertThat(client.rooms()).isNotNull()
        assertThat(client.seti()).isNotNull()
        assertThat(client.shortCodes()).isNotNull()
        assertThat(client.simCardDataUsageNotifications()).isNotNull()
        assertThat(client.simCardGroups()).isNotNull()
        assertThat(client.simCardOrderPreview()).isNotNull()
        assertThat(client.simCardOrders()).isNotNull()
        assertThat(client.simCards()).isNotNull()
        assertThat(client.siprecConnectors()).isNotNull()
        assertThat(client.storage()).isNotNull()
        assertThat(client.subNumberOrders()).isNotNull()
        assertThat(client.subNumberOrdersReport()).isNotNull()
        assertThat(client.telephonyCredentials()).isNotNull()
        assertThat(client.texml()).isNotNull()
        assertThat(client.texmlApplications()).isNotNull()
        assertThat(client.textToSpeech()).isNotNull()
        assertThat(client.usageReports()).isNotNull()
        assertThat(client.userAddresses()).isNotNull()
        assertThat(client.userTags()).isNotNull()
        assertThat(client.verifications()).isNotNull()
        assertThat(client.verifiedNumbers()).isNotNull()
        assertThat(client.verifyProfiles()).isNotNull()
        assertThat(client.virtualCrossConnects()).isNotNull()
        assertThat(client.virtualCrossConnectsCoverage()).isNotNull()
        assertThat(client.webhookDeliveries()).isNotNull()
        assertThat(client.wireguardInterfaces()).isNotNull()
        assertThat(client.wireguardPeers()).isNotNull()
        assertThat(client.wireless()).isNotNull()
        assertThat(client.wirelessBlocklistValues()).isNotNull()
        assertThat(client.wirelessBlocklists()).isNotNull()
        assertThat(client.wellKnown()).isNotNull()
        assertThat(client.inexplicitNumberOrders()).isNotNull()
        assertThat(client.mobilePhoneNumbers()).isNotNull()
        assertThat(client.mobileVoiceConnections()).isNotNull()
        assertThat(client.messaging10dlc()).isNotNull()
        assertThat(client.speechToText()).isNotNull()
        assertThat(client.organizations()).isNotNull()
    }

    @Test
    fun numberOrderWithPhoneNumbersRoundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderWithPhoneNumbers =
            NumberOrderWithPhoneNumbers.builder()
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    PhoneNumber.builder()
                        .phoneNumber("+19705555098")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirementWithValue.builder()
                                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .build()
                )
                .addSubNumberOrdersId("string")
                .build()

        val roundtrippedNumberOrderWithPhoneNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderWithPhoneNumbers),
                jacksonTypeRef<NumberOrderWithPhoneNumbers>(),
            )

        assertThat(roundtrippedNumberOrderWithPhoneNumbers).isEqualTo(numberOrderWithPhoneNumbers)
    }

    @Test
    fun unsafeUnwrapWebhookEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofCallAiGatherEnded(
                CallAiGatherEndedWebhookEvent.builder()
                    .data(
                        CallAiGatherEndedWebhookEvent.Data.builder()
                            .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .eventType(
                                CallAiGatherEndedWebhookEvent.Data.EventType.CALL_AI_GATHER_ENDED
                            )
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                            .payload(
                                CallAiGatherEndedWebhookEvent.Data.Payload.builder()
                                    .callControlId(
                                        "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
                                    )
                                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                    .connectionId("7267xxxxxxxxxxxxxx")
                                    .from("+35319605860")
                                    .addMessageHistory(
                                        CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                            .builder()
                                            .content(
                                                "Hello, can you tell me your age and where you live?"
                                            )
                                            .role(
                                                CallAiGatherEndedWebhookEvent.Data.Payload
                                                    .MessageHistory
                                                    .Role
                                                    .ASSISTANT
                                            )
                                            .build()
                                    )
                                    .addMessageHistory(
                                        CallAiGatherEndedWebhookEvent.Data.Payload.MessageHistory
                                            .builder()
                                            .content("Hello, I'm 29 and I live in Paris?")
                                            .role(
                                                CallAiGatherEndedWebhookEvent.Data.Payload
                                                    .MessageHistory
                                                    .Role
                                                    .USER
                                            )
                                            .build()
                                    )
                                    .result(
                                        CallAiGatherEndedWebhookEvent.Data.Payload.Result.builder()
                                            .putAdditionalProperty("age", JsonValue.from("bar"))
                                            .putAdditionalProperty("city", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .status(CallAiGatherEndedWebhookEvent.Data.Payload.Status.VALID)
                                    .to("+35319605860")
                                    .build()
                            )
                            .recordType(CallAiGatherEndedWebhookEvent.Data.RecordType.EVENT)
                            .build()
                    )
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun streamBidirectionalCodecRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamBidirectionalCodec = StreamBidirectionalCodec.G722

        val roundtrippedStreamBidirectionalCodec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamBidirectionalCodec),
                jacksonTypeRef<StreamBidirectionalCodec>(),
            )

        assertThat(roundtrippedStreamBidirectionalCodec).isEqualTo(streamBidirectionalCodec)
    }
}
