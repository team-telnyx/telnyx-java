// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.getPackageVersion
import com.telnyx.sdk.services.async.AccessIpAddressServiceAsync
import com.telnyx.sdk.services.async.AccessIpAddressServiceAsyncImpl
import com.telnyx.sdk.services.async.AccessIpRangeServiceAsync
import com.telnyx.sdk.services.async.AccessIpRangeServiceAsyncImpl
import com.telnyx.sdk.services.async.ActionServiceAsync
import com.telnyx.sdk.services.async.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.AddressServiceAsync
import com.telnyx.sdk.services.async.AddressServiceAsyncImpl
import com.telnyx.sdk.services.async.AdvancedOrderServiceAsync
import com.telnyx.sdk.services.async.AdvancedOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.AiServiceAsync
import com.telnyx.sdk.services.async.AiServiceAsyncImpl
import com.telnyx.sdk.services.async.AuditEventServiceAsync
import com.telnyx.sdk.services.async.AuditEventServiceAsyncImpl
import com.telnyx.sdk.services.async.AuthenticationProviderServiceAsync
import com.telnyx.sdk.services.async.AuthenticationProviderServiceAsyncImpl
import com.telnyx.sdk.services.async.AvailablePhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberBlockServiceAsyncImpl
import com.telnyx.sdk.services.async.AvailablePhoneNumberServiceAsync
import com.telnyx.sdk.services.async.AvailablePhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.BalanceServiceAsync
import com.telnyx.sdk.services.async.BalanceServiceAsyncImpl
import com.telnyx.sdk.services.async.BillingGroupServiceAsync
import com.telnyx.sdk.services.async.BillingGroupServiceAsyncImpl
import com.telnyx.sdk.services.async.BrandServiceAsync
import com.telnyx.sdk.services.async.BrandServiceAsyncImpl
import com.telnyx.sdk.services.async.BulkSimCardActionServiceAsync
import com.telnyx.sdk.services.async.BulkSimCardActionServiceAsyncImpl
import com.telnyx.sdk.services.async.BundlePricingServiceAsync
import com.telnyx.sdk.services.async.BundlePricingServiceAsyncImpl
import com.telnyx.sdk.services.async.CallControlApplicationServiceAsync
import com.telnyx.sdk.services.async.CallControlApplicationServiceAsyncImpl
import com.telnyx.sdk.services.async.CallEventServiceAsync
import com.telnyx.sdk.services.async.CallEventServiceAsyncImpl
import com.telnyx.sdk.services.async.CallServiceAsync
import com.telnyx.sdk.services.async.CallServiceAsyncImpl
import com.telnyx.sdk.services.async.CampaignBuilderServiceAsync
import com.telnyx.sdk.services.async.CampaignBuilderServiceAsyncImpl
import com.telnyx.sdk.services.async.CampaignServiceAsync
import com.telnyx.sdk.services.async.CampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.ChannelZoneServiceAsync
import com.telnyx.sdk.services.async.ChannelZoneServiceAsyncImpl
import com.telnyx.sdk.services.async.ChargesBreakdownServiceAsync
import com.telnyx.sdk.services.async.ChargesBreakdownServiceAsyncImpl
import com.telnyx.sdk.services.async.ChargesSummaryServiceAsync
import com.telnyx.sdk.services.async.ChargesSummaryServiceAsyncImpl
import com.telnyx.sdk.services.async.CommentServiceAsync
import com.telnyx.sdk.services.async.CommentServiceAsyncImpl
import com.telnyx.sdk.services.async.ConferenceServiceAsync
import com.telnyx.sdk.services.async.ConferenceServiceAsyncImpl
import com.telnyx.sdk.services.async.ConnectionServiceAsync
import com.telnyx.sdk.services.async.ConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.CountryCoverageServiceAsync
import com.telnyx.sdk.services.async.CountryCoverageServiceAsyncImpl
import com.telnyx.sdk.services.async.CredentialConnectionServiceAsync
import com.telnyx.sdk.services.async.CredentialConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.CustomStorageCredentialServiceAsync
import com.telnyx.sdk.services.async.CustomStorageCredentialServiceAsyncImpl
import com.telnyx.sdk.services.async.CustomerServiceRecordServiceAsync
import com.telnyx.sdk.services.async.CustomerServiceRecordServiceAsyncImpl
import com.telnyx.sdk.services.async.DetailRecordServiceAsync
import com.telnyx.sdk.services.async.DetailRecordServiceAsyncImpl
import com.telnyx.sdk.services.async.DialogflowConnectionServiceAsync
import com.telnyx.sdk.services.async.DialogflowConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.DocumentLinkServiceAsync
import com.telnyx.sdk.services.async.DocumentLinkServiceAsyncImpl
import com.telnyx.sdk.services.async.DocumentServiceAsync
import com.telnyx.sdk.services.async.DocumentServiceAsyncImpl
import com.telnyx.sdk.services.async.DynamicEmergencyAddressServiceAsync
import com.telnyx.sdk.services.async.DynamicEmergencyAddressServiceAsyncImpl
import com.telnyx.sdk.services.async.DynamicEmergencyEndpointServiceAsync
import com.telnyx.sdk.services.async.DynamicEmergencyEndpointServiceAsyncImpl
import com.telnyx.sdk.services.async.EnumServiceAsync
import com.telnyx.sdk.services.async.EnumServiceAsyncImpl
import com.telnyx.sdk.services.async.ExternalConnectionServiceAsync
import com.telnyx.sdk.services.async.ExternalConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.FaxApplicationServiceAsync
import com.telnyx.sdk.services.async.FaxApplicationServiceAsyncImpl
import com.telnyx.sdk.services.async.FaxServiceAsync
import com.telnyx.sdk.services.async.FaxServiceAsyncImpl
import com.telnyx.sdk.services.async.FqdnConnectionServiceAsync
import com.telnyx.sdk.services.async.FqdnConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.FqdnServiceAsync
import com.telnyx.sdk.services.async.FqdnServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpAllowedPortServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAllowedPortServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpAssignmentHealthServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentHealthServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpAssignmentServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpAssignmentsUsageServiceAsync
import com.telnyx.sdk.services.async.GlobalIpAssignmentsUsageServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpHealthCheckServiceAsync
import com.telnyx.sdk.services.async.GlobalIpHealthCheckServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpHealthCheckTypeServiceAsync
import com.telnyx.sdk.services.async.GlobalIpHealthCheckTypeServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpLatencyServiceAsync
import com.telnyx.sdk.services.async.GlobalIpLatencyServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpProtocolServiceAsync
import com.telnyx.sdk.services.async.GlobalIpProtocolServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpServiceAsync
import com.telnyx.sdk.services.async.GlobalIpServiceAsyncImpl
import com.telnyx.sdk.services.async.GlobalIpUsageServiceAsync
import com.telnyx.sdk.services.async.GlobalIpUsageServiceAsyncImpl
import com.telnyx.sdk.services.async.InboundChannelServiceAsync
import com.telnyx.sdk.services.async.InboundChannelServiceAsyncImpl
import com.telnyx.sdk.services.async.InexplicitNumberOrderServiceAsync
import com.telnyx.sdk.services.async.InexplicitNumberOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.IntegrationSecretServiceAsync
import com.telnyx.sdk.services.async.IntegrationSecretServiceAsyncImpl
import com.telnyx.sdk.services.async.InventoryCoverageServiceAsync
import com.telnyx.sdk.services.async.InventoryCoverageServiceAsyncImpl
import com.telnyx.sdk.services.async.InvoiceServiceAsync
import com.telnyx.sdk.services.async.InvoiceServiceAsyncImpl
import com.telnyx.sdk.services.async.IpConnectionServiceAsync
import com.telnyx.sdk.services.async.IpConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.IpServiceAsync
import com.telnyx.sdk.services.async.IpServiceAsyncImpl
import com.telnyx.sdk.services.async.LedgerBillingGroupReportServiceAsync
import com.telnyx.sdk.services.async.LedgerBillingGroupReportServiceAsyncImpl
import com.telnyx.sdk.services.async.LegacyServiceAsync
import com.telnyx.sdk.services.async.LegacyServiceAsyncImpl
import com.telnyx.sdk.services.async.ListServiceAsync
import com.telnyx.sdk.services.async.ListServiceAsyncImpl
import com.telnyx.sdk.services.async.ManagedAccountServiceAsync
import com.telnyx.sdk.services.async.ManagedAccountServiceAsyncImpl
import com.telnyx.sdk.services.async.MediaServiceAsync
import com.telnyx.sdk.services.async.MediaServiceAsyncImpl
import com.telnyx.sdk.services.async.MessageServiceAsync
import com.telnyx.sdk.services.async.MessageServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingHostedNumberOrderServiceAsync
import com.telnyx.sdk.services.async.MessagingHostedNumberOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingHostedNumberServiceAsync
import com.telnyx.sdk.services.async.MessagingHostedNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingNumbersBulkUpdateServiceAsync
import com.telnyx.sdk.services.async.MessagingNumbersBulkUpdateServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingOptoutServiceAsync
import com.telnyx.sdk.services.async.MessagingOptoutServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingProfileServiceAsync
import com.telnyx.sdk.services.async.MessagingProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingServiceAsync
import com.telnyx.sdk.services.async.MessagingServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingTollfreeServiceAsync
import com.telnyx.sdk.services.async.MessagingTollfreeServiceAsyncImpl
import com.telnyx.sdk.services.async.MessagingUrlDomainServiceAsync
import com.telnyx.sdk.services.async.MessagingUrlDomainServiceAsyncImpl
import com.telnyx.sdk.services.async.MesssageServiceAsync
import com.telnyx.sdk.services.async.MesssageServiceAsyncImpl
import com.telnyx.sdk.services.async.MobileNetworkOperatorServiceAsync
import com.telnyx.sdk.services.async.MobileNetworkOperatorServiceAsyncImpl
import com.telnyx.sdk.services.async.MobilePhoneNumberServiceAsync
import com.telnyx.sdk.services.async.MobilePhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.MobilePushCredentialServiceAsync
import com.telnyx.sdk.services.async.MobilePushCredentialServiceAsyncImpl
import com.telnyx.sdk.services.async.MobileVoiceConnectionServiceAsync
import com.telnyx.sdk.services.async.MobileVoiceConnectionServiceAsyncImpl
import com.telnyx.sdk.services.async.NetworkCoverageServiceAsync
import com.telnyx.sdk.services.async.NetworkCoverageServiceAsyncImpl
import com.telnyx.sdk.services.async.NetworkServiceAsync
import com.telnyx.sdk.services.async.NetworkServiceAsyncImpl
import com.telnyx.sdk.services.async.NotificationChannelServiceAsync
import com.telnyx.sdk.services.async.NotificationChannelServiceAsyncImpl
import com.telnyx.sdk.services.async.NotificationEventConditionServiceAsync
import com.telnyx.sdk.services.async.NotificationEventConditionServiceAsyncImpl
import com.telnyx.sdk.services.async.NotificationEventServiceAsync
import com.telnyx.sdk.services.async.NotificationEventServiceAsyncImpl
import com.telnyx.sdk.services.async.NotificationProfileServiceAsync
import com.telnyx.sdk.services.async.NotificationProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.NotificationSettingServiceAsync
import com.telnyx.sdk.services.async.NotificationSettingServiceAsyncImpl
import com.telnyx.sdk.services.async.NumberBlockOrderServiceAsync
import com.telnyx.sdk.services.async.NumberBlockOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.NumberLookupServiceAsync
import com.telnyx.sdk.services.async.NumberLookupServiceAsyncImpl
import com.telnyx.sdk.services.async.NumberOrderPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.NumberOrderPhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.NumberOrderServiceAsync
import com.telnyx.sdk.services.async.NumberOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.NumberReservationServiceAsync
import com.telnyx.sdk.services.async.NumberReservationServiceAsyncImpl
import com.telnyx.sdk.services.async.NumbersFeatureServiceAsync
import com.telnyx.sdk.services.async.NumbersFeatureServiceAsyncImpl
import com.telnyx.sdk.services.async.OAuthClientServiceAsync
import com.telnyx.sdk.services.async.OAuthClientServiceAsyncImpl
import com.telnyx.sdk.services.async.OAuthGrantServiceAsync
import com.telnyx.sdk.services.async.OAuthGrantServiceAsyncImpl
import com.telnyx.sdk.services.async.OAuthServiceAsync
import com.telnyx.sdk.services.async.OAuthServiceAsyncImpl
import com.telnyx.sdk.services.async.OperatorConnectServiceAsync
import com.telnyx.sdk.services.async.OperatorConnectServiceAsyncImpl
import com.telnyx.sdk.services.async.OtaUpdateServiceAsync
import com.telnyx.sdk.services.async.OtaUpdateServiceAsyncImpl
import com.telnyx.sdk.services.async.OutboundVoiceProfileServiceAsync
import com.telnyx.sdk.services.async.OutboundVoiceProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.PartnerCampaignServiceAsync
import com.telnyx.sdk.services.async.PartnerCampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.PaymentServiceAsync
import com.telnyx.sdk.services.async.PaymentServiceAsyncImpl
import com.telnyx.sdk.services.async.PhoneNumberAssignmentByProfileServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberAssignmentByProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.PhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberBlockServiceAsyncImpl
import com.telnyx.sdk.services.async.PhoneNumberCampaignServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberCampaignServiceAsyncImpl
import com.telnyx.sdk.services.async.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.PhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.PhoneNumbersRegulatoryRequirementServiceAsync
import com.telnyx.sdk.services.async.PhoneNumbersRegulatoryRequirementServiceAsyncImpl
import com.telnyx.sdk.services.async.PortabilityCheckServiceAsync
import com.telnyx.sdk.services.async.PortabilityCheckServiceAsyncImpl
import com.telnyx.sdk.services.async.PortingOrderServiceAsync
import com.telnyx.sdk.services.async.PortingOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.PortingPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.PortingPhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.PortingServiceAsync
import com.telnyx.sdk.services.async.PortingServiceAsyncImpl
import com.telnyx.sdk.services.async.PortoutServiceAsync
import com.telnyx.sdk.services.async.PortoutServiceAsyncImpl
import com.telnyx.sdk.services.async.PrivateWirelessGatewayServiceAsync
import com.telnyx.sdk.services.async.PrivateWirelessGatewayServiceAsyncImpl
import com.telnyx.sdk.services.async.PublicInternetGatewayServiceAsync
import com.telnyx.sdk.services.async.PublicInternetGatewayServiceAsyncImpl
import com.telnyx.sdk.services.async.QueueServiceAsync
import com.telnyx.sdk.services.async.QueueServiceAsyncImpl
import com.telnyx.sdk.services.async.RcsAgentServiceAsync
import com.telnyx.sdk.services.async.RcsAgentServiceAsyncImpl
import com.telnyx.sdk.services.async.RecordingServiceAsync
import com.telnyx.sdk.services.async.RecordingServiceAsyncImpl
import com.telnyx.sdk.services.async.RecordingTranscriptionServiceAsync
import com.telnyx.sdk.services.async.RecordingTranscriptionServiceAsyncImpl
import com.telnyx.sdk.services.async.RegionServiceAsync
import com.telnyx.sdk.services.async.RegionServiceAsyncImpl
import com.telnyx.sdk.services.async.RegulatoryRequirementServiceAsync
import com.telnyx.sdk.services.async.RegulatoryRequirementServiceAsyncImpl
import com.telnyx.sdk.services.async.ReportServiceAsync
import com.telnyx.sdk.services.async.ReportServiceAsyncImpl
import com.telnyx.sdk.services.async.RequirementGroupServiceAsync
import com.telnyx.sdk.services.async.RequirementGroupServiceAsyncImpl
import com.telnyx.sdk.services.async.RequirementServiceAsync
import com.telnyx.sdk.services.async.RequirementServiceAsyncImpl
import com.telnyx.sdk.services.async.RequirementTypeServiceAsync
import com.telnyx.sdk.services.async.RequirementTypeServiceAsyncImpl
import com.telnyx.sdk.services.async.RoomCompositionServiceAsync
import com.telnyx.sdk.services.async.RoomCompositionServiceAsyncImpl
import com.telnyx.sdk.services.async.RoomParticipantServiceAsync
import com.telnyx.sdk.services.async.RoomParticipantServiceAsyncImpl
import com.telnyx.sdk.services.async.RoomRecordingServiceAsync
import com.telnyx.sdk.services.async.RoomRecordingServiceAsyncImpl
import com.telnyx.sdk.services.async.RoomServiceAsync
import com.telnyx.sdk.services.async.RoomServiceAsyncImpl
import com.telnyx.sdk.services.async.SetiServiceAsync
import com.telnyx.sdk.services.async.SetiServiceAsyncImpl
import com.telnyx.sdk.services.async.ShortCodeServiceAsync
import com.telnyx.sdk.services.async.ShortCodeServiceAsyncImpl
import com.telnyx.sdk.services.async.SimCardDataUsageNotificationServiceAsync
import com.telnyx.sdk.services.async.SimCardDataUsageNotificationServiceAsyncImpl
import com.telnyx.sdk.services.async.SimCardGroupServiceAsync
import com.telnyx.sdk.services.async.SimCardGroupServiceAsyncImpl
import com.telnyx.sdk.services.async.SimCardOrderPreviewServiceAsync
import com.telnyx.sdk.services.async.SimCardOrderPreviewServiceAsyncImpl
import com.telnyx.sdk.services.async.SimCardOrderServiceAsync
import com.telnyx.sdk.services.async.SimCardOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.SimCardServiceAsync
import com.telnyx.sdk.services.async.SimCardServiceAsyncImpl
import com.telnyx.sdk.services.async.SiprecConnectorServiceAsync
import com.telnyx.sdk.services.async.SiprecConnectorServiceAsyncImpl
import com.telnyx.sdk.services.async.StorageServiceAsync
import com.telnyx.sdk.services.async.StorageServiceAsyncImpl
import com.telnyx.sdk.services.async.SubNumberOrderServiceAsync
import com.telnyx.sdk.services.async.SubNumberOrderServiceAsyncImpl
import com.telnyx.sdk.services.async.SubNumberOrdersReportServiceAsync
import com.telnyx.sdk.services.async.SubNumberOrdersReportServiceAsyncImpl
import com.telnyx.sdk.services.async.TelephonyCredentialServiceAsync
import com.telnyx.sdk.services.async.TelephonyCredentialServiceAsyncImpl
import com.telnyx.sdk.services.async.TexmlApplicationServiceAsync
import com.telnyx.sdk.services.async.TexmlApplicationServiceAsyncImpl
import com.telnyx.sdk.services.async.TexmlServiceAsync
import com.telnyx.sdk.services.async.TexmlServiceAsyncImpl
import com.telnyx.sdk.services.async.TextToSpeechServiceAsync
import com.telnyx.sdk.services.async.TextToSpeechServiceAsyncImpl
import com.telnyx.sdk.services.async.UsageReportServiceAsync
import com.telnyx.sdk.services.async.UsageReportServiceAsyncImpl
import com.telnyx.sdk.services.async.UserAddressServiceAsync
import com.telnyx.sdk.services.async.UserAddressServiceAsyncImpl
import com.telnyx.sdk.services.async.UserTagServiceAsync
import com.telnyx.sdk.services.async.UserTagServiceAsyncImpl
import com.telnyx.sdk.services.async.VerificationServiceAsync
import com.telnyx.sdk.services.async.VerificationServiceAsyncImpl
import com.telnyx.sdk.services.async.VerifiedNumberServiceAsync
import com.telnyx.sdk.services.async.VerifiedNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.VerifyProfileServiceAsync
import com.telnyx.sdk.services.async.VerifyProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.VirtualCrossConnectServiceAsync
import com.telnyx.sdk.services.async.VirtualCrossConnectServiceAsyncImpl
import com.telnyx.sdk.services.async.VirtualCrossConnectsCoverageServiceAsync
import com.telnyx.sdk.services.async.VirtualCrossConnectsCoverageServiceAsyncImpl
import com.telnyx.sdk.services.async.WebhookDeliveryServiceAsync
import com.telnyx.sdk.services.async.WebhookDeliveryServiceAsyncImpl
import com.telnyx.sdk.services.async.WebhookServiceAsync
import com.telnyx.sdk.services.async.WebhookServiceAsyncImpl
import com.telnyx.sdk.services.async.WellKnownServiceAsync
import com.telnyx.sdk.services.async.WellKnownServiceAsyncImpl
import com.telnyx.sdk.services.async.WireguardInterfaceServiceAsync
import com.telnyx.sdk.services.async.WireguardInterfaceServiceAsyncImpl
import com.telnyx.sdk.services.async.WireguardPeerServiceAsync
import com.telnyx.sdk.services.async.WireguardPeerServiceAsyncImpl
import com.telnyx.sdk.services.async.WirelessBlocklistServiceAsync
import com.telnyx.sdk.services.async.WirelessBlocklistServiceAsyncImpl
import com.telnyx.sdk.services.async.WirelessBlocklistValueServiceAsync
import com.telnyx.sdk.services.async.WirelessBlocklistValueServiceAsyncImpl
import com.telnyx.sdk.services.async.WirelessServiceAsync
import com.telnyx.sdk.services.async.WirelessServiceAsyncImpl
import java.util.function.Consumer

