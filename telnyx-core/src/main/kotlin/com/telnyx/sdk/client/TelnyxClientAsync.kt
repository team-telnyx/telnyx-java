// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.AccessIpAddressServiceAsync
import com.telnyx.sdk.services.async.AccessIpRangeServiceAsync
import com.telnyx.sdk.services.async.ActionServiceAsync
import com.telnyx.sdk.services.async.AddressServiceAsync
import com.telnyx.sdk.services.async.AdvancedOrderServiceAsync
import com.telnyx.sdk.services.async.AiServiceAsync
import com.telnyx.sdk.services.async.AlphanumericSenderIdServiceAsync
import com.telnyx.sdk.services.async.AuditEventServiceAsync
import com.telnyx.sdk.services.async.AuthenticationProviderServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberServiceAsync
import com.telnyx.sdk.services.async.BalanceServiceAsync
import com.telnyx.sdk.services.async.BillingGroupServiceAsync
import com.telnyx.sdk.services.async.BulkSimCardActionServiceAsync
import com.telnyx.sdk.services.async.BundlePricingServiceAsync
import com.telnyx.sdk.services.async.CallControlApplicationServiceAsync
import com.telnyx.sdk.services.async.CallEventServiceAsync
import com.telnyx.sdk.services.async.CallServiceAsync
import com.telnyx.sdk.services.async.ChannelZoneServiceAsync
import com.telnyx.sdk.services.async.ChargesBreakdownServiceAsync
import com.telnyx.sdk.services.async.ChargesSummaryServiceAsync
import com.telnyx.sdk.services.async.CommentServiceAsync
import com.telnyx.sdk.services.async.ConferenceServiceAsync
import com.telnyx.sdk.services.async.ConnectionServiceAsync
import com.telnyx.sdk.services.async.CountryCoverageServiceAsync
import com.telnyx.sdk.services.async.CredentialConnectionServiceAsync
import com.telnyx.sdk.services.async.CustomStorageCredentialServiceAsync
import com.telnyx.sdk.services.async.CustomerServiceRecordServiceAsync
import com.telnyx.sdk.services.async.DetailRecordServiceAsync
import com.telnyx.sdk.services.async.DialogflowConnectionServiceAsync
import com.telnyx.sdk.services.async.DocumentLinkServiceAsync
import com.telnyx.sdk.services.async.DocumentServiceAsync
import com.telnyx.sdk.services.async.DynamicEmergencyAddressServiceAsync
import com.telnyx.sdk.services.async.DynamicEmergencyEndpointServiceAsync
import com.telnyx.sdk.services.async.ExternalConnectionServiceAsync
import com.telnyx.sdk.services.async.FaxApplicationServiceAsync
import com.telnyx.sdk.services.async.FaxServiceAsync
import com.telnyx.sdk.services.async.FqdnConnectionServiceAsync
import com.telnyx.sdk.services.async.FqdnServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAllowedPortServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentHealthServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentsUsageServiceAsync
import com.telnyx.sdk.services.async.GlobalIpHealthCheckServiceAsync
import com.telnyx.sdk.services.async.GlobalIpHealthCheckTypeServiceAsync
import com.telnyx.sdk.services.async.GlobalIpLatencyServiceAsync
import com.telnyx.sdk.services.async.GlobalIpProtocolServiceAsync
import com.telnyx.sdk.services.async.GlobalIpServiceAsync
import com.telnyx.sdk.services.async.GlobalIpUsageServiceAsync
import com.telnyx.sdk.services.async.InboundChannelServiceAsync
import com.telnyx.sdk.services.async.InexplicitNumberOrderServiceAsync
import com.telnyx.sdk.services.async.IntegrationSecretServiceAsync
import com.telnyx.sdk.services.async.InventoryCoverageServiceAsync
import com.telnyx.sdk.services.async.InvoiceServiceAsync
import com.telnyx.sdk.services.async.IpConnectionServiceAsync
import com.telnyx.sdk.services.async.IpServiceAsync
import com.telnyx.sdk.services.async.LedgerBillingGroupReportServiceAsync
import com.telnyx.sdk.services.async.LegacyServiceAsync
import com.telnyx.sdk.services.async.ListServiceAsync
import com.telnyx.sdk.services.async.ManagedAccountServiceAsync
import com.telnyx.sdk.services.async.MediaServiceAsync
import com.telnyx.sdk.services.async.MessageServiceAsync
import com.telnyx.sdk.services.async.Messaging10dlcServiceAsync
import com.telnyx.sdk.services.async.MessagingHostedNumberOrderServiceAsync
import com.telnyx.sdk.services.async.MessagingHostedNumberServiceAsync
import com.telnyx.sdk.services.async.MessagingNumbersBulkUpdateServiceAsync
import com.telnyx.sdk.services.async.MessagingOptoutServiceAsync
import com.telnyx.sdk.services.async.MessagingProfileMetricServiceAsync
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import com.telnyx.sdk.services.async.MessagingServiceAsync
import com.telnyx.sdk.services.async.MessagingTollfreeServiceAsync
import com.telnyx.sdk.services.async.MessagingUrlDomainServiceAsync
import com.telnyx.sdk.services.async.MobileNetworkOperatorServiceAsync
import com.telnyx.sdk.services.async.MobilePhoneNumberServiceAsync
import com.telnyx.sdk.services.async.MobilePushCredentialServiceAsync
import com.telnyx.sdk.services.async.MobileVoiceConnectionServiceAsync
import com.telnyx.sdk.services.async.NetworkCoverageServiceAsync
import com.telnyx.sdk.services.async.NetworkServiceAsync
import com.telnyx.sdk.services.async.NotificationChannelServiceAsync
import com.telnyx.sdk.services.async.NotificationEventConditionServiceAsync
import com.telnyx.sdk.services.async.NotificationEventServiceAsync
import com.telnyx.sdk.services.async.NotificationProfileServiceAsync
import com.telnyx.sdk.services.async.NotificationSettingServiceAsync
import com.telnyx.sdk.services.async.NumberBlockOrderServiceAsync
import com.telnyx.sdk.services.async.NumberLookupServiceAsync
import com.telnyx.sdk.services.async.NumberOrderPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.NumberOrderServiceAsync
import com.telnyx.sdk.services.async.NumberReservationServiceAsync
import com.telnyx.sdk.services.async.NumbersFeatureServiceAsync
import com.telnyx.sdk.services.async.OAuthClientServiceAsync
import com.telnyx.sdk.services.async.OAuthGrantServiceAsync
import com.telnyx.sdk.services.async.OAuthServiceAsync
import com.telnyx.sdk.services.async.OperatorConnectServiceAsync
import com.telnyx.sdk.services.async.OrganizationServiceAsync
import com.telnyx.sdk.services.async.OtaUpdateServiceAsync
import com.telnyx.sdk.services.async.OutboundVoiceProfileServiceAsync
import com.telnyx.sdk.services.async.PaymentServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.PhoneNumbersRegulatoryRequirementServiceAsync
import com.telnyx.sdk.services.async.PortabilityCheckServiceAsync
import com.telnyx.sdk.services.async.PortingOrderServiceAsync
import com.telnyx.sdk.services.async.PortingPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.PortingServiceAsync
import com.telnyx.sdk.services.async.PortoutServiceAsync
import com.telnyx.sdk.services.async.PrivateWirelessGatewayServiceAsync
import com.telnyx.sdk.services.async.PublicInternetGatewayServiceAsync
import com.telnyx.sdk.services.async.QueueServiceAsync
import com.telnyx.sdk.services.async.RcsAgentServiceAsync
import com.telnyx.sdk.services.async.RecordingServiceAsync
import com.telnyx.sdk.services.async.RecordingTranscriptionServiceAsync
import com.telnyx.sdk.services.async.RegionServiceAsync
import com.telnyx.sdk.services.async.RegulatoryRequirementServiceAsync
import com.telnyx.sdk.services.async.ReportServiceAsync
import com.telnyx.sdk.services.async.RequirementGroupServiceAsync
import com.telnyx.sdk.services.async.RequirementServiceAsync
import com.telnyx.sdk.services.async.RequirementTypeServiceAsync
import com.telnyx.sdk.services.async.RoomCompositionServiceAsync
import com.telnyx.sdk.services.async.RoomParticipantServiceAsync
import com.telnyx.sdk.services.async.RoomRecordingServiceAsync
import com.telnyx.sdk.services.async.RoomServiceAsync
import com.telnyx.sdk.services.async.SetiServiceAsync
import com.telnyx.sdk.services.async.ShortCodeServiceAsync
import com.telnyx.sdk.services.async.SimCardDataUsageNotificationServiceAsync
import com.telnyx.sdk.services.async.SimCardGroupServiceAsync
import com.telnyx.sdk.services.async.SimCardOrderPreviewServiceAsync
import com.telnyx.sdk.services.async.SimCardOrderServiceAsync
import com.telnyx.sdk.services.async.SimCardServiceAsync
import com.telnyx.sdk.services.async.SiprecConnectorServiceAsync
import com.telnyx.sdk.services.async.SpeechToTextServiceAsync
import com.telnyx.sdk.services.async.StorageServiceAsync
import com.telnyx.sdk.services.async.SubNumberOrderServiceAsync
import com.telnyx.sdk.services.async.SubNumberOrdersReportServiceAsync
import com.telnyx.sdk.services.async.TelephonyCredentialServiceAsync
import com.telnyx.sdk.services.async.TexmlApplicationServiceAsync
import com.telnyx.sdk.services.async.TexmlServiceAsync
import com.telnyx.sdk.services.async.TextToSpeechServiceAsync
import com.telnyx.sdk.services.async.UsageReportServiceAsync
import com.telnyx.sdk.services.async.UserAddressServiceAsync
import com.telnyx.sdk.services.async.UserTagServiceAsync
import com.telnyx.sdk.services.async.VerificationServiceAsync
import com.telnyx.sdk.services.async.VerifiedNumberServiceAsync
import com.telnyx.sdk.services.async.VerifyProfileServiceAsync
import com.telnyx.sdk.services.async.VirtualCrossConnectServiceAsync
import com.telnyx.sdk.services.async.VirtualCrossConnectsCoverageServiceAsync
import com.telnyx.sdk.services.async.WebhookDeliveryServiceAsync
import com.telnyx.sdk.services.async.WebhookServiceAsync
import com.telnyx.sdk.services.async.WellKnownServiceAsync
import com.telnyx.sdk.services.async.WireguardInterfaceServiceAsync
import com.telnyx.sdk.services.async.WireguardPeerServiceAsync
import com.telnyx.sdk.services.async.WirelessBlocklistServiceAsync
import com.telnyx.sdk.services.async.WirelessBlocklistValueServiceAsync
import com.telnyx.sdk.services.async.WirelessServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Telnyx REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface TelnyxClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): TelnyxClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxClientAsync

    fun legacy(): LegacyServiceAsync

    fun oauth(): OAuthServiceAsync

    fun oauthClients(): OAuthClientServiceAsync

    fun oauthGrants(): OAuthGrantServiceAsync

    fun webhooks(): WebhookServiceAsync

    /** IP Address Operations */
    fun accessIpAddress(): AccessIpAddressServiceAsync

    /** IP Range Operations */
    fun accessIpRanges(): AccessIpRangeServiceAsync

    fun actions(): ActionServiceAsync

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
    fun addresses(): AddressServiceAsync

    fun advancedOrders(): AdvancedOrderServiceAsync

    /** Generate text with LLMs */
    fun ai(): AiServiceAsync

    /** Audit log operations. */
    fun auditEvents(): AuditEventServiceAsync

    fun authenticationProviders(): AuthenticationProviderServiceAsync

    /** Number search */
    fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockServiceAsync

    /** Number search */
    fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync

    /** Billing operations */
    fun balance(): BalanceServiceAsync

    /** Billing groups operations */
    fun billingGroups(): BillingGroupServiceAsync

    /** View SIM card actions, their progress and timestamps using the SIM Card Actions API */
    fun bulkSimCardActions(): BulkSimCardActionServiceAsync

    fun bundlePricing(): BundlePricingServiceAsync

    /** Call Control applications operations */
    fun callControlApplications(): CallControlApplicationServiceAsync

    /** Call Control debugging */
    fun callEvents(): CallEventServiceAsync

    fun calls(): CallServiceAsync

    /** Voice Channels */
    fun channelZones(): ChannelZoneServiceAsync

    fun chargesBreakdown(): ChargesBreakdownServiceAsync

    fun chargesSummary(): ChargesSummaryServiceAsync

    /** Number orders */
    fun comments(): CommentServiceAsync

    /** Conference command operations */
    fun conferences(): ConferenceServiceAsync

    fun connections(): ConnectionServiceAsync

    /** Country Coverage */
    fun countryCoverage(): CountryCoverageServiceAsync

    /** Credential connection operations */
    fun credentialConnections(): CredentialConnectionServiceAsync

    /** Call Recordings operations. */
    fun customStorageCredentials(): CustomStorageCredentialServiceAsync

    /** Customer Service Record operations */
    fun customerServiceRecords(): CustomerServiceRecordServiceAsync

    /** Detail Records operations */
    fun detailRecords(): DetailRecordServiceAsync

    /** Dialogflow Connection Operations. */
    fun dialogflowConnections(): DialogflowConnectionServiceAsync

    /** Documents */
    fun documentLinks(): DocumentLinkServiceAsync

    /** Documents */
    fun documents(): DocumentServiceAsync

    /** Dynamic emergency address operations */
    fun dynamicEmergencyAddresses(): DynamicEmergencyAddressServiceAsync

    /** Dynamic Emergency Endpoints */
    fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointServiceAsync

    /** External Connections operations */
    fun externalConnections(): ExternalConnectionServiceAsync

    /** Fax Applications operations */
    fun faxApplications(): FaxApplicationServiceAsync

    /** Programmable fax command operations */
    fun faxes(): FaxServiceAsync

    /** FQDN connection operations */
    fun fqdnConnections(): FqdnConnectionServiceAsync

    /** FQDN operations */
    fun fqdns(): FqdnServiceAsync

    /** Global IPs */
    fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync

    /** Global IPs */
    fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthServiceAsync

    /** Global IPs */
    fun globalIpAssignments(): GlobalIpAssignmentServiceAsync

    /** Global IPs */
    fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageServiceAsync

    /** Global IPs */
    fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeServiceAsync

    /** Global IPs */
    fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync

    /** Global IPs */
    fun globalIpLatency(): GlobalIpLatencyServiceAsync

    /** Global IPs */
    fun globalIpProtocols(): GlobalIpProtocolServiceAsync

    /** Global IPs */
    fun globalIpUsage(): GlobalIpUsageServiceAsync

    /** Global IPs */
    fun globalIps(): GlobalIpServiceAsync

    /** Voice Channels */
    fun inboundChannels(): InboundChannelServiceAsync

    /** Store and retrieve integration secrets */
    fun integrationSecrets(): IntegrationSecretServiceAsync

    /** Inventory Level */
    fun inventoryCoverage(): InventoryCoverageServiceAsync

    fun invoices(): InvoiceServiceAsync

    /** IP connection operations */
    fun ipConnections(): IpConnectionServiceAsync

    /** IP operations */
    fun ips(): IpServiceAsync

    /** Ledger billing reports */
    fun ledgerBillingGroupReports(): LedgerBillingGroupReportServiceAsync

    /** Voice Channels */
    fun list(): ListServiceAsync

    /** Managed Accounts operations */
    fun managedAccounts(): ManagedAccountServiceAsync

    /** Media Storage operations */
    fun media(): MediaServiceAsync

    fun messages(): MessageServiceAsync

    fun messaging(): MessagingServiceAsync

    /** Manage your messaging hosted numbers */
    fun messagingHostedNumberOrders(): MessagingHostedNumberOrderServiceAsync

    fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync

    /** Configure your phone numbers */
    fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateServiceAsync

    /** Opt-Out Management */
    fun messagingOptouts(): MessagingOptoutServiceAsync

    fun messagingProfiles(): MessagingProfileServiceAsync

    fun messagingTollfree(): MessagingTollfreeServiceAsync

    /** Messaging URL Domains */
    fun messagingUrlDomains(): MessagingUrlDomainServiceAsync

    /** Mobile network operators operations */
    fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync

    /** Mobile push credential management */
    fun mobilePushCredentials(): MobilePushCredentialServiceAsync

    fun networkCoverage(): NetworkCoverageServiceAsync

    /** Network operations */
    fun networks(): NetworkServiceAsync

    /** Notification settings operations */
    fun notificationChannels(): NotificationChannelServiceAsync

    /** Notification settings operations */
    fun notificationEventConditions(): NotificationEventConditionServiceAsync

    /** Notification settings operations */
    fun notificationEvents(): NotificationEventServiceAsync

    /** Notification settings operations */
    fun notificationProfiles(): NotificationProfileServiceAsync

    /** Notification settings operations */
    fun notificationSettings(): NotificationSettingServiceAsync

    fun numberBlockOrders(): NumberBlockOrderServiceAsync

    /** Look up phone number data */
    fun numberLookup(): NumberLookupServiceAsync

    fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync

    /** Number orders */
    fun numberOrders(): NumberOrderServiceAsync

    /** Number reservations */
    fun numberReservations(): NumberReservationServiceAsync

    fun numbersFeatures(): NumbersFeatureServiceAsync

    fun operatorConnect(): OperatorConnectServiceAsync

    /** OTA updates operations */
    fun otaUpdates(): OtaUpdateServiceAsync

    /** Outbound voice profiles operations */
    fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync

    /** Operations for managing stored payment transactions. */
    fun payment(): PaymentServiceAsync

    fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync

    /** Configure your phone numbers */
    fun phoneNumbers(): PhoneNumberServiceAsync

    /** Regulatory Requirements */
    fun phoneNumbersRegulatoryRequirements(): PhoneNumbersRegulatoryRequirementServiceAsync

    /** Determining portability of phone numbers */
    fun portabilityChecks(): PortabilityCheckServiceAsync

    /** Endpoints related to porting orders management. */
    fun porting(): PortingServiceAsync

    /** Endpoints related to porting orders management. */
    fun portingOrders(): PortingOrderServiceAsync

    /** Endpoints related to porting orders management. */
    fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync

    /** Number portout operations */
    fun portouts(): PortoutServiceAsync

    /** Private Wireless Gateways operations */
    fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync

    /** Public Internet Gateway operations */
    fun publicInternetGateways(): PublicInternetGatewayServiceAsync

    /** Queue commands operations */
    fun queues(): QueueServiceAsync

    fun rcsAgents(): RcsAgentServiceAsync

    /** Call Recordings operations. */
    fun recordingTranscriptions(): RecordingTranscriptionServiceAsync

    /** Call Recordings operations. */
    fun recordings(): RecordingServiceAsync

    /** Regions */
    fun regions(): RegionServiceAsync

    /** Regulatory Requirements */
    fun regulatoryRequirements(): RegulatoryRequirementServiceAsync

    fun reports(): ReportServiceAsync

    /** Requirement Groups */
    fun requirementGroups(): RequirementGroupServiceAsync

    /** Types of requirements for international numbers and porting orders */
    fun requirementTypes(): RequirementTypeServiceAsync

    /** Requirements for international numbers and porting orders */
    fun requirements(): RequirementServiceAsync

    /** Rooms Compositions operations. */
    fun roomCompositions(): RoomCompositionServiceAsync

    /** Rooms Participants operations. */
    fun roomParticipants(): RoomParticipantServiceAsync

    /** Rooms Recordings operations. */
    fun roomRecordings(): RoomRecordingServiceAsync

    /** Rooms operations. */
    fun rooms(): RoomServiceAsync

    /** Observability into Telnyx platform stability and performance. */
    fun seti(): SetiServiceAsync

    /** Short codes */
    fun shortCodes(): ShortCodeServiceAsync

    /** SIM Cards operations */
    fun simCardDataUsageNotifications(): SimCardDataUsageNotificationServiceAsync

    /** SIM Card Groups operations */
    fun simCardGroups(): SimCardGroupServiceAsync

    /** SIM Card Orders operations */
    fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync

    /** SIM Card Orders operations */
    fun simCardOrders(): SimCardOrderServiceAsync

    /** SIM Cards operations */
    fun simCards(): SimCardServiceAsync

    /** SIPREC connectors configuration. */
    fun siprecConnectors(): SiprecConnectorServiceAsync

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    fun storage(): StorageServiceAsync

    fun subNumberOrders(): SubNumberOrderServiceAsync

    /** Number orders */
    fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync

    fun telephonyCredentials(): TelephonyCredentialServiceAsync

    /** TeXML REST Commands */
    fun texml(): TexmlServiceAsync

    /** TeXML Applications operations */
    fun texmlApplications(): TexmlApplicationServiceAsync

    /** Text to speech streaming command operations */
    fun textToSpeech(): TextToSpeechServiceAsync

    /** Usage data reporting across Telnyx products */
    fun usageReports(): UsageReportServiceAsync

    /**
     * Operations for working with UserAddress records. UserAddress records are stored addresses
     * that users can use for non-emergency-calling purposes, such as for shipping addresses for
     * orders of wireless SIMs (or other physical items). They cannot be used for emergency calling
     * and are distinct from Address records, which are used on phone numbers.
     */
    fun userAddresses(): UserAddressServiceAsync

    /** User-defined tags for Telnyx resources */
    fun userTags(): UserTagServiceAsync

    /** Two factor authentication API */
    fun verifications(): VerificationServiceAsync

    /** Verified Numbers operations */
    fun verifiedNumbers(): VerifiedNumberServiceAsync

    /** Two factor authentication API */
    fun verifyProfiles(): VerifyProfileServiceAsync

    /** Virtual Cross Connect operations */
    fun virtualCrossConnects(): VirtualCrossConnectServiceAsync

    /** Virtual Cross Connect operations */
    fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageServiceAsync

    /** Webhooks operations */
    fun webhookDeliveries(): WebhookDeliveryServiceAsync

    /** WireGuard Interface operations */
    fun wireguardInterfaces(): WireguardInterfaceServiceAsync

    /** WireGuard Interface operations */
    fun wireguardPeers(): WireguardPeerServiceAsync

    /** Regions for wireless services */
    fun wireless(): WirelessServiceAsync

    /** Wireless Blocklists operations */
    fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync

    /** Wireless Blocklists operations */
    fun wirelessBlocklists(): WirelessBlocklistServiceAsync

    fun wellKnown(): WellKnownServiceAsync

    /** Inexplicit number orders for bulk purchasing without specifying exact numbers */
    fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync

    /** Mobile phone number operations */
    fun mobilePhoneNumbers(): MobilePhoneNumberServiceAsync

    /** Mobile voice connection operations */
    fun mobileVoiceConnections(): MobileVoiceConnectionServiceAsync

    fun messaging10dlc(): Messaging10dlcServiceAsync

    /** Speech to text command operations */
    fun speechToText(): SpeechToTextServiceAsync

    fun organizations(): OrganizationServiceAsync

    fun alphanumericSenderIds(): AlphanumericSenderIdServiceAsync

    fun messagingProfileMetrics(): MessagingProfileMetricServiceAsync

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

    /** A view of [TelnyxClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxClientAsync.WithRawResponse

        fun legacy(): LegacyServiceAsync.WithRawResponse

        fun oauth(): OAuthServiceAsync.WithRawResponse

        fun oauthClients(): OAuthClientServiceAsync.WithRawResponse

        fun oauthGrants(): OAuthGrantServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse

        /** IP Address Operations */
        fun accessIpAddress(): AccessIpAddressServiceAsync.WithRawResponse

        /** IP Range Operations */
        fun accessIpRanges(): AccessIpRangeServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

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
        fun addresses(): AddressServiceAsync.WithRawResponse

        fun advancedOrders(): AdvancedOrderServiceAsync.WithRawResponse

        /** Generate text with LLMs */
        fun ai(): AiServiceAsync.WithRawResponse

        /** Audit log operations. */
        fun auditEvents(): AuditEventServiceAsync.WithRawResponse

        fun authenticationProviders(): AuthenticationProviderServiceAsync.WithRawResponse

        /** Number search */
        fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockServiceAsync.WithRawResponse

        /** Number search */
        fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync.WithRawResponse

        /** Billing operations */
        fun balance(): BalanceServiceAsync.WithRawResponse

        /** Billing groups operations */
        fun billingGroups(): BillingGroupServiceAsync.WithRawResponse

        /** View SIM card actions, their progress and timestamps using the SIM Card Actions API */
        fun bulkSimCardActions(): BulkSimCardActionServiceAsync.WithRawResponse

        fun bundlePricing(): BundlePricingServiceAsync.WithRawResponse

        /** Call Control applications operations */
        fun callControlApplications(): CallControlApplicationServiceAsync.WithRawResponse

        /** Call Control debugging */
        fun callEvents(): CallEventServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        /** Voice Channels */
        fun channelZones(): ChannelZoneServiceAsync.WithRawResponse

        fun chargesBreakdown(): ChargesBreakdownServiceAsync.WithRawResponse

        fun chargesSummary(): ChargesSummaryServiceAsync.WithRawResponse

        /** Number orders */
        fun comments(): CommentServiceAsync.WithRawResponse

        /** Conference command operations */
        fun conferences(): ConferenceServiceAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        /** Country Coverage */
        fun countryCoverage(): CountryCoverageServiceAsync.WithRawResponse

        /** Credential connection operations */
        fun credentialConnections(): CredentialConnectionServiceAsync.WithRawResponse

        /** Call Recordings operations. */
        fun customStorageCredentials(): CustomStorageCredentialServiceAsync.WithRawResponse

        /** Customer Service Record operations */
        fun customerServiceRecords(): CustomerServiceRecordServiceAsync.WithRawResponse

        /** Detail Records operations */
        fun detailRecords(): DetailRecordServiceAsync.WithRawResponse

        /** Dialogflow Connection Operations. */
        fun dialogflowConnections(): DialogflowConnectionServiceAsync.WithRawResponse

        /** Documents */
        fun documentLinks(): DocumentLinkServiceAsync.WithRawResponse

        /** Documents */
        fun documents(): DocumentServiceAsync.WithRawResponse

        /** Dynamic emergency address operations */
        fun dynamicEmergencyAddresses(): DynamicEmergencyAddressServiceAsync.WithRawResponse

        /** Dynamic Emergency Endpoints */
        fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointServiceAsync.WithRawResponse

        /** External Connections operations */
        fun externalConnections(): ExternalConnectionServiceAsync.WithRawResponse

        /** Fax Applications operations */
        fun faxApplications(): FaxApplicationServiceAsync.WithRawResponse

        /** Programmable fax command operations */
        fun faxes(): FaxServiceAsync.WithRawResponse

        /** FQDN connection operations */
        fun fqdnConnections(): FqdnConnectionServiceAsync.WithRawResponse

        /** FQDN operations */
        fun fqdns(): FqdnServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpAssignments(): GlobalIpAssignmentServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpLatency(): GlobalIpLatencyServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpProtocols(): GlobalIpProtocolServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIpUsage(): GlobalIpUsageServiceAsync.WithRawResponse

        /** Global IPs */
        fun globalIps(): GlobalIpServiceAsync.WithRawResponse

        /** Voice Channels */
        fun inboundChannels(): InboundChannelServiceAsync.WithRawResponse

        /** Store and retrieve integration secrets */
        fun integrationSecrets(): IntegrationSecretServiceAsync.WithRawResponse

        /** Inventory Level */
        fun inventoryCoverage(): InventoryCoverageServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        /** IP connection operations */
        fun ipConnections(): IpConnectionServiceAsync.WithRawResponse

        /** IP operations */
        fun ips(): IpServiceAsync.WithRawResponse

        /** Ledger billing reports */
        fun ledgerBillingGroupReports(): LedgerBillingGroupReportServiceAsync.WithRawResponse

        /** Voice Channels */
        fun list(): ListServiceAsync.WithRawResponse

        /** Managed Accounts operations */
        fun managedAccounts(): ManagedAccountServiceAsync.WithRawResponse

        /** Media Storage operations */
        fun media(): MediaServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun messaging(): MessagingServiceAsync.WithRawResponse

        /** Manage your messaging hosted numbers */
        fun messagingHostedNumberOrders(): MessagingHostedNumberOrderServiceAsync.WithRawResponse

        fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync.WithRawResponse

        /** Configure your phone numbers */
        fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateServiceAsync.WithRawResponse

        /** Opt-Out Management */
        fun messagingOptouts(): MessagingOptoutServiceAsync.WithRawResponse

        fun messagingProfiles(): MessagingProfileServiceAsync.WithRawResponse

        fun messagingTollfree(): MessagingTollfreeServiceAsync.WithRawResponse

        /** Messaging URL Domains */
        fun messagingUrlDomains(): MessagingUrlDomainServiceAsync.WithRawResponse

        /** Mobile network operators operations */
        fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync.WithRawResponse

        /** Mobile push credential management */
        fun mobilePushCredentials(): MobilePushCredentialServiceAsync.WithRawResponse

        fun networkCoverage(): NetworkCoverageServiceAsync.WithRawResponse

        /** Network operations */
        fun networks(): NetworkServiceAsync.WithRawResponse

        /** Notification settings operations */
        fun notificationChannels(): NotificationChannelServiceAsync.WithRawResponse

        /** Notification settings operations */
        fun notificationEventConditions(): NotificationEventConditionServiceAsync.WithRawResponse

        /** Notification settings operations */
        fun notificationEvents(): NotificationEventServiceAsync.WithRawResponse

        /** Notification settings operations */
        fun notificationProfiles(): NotificationProfileServiceAsync.WithRawResponse

        /** Notification settings operations */
        fun notificationSettings(): NotificationSettingServiceAsync.WithRawResponse

        fun numberBlockOrders(): NumberBlockOrderServiceAsync.WithRawResponse

        /** Look up phone number data */
        fun numberLookup(): NumberLookupServiceAsync.WithRawResponse

        fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync.WithRawResponse

        /** Number orders */
        fun numberOrders(): NumberOrderServiceAsync.WithRawResponse

        /** Number reservations */
        fun numberReservations(): NumberReservationServiceAsync.WithRawResponse

        fun numbersFeatures(): NumbersFeatureServiceAsync.WithRawResponse

        fun operatorConnect(): OperatorConnectServiceAsync.WithRawResponse

        /** OTA updates operations */
        fun otaUpdates(): OtaUpdateServiceAsync.WithRawResponse

        /** Outbound voice profiles operations */
        fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync.WithRawResponse

        /** Operations for managing stored payment transactions. */
        fun payment(): PaymentServiceAsync.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync.WithRawResponse

        /** Configure your phone numbers */
        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        /** Regulatory Requirements */
        fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementServiceAsync.WithRawResponse

        /** Determining portability of phone numbers */
        fun portabilityChecks(): PortabilityCheckServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun porting(): PortingServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun portingOrders(): PortingOrderServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync.WithRawResponse

        /** Number portout operations */
        fun portouts(): PortoutServiceAsync.WithRawResponse

        /** Private Wireless Gateways operations */
        fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync.WithRawResponse

        /** Public Internet Gateway operations */
        fun publicInternetGateways(): PublicInternetGatewayServiceAsync.WithRawResponse

        /** Queue commands operations */
        fun queues(): QueueServiceAsync.WithRawResponse

        fun rcsAgents(): RcsAgentServiceAsync.WithRawResponse

        /** Call Recordings operations. */
        fun recordingTranscriptions(): RecordingTranscriptionServiceAsync.WithRawResponse

        /** Call Recordings operations. */
        fun recordings(): RecordingServiceAsync.WithRawResponse

        /** Regions */
        fun regions(): RegionServiceAsync.WithRawResponse

        /** Regulatory Requirements */
        fun regulatoryRequirements(): RegulatoryRequirementServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse

        /** Requirement Groups */
        fun requirementGroups(): RequirementGroupServiceAsync.WithRawResponse

        /** Types of requirements for international numbers and porting orders */
        fun requirementTypes(): RequirementTypeServiceAsync.WithRawResponse

        /** Requirements for international numbers and porting orders */
        fun requirements(): RequirementServiceAsync.WithRawResponse

        /** Rooms Compositions operations. */
        fun roomCompositions(): RoomCompositionServiceAsync.WithRawResponse

        /** Rooms Participants operations. */
        fun roomParticipants(): RoomParticipantServiceAsync.WithRawResponse

        /** Rooms Recordings operations. */
        fun roomRecordings(): RoomRecordingServiceAsync.WithRawResponse

        /** Rooms operations. */
        fun rooms(): RoomServiceAsync.WithRawResponse

        /** Observability into Telnyx platform stability and performance. */
        fun seti(): SetiServiceAsync.WithRawResponse

        /** Short codes */
        fun shortCodes(): ShortCodeServiceAsync.WithRawResponse

        /** SIM Cards operations */
        fun simCardDataUsageNotifications():
            SimCardDataUsageNotificationServiceAsync.WithRawResponse

        /** SIM Card Groups operations */
        fun simCardGroups(): SimCardGroupServiceAsync.WithRawResponse

        /** SIM Card Orders operations */
        fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync.WithRawResponse

        /** SIM Card Orders operations */
        fun simCardOrders(): SimCardOrderServiceAsync.WithRawResponse

        /** SIM Cards operations */
        fun simCards(): SimCardServiceAsync.WithRawResponse

        /** SIPREC connectors configuration. */
        fun siprecConnectors(): SiprecConnectorServiceAsync.WithRawResponse

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        fun storage(): StorageServiceAsync.WithRawResponse

        fun subNumberOrders(): SubNumberOrderServiceAsync.WithRawResponse

        /** Number orders */
        fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync.WithRawResponse

        fun telephonyCredentials(): TelephonyCredentialServiceAsync.WithRawResponse

        /** TeXML REST Commands */
        fun texml(): TexmlServiceAsync.WithRawResponse

        /** TeXML Applications operations */
        fun texmlApplications(): TexmlApplicationServiceAsync.WithRawResponse

        /** Text to speech streaming command operations */
        fun textToSpeech(): TextToSpeechServiceAsync.WithRawResponse

        /** Usage data reporting across Telnyx products */
        fun usageReports(): UsageReportServiceAsync.WithRawResponse

        /**
         * Operations for working with UserAddress records. UserAddress records are stored addresses
         * that users can use for non-emergency-calling purposes, such as for shipping addresses for
         * orders of wireless SIMs (or other physical items). They cannot be used for emergency
         * calling and are distinct from Address records, which are used on phone numbers.
         */
        fun userAddresses(): UserAddressServiceAsync.WithRawResponse

        /** User-defined tags for Telnyx resources */
        fun userTags(): UserTagServiceAsync.WithRawResponse

        /** Two factor authentication API */
        fun verifications(): VerificationServiceAsync.WithRawResponse

        /** Verified Numbers operations */
        fun verifiedNumbers(): VerifiedNumberServiceAsync.WithRawResponse

        /** Two factor authentication API */
        fun verifyProfiles(): VerifyProfileServiceAsync.WithRawResponse

        /** Virtual Cross Connect operations */
        fun virtualCrossConnects(): VirtualCrossConnectServiceAsync.WithRawResponse

        /** Virtual Cross Connect operations */
        fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageServiceAsync.WithRawResponse

        /** Webhooks operations */
        fun webhookDeliveries(): WebhookDeliveryServiceAsync.WithRawResponse

        /** WireGuard Interface operations */
        fun wireguardInterfaces(): WireguardInterfaceServiceAsync.WithRawResponse

        /** WireGuard Interface operations */
        fun wireguardPeers(): WireguardPeerServiceAsync.WithRawResponse

        /** Regions for wireless services */
        fun wireless(): WirelessServiceAsync.WithRawResponse

        /** Wireless Blocklists operations */
        fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync.WithRawResponse

        /** Wireless Blocklists operations */
        fun wirelessBlocklists(): WirelessBlocklistServiceAsync.WithRawResponse

        fun wellKnown(): WellKnownServiceAsync.WithRawResponse

        /** Inexplicit number orders for bulk purchasing without specifying exact numbers */
        fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync.WithRawResponse

        /** Mobile phone number operations */
        fun mobilePhoneNumbers(): MobilePhoneNumberServiceAsync.WithRawResponse

        /** Mobile voice connection operations */
        fun mobileVoiceConnections(): MobileVoiceConnectionServiceAsync.WithRawResponse

        fun messaging10dlc(): Messaging10dlcServiceAsync.WithRawResponse

        /** Speech to text command operations */
        fun speechToText(): SpeechToTextServiceAsync.WithRawResponse

        fun organizations(): OrganizationServiceAsync.WithRawResponse

        fun alphanumericSenderIds(): AlphanumericSenderIdServiceAsync.WithRawResponse

        fun messagingProfileMetrics(): MessagingProfileMetricServiceAsync.WithRawResponse
    }
}
