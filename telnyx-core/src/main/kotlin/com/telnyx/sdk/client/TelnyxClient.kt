// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.AccessIpAddressService
import com.telnyx.sdk.services.blocking.AccessIpRangeService
import com.telnyx.sdk.services.blocking.ActionService
import com.telnyx.sdk.services.blocking.AddressService
import com.telnyx.sdk.services.blocking.AdvancedOrderService
import com.telnyx.sdk.services.blocking.AiService
import com.telnyx.sdk.services.blocking.AuditEventService
import com.telnyx.sdk.services.blocking.AuthenticationProviderService
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberBlockService
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberService
import com.telnyx.sdk.services.blocking.BalanceService
import com.telnyx.sdk.services.blocking.BillingGroupService
import com.telnyx.sdk.services.blocking.BulkSimCardActionService
import com.telnyx.sdk.services.blocking.BundlePricingService
import com.telnyx.sdk.services.blocking.CallControlApplicationService
import com.telnyx.sdk.services.blocking.CallEventService
import com.telnyx.sdk.services.blocking.CallService
import com.telnyx.sdk.services.blocking.ChannelZoneService
import com.telnyx.sdk.services.blocking.ChargesBreakdownService
import com.telnyx.sdk.services.blocking.ChargesSummaryService
import com.telnyx.sdk.services.blocking.CommentService
import com.telnyx.sdk.services.blocking.ConferenceService
import com.telnyx.sdk.services.blocking.ConnectionService
import com.telnyx.sdk.services.blocking.CountryCoverageService
import com.telnyx.sdk.services.blocking.CredentialConnectionService
import com.telnyx.sdk.services.blocking.CustomStorageCredentialService
import com.telnyx.sdk.services.blocking.CustomerServiceRecordService
import com.telnyx.sdk.services.blocking.DetailRecordService
import com.telnyx.sdk.services.blocking.DialogflowConnectionService
import com.telnyx.sdk.services.blocking.DocumentLinkService
import com.telnyx.sdk.services.blocking.DocumentService
import com.telnyx.sdk.services.blocking.DynamicEmergencyAddressService
import com.telnyx.sdk.services.blocking.DynamicEmergencyEndpointService
import com.telnyx.sdk.services.blocking.ExternalConnectionService
import com.telnyx.sdk.services.blocking.FaxApplicationService
import com.telnyx.sdk.services.blocking.FaxService
import com.telnyx.sdk.services.blocking.FqdnConnectionService
import com.telnyx.sdk.services.blocking.FqdnService
import com.telnyx.sdk.services.blocking.GlobalIpAllowedPortService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentHealthService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentsUsageService
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckService
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckTypeService
import com.telnyx.sdk.services.blocking.GlobalIpLatencyService
import com.telnyx.sdk.services.blocking.GlobalIpProtocolService
import com.telnyx.sdk.services.blocking.GlobalIpService
import com.telnyx.sdk.services.blocking.GlobalIpUsageService
import com.telnyx.sdk.services.blocking.InboundChannelService
import com.telnyx.sdk.services.blocking.InexplicitNumberOrderService
import com.telnyx.sdk.services.blocking.IntegrationSecretService
import com.telnyx.sdk.services.blocking.InventoryCoverageService
import com.telnyx.sdk.services.blocking.InvoiceService
import com.telnyx.sdk.services.blocking.IpConnectionService
import com.telnyx.sdk.services.blocking.IpService
import com.telnyx.sdk.services.blocking.LedgerBillingGroupReportService
import com.telnyx.sdk.services.blocking.LegacyService
import com.telnyx.sdk.services.blocking.ListService
import com.telnyx.sdk.services.blocking.ManagedAccountService
import com.telnyx.sdk.services.blocking.MediaService
import com.telnyx.sdk.services.blocking.MessageService
import com.telnyx.sdk.services.blocking.Messaging10dlcService
import com.telnyx.sdk.services.blocking.MessagingHostedNumberOrderService
import com.telnyx.sdk.services.blocking.MessagingHostedNumberService
import com.telnyx.sdk.services.blocking.MessagingNumbersBulkUpdateService
import com.telnyx.sdk.services.blocking.MessagingOptoutService
import com.telnyx.sdk.services.blocking.MessagingProfileService
import com.telnyx.sdk.services.blocking.MessagingService
import com.telnyx.sdk.services.blocking.MessagingTollfreeService
import com.telnyx.sdk.services.blocking.MessagingUrlDomainService
import com.telnyx.sdk.services.blocking.MobileNetworkOperatorService
import com.telnyx.sdk.services.blocking.MobilePhoneNumberService
import com.telnyx.sdk.services.blocking.MobilePushCredentialService
import com.telnyx.sdk.services.blocking.MobileVoiceConnectionService
import com.telnyx.sdk.services.blocking.NetworkCoverageService
import com.telnyx.sdk.services.blocking.NetworkService
import com.telnyx.sdk.services.blocking.NotificationChannelService
import com.telnyx.sdk.services.blocking.NotificationEventConditionService
import com.telnyx.sdk.services.blocking.NotificationEventService
import com.telnyx.sdk.services.blocking.NotificationProfileService
import com.telnyx.sdk.services.blocking.NotificationSettingService
import com.telnyx.sdk.services.blocking.NumberBlockOrderService
import com.telnyx.sdk.services.blocking.NumberLookupService
import com.telnyx.sdk.services.blocking.NumberOrderPhoneNumberService
import com.telnyx.sdk.services.blocking.NumberOrderService
import com.telnyx.sdk.services.blocking.NumberReservationService
import com.telnyx.sdk.services.blocking.NumbersFeatureService
import com.telnyx.sdk.services.blocking.OAuthClientService
import com.telnyx.sdk.services.blocking.OAuthGrantService
import com.telnyx.sdk.services.blocking.OAuthService
import com.telnyx.sdk.services.blocking.OperatorConnectService
import com.telnyx.sdk.services.blocking.OtaUpdateService
import com.telnyx.sdk.services.blocking.OutboundVoiceProfileService
import com.telnyx.sdk.services.blocking.PaymentService
import com.telnyx.sdk.services.blocking.PhoneNumberBlockService
import com.telnyx.sdk.services.blocking.PhoneNumberService
import com.telnyx.sdk.services.blocking.PhoneNumbersRegulatoryRequirementService
import com.telnyx.sdk.services.blocking.PortabilityCheckService
import com.telnyx.sdk.services.blocking.PortingOrderService
import com.telnyx.sdk.services.blocking.PortingPhoneNumberService
import com.telnyx.sdk.services.blocking.PortingService
import com.telnyx.sdk.services.blocking.PortoutService
import com.telnyx.sdk.services.blocking.PrivateWirelessGatewayService
import com.telnyx.sdk.services.blocking.PublicInternetGatewayService
import com.telnyx.sdk.services.blocking.QueueService
import com.telnyx.sdk.services.blocking.RcsAgentService
import com.telnyx.sdk.services.blocking.RecordingService
import com.telnyx.sdk.services.blocking.RecordingTranscriptionService
import com.telnyx.sdk.services.blocking.RegionService
import com.telnyx.sdk.services.blocking.RegulatoryRequirementService
import com.telnyx.sdk.services.blocking.ReportService
import com.telnyx.sdk.services.blocking.RequirementGroupService
import com.telnyx.sdk.services.blocking.RequirementService
import com.telnyx.sdk.services.blocking.RequirementTypeService
import com.telnyx.sdk.services.blocking.RoomCompositionService
import com.telnyx.sdk.services.blocking.RoomParticipantService
import com.telnyx.sdk.services.blocking.RoomRecordingService
import com.telnyx.sdk.services.blocking.RoomService
import com.telnyx.sdk.services.blocking.SetiService
import com.telnyx.sdk.services.blocking.ShortCodeService
import com.telnyx.sdk.services.blocking.SimCardDataUsageNotificationService
import com.telnyx.sdk.services.blocking.SimCardGroupService
import com.telnyx.sdk.services.blocking.SimCardOrderPreviewService
import com.telnyx.sdk.services.blocking.SimCardOrderService
import com.telnyx.sdk.services.blocking.SimCardService
import com.telnyx.sdk.services.blocking.SiprecConnectorService
import com.telnyx.sdk.services.blocking.SpeechToTextService
import com.telnyx.sdk.services.blocking.StorageService
import com.telnyx.sdk.services.blocking.SubNumberOrderService
import com.telnyx.sdk.services.blocking.SubNumberOrdersReportService
import com.telnyx.sdk.services.blocking.TelephonyCredentialService
import com.telnyx.sdk.services.blocking.TexmlApplicationService
import com.telnyx.sdk.services.blocking.TexmlService
import com.telnyx.sdk.services.blocking.TextToSpeechService
import com.telnyx.sdk.services.blocking.UsageReportService
import com.telnyx.sdk.services.blocking.UserAddressService
import com.telnyx.sdk.services.blocking.UserTagService
import com.telnyx.sdk.services.blocking.VerificationService
import com.telnyx.sdk.services.blocking.VerifiedNumberService
import com.telnyx.sdk.services.blocking.VerifyProfileService
import com.telnyx.sdk.services.blocking.VirtualCrossConnectService
import com.telnyx.sdk.services.blocking.VirtualCrossConnectsCoverageService
import com.telnyx.sdk.services.blocking.WebhookDeliveryService
import com.telnyx.sdk.services.blocking.WebhookService
import com.telnyx.sdk.services.blocking.WellKnownService
import com.telnyx.sdk.services.blocking.WireguardInterfaceService
import com.telnyx.sdk.services.blocking.WireguardPeerService
import com.telnyx.sdk.services.blocking.WirelessBlocklistService
import com.telnyx.sdk.services.blocking.WirelessBlocklistValueService
import com.telnyx.sdk.services.blocking.WirelessService
import java.util.function.Consumer

