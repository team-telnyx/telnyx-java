// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.client

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.AccessIpAddressServiceAsync
import com.telnyx.api.services.async.AccessIpRangeServiceAsync
import com.telnyx.api.services.async.ActionServiceAsync
import com.telnyx.api.services.async.AddressServiceAsync
import com.telnyx.api.services.async.AdvancedOrderServiceAsync
import com.telnyx.api.services.async.AiServiceAsync
import com.telnyx.api.services.async.AuditEventServiceAsync
import com.telnyx.api.services.async.AuthenticationProviderServiceAsync
import com.telnyx.api.services.async.AvailablePhoneNumberBlockServiceAsync
import com.telnyx.api.services.async.AvailablePhoneNumberServiceAsync
import com.telnyx.api.services.async.BalanceServiceAsync
import com.telnyx.api.services.async.BillingGroupServiceAsync
import com.telnyx.api.services.async.BrandServiceAsync
import com.telnyx.api.services.async.BulkSimCardActionServiceAsync
import com.telnyx.api.services.async.BundlePricingServiceAsync
import com.telnyx.api.services.async.CallControlApplicationServiceAsync
import com.telnyx.api.services.async.CallEventServiceAsync
import com.telnyx.api.services.async.CallServiceAsync
import com.telnyx.api.services.async.CampaignBuilderServiceAsync
import com.telnyx.api.services.async.CampaignServiceAsync
import com.telnyx.api.services.async.ChannelZoneServiceAsync
import com.telnyx.api.services.async.ChargesBreakdownServiceAsync
import com.telnyx.api.services.async.ChargesSummaryServiceAsync
import com.telnyx.api.services.async.CommentServiceAsync
import com.telnyx.api.services.async.ConferenceServiceAsync
import com.telnyx.api.services.async.ConnectionServiceAsync
import com.telnyx.api.services.async.CountryCoverageServiceAsync
import com.telnyx.api.services.async.CredentialConnectionServiceAsync
import com.telnyx.api.services.async.CustomStorageCredentialServiceAsync
import com.telnyx.api.services.async.CustomerServiceRecordServiceAsync
import com.telnyx.api.services.async.DetailRecordServiceAsync
import com.telnyx.api.services.async.DialogflowConnectionServiceAsync
import com.telnyx.api.services.async.DocumentLinkServiceAsync
import com.telnyx.api.services.async.DocumentServiceAsync
import com.telnyx.api.services.async.DynamicEmergencyAddressServiceAsync
import com.telnyx.api.services.async.DynamicEmergencyEndpointServiceAsync
import com.telnyx.api.services.async.EnumServiceAsync
import com.telnyx.api.services.async.ExternalConnectionServiceAsync
import com.telnyx.api.services.async.FaxApplicationServiceAsync
import com.telnyx.api.services.async.FaxServiceAsync
import com.telnyx.api.services.async.FqdnConnectionServiceAsync
import com.telnyx.api.services.async.FqdnServiceAsync
import com.telnyx.api.services.async.GlobalIpAllowedPortServiceAsync
import com.telnyx.api.services.async.GlobalIpAssignmentHealthServiceAsync
import com.telnyx.api.services.async.GlobalIpAssignmentServiceAsync
import com.telnyx.api.services.async.GlobalIpAssignmentsUsageServiceAsync
import com.telnyx.api.services.async.GlobalIpHealthCheckServiceAsync
import com.telnyx.api.services.async.GlobalIpHealthCheckTypeServiceAsync
import com.telnyx.api.services.async.GlobalIpLatencyServiceAsync
import com.telnyx.api.services.async.GlobalIpProtocolServiceAsync
import com.telnyx.api.services.async.GlobalIpServiceAsync
import com.telnyx.api.services.async.GlobalIpUsageServiceAsync
import com.telnyx.api.services.async.InboundChannelServiceAsync
import com.telnyx.api.services.async.IntegrationSecretServiceAsync
import com.telnyx.api.services.async.InventoryCoverageServiceAsync
import com.telnyx.api.services.async.InvoiceServiceAsync
import com.telnyx.api.services.async.IpConnectionServiceAsync
import com.telnyx.api.services.async.IpServiceAsync
import com.telnyx.api.services.async.LedgerBillingGroupReportServiceAsync
import com.telnyx.api.services.async.LegacyServiceAsync
import com.telnyx.api.services.async.ListServiceAsync
import com.telnyx.api.services.async.ManagedAccountServiceAsync
import com.telnyx.api.services.async.MediaServiceAsync
import com.telnyx.api.services.async.MessageServiceAsync
import com.telnyx.api.services.async.MessagingHostedNumberOrderServiceAsync
import com.telnyx.api.services.async.MessagingHostedNumberServiceAsync
import com.telnyx.api.services.async.MessagingNumbersBulkUpdateServiceAsync
import com.telnyx.api.services.async.MessagingOptoutServiceAsync
import com.telnyx.api.services.async.MessagingProfileServiceAsync
import com.telnyx.api.services.async.MessagingServiceAsync
import com.telnyx.api.services.async.MessagingTollfreeServiceAsync
import com.telnyx.api.services.async.MessagingUrlDomainServiceAsync
import com.telnyx.api.services.async.MesssageServiceAsync
import com.telnyx.api.services.async.MobileNetworkOperatorServiceAsync
import com.telnyx.api.services.async.MobilePushCredentialServiceAsync
import com.telnyx.api.services.async.NetworkCoverageServiceAsync
import com.telnyx.api.services.async.NetworkServiceAsync
import com.telnyx.api.services.async.NotificationChannelServiceAsync
import com.telnyx.api.services.async.NotificationEventConditionServiceAsync
import com.telnyx.api.services.async.NotificationEventServiceAsync
import com.telnyx.api.services.async.NotificationProfileServiceAsync
import com.telnyx.api.services.async.NotificationSettingServiceAsync
import com.telnyx.api.services.async.NumberBlockOrderServiceAsync
import com.telnyx.api.services.async.NumberLookupServiceAsync
import com.telnyx.api.services.async.NumberOrderPhoneNumberServiceAsync
import com.telnyx.api.services.async.NumberOrderServiceAsync
import com.telnyx.api.services.async.NumberReservationServiceAsync
import com.telnyx.api.services.async.NumbersFeatureServiceAsync
import com.telnyx.api.services.async.OAuthClientServiceAsync
import com.telnyx.api.services.async.OAuthGrantServiceAsync
import com.telnyx.api.services.async.OAuthServiceAsync
import com.telnyx.api.services.async.OperatorConnectServiceAsync
import com.telnyx.api.services.async.OtaUpdateServiceAsync
import com.telnyx.api.services.async.OutboundVoiceProfileServiceAsync
import com.telnyx.api.services.async.PartnerCampaignServiceAsync
import com.telnyx.api.services.async.PaymentServiceAsync
import com.telnyx.api.services.async.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.api.services.async.PhoneNumberBlockServiceAsync
import com.telnyx.api.services.async.PhoneNumberCampaignServiceAsync
import com.telnyx.api.services.async.PhoneNumberServiceAsync
import com.telnyx.api.services.async.PhoneNumbersRegulatoryRequirementServiceAsync
import com.telnyx.api.services.async.PortabilityCheckServiceAsync
import com.telnyx.api.services.async.PortingOrderServiceAsync
import com.telnyx.api.services.async.PortingPhoneNumberServiceAsync
import com.telnyx.api.services.async.PortingServiceAsync
import com.telnyx.api.services.async.PortoutServiceAsync
import com.telnyx.api.services.async.PrivateWirelessGatewayServiceAsync
import com.telnyx.api.services.async.PublicInternetGatewayServiceAsync
import com.telnyx.api.services.async.QueueServiceAsync
import com.telnyx.api.services.async.RcsAgentServiceAsync
import com.telnyx.api.services.async.RecordingServiceAsync
import com.telnyx.api.services.async.RecordingTranscriptionServiceAsync
import com.telnyx.api.services.async.RegionServiceAsync
import com.telnyx.api.services.async.RegulatoryRequirementServiceAsync
import com.telnyx.api.services.async.ReportServiceAsync
import com.telnyx.api.services.async.RequirementGroupServiceAsync
import com.telnyx.api.services.async.RequirementServiceAsync
import com.telnyx.api.services.async.RequirementTypeServiceAsync
import com.telnyx.api.services.async.RoomCompositionServiceAsync
import com.telnyx.api.services.async.RoomParticipantServiceAsync
import com.telnyx.api.services.async.RoomRecordingServiceAsync
import com.telnyx.api.services.async.RoomServiceAsync
import com.telnyx.api.services.async.SetiServiceAsync
import com.telnyx.api.services.async.ShortCodeServiceAsync
import com.telnyx.api.services.async.SimCardDataUsageNotificationServiceAsync
import com.telnyx.api.services.async.SimCardGroupServiceAsync
import com.telnyx.api.services.async.SimCardOrderPreviewServiceAsync
import com.telnyx.api.services.async.SimCardOrderServiceAsync
import com.telnyx.api.services.async.SimCardServiceAsync
import com.telnyx.api.services.async.SiprecConnectorServiceAsync
import com.telnyx.api.services.async.StorageServiceAsync
import com.telnyx.api.services.async.SubNumberOrderServiceAsync
import com.telnyx.api.services.async.SubNumberOrdersReportServiceAsync
import com.telnyx.api.services.async.TelephonyCredentialServiceAsync
import com.telnyx.api.services.async.TexmlApplicationServiceAsync
import com.telnyx.api.services.async.TexmlServiceAsync
import com.telnyx.api.services.async.TextToSpeechServiceAsync
import com.telnyx.api.services.async.UsageReportServiceAsync
import com.telnyx.api.services.async.UserAddressServiceAsync
import com.telnyx.api.services.async.UserTagServiceAsync
import com.telnyx.api.services.async.VerificationServiceAsync
import com.telnyx.api.services.async.VerifiedNumberServiceAsync
import com.telnyx.api.services.async.VerifyProfileServiceAsync
import com.telnyx.api.services.async.VirtualCrossConnectServiceAsync
import com.telnyx.api.services.async.VirtualCrossConnectsCoverageServiceAsync
import com.telnyx.api.services.async.WebhookDeliveryServiceAsync
import com.telnyx.api.services.async.WebhookServiceAsync
import com.telnyx.api.services.async.WellKnownServiceAsync
import com.telnyx.api.services.async.WireguardInterfaceServiceAsync
import com.telnyx.api.services.async.WireguardPeerServiceAsync
import com.telnyx.api.services.async.WirelessBlocklistServiceAsync
import com.telnyx.api.services.async.WirelessBlocklistValueServiceAsync
import com.telnyx.api.services.async.WirelessServiceAsync
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

    fun accessIpAddress(): AccessIpAddressServiceAsync

    fun accessIpRanges(): AccessIpRangeServiceAsync

    fun actions(): ActionServiceAsync

    fun addresses(): AddressServiceAsync

    fun advancedOrders(): AdvancedOrderServiceAsync

    fun ai(): AiServiceAsync

    fun auditEvents(): AuditEventServiceAsync

    fun authenticationProviders(): AuthenticationProviderServiceAsync

    fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockServiceAsync

    fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync

    fun balance(): BalanceServiceAsync

    fun billingGroups(): BillingGroupServiceAsync

    fun brand(): BrandServiceAsync

    fun bulkSimCardActions(): BulkSimCardActionServiceAsync

    fun bundlePricing(): BundlePricingServiceAsync

    fun callControlApplications(): CallControlApplicationServiceAsync

    fun callEvents(): CallEventServiceAsync

    fun calls(): CallServiceAsync

    fun campaign(): CampaignServiceAsync

    fun campaignBuilder(): CampaignBuilderServiceAsync

    fun channelZones(): ChannelZoneServiceAsync

    fun chargesBreakdown(): ChargesBreakdownServiceAsync

    fun chargesSummary(): ChargesSummaryServiceAsync

    fun comments(): CommentServiceAsync

    fun conferences(): ConferenceServiceAsync

    fun connections(): ConnectionServiceAsync

    fun countryCoverage(): CountryCoverageServiceAsync

    fun credentialConnections(): CredentialConnectionServiceAsync

    fun customStorageCredentials(): CustomStorageCredentialServiceAsync

    fun customerServiceRecords(): CustomerServiceRecordServiceAsync

    fun detailRecords(): DetailRecordServiceAsync

    fun dialogflowConnections(): DialogflowConnectionServiceAsync

    fun documentLinks(): DocumentLinkServiceAsync

    fun documents(): DocumentServiceAsync

    fun dynamicEmergencyAddresses(): DynamicEmergencyAddressServiceAsync

    fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointServiceAsync

    fun enum_(): EnumServiceAsync

    fun externalConnections(): ExternalConnectionServiceAsync

    fun faxApplications(): FaxApplicationServiceAsync

    fun faxes(): FaxServiceAsync

    fun fqdnConnections(): FqdnConnectionServiceAsync

    fun fqdns(): FqdnServiceAsync

    fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync

    fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthServiceAsync

    fun globalIpAssignments(): GlobalIpAssignmentServiceAsync

    fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageServiceAsync

    fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeServiceAsync

    fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync

    fun globalIpLatency(): GlobalIpLatencyServiceAsync

    fun globalIpProtocols(): GlobalIpProtocolServiceAsync

    fun globalIpUsage(): GlobalIpUsageServiceAsync

    fun globalIps(): GlobalIpServiceAsync

    fun inboundChannels(): InboundChannelServiceAsync

    fun integrationSecrets(): IntegrationSecretServiceAsync

    fun inventoryCoverage(): InventoryCoverageServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun ipConnections(): IpConnectionServiceAsync

    fun ips(): IpServiceAsync

    fun ledgerBillingGroupReports(): LedgerBillingGroupReportServiceAsync

    fun list(): ListServiceAsync

    fun managedAccounts(): ManagedAccountServiceAsync

    fun media(): MediaServiceAsync

    fun messages(): MessageServiceAsync

    fun messaging(): MessagingServiceAsync

    fun messagingHostedNumberOrders(): MessagingHostedNumberOrderServiceAsync

    fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync

    fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateServiceAsync

    fun messagingOptouts(): MessagingOptoutServiceAsync

    fun messagingProfiles(): MessagingProfileServiceAsync

    fun messagingTollfree(): MessagingTollfreeServiceAsync

    fun messagingUrlDomains(): MessagingUrlDomainServiceAsync

    fun messsages(): MesssageServiceAsync

    fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync

    fun mobilePushCredentials(): MobilePushCredentialServiceAsync

    fun networkCoverage(): NetworkCoverageServiceAsync

    fun networks(): NetworkServiceAsync

    fun notificationChannels(): NotificationChannelServiceAsync

    fun notificationEventConditions(): NotificationEventConditionServiceAsync

    fun notificationEvents(): NotificationEventServiceAsync

    fun notificationProfiles(): NotificationProfileServiceAsync

    fun notificationSettings(): NotificationSettingServiceAsync

    fun numberBlockOrders(): NumberBlockOrderServiceAsync

    fun numberLookup(): NumberLookupServiceAsync

    fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync

    fun numberOrders(): NumberOrderServiceAsync

    fun numberReservations(): NumberReservationServiceAsync

    fun numbersFeatures(): NumbersFeatureServiceAsync

    fun operatorConnect(): OperatorConnectServiceAsync

    fun otaUpdates(): OtaUpdateServiceAsync

    fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync

    fun payment(): PaymentServiceAsync

    fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync

    fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync

    fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync

    fun phoneNumbers(): PhoneNumberServiceAsync

    fun phoneNumbersRegulatoryRequirements(): PhoneNumbersRegulatoryRequirementServiceAsync

    fun portabilityChecks(): PortabilityCheckServiceAsync

    fun porting(): PortingServiceAsync

    fun portingOrders(): PortingOrderServiceAsync

    fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync

    fun portouts(): PortoutServiceAsync

    fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync

    fun publicInternetGateways(): PublicInternetGatewayServiceAsync

    fun queues(): QueueServiceAsync

    fun rcsAgents(): RcsAgentServiceAsync

    fun recordingTranscriptions(): RecordingTranscriptionServiceAsync

    fun recordings(): RecordingServiceAsync

    fun regions(): RegionServiceAsync

    fun regulatoryRequirements(): RegulatoryRequirementServiceAsync

    fun reports(): ReportServiceAsync

    fun requirementGroups(): RequirementGroupServiceAsync

    fun requirementTypes(): RequirementTypeServiceAsync

    fun requirements(): RequirementServiceAsync

    fun roomCompositions(): RoomCompositionServiceAsync

    fun roomParticipants(): RoomParticipantServiceAsync

    fun roomRecordings(): RoomRecordingServiceAsync

    fun rooms(): RoomServiceAsync

    fun seti(): SetiServiceAsync

    fun shortCodes(): ShortCodeServiceAsync

    fun simCardDataUsageNotifications(): SimCardDataUsageNotificationServiceAsync

    fun simCardGroups(): SimCardGroupServiceAsync

    fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync

    fun simCardOrders(): SimCardOrderServiceAsync

    fun simCards(): SimCardServiceAsync

    fun siprecConnectors(): SiprecConnectorServiceAsync

    fun storage(): StorageServiceAsync

    fun subNumberOrders(): SubNumberOrderServiceAsync

    fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync

    fun telephonyCredentials(): TelephonyCredentialServiceAsync

    fun texml(): TexmlServiceAsync

    fun texmlApplications(): TexmlApplicationServiceAsync

    fun textToSpeech(): TextToSpeechServiceAsync

    fun usageReports(): UsageReportServiceAsync

    fun userAddresses(): UserAddressServiceAsync

    fun userTags(): UserTagServiceAsync

    fun verifications(): VerificationServiceAsync

    fun verifiedNumbers(): VerifiedNumberServiceAsync

    fun verifyProfiles(): VerifyProfileServiceAsync

    fun virtualCrossConnects(): VirtualCrossConnectServiceAsync

    fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageServiceAsync

    fun webhookDeliveries(): WebhookDeliveryServiceAsync

    fun wireguardInterfaces(): WireguardInterfaceServiceAsync

    fun wireguardPeers(): WireguardPeerServiceAsync

    fun wireless(): WirelessServiceAsync

    fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync

    fun wirelessBlocklists(): WirelessBlocklistServiceAsync

    fun partnerCampaigns(): PartnerCampaignServiceAsync

    fun wellKnown(): WellKnownServiceAsync

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

        fun accessIpAddress(): AccessIpAddressServiceAsync.WithRawResponse

        fun accessIpRanges(): AccessIpRangeServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        fun addresses(): AddressServiceAsync.WithRawResponse

        fun advancedOrders(): AdvancedOrderServiceAsync.WithRawResponse

        fun ai(): AiServiceAsync.WithRawResponse

        fun auditEvents(): AuditEventServiceAsync.WithRawResponse

        fun authenticationProviders(): AuthenticationProviderServiceAsync.WithRawResponse

        fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockServiceAsync.WithRawResponse

        fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync.WithRawResponse

        fun balance(): BalanceServiceAsync.WithRawResponse

        fun billingGroups(): BillingGroupServiceAsync.WithRawResponse

        fun brand(): BrandServiceAsync.WithRawResponse

        fun bulkSimCardActions(): BulkSimCardActionServiceAsync.WithRawResponse

        fun bundlePricing(): BundlePricingServiceAsync.WithRawResponse

        fun callControlApplications(): CallControlApplicationServiceAsync.WithRawResponse

        fun callEvents(): CallEventServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        fun campaign(): CampaignServiceAsync.WithRawResponse

        fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse

        fun channelZones(): ChannelZoneServiceAsync.WithRawResponse

        fun chargesBreakdown(): ChargesBreakdownServiceAsync.WithRawResponse

        fun chargesSummary(): ChargesSummaryServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun conferences(): ConferenceServiceAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        fun countryCoverage(): CountryCoverageServiceAsync.WithRawResponse

        fun credentialConnections(): CredentialConnectionServiceAsync.WithRawResponse

        fun customStorageCredentials(): CustomStorageCredentialServiceAsync.WithRawResponse

        fun customerServiceRecords(): CustomerServiceRecordServiceAsync.WithRawResponse

        fun detailRecords(): DetailRecordServiceAsync.WithRawResponse

        fun dialogflowConnections(): DialogflowConnectionServiceAsync.WithRawResponse

        fun documentLinks(): DocumentLinkServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        fun dynamicEmergencyAddresses(): DynamicEmergencyAddressServiceAsync.WithRawResponse

        fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointServiceAsync.WithRawResponse

        fun enum_(): EnumServiceAsync.WithRawResponse

        fun externalConnections(): ExternalConnectionServiceAsync.WithRawResponse

        fun faxApplications(): FaxApplicationServiceAsync.WithRawResponse

        fun faxes(): FaxServiceAsync.WithRawResponse

        fun fqdnConnections(): FqdnConnectionServiceAsync.WithRawResponse

        fun fqdns(): FqdnServiceAsync.WithRawResponse

        fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync.WithRawResponse

        fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthServiceAsync.WithRawResponse

        fun globalIpAssignments(): GlobalIpAssignmentServiceAsync.WithRawResponse

        fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageServiceAsync.WithRawResponse

        fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeServiceAsync.WithRawResponse

        fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync.WithRawResponse

        fun globalIpLatency(): GlobalIpLatencyServiceAsync.WithRawResponse

        fun globalIpProtocols(): GlobalIpProtocolServiceAsync.WithRawResponse

        fun globalIpUsage(): GlobalIpUsageServiceAsync.WithRawResponse

        fun globalIps(): GlobalIpServiceAsync.WithRawResponse

        fun inboundChannels(): InboundChannelServiceAsync.WithRawResponse

        fun integrationSecrets(): IntegrationSecretServiceAsync.WithRawResponse

        fun inventoryCoverage(): InventoryCoverageServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun ipConnections(): IpConnectionServiceAsync.WithRawResponse

        fun ips(): IpServiceAsync.WithRawResponse

        fun ledgerBillingGroupReports(): LedgerBillingGroupReportServiceAsync.WithRawResponse

        fun list(): ListServiceAsync.WithRawResponse

        fun managedAccounts(): ManagedAccountServiceAsync.WithRawResponse

        fun media(): MediaServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun messaging(): MessagingServiceAsync.WithRawResponse

        fun messagingHostedNumberOrders(): MessagingHostedNumberOrderServiceAsync.WithRawResponse

        fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync.WithRawResponse

        fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateServiceAsync.WithRawResponse

        fun messagingOptouts(): MessagingOptoutServiceAsync.WithRawResponse

        fun messagingProfiles(): MessagingProfileServiceAsync.WithRawResponse

        fun messagingTollfree(): MessagingTollfreeServiceAsync.WithRawResponse

        fun messagingUrlDomains(): MessagingUrlDomainServiceAsync.WithRawResponse

        fun messsages(): MesssageServiceAsync.WithRawResponse

        fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync.WithRawResponse

        fun mobilePushCredentials(): MobilePushCredentialServiceAsync.WithRawResponse

        fun networkCoverage(): NetworkCoverageServiceAsync.WithRawResponse

        fun networks(): NetworkServiceAsync.WithRawResponse

        fun notificationChannels(): NotificationChannelServiceAsync.WithRawResponse

        fun notificationEventConditions(): NotificationEventConditionServiceAsync.WithRawResponse

        fun notificationEvents(): NotificationEventServiceAsync.WithRawResponse

        fun notificationProfiles(): NotificationProfileServiceAsync.WithRawResponse

        fun notificationSettings(): NotificationSettingServiceAsync.WithRawResponse

        fun numberBlockOrders(): NumberBlockOrderServiceAsync.WithRawResponse

        fun numberLookup(): NumberLookupServiceAsync.WithRawResponse

        fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync.WithRawResponse

        fun numberOrders(): NumberOrderServiceAsync.WithRawResponse

        fun numberReservations(): NumberReservationServiceAsync.WithRawResponse

        fun numbersFeatures(): NumbersFeatureServiceAsync.WithRawResponse

        fun operatorConnect(): OperatorConnectServiceAsync.WithRawResponse

        fun otaUpdates(): OtaUpdateServiceAsync.WithRawResponse

        fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync.WithRawResponse

        fun payment(): PaymentServiceAsync.WithRawResponse

        fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync.WithRawResponse

        fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse

        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementServiceAsync.WithRawResponse

        fun portabilityChecks(): PortabilityCheckServiceAsync.WithRawResponse

        fun porting(): PortingServiceAsync.WithRawResponse

        fun portingOrders(): PortingOrderServiceAsync.WithRawResponse

        fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync.WithRawResponse

        fun portouts(): PortoutServiceAsync.WithRawResponse

        fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync.WithRawResponse

        fun publicInternetGateways(): PublicInternetGatewayServiceAsync.WithRawResponse

        fun queues(): QueueServiceAsync.WithRawResponse

        fun rcsAgents(): RcsAgentServiceAsync.WithRawResponse

        fun recordingTranscriptions(): RecordingTranscriptionServiceAsync.WithRawResponse

        fun recordings(): RecordingServiceAsync.WithRawResponse

        fun regions(): RegionServiceAsync.WithRawResponse

        fun regulatoryRequirements(): RegulatoryRequirementServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse

        fun requirementGroups(): RequirementGroupServiceAsync.WithRawResponse

        fun requirementTypes(): RequirementTypeServiceAsync.WithRawResponse

        fun requirements(): RequirementServiceAsync.WithRawResponse

        fun roomCompositions(): RoomCompositionServiceAsync.WithRawResponse

        fun roomParticipants(): RoomParticipantServiceAsync.WithRawResponse

        fun roomRecordings(): RoomRecordingServiceAsync.WithRawResponse

        fun rooms(): RoomServiceAsync.WithRawResponse

        fun seti(): SetiServiceAsync.WithRawResponse

        fun shortCodes(): ShortCodeServiceAsync.WithRawResponse

        fun simCardDataUsageNotifications():
            SimCardDataUsageNotificationServiceAsync.WithRawResponse

        fun simCardGroups(): SimCardGroupServiceAsync.WithRawResponse

        fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync.WithRawResponse

        fun simCardOrders(): SimCardOrderServiceAsync.WithRawResponse

        fun simCards(): SimCardServiceAsync.WithRawResponse

        fun siprecConnectors(): SiprecConnectorServiceAsync.WithRawResponse

        fun storage(): StorageServiceAsync.WithRawResponse

        fun subNumberOrders(): SubNumberOrderServiceAsync.WithRawResponse

        fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync.WithRawResponse

        fun telephonyCredentials(): TelephonyCredentialServiceAsync.WithRawResponse

        fun texml(): TexmlServiceAsync.WithRawResponse

        fun texmlApplications(): TexmlApplicationServiceAsync.WithRawResponse

        fun textToSpeech(): TextToSpeechServiceAsync.WithRawResponse

        fun usageReports(): UsageReportServiceAsync.WithRawResponse

        fun userAddresses(): UserAddressServiceAsync.WithRawResponse

        fun userTags(): UserTagServiceAsync.WithRawResponse

        fun verifications(): VerificationServiceAsync.WithRawResponse

        fun verifiedNumbers(): VerifiedNumberServiceAsync.WithRawResponse

        fun verifyProfiles(): VerifyProfileServiceAsync.WithRawResponse

        fun virtualCrossConnects(): VirtualCrossConnectServiceAsync.WithRawResponse

        fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageServiceAsync.WithRawResponse

        fun webhookDeliveries(): WebhookDeliveryServiceAsync.WithRawResponse

        fun wireguardInterfaces(): WireguardInterfaceServiceAsync.WithRawResponse

        fun wireguardPeers(): WireguardPeerServiceAsync.WithRawResponse

        fun wireless(): WirelessServiceAsync.WithRawResponse

        fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync.WithRawResponse

        fun wirelessBlocklists(): WirelessBlocklistServiceAsync.WithRawResponse

        fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse

        fun wellKnown(): WellKnownServiceAsync.WithRawResponse
    }
}
