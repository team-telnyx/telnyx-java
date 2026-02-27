// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.AccessIpAddressService
import com.telnyx.sdk.services.blocking.AccessIpRangeService
import com.telnyx.sdk.services.blocking.ActionService
import com.telnyx.sdk.services.blocking.AddressService
import com.telnyx.sdk.services.blocking.AdvancedOrderService
import com.telnyx.sdk.services.blocking.AiService
import com.telnyx.sdk.services.blocking.AlphanumericSenderIdService
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
import com.telnyx.sdk.services.blocking.MessagingProfileMetricService
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
import com.telnyx.sdk.services.blocking.OrganizationService
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

    /** IP Address Operations */
    fun accessIpAddress(): AccessIpAddressService

    /** IP Range Operations */
    fun accessIpRanges(): AccessIpRangeService

    fun actions(): ActionService

    /**
     * Operations to work with Address records. Address records are emergency-validated addresses
     * meant to be associated with phone numbers. They are validated for emergency usage purposes at
     * creation time, although you may validate them separately with a custom workflow using the
     * ValidateAddress operation separately. Address records are not usable for physical orders,
     * such as for Telnyx SIM cards, please use UserAddress for that. It is not possible to entirely
     * skip emergency service validation for Address records; if an emergency provider for a phone
     * number rejects the address then it cannot be used on a phone number. To prevent records from
     * getting out of sync, Address records are immutable and cannot be altered once created. If you
     * realize you need to alter an address, a new record must be created with the differing
     * address.
     */
    fun addresses(): AddressService

    fun advancedOrders(): AdvancedOrderService

    /** Generate text with LLMs */
    fun ai(): AiService

    /** Audit log operations. */
    fun auditEvents(): AuditEventService

    fun authenticationProviders(): AuthenticationProviderService

    /** Number search */
    fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockService

    /** Number search */
    fun availablePhoneNumbers(): AvailablePhoneNumberService

    /** Billing operations */
    fun balance(): BalanceService

    /** Billing groups operations */
    fun billingGroups(): BillingGroupService

    /** View SIM card actions, their progress and timestamps using the SIM Card Actions API */
    fun bulkSimCardActions(): BulkSimCardActionService

    fun bundlePricing(): BundlePricingService

    /** Call Control applications operations */
    fun callControlApplications(): CallControlApplicationService

    /** Call Control debugging */
    fun callEvents(): CallEventService

    fun calls(): CallService

    /** Voice Channels */
    fun channelZones(): ChannelZoneService

    fun chargesBreakdown(): ChargesBreakdownService

    fun chargesSummary(): ChargesSummaryService

    /** Number orders */
    fun comments(): CommentService

    /** Conference command operations */
    fun conferences(): ConferenceService

    fun connections(): ConnectionService

    /** Country Coverage */
    fun countryCoverage(): CountryCoverageService

    /** Credential connection operations */
    fun credentialConnections(): CredentialConnectionService

    /** Call Recordings operations. */
    fun customStorageCredentials(): CustomStorageCredentialService

    /** Customer Service Record operations */
    fun customerServiceRecords(): CustomerServiceRecordService

    /** Detail Records operations */
    fun detailRecords(): DetailRecordService

    /** Dialogflow Connection Operations. */
    fun dialogflowConnections(): DialogflowConnectionService

    /** Documents */
    fun documentLinks(): DocumentLinkService

    /** Documents */
    fun documents(): DocumentService

    /** Dynamic emergency address operations */
    fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService

    /** Dynamic Emergency Endpoints */
    fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService

    /** External Connections operations */
    fun externalConnections(): ExternalConnectionService

    /** Fax Applications operations */
    fun faxApplications(): FaxApplicationService

    /** Programmable fax command operations */
    fun faxes(): FaxService

    /** FQDN connection operations */
    fun fqdnConnections(): FqdnConnectionService

    /** FQDN operations */
    fun fqdns(): FqdnService

    /** Global IPs */
    fun globalIpAllowedPorts(): GlobalIpAllowedPortService

    /** Global IPs */
    fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService

    /** Global IPs */
    fun globalIpAssignments(): GlobalIpAssignmentService

    /** Global IPs */
    fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService

    /** Global IPs */
    fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService

    /** Global IPs */
    fun globalIpHealthChecks(): GlobalIpHealthCheckService

    /** Global IPs */
    fun globalIpLatency(): GlobalIpLatencyService

    /** Global IPs */
    fun globalIpProtocols(): GlobalIpProtocolService

    /** Global IPs */
    fun globalIpUsage(): GlobalIpUsageService

    /** Global IPs */
    fun globalIps(): GlobalIpService

    /** Voice Channels */
    fun inboundChannels(): InboundChannelService

    /** Store and retrieve integration secrets */
    fun integrationSecrets(): IntegrationSecretService

    /** Inventory Level */
    fun inventoryCoverage(): InventoryCoverageService

    fun invoices(): InvoiceService

    /** IP connection operations */
    fun ipConnections(): IpConnectionService

    /** IP operations */
    fun ips(): IpService

    /** Ledger billing reports */
    fun ledgerBillingGroupReports(): LedgerBillingGroupReportService

    /** Voice Channels */
    fun list(): ListService

    /** Managed Accounts operations */
    fun managedAccounts(): ManagedAccountService

    /** Media Storage operations */
    fun media(): MediaService

    fun messages(): MessageService

    fun messaging(): MessagingService

    /** Manage your messaging hosted numbers */
    fun messagingHostedNumberOrders(): MessagingHostedNumberOrderService

    fun messagingHostedNumbers(): MessagingHostedNumberService

    /** Configure your phone numbers */
    fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateService

    /** Opt-Out Management */
    fun messagingOptouts(): MessagingOptoutService

    fun messagingProfiles(): MessagingProfileService

    fun messagingTollfree(): MessagingTollfreeService

    /** Messaging URL Domains */
    fun messagingUrlDomains(): MessagingUrlDomainService

    /** Mobile network operators operations */
    fun mobileNetworkOperators(): MobileNetworkOperatorService

    /** Mobile push credential management */
    fun mobilePushCredentials(): MobilePushCredentialService

    fun networkCoverage(): NetworkCoverageService

    /** Network operations */
    fun networks(): NetworkService

    /** Notification settings operations */
    fun notificationChannels(): NotificationChannelService

    /** Notification settings operations */
    fun notificationEventConditions(): NotificationEventConditionService

    /** Notification settings operations */
    fun notificationEvents(): NotificationEventService

    /** Notification settings operations */
    fun notificationProfiles(): NotificationProfileService

    /** Notification settings operations */
    fun notificationSettings(): NotificationSettingService

    fun numberBlockOrders(): NumberBlockOrderService

    /** Look up phone number data */
    fun numberLookup(): NumberLookupService

    fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService

    /** Number orders */
    fun numberOrders(): NumberOrderService

    /** Number reservations */
    fun numberReservations(): NumberReservationService

    fun numbersFeatures(): NumbersFeatureService

    fun operatorConnect(): OperatorConnectService

    /** OTA updates operations */
    fun otaUpdates(): OtaUpdateService

    /** Outbound voice profiles operations */
    fun outboundVoiceProfiles(): OutboundVoiceProfileService

    /** Operations for managing stored payment transactions. */
    fun payment(): PaymentService

    fun phoneNumberBlocks(): PhoneNumberBlockService

    /** Configure your phone numbers */
    fun phoneNumbers(): PhoneNumberService

    /** Regulatory Requirements */
    fun phoneNumbersRegulatoryRequirements(): PhoneNumbersRegulatoryRequirementService

    /** Determining portability of phone numbers */
    fun portabilityChecks(): PortabilityCheckService

    /** Endpoints related to porting orders management. */
    fun porting(): PortingService

    /** Endpoints related to porting orders management. */
    fun portingOrders(): PortingOrderService

    /** Endpoints related to porting orders management. */
    fun portingPhoneNumbers(): PortingPhoneNumberService

    /** Number portout operations */
    fun portouts(): PortoutService

    /** Private Wireless Gateways operations */
    fun privateWirelessGateways(): PrivateWirelessGatewayService

    /** Public Internet Gateway operations */
    fun publicInternetGateways(): PublicInternetGatewayService

    /** Queue commands operations */
    fun queues(): QueueService

    fun rcsAgents(): RcsAgentService

    /** Call Recordings operations. */
    fun recordingTranscriptions(): RecordingTranscriptionService

    /** Call Recordings operations. */
    fun recordings(): RecordingService

    /** Regions */
    fun regions(): RegionService

    /** Regulatory Requirements */
    fun regulatoryRequirements(): RegulatoryRequirementService

    fun reports(): ReportService

    /** Requirement Groups */
    fun requirementGroups(): RequirementGroupService

    /** Types of requirements for international numbers and porting orders */
    fun requirementTypes(): RequirementTypeService

    /** Requirements for international numbers and porting orders */
    fun requirements(): RequirementService

    /** Rooms Compositions operations. */
    fun roomCompositions(): RoomCompositionService

    /** Rooms Participants operations. */
    fun roomParticipants(): RoomParticipantService

    /** Rooms Recordings operations. */
    fun roomRecordings(): RoomRecordingService

    /** Rooms operations. */
    fun rooms(): RoomService

    /** Observability into Telnyx platform stability and performance. */
    fun seti(): SetiService

    /** Short codes */
    fun shortCodes(): ShortCodeService

    /** SIM Cards operations */
    fun simCardDataUsageNotifications(): SimCardDataUsageNotificationService

    /** SIM Card Groups operations */
    fun simCardGroups(): SimCardGroupService

    /** SIM Card Orders operations */
    fun simCardOrderPreview(): SimCardOrderPreviewService

    /** SIM Card Orders operations */
    fun simCardOrders(): SimCardOrderService

    /** SIM Cards operations */
    fun simCards(): SimCardService

    /** SIPREC connectors configuration. */
    fun siprecConnectors(): SiprecConnectorService

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    fun storage(): StorageService

    fun subNumberOrders(): SubNumberOrderService

    /** Number orders */
    fun subNumberOrdersReport(): SubNumberOrdersReportService

    fun telephonyCredentials(): TelephonyCredentialService

    /** TeXML REST Commands */
    fun texml(): TexmlService

    /** TeXML Applications operations */
    fun texmlApplications(): TexmlApplicationService

    /** Text to speech streaming command operations */
    fun textToSpeech(): TextToSpeechService

    /** Usage data reporting across Telnyx products */
    fun usageReports(): UsageReportService

    /**
     * Operations for working with UserAddress records. UserAddress records are stored addresses
     * that users can use for non-emergency-calling purposes, such as for shipping addresses for
     * orders of wireless SIMs (or other physical items). They cannot be used for emergency calling
     * and are distinct from Address records, which are used on phone numbers.
     */
    fun userAddresses(): UserAddressService

    /** User-defined tags for Telnyx resources */
    fun userTags(): UserTagService

    /** Two factor authentication API */
    fun verifications(): VerificationService

    /** Verified Numbers operations */
    fun verifiedNumbers(): VerifiedNumberService

    /** Two factor authentication API */
    fun verifyProfiles(): VerifyProfileService

    /** Virtual Cross Connect operations */
    fun virtualCrossConnects(): VirtualCrossConnectService

    /** Virtual Cross Connect operations */
    fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageService

    /** Webhooks operations */
    fun webhookDeliveries(): WebhookDeliveryService

    /** WireGuard Interface operations */
    fun wireguardInterfaces(): WireguardInterfaceService

    /** WireGuard Interface operations */
    fun wireguardPeers(): WireguardPeerService

    /** Regions for wireless services */
    fun wireless(): WirelessService

    /** Wireless Blocklists operations */
    fun wirelessBlocklistValues(): WirelessBlocklistValueService

    /** Wireless Blocklists operations */
    fun wirelessBlocklists(): WirelessBlocklistService

    fun wellKnown(): WellKnownService

    /** Inexplicit number orders for bulk purchasing without specifying exact numbers */
    fun inexplicitNumberOrders(): InexplicitNumberOrderService

    /** Mobile phone number operations */
    fun mobilePhoneNumbers(): MobilePhoneNumberService

    /** Mobile voice connection operations */
    fun mobileVoiceConnections(): MobileVoiceConnectionService

    fun messaging10dlc(): Messaging10dlcService

    /** Speech to text command operations */
    fun speechToText(): SpeechToTextService

    fun organizations(): OrganizationService

    fun alphanumericSenderIds(): AlphanumericSenderIdService

    fun messagingProfileMetrics(): MessagingProfileMetricService

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

        /** IP Address Operations */
        fun accessIpAddress(): AccessIpAddressService.WithRawResponse

        /** IP Range Operations */
        fun accessIpRanges(): AccessIpRangeService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Operations to work with Address records. Address records are emergency-validated
         * addresses meant to be associated with phone numbers. They are validated for emergency
         * usage purposes at creation time, although you may validate them separately with a custom
         * workflow using the ValidateAddress operation separately. Address records are not usable
         * for physical orders, such as for Telnyx SIM cards, please use UserAddress for that. It is
         * not possible to entirely skip emergency service validation for Address records; if an
         * emergency provider for a phone number rejects the address then it cannot be used on a
         * phone number. To prevent records from getting out of sync, Address records are immutable
         * and cannot be altered once created. If you realize you need to alter an address, a new
         * record must be created with the differing address.
         */
        fun addresses(): AddressService.WithRawResponse

        fun advancedOrders(): AdvancedOrderService.WithRawResponse

        /** Generate text with LLMs */
        fun ai(): AiService.WithRawResponse

        /** Audit log operations. */
        fun auditEvents(): AuditEventService.WithRawResponse

        fun authenticationProviders(): AuthenticationProviderService.WithRawResponse

        /** Number search */
        fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockService.WithRawResponse

        /** Number search */
        fun availablePhoneNumbers(): AvailablePhoneNumberService.WithRawResponse

        /** Billing operations */
        fun balance(): BalanceService.WithRawResponse

        /** Billing groups operations */
        fun billingGroups(): BillingGroupService.WithRawResponse

        /** View SIM card actions, their progress and timestamps using the SIM Card Actions API */
        fun bulkSimCardActions(): BulkSimCardActionService.WithRawResponse

        fun bundlePricing(): BundlePricingService.WithRawResponse

        /** Call Control applications operations */
        fun callControlApplications(): CallControlApplicationService.WithRawResponse

        /** Call Control debugging */
        fun callEvents(): CallEventService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        /** Voice Channels */
        fun channelZones(): ChannelZoneService.WithRawResponse

        fun chargesBreakdown(): ChargesBreakdownService.WithRawResponse

        fun chargesSummary(): ChargesSummaryService.WithRawResponse

        /** Number orders */
        fun comments(): CommentService.WithRawResponse

        /** Conference command operations */
        fun conferences(): ConferenceService.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        /** Country Coverage */
        fun countryCoverage(): CountryCoverageService.WithRawResponse

        /** Credential connection operations */
        fun credentialConnections(): CredentialConnectionService.WithRawResponse

        /** Call Recordings operations. */
        fun customStorageCredentials(): CustomStorageCredentialService.WithRawResponse

        /** Customer Service Record operations */
        fun customerServiceRecords(): CustomerServiceRecordService.WithRawResponse

        /** Detail Records operations */
        fun detailRecords(): DetailRecordService.WithRawResponse

        /** Dialogflow Connection Operations. */
        fun dialogflowConnections(): DialogflowConnectionService.WithRawResponse

        /** Documents */
        fun documentLinks(): DocumentLinkService.WithRawResponse

        /** Documents */
        fun documents(): DocumentService.WithRawResponse

        /** Dynamic emergency address operations */
        fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService.WithRawResponse

        /** Dynamic Emergency Endpoints */
        fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService.WithRawResponse

        /** External Connections operations */
        fun externalConnections(): ExternalConnectionService.WithRawResponse

        /** Fax Applications operations */
        fun faxApplications(): FaxApplicationService.WithRawResponse

        /** Programmable fax command operations */
        fun faxes(): FaxService.WithRawResponse

        /** FQDN connection operations */
        fun fqdnConnections(): FqdnConnectionService.WithRawResponse

        /** FQDN operations */
        fun fqdns(): FqdnService.WithRawResponse

        /** Global IPs */
        fun globalIpAllowedPorts(): GlobalIpAllowedPortService.WithRawResponse

        /** Global IPs */
        fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService.WithRawResponse

        /** Global IPs */
        fun globalIpAssignments(): GlobalIpAssignmentService.WithRawResponse

        /** Global IPs */
        fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService.WithRawResponse

        /** Global IPs */
        fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService.WithRawResponse

        /** Global IPs */
        fun globalIpHealthChecks(): GlobalIpHealthCheckService.WithRawResponse

        /** Global IPs */
        fun globalIpLatency(): GlobalIpLatencyService.WithRawResponse

        /** Global IPs */
        fun globalIpProtocols(): GlobalIpProtocolService.WithRawResponse

        /** Global IPs */
        fun globalIpUsage(): GlobalIpUsageService.WithRawResponse

        /** Global IPs */
        fun globalIps(): GlobalIpService.WithRawResponse

        /** Voice Channels */
        fun inboundChannels(): InboundChannelService.WithRawResponse

        /** Store and retrieve integration secrets */
        fun integrationSecrets(): IntegrationSecretService.WithRawResponse

        /** Inventory Level */
        fun inventoryCoverage(): InventoryCoverageService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        /** IP connection operations */
        fun ipConnections(): IpConnectionService.WithRawResponse

        /** IP operations */
        fun ips(): IpService.WithRawResponse

        /** Ledger billing reports */
        fun ledgerBillingGroupReports(): LedgerBillingGroupReportService.WithRawResponse

        /** Voice Channels */
        fun list(): ListService.WithRawResponse

        /** Managed Accounts operations */
        fun managedAccounts(): ManagedAccountService.WithRawResponse

        /** Media Storage operations */
        fun media(): MediaService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun messaging(): MessagingService.WithRawResponse

        /** Manage your messaging hosted numbers */
        fun messagingHostedNumberOrders(): MessagingHostedNumberOrderService.WithRawResponse

        fun messagingHostedNumbers(): MessagingHostedNumberService.WithRawResponse

        /** Configure your phone numbers */
        fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateService.WithRawResponse

        /** Opt-Out Management */
        fun messagingOptouts(): MessagingOptoutService.WithRawResponse

        fun messagingProfiles(): MessagingProfileService.WithRawResponse

        fun messagingTollfree(): MessagingTollfreeService.WithRawResponse

        /** Messaging URL Domains */
        fun messagingUrlDomains(): MessagingUrlDomainService.WithRawResponse

        /** Mobile network operators operations */
        fun mobileNetworkOperators(): MobileNetworkOperatorService.WithRawResponse

        /** Mobile push credential management */
        fun mobilePushCredentials(): MobilePushCredentialService.WithRawResponse

        fun networkCoverage(): NetworkCoverageService.WithRawResponse

        /** Network operations */
        fun networks(): NetworkService.WithRawResponse

        /** Notification settings operations */
        fun notificationChannels(): NotificationChannelService.WithRawResponse

        /** Notification settings operations */
        fun notificationEventConditions(): NotificationEventConditionService.WithRawResponse

        /** Notification settings operations */
        fun notificationEvents(): NotificationEventService.WithRawResponse

        /** Notification settings operations */
        fun notificationProfiles(): NotificationProfileService.WithRawResponse

        /** Notification settings operations */
        fun notificationSettings(): NotificationSettingService.WithRawResponse

        fun numberBlockOrders(): NumberBlockOrderService.WithRawResponse

        /** Look up phone number data */
        fun numberLookup(): NumberLookupService.WithRawResponse

        fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService.WithRawResponse

        /** Number orders */
        fun numberOrders(): NumberOrderService.WithRawResponse

        /** Number reservations */
        fun numberReservations(): NumberReservationService.WithRawResponse

        fun numbersFeatures(): NumbersFeatureService.WithRawResponse

        fun operatorConnect(): OperatorConnectService.WithRawResponse

        /** OTA updates operations */
        fun otaUpdates(): OtaUpdateService.WithRawResponse

        /** Outbound voice profiles operations */
        fun outboundVoiceProfiles(): OutboundVoiceProfileService.WithRawResponse

        /** Operations for managing stored payment transactions. */
        fun payment(): PaymentService.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockService.WithRawResponse

        /** Configure your phone numbers */
        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /** Regulatory Requirements */
        fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementService.WithRawResponse

        /** Determining portability of phone numbers */
        fun portabilityChecks(): PortabilityCheckService.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun porting(): PortingService.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun portingOrders(): PortingOrderService.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun portingPhoneNumbers(): PortingPhoneNumberService.WithRawResponse

        /** Number portout operations */
        fun portouts(): PortoutService.WithRawResponse

        /** Private Wireless Gateways operations */
        fun privateWirelessGateways(): PrivateWirelessGatewayService.WithRawResponse

        /** Public Internet Gateway operations */
        fun publicInternetGateways(): PublicInternetGatewayService.WithRawResponse

        /** Queue commands operations */
        fun queues(): QueueService.WithRawResponse

        fun rcsAgents(): RcsAgentService.WithRawResponse

        /** Call Recordings operations. */
        fun recordingTranscriptions(): RecordingTranscriptionService.WithRawResponse

        /** Call Recordings operations. */
        fun recordings(): RecordingService.WithRawResponse

        /** Regions */
        fun regions(): RegionService.WithRawResponse

        /** Regulatory Requirements */
        fun regulatoryRequirements(): RegulatoryRequirementService.WithRawResponse

        fun reports(): ReportService.WithRawResponse

        /** Requirement Groups */
        fun requirementGroups(): RequirementGroupService.WithRawResponse

        /** Types of requirements for international numbers and porting orders */
        fun requirementTypes(): RequirementTypeService.WithRawResponse

        /** Requirements for international numbers and porting orders */
        fun requirements(): RequirementService.WithRawResponse

        /** Rooms Compositions operations. */
        fun roomCompositions(): RoomCompositionService.WithRawResponse

        /** Rooms Participants operations. */
        fun roomParticipants(): RoomParticipantService.WithRawResponse

        /** Rooms Recordings operations. */
        fun roomRecordings(): RoomRecordingService.WithRawResponse

        /** Rooms operations. */
        fun rooms(): RoomService.WithRawResponse

        /** Observability into Telnyx platform stability and performance. */
        fun seti(): SetiService.WithRawResponse

        /** Short codes */
        fun shortCodes(): ShortCodeService.WithRawResponse

        /** SIM Cards operations */
        fun simCardDataUsageNotifications(): SimCardDataUsageNotificationService.WithRawResponse

        /** SIM Card Groups operations */
        fun simCardGroups(): SimCardGroupService.WithRawResponse

        /** SIM Card Orders operations */
        fun simCardOrderPreview(): SimCardOrderPreviewService.WithRawResponse

        /** SIM Card Orders operations */
        fun simCardOrders(): SimCardOrderService.WithRawResponse

        /** SIM Cards operations */
        fun simCards(): SimCardService.WithRawResponse

        /** SIPREC connectors configuration. */
        fun siprecConnectors(): SiprecConnectorService.WithRawResponse

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        fun storage(): StorageService.WithRawResponse

        fun subNumberOrders(): SubNumberOrderService.WithRawResponse

        /** Number orders */
        fun subNumberOrdersReport(): SubNumberOrdersReportService.WithRawResponse

        fun telephonyCredentials(): TelephonyCredentialService.WithRawResponse

        /** TeXML REST Commands */
        fun texml(): TexmlService.WithRawResponse

        /** TeXML Applications operations */
        fun texmlApplications(): TexmlApplicationService.WithRawResponse

        /** Text to speech streaming command operations */
        fun textToSpeech(): TextToSpeechService.WithRawResponse

        /** Usage data reporting across Telnyx products */
        fun usageReports(): UsageReportService.WithRawResponse

        /**
         * Operations for working with UserAddress records. UserAddress records are stored addresses
         * that users can use for non-emergency-calling purposes, such as for shipping addresses for
         * orders of wireless SIMs (or other physical items). They cannot be used for emergency
         * calling and are distinct from Address records, which are used on phone numbers.
         */
        fun userAddresses(): UserAddressService.WithRawResponse

        /** User-defined tags for Telnyx resources */
        fun userTags(): UserTagService.WithRawResponse

        /** Two factor authentication API */
        fun verifications(): VerificationService.WithRawResponse

        /** Verified Numbers operations */
        fun verifiedNumbers(): VerifiedNumberService.WithRawResponse

        /** Two factor authentication API */
        fun verifyProfiles(): VerifyProfileService.WithRawResponse

        /** Virtual Cross Connect operations */
        fun virtualCrossConnects(): VirtualCrossConnectService.WithRawResponse

        /** Virtual Cross Connect operations */
        fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageService.WithRawResponse

        /** Webhooks operations */
        fun webhookDeliveries(): WebhookDeliveryService.WithRawResponse

        /** WireGuard Interface operations */
        fun wireguardInterfaces(): WireguardInterfaceService.WithRawResponse

        /** WireGuard Interface operations */
        fun wireguardPeers(): WireguardPeerService.WithRawResponse

        /** Regions for wireless services */
        fun wireless(): WirelessService.WithRawResponse

        /** Wireless Blocklists operations */
        fun wirelessBlocklistValues(): WirelessBlocklistValueService.WithRawResponse

        /** Wireless Blocklists operations */
        fun wirelessBlocklists(): WirelessBlocklistService.WithRawResponse

        fun wellKnown(): WellKnownService.WithRawResponse

        /** Inexplicit number orders for bulk purchasing without specifying exact numbers */
        fun inexplicitNumberOrders(): InexplicitNumberOrderService.WithRawResponse

        /** Mobile phone number operations */
        fun mobilePhoneNumbers(): MobilePhoneNumberService.WithRawResponse

        /** Mobile voice connection operations */
        fun mobileVoiceConnections(): MobileVoiceConnectionService.WithRawResponse

        fun messaging10dlc(): Messaging10dlcService.WithRawResponse

        /** Speech to text command operations */
        fun speechToText(): SpeechToTextService.WithRawResponse

        fun organizations(): OrganizationService.WithRawResponse

        fun alphanumericSenderIds(): AlphanumericSenderIdService.WithRawResponse

        fun messagingProfileMetrics(): MessagingProfileMetricService.WithRawResponse
    }
}