class TelnyxClientAsyncImpl(private val clientOptions: ClientOptions) : TelnyxClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: TelnyxClient by lazy { TelnyxClientImpl(clientOptions) }

    private val withRawResponse: TelnyxClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val legacy: LegacyServiceAsync by lazy {
        LegacyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauth: OAuthServiceAsync by lazy {
        OAuthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauthClients: OAuthClientServiceAsync by lazy {
        OAuthClientServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val oauthGrants: OAuthGrantServiceAsync by lazy {
        OAuthGrantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accessIpAddress: AccessIpAddressServiceAsync by lazy {
        AccessIpAddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accessIpRanges: AccessIpRangeServiceAsync by lazy {
        AccessIpRangeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val actions: ActionServiceAsync by lazy {
        ActionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val addresses: AddressServiceAsync by lazy {
        AddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val advancedOrders: AdvancedOrderServiceAsync by lazy {
        AdvancedOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ai: AiServiceAsync by lazy { AiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val auditEvents: AuditEventServiceAsync by lazy {
        AuditEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val authenticationProviders: AuthenticationProviderServiceAsync by lazy {
        AuthenticationProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val availablePhoneNumberBlocks: AvailablePhoneNumberBlockServiceAsync by lazy {
        AvailablePhoneNumberBlockServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val availablePhoneNumbers: AvailablePhoneNumberServiceAsync by lazy {
        AvailablePhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val balance: BalanceServiceAsync by lazy {
        BalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val billingGroups: BillingGroupServiceAsync by lazy {
        BillingGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val brand: BrandServiceAsync by lazy {
        BrandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bulkSimCardActions: BulkSimCardActionServiceAsync by lazy {
        BulkSimCardActionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bundlePricing: BundlePricingServiceAsync by lazy {
        BundlePricingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val callControlApplications: CallControlApplicationServiceAsync by lazy {
        CallControlApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val callEvents: CallEventServiceAsync by lazy {
        CallEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val campaign: CampaignServiceAsync by lazy {
        CampaignServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val campaignBuilder: CampaignBuilderServiceAsync by lazy {
        CampaignBuilderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val channelZones: ChannelZoneServiceAsync by lazy {
        ChannelZoneServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chargesBreakdown: ChargesBreakdownServiceAsync by lazy {
        ChargesBreakdownServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chargesSummary: ChargesSummaryServiceAsync by lazy {
        ChargesSummaryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val comments: CommentServiceAsync by lazy {
        CommentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val conferences: ConferenceServiceAsync by lazy {
        ConferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val countryCoverage: CountryCoverageServiceAsync by lazy {
        CountryCoverageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val credentialConnections: CredentialConnectionServiceAsync by lazy {
        CredentialConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customStorageCredentials: CustomStorageCredentialServiceAsync by lazy {
        CustomStorageCredentialServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customerServiceRecords: CustomerServiceRecordServiceAsync by lazy {
        CustomerServiceRecordServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val detailRecords: DetailRecordServiceAsync by lazy {
        DetailRecordServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dialogflowConnections: DialogflowConnectionServiceAsync by lazy {
        DialogflowConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val documentLinks: DocumentLinkServiceAsync by lazy {
        DocumentLinkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val documents: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dynamicEmergencyAddresses: DynamicEmergencyAddressServiceAsync by lazy {
        DynamicEmergencyAddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dynamicEmergencyEndpoints: DynamicEmergencyEndpointServiceAsync by lazy {
        DynamicEmergencyEndpointServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val enum_: EnumServiceAsync by lazy { EnumServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val externalConnections: ExternalConnectionServiceAsync by lazy {
        ExternalConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val faxApplications: FaxApplicationServiceAsync by lazy {
        FaxApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val faxes: FaxServiceAsync by lazy { FaxServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val fqdnConnections: FqdnConnectionServiceAsync by lazy {
        FqdnConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val fqdns: FqdnServiceAsync by lazy { FqdnServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val globalIpAllowedPorts: GlobalIpAllowedPortServiceAsync by lazy {
        GlobalIpAllowedPortServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignmentHealth: GlobalIpAssignmentHealthServiceAsync by lazy {
        GlobalIpAssignmentHealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignments: GlobalIpAssignmentServiceAsync by lazy {
        GlobalIpAssignmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignmentsUsage: GlobalIpAssignmentsUsageServiceAsync by lazy {
        GlobalIpAssignmentsUsageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpHealthCheckTypes: GlobalIpHealthCheckTypeServiceAsync by lazy {
        GlobalIpHealthCheckTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpHealthChecks: GlobalIpHealthCheckServiceAsync by lazy {
        GlobalIpHealthCheckServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpLatency: GlobalIpLatencyServiceAsync by lazy {
        GlobalIpLatencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpProtocols: GlobalIpProtocolServiceAsync by lazy {
        GlobalIpProtocolServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIpUsage: GlobalIpUsageServiceAsync by lazy {
        GlobalIpUsageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalIps: GlobalIpServiceAsync by lazy {
        GlobalIpServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inboundChannels: InboundChannelServiceAsync by lazy {
        InboundChannelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val integrationSecrets: IntegrationSecretServiceAsync by lazy {
        IntegrationSecretServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inventoryCoverage: InventoryCoverageServiceAsync by lazy {
        InventoryCoverageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ipConnections: IpConnectionServiceAsync by lazy {
        IpConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ips: IpServiceAsync by lazy { IpServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val ledgerBillingGroupReports: LedgerBillingGroupReportServiceAsync by lazy {
        LedgerBillingGroupReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val list: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val managedAccounts: ManagedAccountServiceAsync by lazy {
        ManagedAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val media: MediaServiceAsync by lazy {
        MediaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messages: MessageServiceAsync by lazy {
        MessageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messaging: MessagingServiceAsync by lazy {
        MessagingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingHostedNumberOrders: MessagingHostedNumberOrderServiceAsync by lazy {
        MessagingHostedNumberOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingHostedNumbers: MessagingHostedNumberServiceAsync by lazy {
        MessagingHostedNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingNumbersBulkUpdates: MessagingNumbersBulkUpdateServiceAsync by lazy {
        MessagingNumbersBulkUpdateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingOptouts: MessagingOptoutServiceAsync by lazy {
        MessagingOptoutServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingProfiles: MessagingProfileServiceAsync by lazy {
        MessagingProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingTollfree: MessagingTollfreeServiceAsync by lazy {
        MessagingTollfreeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messagingUrlDomains: MessagingUrlDomainServiceAsync by lazy {
        MessagingUrlDomainServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messsages: MesssageServiceAsync by lazy {
        MesssageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mobileNetworkOperators: MobileNetworkOperatorServiceAsync by lazy {
        MobileNetworkOperatorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mobilePushCredentials: MobilePushCredentialServiceAsync by lazy {
        MobilePushCredentialServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val networkCoverage: NetworkCoverageServiceAsync by lazy {
        NetworkCoverageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val networks: NetworkServiceAsync by lazy {
        NetworkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationChannels: NotificationChannelServiceAsync by lazy {
        NotificationChannelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationEventConditions: NotificationEventConditionServiceAsync by lazy {
        NotificationEventConditionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationEvents: NotificationEventServiceAsync by lazy {
        NotificationEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationProfiles: NotificationProfileServiceAsync by lazy {
        NotificationProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationSettings: NotificationSettingServiceAsync by lazy {
        NotificationSettingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numberBlockOrders: NumberBlockOrderServiceAsync by lazy {
        NumberBlockOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numberLookup: NumberLookupServiceAsync by lazy {
        NumberLookupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numberOrderPhoneNumbers: NumberOrderPhoneNumberServiceAsync by lazy {
        NumberOrderPhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numberOrders: NumberOrderServiceAsync by lazy {
        NumberOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numberReservations: NumberReservationServiceAsync by lazy {
        NumberReservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val numbersFeatures: NumbersFeatureServiceAsync by lazy {
        NumbersFeatureServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val operatorConnect: OperatorConnectServiceAsync by lazy {
        OperatorConnectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val otaUpdates: OtaUpdateServiceAsync by lazy {
        OtaUpdateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val outboundVoiceProfiles: OutboundVoiceProfileServiceAsync by lazy {
        OutboundVoiceProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val payment: PaymentServiceAsync by lazy {
        PaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumberAssignmentByProfile: PhoneNumberAssignmentByProfileServiceAsync by lazy {
        PhoneNumberAssignmentByProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumberBlocks: PhoneNumberBlockServiceAsync by lazy {
        PhoneNumberBlockServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync by lazy {
        PhoneNumberCampaignServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbersRegulatoryRequirements:
        PhoneNumbersRegulatoryRequirementServiceAsync by lazy {
        PhoneNumbersRegulatoryRequirementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val portabilityChecks: PortabilityCheckServiceAsync by lazy {
        PortabilityCheckServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val porting: PortingServiceAsync by lazy {
        PortingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val portingOrders: PortingOrderServiceAsync by lazy {
        PortingOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val portingPhoneNumbers: PortingPhoneNumberServiceAsync by lazy {
        PortingPhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val portouts: PortoutServiceAsync by lazy {
        PortoutServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val privateWirelessGateways: PrivateWirelessGatewayServiceAsync by lazy {
        PrivateWirelessGatewayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val publicInternetGateways: PublicInternetGatewayServiceAsync by lazy {
        PublicInternetGatewayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val queues: QueueServiceAsync by lazy {
        QueueServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rcsAgents: RcsAgentServiceAsync by lazy {
        RcsAgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val recordingTranscriptions: RecordingTranscriptionServiceAsync by lazy {
        RecordingTranscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val recordings: RecordingServiceAsync by lazy {
        RecordingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val regions: RegionServiceAsync by lazy {
        RegionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val regulatoryRequirements: RegulatoryRequirementServiceAsync by lazy {
        RegulatoryRequirementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reports: ReportServiceAsync by lazy {
        ReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requirementGroups: RequirementGroupServiceAsync by lazy {
        RequirementGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requirementTypes: RequirementTypeServiceAsync by lazy {
        RequirementTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requirements: RequirementServiceAsync by lazy {
        RequirementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val roomCompositions: RoomCompositionServiceAsync by lazy {
        RoomCompositionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val roomParticipants: RoomParticipantServiceAsync by lazy {
        RoomParticipantServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val roomRecordings: RoomRecordingServiceAsync by lazy {
        RoomRecordingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rooms: RoomServiceAsync by lazy { RoomServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val seti: SetiServiceAsync by lazy { SetiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val shortCodes: ShortCodeServiceAsync by lazy {
        ShortCodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simCardDataUsageNotifications: SimCardDataUsageNotificationServiceAsync by lazy {
        SimCardDataUsageNotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simCardGroups: SimCardGroupServiceAsync by lazy {
        SimCardGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simCardOrderPreview: SimCardOrderPreviewServiceAsync by lazy {
        SimCardOrderPreviewServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simCardOrders: SimCardOrderServiceAsync by lazy {
        SimCardOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val simCards: SimCardServiceAsync by lazy {
        SimCardServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val siprecConnectors: SiprecConnectorServiceAsync by lazy {
        SiprecConnectorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val storage: StorageServiceAsync by lazy {
        StorageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subNumberOrders: SubNumberOrderServiceAsync by lazy {
        SubNumberOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subNumberOrdersReport: SubNumberOrdersReportServiceAsync by lazy {
        SubNumberOrdersReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val telephonyCredentials: TelephonyCredentialServiceAsync by lazy {
        TelephonyCredentialServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val texml: TexmlServiceAsync by lazy {
        TexmlServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val texmlApplications: TexmlApplicationServiceAsync by lazy {
        TexmlApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val textToSpeech: TextToSpeechServiceAsync by lazy {
        TextToSpeechServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val usageReports: UsageReportServiceAsync by lazy {
        UsageReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val userAddresses: UserAddressServiceAsync by lazy {
        UserAddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val userTags: UserTagServiceAsync by lazy {
        UserTagServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val verifications: VerificationServiceAsync by lazy {
        VerificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val verifiedNumbers: VerifiedNumberServiceAsync by lazy {
        VerifiedNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val verifyProfiles: VerifyProfileServiceAsync by lazy {
        VerifyProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val virtualCrossConnects: VirtualCrossConnectServiceAsync by lazy {
        VirtualCrossConnectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val virtualCrossConnectsCoverage: VirtualCrossConnectsCoverageServiceAsync by lazy {
        VirtualCrossConnectsCoverageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhookDeliveries: WebhookDeliveryServiceAsync by lazy {
        WebhookDeliveryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wireguardInterfaces: WireguardInterfaceServiceAsync by lazy {
        WireguardInterfaceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wireguardPeers: WireguardPeerServiceAsync by lazy {
        WireguardPeerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wireless: WirelessServiceAsync by lazy {
        WirelessServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wirelessBlocklistValues: WirelessBlocklistValueServiceAsync by lazy {
        WirelessBlocklistValueServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wirelessBlocklists: WirelessBlocklistServiceAsync by lazy {
        WirelessBlocklistServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val partnerCampaigns: PartnerCampaignServiceAsync by lazy {
        PartnerCampaignServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val wellKnown: WellKnownServiceAsync by lazy {
        WellKnownServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inexplicitNumberOrders: InexplicitNumberOrderServiceAsync by lazy {
        InexplicitNumberOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mobilePhoneNumbers: MobilePhoneNumberServiceAsync by lazy {
        MobilePhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mobileVoiceConnections: MobileVoiceConnectionServiceAsync by lazy {
        MobileVoiceConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): TelnyxClient = sync

    override fun withRawResponse(): TelnyxClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxClientAsync =
        TelnyxClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun legacy(): LegacyServiceAsync = legacy

    override fun oauth(): OAuthServiceAsync = oauth

    override fun oauthClients(): OAuthClientServiceAsync = oauthClients

    override fun oauthGrants(): OAuthGrantServiceAsync = oauthGrants

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun accessIpAddress(): AccessIpAddressServiceAsync = accessIpAddress

    override fun accessIpRanges(): AccessIpRangeServiceAsync = accessIpRanges

    override fun actions(): ActionServiceAsync = actions

    override fun addresses(): AddressServiceAsync = addresses

    override fun advancedOrders(): AdvancedOrderServiceAsync = advancedOrders

    override fun ai(): AiServiceAsync = ai

    override fun auditEvents(): AuditEventServiceAsync = auditEvents

    override fun authenticationProviders(): AuthenticationProviderServiceAsync =
        authenticationProviders

    override fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockServiceAsync =
        availablePhoneNumberBlocks

    override fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync = availablePhoneNumbers

    override fun balance(): BalanceServiceAsync = balance

    override fun billingGroups(): BillingGroupServiceAsync = billingGroups

    override fun brand(): BrandServiceAsync = brand

    override fun bulkSimCardActions(): BulkSimCardActionServiceAsync = bulkSimCardActions

    override fun bundlePricing(): BundlePricingServiceAsync = bundlePricing

    override fun callControlApplications(): CallControlApplicationServiceAsync =
        callControlApplications

    override fun callEvents(): CallEventServiceAsync = callEvents

    override fun calls(): CallServiceAsync = calls

    override fun campaign(): CampaignServiceAsync = campaign

    override fun campaignBuilder(): CampaignBuilderServiceAsync = campaignBuilder

    override fun channelZones(): ChannelZoneServiceAsync = channelZones

    override fun chargesBreakdown(): ChargesBreakdownServiceAsync = chargesBreakdown

    override fun chargesSummary(): ChargesSummaryServiceAsync = chargesSummary

    override fun comments(): CommentServiceAsync = comments

    override fun conferences(): ConferenceServiceAsync = conferences

    override fun connections(): ConnectionServiceAsync = connections

    override fun countryCoverage(): CountryCoverageServiceAsync = countryCoverage

    override fun credentialConnections(): CredentialConnectionServiceAsync = credentialConnections

    override fun customStorageCredentials(): CustomStorageCredentialServiceAsync =
        customStorageCredentials

    override fun customerServiceRecords(): CustomerServiceRecordServiceAsync =
        customerServiceRecords

    override fun detailRecords(): DetailRecordServiceAsync = detailRecords

    override fun dialogflowConnections(): DialogflowConnectionServiceAsync = dialogflowConnections

    override fun documentLinks(): DocumentLinkServiceAsync = documentLinks

    override fun documents(): DocumentServiceAsync = documents

    override fun dynamicEmergencyAddresses(): DynamicEmergencyAddressServiceAsync =
        dynamicEmergencyAddresses

    override fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointServiceAsync =
        dynamicEmergencyEndpoints

    override fun enum_(): EnumServiceAsync = enum_

    override fun externalConnections(): ExternalConnectionServiceAsync = externalConnections

    override fun faxApplications(): FaxApplicationServiceAsync = faxApplications

    override fun faxes(): FaxServiceAsync = faxes

    override fun fqdnConnections(): FqdnConnectionServiceAsync = fqdnConnections

    override fun fqdns(): FqdnServiceAsync = fqdns

    override fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync = globalIpAllowedPorts

    override fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthServiceAsync =
        globalIpAssignmentHealth

    override fun globalIpAssignments(): GlobalIpAssignmentServiceAsync = globalIpAssignments

    override fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageServiceAsync =
        globalIpAssignmentsUsage

    override fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeServiceAsync =
        globalIpHealthCheckTypes

    override fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync = globalIpHealthChecks

    override fun globalIpLatency(): GlobalIpLatencyServiceAsync = globalIpLatency

    override fun globalIpProtocols(): GlobalIpProtocolServiceAsync = globalIpProtocols

    override fun globalIpUsage(): GlobalIpUsageServiceAsync = globalIpUsage

    override fun globalIps(): GlobalIpServiceAsync = globalIps

    override fun inboundChannels(): InboundChannelServiceAsync = inboundChannels

    override fun integrationSecrets(): IntegrationSecretServiceAsync = integrationSecrets

    override fun inventoryCoverage(): InventoryCoverageServiceAsync = inventoryCoverage

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun ipConnections(): IpConnectionServiceAsync = ipConnections

    override fun ips(): IpServiceAsync = ips

    override fun ledgerBillingGroupReports(): LedgerBillingGroupReportServiceAsync =
        ledgerBillingGroupReports

    override fun list(): ListServiceAsync = list

    override fun managedAccounts(): ManagedAccountServiceAsync = managedAccounts

    override fun media(): MediaServiceAsync = media

    override fun messages(): MessageServiceAsync = messages

    override fun messaging(): MessagingServiceAsync = messaging

    override fun messagingHostedNumberOrders(): MessagingHostedNumberOrderServiceAsync =
        messagingHostedNumberOrders

    override fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync =
        messagingHostedNumbers

    override fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateServiceAsync =
        messagingNumbersBulkUpdates

    override fun messagingOptouts(): MessagingOptoutServiceAsync = messagingOptouts

    override fun messagingProfiles(): MessagingProfileServiceAsync = messagingProfiles

    override fun messagingTollfree(): MessagingTollfreeServiceAsync = messagingTollfree

    override fun messagingUrlDomains(): MessagingUrlDomainServiceAsync = messagingUrlDomains

    override fun messsages(): MesssageServiceAsync = messsages

    override fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync =
        mobileNetworkOperators

    override fun mobilePushCredentials(): MobilePushCredentialServiceAsync = mobilePushCredentials

    override fun networkCoverage(): NetworkCoverageServiceAsync = networkCoverage

    override fun networks(): NetworkServiceAsync = networks

    override fun notificationChannels(): NotificationChannelServiceAsync = notificationChannels

    override fun notificationEventConditions(): NotificationEventConditionServiceAsync =
        notificationEventConditions

    override fun notificationEvents(): NotificationEventServiceAsync = notificationEvents

    override fun notificationProfiles(): NotificationProfileServiceAsync = notificationProfiles

    override fun notificationSettings(): NotificationSettingServiceAsync = notificationSettings

    override fun numberBlockOrders(): NumberBlockOrderServiceAsync = numberBlockOrders

    override fun numberLookup(): NumberLookupServiceAsync = numberLookup

    override fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync =
        numberOrderPhoneNumbers

    override fun numberOrders(): NumberOrderServiceAsync = numberOrders

    override fun numberReservations(): NumberReservationServiceAsync = numberReservations

    override fun numbersFeatures(): NumbersFeatureServiceAsync = numbersFeatures

    override fun operatorConnect(): OperatorConnectServiceAsync = operatorConnect

    override fun otaUpdates(): OtaUpdateServiceAsync = otaUpdates

    override fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync = outboundVoiceProfiles

    override fun payment(): PaymentServiceAsync = payment

    override fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileServiceAsync =
        phoneNumberAssignmentByProfile

    override fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync = phoneNumberBlocks

    override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync = phoneNumberCampaigns

    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun phoneNumbersRegulatoryRequirements():
        PhoneNumbersRegulatoryRequirementServiceAsync = phoneNumbersRegulatoryRequirements

    override fun portabilityChecks(): PortabilityCheckServiceAsync = portabilityChecks

    override fun porting(): PortingServiceAsync = porting

    override fun portingOrders(): PortingOrderServiceAsync = portingOrders

    override fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync = portingPhoneNumbers

    override fun portouts(): PortoutServiceAsync = portouts

    override fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync =
        privateWirelessGateways

    override fun publicInternetGateways(): PublicInternetGatewayServiceAsync =
        publicInternetGateways

    override fun queues(): QueueServiceAsync = queues

    override fun rcsAgents(): RcsAgentServiceAsync = rcsAgents

    override fun recordingTranscriptions(): RecordingTranscriptionServiceAsync =
        recordingTranscriptions

    override fun recordings(): RecordingServiceAsync = recordings

    override fun regions(): RegionServiceAsync = regions

    override fun regulatoryRequirements(): RegulatoryRequirementServiceAsync =
        regulatoryRequirements

    override fun reports(): ReportServiceAsync = reports

    override fun requirementGroups(): RequirementGroupServiceAsync = requirementGroups

    override fun requirementTypes(): RequirementTypeServiceAsync = requirementTypes

    override fun requirements(): RequirementServiceAsync = requirements

    override fun roomCompositions(): RoomCompositionServiceAsync = roomCompositions

    override fun roomParticipants(): RoomParticipantServiceAsync = roomParticipants

    override fun roomRecordings(): RoomRecordingServiceAsync = roomRecordings

    override fun rooms(): RoomServiceAsync = rooms

    override fun seti(): SetiServiceAsync = seti

    override fun shortCodes(): ShortCodeServiceAsync = shortCodes

    override fun simCardDataUsageNotifications(): SimCardDataUsageNotificationServiceAsync =
        simCardDataUsageNotifications

    override fun simCardGroups(): SimCardGroupServiceAsync = simCardGroups

    override fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync = simCardOrderPreview

    override fun simCardOrders(): SimCardOrderServiceAsync = simCardOrders

    override fun simCards(): SimCardServiceAsync = simCards

    override fun siprecConnectors(): SiprecConnectorServiceAsync = siprecConnectors

    override fun storage(): StorageServiceAsync = storage

    override fun subNumberOrders(): SubNumberOrderServiceAsync = subNumberOrders

    override fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync = subNumberOrdersReport

    override fun telephonyCredentials(): TelephonyCredentialServiceAsync = telephonyCredentials

    override fun texml(): TexmlServiceAsync = texml

    override fun texmlApplications(): TexmlApplicationServiceAsync = texmlApplications

    override fun textToSpeech(): TextToSpeechServiceAsync = textToSpeech

    override fun usageReports(): UsageReportServiceAsync = usageReports

    override fun userAddresses(): UserAddressServiceAsync = userAddresses

    override fun userTags(): UserTagServiceAsync = userTags

    override fun verifications(): VerificationServiceAsync = verifications

    override fun verifiedNumbers(): VerifiedNumberServiceAsync = verifiedNumbers

    override fun verifyProfiles(): VerifyProfileServiceAsync = verifyProfiles

    override fun virtualCrossConnects(): VirtualCrossConnectServiceAsync = virtualCrossConnects

    override fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageServiceAsync =
        virtualCrossConnectsCoverage

    override fun webhookDeliveries(): WebhookDeliveryServiceAsync = webhookDeliveries

    override fun wireguardInterfaces(): WireguardInterfaceServiceAsync = wireguardInterfaces

    override fun wireguardPeers(): WireguardPeerServiceAsync = wireguardPeers

    override fun wireless(): WirelessServiceAsync = wireless

    override fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync =
        wirelessBlocklistValues

    override fun wirelessBlocklists(): WirelessBlocklistServiceAsync = wirelessBlocklists

    override fun partnerCampaigns(): PartnerCampaignServiceAsync = partnerCampaigns

    override fun wellKnown(): WellKnownServiceAsync = wellKnown

    override fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync =
        inexplicitNumberOrders

    override fun mobilePhoneNumbers(): MobilePhoneNumberServiceAsync = mobilePhoneNumbers

    override fun mobileVoiceConnections(): MobileVoiceConnectionServiceAsync =
        mobileVoiceConnections

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelnyxClientAsync.WithRawResponse {

        private val legacy: LegacyServiceAsync.WithRawResponse by lazy {
            LegacyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauth: OAuthServiceAsync.WithRawResponse by lazy {
            OAuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthClients: OAuthClientServiceAsync.WithRawResponse by lazy {
            OAuthClientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthGrants: OAuthGrantServiceAsync.WithRawResponse by lazy {
            OAuthGrantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accessIpAddress: AccessIpAddressServiceAsync.WithRawResponse by lazy {
            AccessIpAddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accessIpRanges: AccessIpRangeServiceAsync.WithRawResponse by lazy {
            AccessIpRangeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val addresses: AddressServiceAsync.WithRawResponse by lazy {
            AddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val advancedOrders: AdvancedOrderServiceAsync.WithRawResponse by lazy {
            AdvancedOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiServiceAsync.WithRawResponse by lazy {
            AiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditEvents: AuditEventServiceAsync.WithRawResponse by lazy {
            AuditEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val authenticationProviders:
            AuthenticationProviderServiceAsync.WithRawResponse by lazy {
            AuthenticationProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val availablePhoneNumberBlocks:
            AvailablePhoneNumberBlockServiceAsync.WithRawResponse by lazy {
            AvailablePhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val availablePhoneNumbers:
            AvailablePhoneNumberServiceAsync.WithRawResponse by lazy {
            AvailablePhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billingGroups: BillingGroupServiceAsync.WithRawResponse by lazy {
            BillingGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulkSimCardActions: BulkSimCardActionServiceAsync.WithRawResponse by lazy {
            BulkSimCardActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bundlePricing: BundlePricingServiceAsync.WithRawResponse by lazy {
            BundlePricingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val callControlApplications:
            CallControlApplicationServiceAsync.WithRawResponse by lazy {
            CallControlApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val callEvents: CallEventServiceAsync.WithRawResponse by lazy {
            CallEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaignBuilder: CampaignBuilderServiceAsync.WithRawResponse by lazy {
            CampaignBuilderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val channelZones: ChannelZoneServiceAsync.WithRawResponse by lazy {
            ChannelZoneServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chargesBreakdown: ChargesBreakdownServiceAsync.WithRawResponse by lazy {
            ChargesBreakdownServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chargesSummary: ChargesSummaryServiceAsync.WithRawResponse by lazy {
            ChargesSummaryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conferences: ConferenceServiceAsync.WithRawResponse by lazy {
            ConferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val connections: ConnectionServiceAsync.WithRawResponse by lazy {
            ConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val countryCoverage: CountryCoverageServiceAsync.WithRawResponse by lazy {
            CountryCoverageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val credentialConnections:
            CredentialConnectionServiceAsync.WithRawResponse by lazy {
            CredentialConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customStorageCredentials:
            CustomStorageCredentialServiceAsync.WithRawResponse by lazy {
            CustomStorageCredentialServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customerServiceRecords:
            CustomerServiceRecordServiceAsync.WithRawResponse by lazy {
            CustomerServiceRecordServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val detailRecords: DetailRecordServiceAsync.WithRawResponse by lazy {
            DetailRecordServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dialogflowConnections:
            DialogflowConnectionServiceAsync.WithRawResponse by lazy {
            DialogflowConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documentLinks: DocumentLinkServiceAsync.WithRawResponse by lazy {
            DocumentLinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dynamicEmergencyAddresses:
            DynamicEmergencyAddressServiceAsync.WithRawResponse by lazy {
            DynamicEmergencyAddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dynamicEmergencyEndpoints:
            DynamicEmergencyEndpointServiceAsync.WithRawResponse by lazy {
            DynamicEmergencyEndpointServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val enum_: EnumServiceAsync.WithRawResponse by lazy {
            EnumServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalConnections: ExternalConnectionServiceAsync.WithRawResponse by lazy {
            ExternalConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val faxApplications: FaxApplicationServiceAsync.WithRawResponse by lazy {
            FaxApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val faxes: FaxServiceAsync.WithRawResponse by lazy {
            FaxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fqdnConnections: FqdnConnectionServiceAsync.WithRawResponse by lazy {
            FqdnConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fqdns: FqdnServiceAsync.WithRawResponse by lazy {
            FqdnServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAllowedPorts: GlobalIpAllowedPortServiceAsync.WithRawResponse by lazy {
            GlobalIpAllowedPortServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignmentHealth:
            GlobalIpAssignmentHealthServiceAsync.WithRawResponse by lazy {
            GlobalIpAssignmentHealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignments: GlobalIpAssignmentServiceAsync.WithRawResponse by lazy {
            GlobalIpAssignmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignmentsUsage:
            GlobalIpAssignmentsUsageServiceAsync.WithRawResponse by lazy {
            GlobalIpAssignmentsUsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpHealthCheckTypes:
            GlobalIpHealthCheckTypeServiceAsync.WithRawResponse by lazy {
            GlobalIpHealthCheckTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpHealthChecks: GlobalIpHealthCheckServiceAsync.WithRawResponse by lazy {
            GlobalIpHealthCheckServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpLatency: GlobalIpLatencyServiceAsync.WithRawResponse by lazy {
            GlobalIpLatencyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpProtocols: GlobalIpProtocolServiceAsync.WithRawResponse by lazy {
            GlobalIpProtocolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpUsage: GlobalIpUsageServiceAsync.WithRawResponse by lazy {
            GlobalIpUsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIps: GlobalIpServiceAsync.WithRawResponse by lazy {
            GlobalIpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundChannels: InboundChannelServiceAsync.WithRawResponse by lazy {
            InboundChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrationSecrets: IntegrationSecretServiceAsync.WithRawResponse by lazy {
            IntegrationSecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inventoryCoverage: InventoryCoverageServiceAsync.WithRawResponse by lazy {
            InventoryCoverageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ipConnections: IpConnectionServiceAsync.WithRawResponse by lazy {
            IpConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ips: IpServiceAsync.WithRawResponse by lazy {
            IpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ledgerBillingGroupReports:
            LedgerBillingGroupReportServiceAsync.WithRawResponse by lazy {
            LedgerBillingGroupReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val list: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val managedAccounts: ManagedAccountServiceAsync.WithRawResponse by lazy {
            ManagedAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaServiceAsync.WithRawResponse by lazy {
            MediaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messaging: MessagingServiceAsync.WithRawResponse by lazy {
            MessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingHostedNumberOrders:
            MessagingHostedNumberOrderServiceAsync.WithRawResponse by lazy {
            MessagingHostedNumberOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingHostedNumbers:
            MessagingHostedNumberServiceAsync.WithRawResponse by lazy {
            MessagingHostedNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingNumbersBulkUpdates:
            MessagingNumbersBulkUpdateServiceAsync.WithRawResponse by lazy {
            MessagingNumbersBulkUpdateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingOptouts: MessagingOptoutServiceAsync.WithRawResponse by lazy {
            MessagingOptoutServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingProfiles: MessagingProfileServiceAsync.WithRawResponse by lazy {
            MessagingProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingTollfree: MessagingTollfreeServiceAsync.WithRawResponse by lazy {
            MessagingTollfreeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingUrlDomains: MessagingUrlDomainServiceAsync.WithRawResponse by lazy {
            MessagingUrlDomainServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messsages: MesssageServiceAsync.WithRawResponse by lazy {
            MesssageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobileNetworkOperators:
            MobileNetworkOperatorServiceAsync.WithRawResponse by lazy {
            MobileNetworkOperatorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobilePushCredentials:
            MobilePushCredentialServiceAsync.WithRawResponse by lazy {
            MobilePushCredentialServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val networkCoverage: NetworkCoverageServiceAsync.WithRawResponse by lazy {
            NetworkCoverageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val networks: NetworkServiceAsync.WithRawResponse by lazy {
            NetworkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationChannels: NotificationChannelServiceAsync.WithRawResponse by lazy {
            NotificationChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationEventConditions:
            NotificationEventConditionServiceAsync.WithRawResponse by lazy {
            NotificationEventConditionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationEvents: NotificationEventServiceAsync.WithRawResponse by lazy {
            NotificationEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationProfiles: NotificationProfileServiceAsync.WithRawResponse by lazy {
            NotificationProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationSettings: NotificationSettingServiceAsync.WithRawResponse by lazy {
            NotificationSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberBlockOrders: NumberBlockOrderServiceAsync.WithRawResponse by lazy {
            NumberBlockOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberLookup: NumberLookupServiceAsync.WithRawResponse by lazy {
            NumberLookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberOrderPhoneNumbers:
            NumberOrderPhoneNumberServiceAsync.WithRawResponse by lazy {
            NumberOrderPhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberOrders: NumberOrderServiceAsync.WithRawResponse by lazy {
            NumberOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberReservations: NumberReservationServiceAsync.WithRawResponse by lazy {
            NumberReservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numbersFeatures: NumbersFeatureServiceAsync.WithRawResponse by lazy {
            NumbersFeatureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatorConnect: OperatorConnectServiceAsync.WithRawResponse by lazy {
            OperatorConnectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val otaUpdates: OtaUpdateServiceAsync.WithRawResponse by lazy {
            OtaUpdateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val outboundVoiceProfiles:
            OutboundVoiceProfileServiceAsync.WithRawResponse by lazy {
            OutboundVoiceProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payment: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberAssignmentByProfile:
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse by lazy {
            PhoneNumberAssignmentByProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBlocks: PhoneNumberBlockServiceAsync.WithRawResponse by lazy {
            PhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignServiceAsync.WithRawResponse by lazy {
            PhoneNumberCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbersRegulatoryRequirements:
            PhoneNumbersRegulatoryRequirementServiceAsync.WithRawResponse by lazy {
            PhoneNumbersRegulatoryRequirementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portabilityChecks: PortabilityCheckServiceAsync.WithRawResponse by lazy {
            PortabilityCheckServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val porting: PortingServiceAsync.WithRawResponse by lazy {
            PortingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portingOrders: PortingOrderServiceAsync.WithRawResponse by lazy {
            PortingOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portingPhoneNumbers: PortingPhoneNumberServiceAsync.WithRawResponse by lazy {
            PortingPhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portouts: PortoutServiceAsync.WithRawResponse by lazy {
            PortoutServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val privateWirelessGateways:
            PrivateWirelessGatewayServiceAsync.WithRawResponse by lazy {
            PrivateWirelessGatewayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val publicInternetGateways:
            PublicInternetGatewayServiceAsync.WithRawResponse by lazy {
            PublicInternetGatewayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val queues: QueueServiceAsync.WithRawResponse by lazy {
            QueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rcsAgents: RcsAgentServiceAsync.WithRawResponse by lazy {
            RcsAgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordingTranscriptions:
            RecordingTranscriptionServiceAsync.WithRawResponse by lazy {
            RecordingTranscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingServiceAsync.WithRawResponse by lazy {
            RecordingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val regions: RegionServiceAsync.WithRawResponse by lazy {
            RegionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val regulatoryRequirements:
            RegulatoryRequirementServiceAsync.WithRawResponse by lazy {
            RegulatoryRequirementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirementGroups: RequirementGroupServiceAsync.WithRawResponse by lazy {
            RequirementGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirementTypes: RequirementTypeServiceAsync.WithRawResponse by lazy {
            RequirementTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirements: RequirementServiceAsync.WithRawResponse by lazy {
            RequirementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomCompositions: RoomCompositionServiceAsync.WithRawResponse by lazy {
            RoomCompositionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomParticipants: RoomParticipantServiceAsync.WithRawResponse by lazy {
            RoomParticipantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomRecordings: RoomRecordingServiceAsync.WithRawResponse by lazy {
            RoomRecordingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rooms: RoomServiceAsync.WithRawResponse by lazy {
            RoomServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seti: SetiServiceAsync.WithRawResponse by lazy {
            SetiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shortCodes: ShortCodeServiceAsync.WithRawResponse by lazy {
            ShortCodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardDataUsageNotifications:
            SimCardDataUsageNotificationServiceAsync.WithRawResponse by lazy {
            SimCardDataUsageNotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardGroups: SimCardGroupServiceAsync.WithRawResponse by lazy {
            SimCardGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardOrderPreview: SimCardOrderPreviewServiceAsync.WithRawResponse by lazy {
            SimCardOrderPreviewServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardOrders: SimCardOrderServiceAsync.WithRawResponse by lazy {
            SimCardOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCards: SimCardServiceAsync.WithRawResponse by lazy {
            SimCardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siprecConnectors: SiprecConnectorServiceAsync.WithRawResponse by lazy {
            SiprecConnectorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val storage: StorageServiceAsync.WithRawResponse by lazy {
            StorageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subNumberOrders: SubNumberOrderServiceAsync.WithRawResponse by lazy {
            SubNumberOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subNumberOrdersReport:
            SubNumberOrdersReportServiceAsync.WithRawResponse by lazy {
            SubNumberOrdersReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val telephonyCredentials: TelephonyCredentialServiceAsync.WithRawResponse by lazy {
            TelephonyCredentialServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val texml: TexmlServiceAsync.WithRawResponse by lazy {
            TexmlServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val texmlApplications: TexmlApplicationServiceAsync.WithRawResponse by lazy {
            TexmlApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val textToSpeech: TextToSpeechServiceAsync.WithRawResponse by lazy {
            TextToSpeechServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageReports: UsageReportServiceAsync.WithRawResponse by lazy {
            UsageReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val userAddresses: UserAddressServiceAsync.WithRawResponse by lazy {
            UserAddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val userTags: UserTagServiceAsync.WithRawResponse by lazy {
            UserTagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifications: VerificationServiceAsync.WithRawResponse by lazy {
            VerificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifiedNumbers: VerifiedNumberServiceAsync.WithRawResponse by lazy {
            VerifiedNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifyProfiles: VerifyProfileServiceAsync.WithRawResponse by lazy {
            VerifyProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val virtualCrossConnects: VirtualCrossConnectServiceAsync.WithRawResponse by lazy {
            VirtualCrossConnectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val virtualCrossConnectsCoverage:
            VirtualCrossConnectsCoverageServiceAsync.WithRawResponse by lazy {
            VirtualCrossConnectsCoverageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhookDeliveries: WebhookDeliveryServiceAsync.WithRawResponse by lazy {
            WebhookDeliveryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireguardInterfaces: WireguardInterfaceServiceAsync.WithRawResponse by lazy {
            WireguardInterfaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireguardPeers: WireguardPeerServiceAsync.WithRawResponse by lazy {
            WireguardPeerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireless: WirelessServiceAsync.WithRawResponse by lazy {
            WirelessServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wirelessBlocklistValues:
            WirelessBlocklistValueServiceAsync.WithRawResponse by lazy {
            WirelessBlocklistValueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wirelessBlocklists: WirelessBlocklistServiceAsync.WithRawResponse by lazy {
            WirelessBlocklistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerCampaigns: PartnerCampaignServiceAsync.WithRawResponse by lazy {
            PartnerCampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val wellKnown: WellKnownServiceAsync.WithRawResponse by lazy {
            WellKnownServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inexplicitNumberOrders:
            InexplicitNumberOrderServiceAsync.WithRawResponse by lazy {
            InexplicitNumberOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobilePhoneNumbers: MobilePhoneNumberServiceAsync.WithRawResponse by lazy {
            MobilePhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobileVoiceConnections:
            MobileVoiceConnectionServiceAsync.WithRawResponse by lazy {
            MobileVoiceConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxClientAsync.WithRawResponse =
            TelnyxClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun legacy(): LegacyServiceAsync.WithRawResponse = legacy

        override fun oauth(): OAuthServiceAsync.WithRawResponse = oauth

        override fun oauthClients(): OAuthClientServiceAsync.WithRawResponse = oauthClients

        override fun oauthGrants(): OAuthGrantServiceAsync.WithRawResponse = oauthGrants

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun accessIpAddress(): AccessIpAddressServiceAsync.WithRawResponse =
            accessIpAddress

        override fun accessIpRanges(): AccessIpRangeServiceAsync.WithRawResponse = accessIpRanges

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        override fun addresses(): AddressServiceAsync.WithRawResponse = addresses

        override fun advancedOrders(): AdvancedOrderServiceAsync.WithRawResponse = advancedOrders

        override fun ai(): AiServiceAsync.WithRawResponse = ai

        override fun auditEvents(): AuditEventServiceAsync.WithRawResponse = auditEvents

        override fun authenticationProviders(): AuthenticationProviderServiceAsync.WithRawResponse =
            authenticationProviders

        override fun availablePhoneNumberBlocks():
            AvailablePhoneNumberBlockServiceAsync.WithRawResponse = availablePhoneNumberBlocks

        override fun availablePhoneNumbers(): AvailablePhoneNumberServiceAsync.WithRawResponse =
            availablePhoneNumbers

        override fun balance(): BalanceServiceAsync.WithRawResponse = balance

        override fun billingGroups(): BillingGroupServiceAsync.WithRawResponse = billingGroups

        override fun brand(): BrandServiceAsync.WithRawResponse = brand

        override fun bulkSimCardActions(): BulkSimCardActionServiceAsync.WithRawResponse =
            bulkSimCardActions

        override fun bundlePricing(): BundlePricingServiceAsync.WithRawResponse = bundlePricing

        override fun callControlApplications(): CallControlApplicationServiceAsync.WithRawResponse =
            callControlApplications

        override fun callEvents(): CallEventServiceAsync.WithRawResponse = callEvents

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        override fun campaign(): CampaignServiceAsync.WithRawResponse = campaign

        override fun campaignBuilder(): CampaignBuilderServiceAsync.WithRawResponse =
            campaignBuilder

        override fun channelZones(): ChannelZoneServiceAsync.WithRawResponse = channelZones

        override fun chargesBreakdown(): ChargesBreakdownServiceAsync.WithRawResponse =
            chargesBreakdown

        override fun chargesSummary(): ChargesSummaryServiceAsync.WithRawResponse = chargesSummary

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun conferences(): ConferenceServiceAsync.WithRawResponse = conferences

        override fun connections(): ConnectionServiceAsync.WithRawResponse = connections

        override fun countryCoverage(): CountryCoverageServiceAsync.WithRawResponse =
            countryCoverage

        override fun credentialConnections(): CredentialConnectionServiceAsync.WithRawResponse =
            credentialConnections

        override fun customStorageCredentials():
            CustomStorageCredentialServiceAsync.WithRawResponse = customStorageCredentials

        override fun customerServiceRecords(): CustomerServiceRecordServiceAsync.WithRawResponse =
            customerServiceRecords

        override fun detailRecords(): DetailRecordServiceAsync.WithRawResponse = detailRecords

        override fun dialogflowConnections(): DialogflowConnectionServiceAsync.WithRawResponse =
            dialogflowConnections

        override fun documentLinks(): DocumentLinkServiceAsync.WithRawResponse = documentLinks

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        override fun dynamicEmergencyAddresses():
            DynamicEmergencyAddressServiceAsync.WithRawResponse = dynamicEmergencyAddresses

        override fun dynamicEmergencyEndpoints():
            DynamicEmergencyEndpointServiceAsync.WithRawResponse = dynamicEmergencyEndpoints

        override fun enum_(): EnumServiceAsync.WithRawResponse = enum_

        override fun externalConnections(): ExternalConnectionServiceAsync.WithRawResponse =
            externalConnections

        override fun faxApplications(): FaxApplicationServiceAsync.WithRawResponse = faxApplications

        override fun faxes(): FaxServiceAsync.WithRawResponse = faxes

        override fun fqdnConnections(): FqdnConnectionServiceAsync.WithRawResponse = fqdnConnections

        override fun fqdns(): FqdnServiceAsync.WithRawResponse = fqdns

        override fun globalIpAllowedPorts(): GlobalIpAllowedPortServiceAsync.WithRawResponse =
            globalIpAllowedPorts

        override fun globalIpAssignmentHealth():
            GlobalIpAssignmentHealthServiceAsync.WithRawResponse = globalIpAssignmentHealth

        override fun globalIpAssignments(): GlobalIpAssignmentServiceAsync.WithRawResponse =
            globalIpAssignments

        override fun globalIpAssignmentsUsage():
            GlobalIpAssignmentsUsageServiceAsync.WithRawResponse = globalIpAssignmentsUsage

        override fun globalIpHealthCheckTypes():
            GlobalIpHealthCheckTypeServiceAsync.WithRawResponse = globalIpHealthCheckTypes

        override fun globalIpHealthChecks(): GlobalIpHealthCheckServiceAsync.WithRawResponse =
            globalIpHealthChecks

        override fun globalIpLatency(): GlobalIpLatencyServiceAsync.WithRawResponse =
            globalIpLatency

        override fun globalIpProtocols(): GlobalIpProtocolServiceAsync.WithRawResponse =
            globalIpProtocols

        override fun globalIpUsage(): GlobalIpUsageServiceAsync.WithRawResponse = globalIpUsage

        override fun globalIps(): GlobalIpServiceAsync.WithRawResponse = globalIps

        override fun inboundChannels(): InboundChannelServiceAsync.WithRawResponse = inboundChannels

        override fun integrationSecrets(): IntegrationSecretServiceAsync.WithRawResponse =
            integrationSecrets

        override fun inventoryCoverage(): InventoryCoverageServiceAsync.WithRawResponse =
            inventoryCoverage

        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun ipConnections(): IpConnectionServiceAsync.WithRawResponse = ipConnections

        override fun ips(): IpServiceAsync.WithRawResponse = ips

        override fun ledgerBillingGroupReports():
            LedgerBillingGroupReportServiceAsync.WithRawResponse = ledgerBillingGroupReports

        override fun list(): ListServiceAsync.WithRawResponse = list

        override fun managedAccounts(): ManagedAccountServiceAsync.WithRawResponse = managedAccounts

        override fun media(): MediaServiceAsync.WithRawResponse = media

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun messaging(): MessagingServiceAsync.WithRawResponse = messaging

        override fun messagingHostedNumberOrders():
            MessagingHostedNumberOrderServiceAsync.WithRawResponse = messagingHostedNumberOrders

        override fun messagingHostedNumbers(): MessagingHostedNumberServiceAsync.WithRawResponse =
            messagingHostedNumbers

        override fun messagingNumbersBulkUpdates():
            MessagingNumbersBulkUpdateServiceAsync.WithRawResponse = messagingNumbersBulkUpdates

        override fun messagingOptouts(): MessagingOptoutServiceAsync.WithRawResponse =
            messagingOptouts

        override fun messagingProfiles(): MessagingProfileServiceAsync.WithRawResponse =
            messagingProfiles

        override fun messagingTollfree(): MessagingTollfreeServiceAsync.WithRawResponse =
            messagingTollfree

        override fun messagingUrlDomains(): MessagingUrlDomainServiceAsync.WithRawResponse =
            messagingUrlDomains

        override fun messsages(): MesssageServiceAsync.WithRawResponse = messsages

        override fun mobileNetworkOperators(): MobileNetworkOperatorServiceAsync.WithRawResponse =
            mobileNetworkOperators

        override fun mobilePushCredentials(): MobilePushCredentialServiceAsync.WithRawResponse =
            mobilePushCredentials

        override fun networkCoverage(): NetworkCoverageServiceAsync.WithRawResponse =
            networkCoverage

        override fun networks(): NetworkServiceAsync.WithRawResponse = networks

        override fun notificationChannels(): NotificationChannelServiceAsync.WithRawResponse =
            notificationChannels

        override fun notificationEventConditions():
            NotificationEventConditionServiceAsync.WithRawResponse = notificationEventConditions

        override fun notificationEvents(): NotificationEventServiceAsync.WithRawResponse =
            notificationEvents

        override fun notificationProfiles(): NotificationProfileServiceAsync.WithRawResponse =
            notificationProfiles

        override fun notificationSettings(): NotificationSettingServiceAsync.WithRawResponse =
            notificationSettings

        override fun numberBlockOrders(): NumberBlockOrderServiceAsync.WithRawResponse =
            numberBlockOrders

        override fun numberLookup(): NumberLookupServiceAsync.WithRawResponse = numberLookup

        override fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberServiceAsync.WithRawResponse =
            numberOrderPhoneNumbers

        override fun numberOrders(): NumberOrderServiceAsync.WithRawResponse = numberOrders

        override fun numberReservations(): NumberReservationServiceAsync.WithRawResponse =
            numberReservations

        override fun numbersFeatures(): NumbersFeatureServiceAsync.WithRawResponse = numbersFeatures

        override fun operatorConnect(): OperatorConnectServiceAsync.WithRawResponse =
            operatorConnect

        override fun otaUpdates(): OtaUpdateServiceAsync.WithRawResponse = otaUpdates

        override fun outboundVoiceProfiles(): OutboundVoiceProfileServiceAsync.WithRawResponse =
            outboundVoiceProfiles

        override fun payment(): PaymentServiceAsync.WithRawResponse = payment

        override fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse =
            phoneNumberAssignmentByProfile

        override fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync.WithRawResponse =
            phoneNumberBlocks

        override fun phoneNumberCampaigns(): PhoneNumberCampaignServiceAsync.WithRawResponse =
            phoneNumberCampaigns

        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        override fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementServiceAsync.WithRawResponse =
            phoneNumbersRegulatoryRequirements

        override fun portabilityChecks(): PortabilityCheckServiceAsync.WithRawResponse =
            portabilityChecks

        override fun porting(): PortingServiceAsync.WithRawResponse = porting

        override fun portingOrders(): PortingOrderServiceAsync.WithRawResponse = portingOrders

        override fun portingPhoneNumbers(): PortingPhoneNumberServiceAsync.WithRawResponse =
            portingPhoneNumbers

        override fun portouts(): PortoutServiceAsync.WithRawResponse = portouts

        override fun privateWirelessGateways(): PrivateWirelessGatewayServiceAsync.WithRawResponse =
            privateWirelessGateways

        override fun publicInternetGateways(): PublicInternetGatewayServiceAsync.WithRawResponse =
            publicInternetGateways

        override fun queues(): QueueServiceAsync.WithRawResponse = queues

        override fun rcsAgents(): RcsAgentServiceAsync.WithRawResponse = rcsAgents

        override fun recordingTranscriptions(): RecordingTranscriptionServiceAsync.WithRawResponse =
            recordingTranscriptions

        override fun recordings(): RecordingServiceAsync.WithRawResponse = recordings

        override fun regions(): RegionServiceAsync.WithRawResponse = regions

        override fun regulatoryRequirements(): RegulatoryRequirementServiceAsync.WithRawResponse =
            regulatoryRequirements

        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        override fun requirementGroups(): RequirementGroupServiceAsync.WithRawResponse =
            requirementGroups

        override fun requirementTypes(): RequirementTypeServiceAsync.WithRawResponse =
            requirementTypes

        override fun requirements(): RequirementServiceAsync.WithRawResponse = requirements

        override fun roomCompositions(): RoomCompositionServiceAsync.WithRawResponse =
            roomCompositions

        override fun roomParticipants(): RoomParticipantServiceAsync.WithRawResponse =
            roomParticipants

        override fun roomRecordings(): RoomRecordingServiceAsync.WithRawResponse = roomRecordings

        override fun rooms(): RoomServiceAsync.WithRawResponse = rooms

        override fun seti(): SetiServiceAsync.WithRawResponse = seti

        override fun shortCodes(): ShortCodeServiceAsync.WithRawResponse = shortCodes

        override fun simCardDataUsageNotifications():
            SimCardDataUsageNotificationServiceAsync.WithRawResponse = simCardDataUsageNotifications

        override fun simCardGroups(): SimCardGroupServiceAsync.WithRawResponse = simCardGroups

        override fun simCardOrderPreview(): SimCardOrderPreviewServiceAsync.WithRawResponse =
            simCardOrderPreview

        override fun simCardOrders(): SimCardOrderServiceAsync.WithRawResponse = simCardOrders

        override fun simCards(): SimCardServiceAsync.WithRawResponse = simCards

        override fun siprecConnectors(): SiprecConnectorServiceAsync.WithRawResponse =
            siprecConnectors

        override fun storage(): StorageServiceAsync.WithRawResponse = storage

        override fun subNumberOrders(): SubNumberOrderServiceAsync.WithRawResponse = subNumberOrders

        override fun subNumberOrdersReport(): SubNumberOrdersReportServiceAsync.WithRawResponse =
            subNumberOrdersReport

        override fun telephonyCredentials(): TelephonyCredentialServiceAsync.WithRawResponse =
            telephonyCredentials

        override fun texml(): TexmlServiceAsync.WithRawResponse = texml

        override fun texmlApplications(): TexmlApplicationServiceAsync.WithRawResponse =
            texmlApplications

        override fun textToSpeech(): TextToSpeechServiceAsync.WithRawResponse = textToSpeech

        override fun usageReports(): UsageReportServiceAsync.WithRawResponse = usageReports

        override fun userAddresses(): UserAddressServiceAsync.WithRawResponse = userAddresses

        override fun userTags(): UserTagServiceAsync.WithRawResponse = userTags

        override fun verifications(): VerificationServiceAsync.WithRawResponse = verifications

        override fun verifiedNumbers(): VerifiedNumberServiceAsync.WithRawResponse = verifiedNumbers

        override fun verifyProfiles(): VerifyProfileServiceAsync.WithRawResponse = verifyProfiles

        override fun virtualCrossConnects(): VirtualCrossConnectServiceAsync.WithRawResponse =
            virtualCrossConnects

        override fun virtualCrossConnectsCoverage():
            VirtualCrossConnectsCoverageServiceAsync.WithRawResponse = virtualCrossConnectsCoverage

        override fun webhookDeliveries(): WebhookDeliveryServiceAsync.WithRawResponse =
            webhookDeliveries

        override fun wireguardInterfaces(): WireguardInterfaceServiceAsync.WithRawResponse =
            wireguardInterfaces

        override fun wireguardPeers(): WireguardPeerServiceAsync.WithRawResponse = wireguardPeers

        override fun wireless(): WirelessServiceAsync.WithRawResponse = wireless

        override fun wirelessBlocklistValues(): WirelessBlocklistValueServiceAsync.WithRawResponse =
            wirelessBlocklistValues

        override fun wirelessBlocklists(): WirelessBlocklistServiceAsync.WithRawResponse =
            wirelessBlocklists

        override fun partnerCampaigns(): PartnerCampaignServiceAsync.WithRawResponse =
            partnerCampaigns

        override fun wellKnown(): WellKnownServiceAsync.WithRawResponse = wellKnown

        override fun inexplicitNumberOrders(): InexplicitNumberOrderServiceAsync.WithRawResponse =
            inexplicitNumberOrders

        override fun mobilePhoneNumbers(): MobilePhoneNumberServiceAsync.WithRawResponse =
            mobilePhoneNumbers

        override fun mobileVoiceConnections(): MobileVoiceConnectionServiceAsync.WithRawResponse =
            mobileVoiceConnections
    }
}