/**
 * A client for interacting with the Telnyx REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface TelnyxClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): TelnyxClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxClient

    fun legacy(): LegacyService

    fun oauth(): OAuthService

    fun oauthClients(): OAuthClientService

    fun oauthGrants(): OAuthGrantService

    fun webhooks(): WebhookService

    fun accessIpAddress(): AccessIpAddressService

    fun accessIpRanges(): AccessIpRangeService

    fun actions(): ActionService

    fun addresses(): AddressService

    fun advancedOrders(): AdvancedOrderService

    fun ai(): AiService

    fun auditEvents(): AuditEventService

    fun authenticationProviders(): AuthenticationProviderService

    fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockService

    fun availablePhoneNumbers(): AvailablePhoneNumberService

    fun balance(): BalanceService

    fun billingGroups(): BillingGroupService

    fun bulkSimCardActions(): BulkSimCardActionService

    fun bundlePricing(): BundlePricingService

    fun callControlApplications(): CallControlApplicationService

    fun callEvents(): CallEventService

    fun calls(): CallService

    fun channelZones(): ChannelZoneService

    fun chargesBreakdown(): ChargesBreakdownService

    fun chargesSummary(): ChargesSummaryService

    fun comments(): CommentService

    fun conferences(): ConferenceService

    fun connections(): ConnectionService

    fun countryCoverage(): CountryCoverageService

    fun credentialConnections(): CredentialConnectionService

    fun customStorageCredentials(): CustomStorageCredentialService

    fun customerServiceRecords(): CustomerServiceRecordService

    fun detailRecords(): DetailRecordService

    fun dialogflowConnections(): DialogflowConnectionService

    fun documentLinks(): DocumentLinkService

    fun documents(): DocumentService

    fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService

    fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService

    fun externalConnections(): ExternalConnectionService

    fun faxApplications(): FaxApplicationService

    fun faxes(): FaxService

    fun fqdnConnections(): FqdnConnectionService

    fun fqdns(): FqdnService

    fun globalIpAllowedPorts(): GlobalIpAllowedPortService

    fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService

    fun globalIpAssignments(): GlobalIpAssignmentService

    fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService

    fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService

    fun globalIpHealthChecks(): GlobalIpHealthCheckService

    fun globalIpLatency(): GlobalIpLatencyService

    fun globalIpProtocols(): GlobalIpProtocolService

    fun globalIpUsage(): GlobalIpUsageService

    fun globalIps(): GlobalIpService

    fun inboundChannels(): InboundChannelService

    fun integrationSecrets(): IntegrationSecretService

    fun inventoryCoverage(): InventoryCoverageService

    fun invoices(): InvoiceService

    fun ipConnections(): IpConnectionService

    fun ips(): IpService

    fun ledgerBillingGroupReports(): LedgerBillingGroupReportService

    fun list(): ListService

    fun managedAccounts(): ManagedAccountService

    fun media(): MediaService

    fun messages(): MessageService

    fun messaging(): MessagingService

    fun messagingHostedNumberOrders(): MessagingHostedNumberOrderService

    fun messagingHostedNumbers(): MessagingHostedNumberService

    fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateService

    fun messagingOptouts(): MessagingOptoutService

    fun messagingProfiles(): MessagingProfileService

    fun messagingTollfree(): MessagingTollfreeService

    fun messagingUrlDomains(): MessagingUrlDomainService

    fun mobileNetworkOperators(): MobileNetworkOperatorService

    fun mobilePushCredentials(): MobilePushCredentialService

    fun networkCoverage(): NetworkCoverageService

    fun networks(): NetworkService

    fun notificationChannels(): NotificationChannelService

    fun notificationEventConditions(): NotificationEventConditionService

    fun notificationEvents(): NotificationEventService

    fun notificationProfiles(): NotificationProfileService

    fun notificationSettings(): NotificationSettingService

    fun numberBlockOrders(): NumberBlockOrderService

    fun numberLookup(): NumberLookupService

    fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService

    fun numberOrders(): NumberOrderService

    fun numberReservations(): NumberReservationService

    fun numbersFeatures(): NumbersFeatureService

    fun operatorConnect(): OperatorConnectService

    fun otaUpdates(): OtaUpdateService

    fun outboundVoiceProfiles(): OutboundVoiceProfileService

    fun payment(): PaymentService

    fun phoneNumberBlocks(): PhoneNumberBlockService

    fun phoneNumbers(): PhoneNumberService

    fun phoneNumbersRegulatoryRequirements(): PhoneNumbersRegulatoryRequirementService

    fun portabilityChecks(): PortabilityCheckService

    fun porting(): PortingService

    fun portingOrders(): PortingOrderService

    fun portingPhoneNumbers(): PortingPhoneNumberService

    fun portouts(): PortoutService

    fun privateWirelessGateways(): PrivateWirelessGatewayService

    fun publicInternetGateways(): PublicInternetGatewayService

    fun queues(): QueueService

    fun rcsAgents(): RcsAgentService

    fun recordingTranscriptions(): RecordingTranscriptionService

    fun recordings(): RecordingService

    fun regions(): RegionService

    fun regulatoryRequirements(): RegulatoryRequirementService

    fun reports(): ReportService

    fun requirementGroups(): RequirementGroupService

    fun requirementTypes(): RequirementTypeService

    fun requirements(): RequirementService

    fun roomCompositions(): RoomCompositionService

    fun roomParticipants(): RoomParticipantService

    fun roomRecordings(): RoomRecordingService

    fun rooms(): RoomService

    fun seti(): SetiService

    fun shortCodes(): ShortCodeService

    fun simCardDataUsageNotifications(): SimCardDataUsageNotificationService

    fun simCardGroups(): SimCardGroupService

    fun simCardOrderPreview(): SimCardOrderPreviewService

    fun simCardOrders(): SimCardOrderService

    fun simCards(): SimCardService

    fun siprecConnectors(): SiprecConnectorService

    fun storage(): StorageService

    fun subNumberOrders(): SubNumberOrderService

    fun subNumberOrdersReport(): SubNumberOrdersReportService

    fun telephonyCredentials(): TelephonyCredentialService

    fun texml(): TexmlService

    fun texmlApplications(): TexmlApplicationService

    fun textToSpeech(): TextToSpeechService

    fun usageReports(): UsageReportService

    fun userAddresses(): UserAddressService

    fun userTags(): UserTagService

    fun verifications(): VerificationService

    fun verifiedNumbers(): VerifiedNumberService

    fun verifyProfiles(): VerifyProfileService

    fun virtualCrossConnects(): VirtualCrossConnectService

    fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageService

    fun webhookDeliveries(): WebhookDeliveryService

    fun wireguardInterfaces(): WireguardInterfaceService

    fun wireguardPeers(): WireguardPeerService

    fun wireless(): WirelessService

    fun wirelessBlocklistValues(): WirelessBlocklistValueService

    fun wirelessBlocklists(): WirelessBlocklistService

    fun wellKnown(): WellKnownService

    fun inexplicitNumberOrders(): InexplicitNumberOrderService

    fun mobilePhoneNumbers(): MobilePhoneNumberService

    fun mobileVoiceConnections(): MobileVoiceConnectionService

    fun messaging10dlc(): Messaging10dlcService

    fun speechToText(): SpeechToTextService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [TelnyxClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxClient.WithRawResponse

        fun legacy(): LegacyService.WithRawResponse

        fun oauth(): OAuthService.WithRawResponse

        fun oauthClients(): OAuthClientService.WithRawResponse

        fun oauthGrants(): OAuthGrantService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        fun accessIpAddress(): AccessIpAddressService.WithRawResponse

        fun accessIpRanges(): AccessIpRangeService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        fun addresses(): AddressService.WithRawResponse

        fun advancedOrders(): AdvancedOrderService.WithRawResponse

        fun ai(): AiService.WithRawResponse

        fun auditEvents(): AuditEventService.WithRawResponse

        fun authenticationProviders(): AuthenticationProviderService.WithRawResponse

        fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockService.WithRawResponse

        fun availablePhoneNumbers(): AvailablePhoneNumberService.WithRawResponse

        fun balance(): BalanceService.WithRawResponse

        fun billingGroups(): BillingGroupService.WithRawResponse

        fun bulkSimCardActions(): BulkSimCardActionService.WithRawResponse

        fun bundlePricing(): BundlePricingService.WithRawResponse

        fun callControlApplications(): CallControlApplicationService.WithRawResponse

        fun callEvents(): CallEventService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        fun channelZones(): ChannelZoneService.WithRawResponse

        fun chargesBreakdown(): ChargesBreakdownService.WithRawResponse

        fun chargesSummary(): ChargesSummaryService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun conferences(): ConferenceService.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        fun countryCoverage(): CountryCoverageService.WithRawResponse

        fun credentialConnections(): CredentialConnectionService.WithRawResponse

        fun customStorageCredentials(): CustomStorageCredentialService.WithRawResponse

        fun customerServiceRecords(): CustomerServiceRecordService.WithRawResponse

        fun detailRecords(): DetailRecordService.WithRawResponse

        fun dialogflowConnections(): DialogflowConnectionService.WithRawResponse

        fun documentLinks(): DocumentLinkService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService.WithRawResponse

        fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService.WithRawResponse

        fun externalConnections(): ExternalConnectionService.WithRawResponse

        fun faxApplications(): FaxApplicationService.WithRawResponse

        fun faxes(): FaxService.WithRawResponse

        fun fqdnConnections(): FqdnConnectionService.WithRawResponse

        fun fqdns(): FqdnService.WithRawResponse

        fun globalIpAllowedPorts(): GlobalIpAllowedPortService.WithRawResponse

        fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService.WithRawResponse

        fun globalIpAssignments(): GlobalIpAssignmentService.WithRawResponse

        fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService.WithRawResponse

        fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService.WithRawResponse

        fun globalIpHealthChecks(): GlobalIpHealthCheckService.WithRawResponse

        fun globalIpLatency(): GlobalIpLatencyService.WithRawResponse

        fun globalIpProtocols(): GlobalIpProtocolService.WithRawResponse

        fun globalIpUsage(): GlobalIpUsageService.WithRawResponse

        fun globalIps(): GlobalIpService.WithRawResponse

        fun inboundChannels(): InboundChannelService.WithRawResponse

        fun integrationSecrets(): IntegrationSecretService.WithRawResponse

        fun inventoryCoverage(): InventoryCoverageService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun ipConnections(): IpConnectionService.WithRawResponse

        fun ips(): IpService.WithRawResponse

        fun ledgerBillingGroupReports(): LedgerBillingGroupReportService.WithRawResponse

        fun list(): ListService.WithRawResponse

        fun managedAccounts(): ManagedAccountService.WithRawResponse

        fun media(): MediaService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun messaging(): MessagingService.WithRawResponse

        fun messagingHostedNumberOrders(): MessagingHostedNumberOrderService.WithRawResponse

        fun messagingHostedNumbers(): MessagingHostedNumberService.WithRawResponse

        fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateService.WithRawResponse

        fun messagingOptouts(): MessagingOptoutService.WithRawResponse

        fun messagingProfiles(): MessagingProfileService.WithRawResponse

        fun messagingTollfree(): MessagingTollfreeService.WithRawResponse

        fun messagingUrlDomains(): MessagingUrlDomainService.WithRawResponse

        fun mobileNetworkOperators(): MobileNetworkOperatorService.WithRawResponse

        fun mobilePushCredentials(): MobilePushCredentialService.WithRawResponse

        fun networkCoverage(): NetworkCoverageService.WithRawResponse

        fun networks(): NetworkService.WithRawResponse

        fun notificationChannels(): NotificationChannelService.WithRawResponse

        fun notificationEventConditions(): NotificationEventConditionService.WithRawResponse

        fun notificationEvents(): NotificationEventService.WithRawResponse

        fun notificationProfiles(): NotificationProfileService.WithRawResponse

        fun notificationSettings(): NotificationSettingService.WithRawResponse

        fun numberBlockOrders(): NumberBlockOrderService.WithRawResponse

        fun numberLookup(): NumberLookupService.WithRawResponse

        fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService.WithRawResponse

        fun numberOrders(): NumberOrderService.WithRawResponse

        fun numberReservations(): NumberReservationService.WithRawResponse

        fun numbersFeatures(): NumbersFeatureService.WithRawResponse

        fun operatorConnect(): OperatorConnectService.WithRawResponse

        fun otaUpdates(): OtaUpdateService.WithRawResponse

        fun outboundVoiceProfiles(): OutboundVoiceProfileService.WithRawResponse

        fun payment(): PaymentService.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockService.WithRawResponse

        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementService.WithRawResponse

        fun portabilityChecks(): PortabilityCheckService.WithRawResponse

        fun porting(): PortingService.WithRawResponse

        fun portingOrders(): PortingOrderService.WithRawResponse

        fun portingPhoneNumbers(): PortingPhoneNumberService.WithRawResponse

        fun portouts(): PortoutService.WithRawResponse

        fun privateWirelessGateways(): PrivateWirelessGatewayService.WithRawResponse

        fun publicInternetGateways(): PublicInternetGatewayService.WithRawResponse

        fun queues(): QueueService.WithRawResponse

        fun rcsAgents(): RcsAgentService.WithRawResponse

        fun recordingTranscriptions(): RecordingTranscriptionService.WithRawResponse

        fun recordings(): RecordingService.WithRawResponse

        fun regions(): RegionService.WithRawResponse

        fun regulatoryRequirements(): RegulatoryRequirementService.WithRawResponse

        fun reports(): ReportService.WithRawResponse

        fun requirementGroups(): RequirementGroupService.WithRawResponse

        fun requirementTypes(): RequirementTypeService.WithRawResponse

        fun requirements(): RequirementService.WithRawResponse

        fun roomCompositions(): RoomCompositionService.WithRawResponse

        fun roomParticipants(): RoomParticipantService.WithRawResponse

        fun roomRecordings(): RoomRecordingService.WithRawResponse

        fun rooms(): RoomService.WithRawResponse

        fun seti(): SetiService.WithRawResponse

        fun shortCodes(): ShortCodeService.WithRawResponse

        fun simCardDataUsageNotifications(): SimCardDataUsageNotificationService.WithRawResponse

        fun simCardGroups(): SimCardGroupService.WithRawResponse

        fun simCardOrderPreview(): SimCardOrderPreviewService.WithRawResponse

        fun simCardOrders(): SimCardOrderService.WithRawResponse

        fun simCards(): SimCardService.WithRawResponse

        fun siprecConnectors(): SiprecConnectorService.WithRawResponse

        fun storage(): StorageService.WithRawResponse

        fun subNumberOrders(): SubNumberOrderService.WithRawResponse

        fun subNumberOrdersReport(): SubNumberOrdersReportService.WithRawResponse

        fun telephonyCredentials(): TelephonyCredentialService.WithRawResponse

        fun texml(): TexmlService.WithRawResponse

        fun texmlApplications(): TexmlApplicationService.WithRawResponse

        fun textToSpeech(): TextToSpeechService.WithRawResponse

        fun usageReports(): UsageReportService.WithRawResponse

        fun userAddresses(): UserAddressService.WithRawResponse

        fun userTags(): UserTagService.WithRawResponse

        fun verifications(): VerificationService.WithRawResponse

        fun verifiedNumbers(): VerifiedNumberService.WithRawResponse

        fun verifyProfiles(): VerifyProfileService.WithRawResponse

        fun virtualCrossConnects(): VirtualCrossConnectService.WithRawResponse

        fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageService.WithRawResponse

        fun webhookDeliveries(): WebhookDeliveryService.WithRawResponse

        fun wireguardInterfaces(): WireguardInterfaceService.WithRawResponse

        fun wireguardPeers(): WireguardPeerService.WithRawResponse

        fun wireless(): WirelessService.WithRawResponse

        fun wirelessBlocklistValues(): WirelessBlocklistValueService.WithRawResponse

        fun wirelessBlocklists(): WirelessBlocklistService.WithRawResponse

        fun wellKnown(): WellKnownService.WithRawResponse

        fun inexplicitNumberOrders(): InexplicitNumberOrderService.WithRawResponse

        fun mobilePhoneNumbers(): MobilePhoneNumberService.WithRawResponse

        fun mobileVoiceConnections(): MobileVoiceConnectionService.WithRawResponse

        fun messaging10dlc(): Messaging10dlcService.WithRawResponse

        fun speechToText(): SpeechToTextService.WithRawResponse
    }
}
