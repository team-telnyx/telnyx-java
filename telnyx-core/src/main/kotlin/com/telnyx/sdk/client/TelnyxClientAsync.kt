// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.AccessIpAddressServiceAsync
import com.telnyx.sdk.services.async.AccessIpRangeServiceAsync
import com.telnyx.sdk.services.async.ActionServiceAsync
import com.telnyx.sdk.services.async.AddressServiceAsync
import com.telnyx.sdk.services.async.AdvancedOrderServiceAsync
import com.telnyx.sdk.services.async.AiServiceAsync
import com.telnyx.sdk.services.async.AuditEventServiceAsync
import com.telnyx.sdk.services.async.AuthenticationProviderServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberServiceAsync
import com.telnyx.sdk.services.async.BalanceServiceAsync
import com.telnyx.sdk.services.async.BillingGroupServiceAsync
import com.telnyx.sdk.services.async.BrandServiceAsync
import com.telnyx.sdk.services.async.BulkSimCardActionServiceAsync
import com.telnyx.sdk.services.async.BundlePricingServiceAsync
import com.telnyx.sdk.services.async.CallControlApplicationServiceAsync
import com.telnyx.sdk.services.async.CallEventServiceAsync
import com.telnyx.sdk.services.async.CallServiceAsync
import com.telnyx.sdk.services.async.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.CampaignServiceAsync
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
import com.telnyx.sdk.services.async.EnumServiceAsync
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
import com.telnyx.sdk.services.async.MessagingHostedNumberOrderServiceAsync
import com.telnyx.sdk.services.async.MessagingHostedNumberServiceAsync
import com.telnyx.sdk.services.async.MessagingNumbersBulkUpdateServiceAsync
import com.telnyx.sdk.services.async.MessagingOptoutServiceAsync
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import com.telnyx.sdk.services.async.MessagingServiceAsync
import com.telnyx.sdk.services.async.MessagingTollfreeServiceAsync
import com.telnyx.sdk.services.async.MessagingUrlDomainServiceAsync
import com.telnyx.sdk.services.async.MesssageServiceAsync
import com.telnyx.sdk.services.async.MobileNetworkOperatorServiceAsync
import com.telnyx.sdk.services.async.MobilePushCredentialServiceAsync
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
import com.telnyx.sdk.services.async.OtaUpdateServiceAsync
import com.telnyx.sdk.services.async.OutboundVoiceProfileServiceAsync
import com.telnyx.sdk.services.async.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.PaymentServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberCampaignServiceAsync
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

    fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync

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

        fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync.WithRawResponse
    }
}
