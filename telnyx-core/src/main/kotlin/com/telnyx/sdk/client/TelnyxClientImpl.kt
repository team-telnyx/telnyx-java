// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.client

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.getPackageVersion
import com.telnyx.sdk.services.blocking.AccessIpAddressService
import com.telnyx.sdk.services.blocking.AccessIpAddressServiceImpl
import com.telnyx.sdk.services.blocking.AccessIpRangeService
import com.telnyx.sdk.services.blocking.AccessIpRangeServiceImpl
import com.telnyx.sdk.services.blocking.ActionService
import com.telnyx.sdk.services.blocking.ActionServiceImpl
import com.telnyx.sdk.services.blocking.AddressService
import com.telnyx.sdk.services.blocking.AddressServiceImpl
import com.telnyx.sdk.services.blocking.AdvancedOrderService
import com.telnyx.sdk.services.blocking.AdvancedOrderServiceImpl
import com.telnyx.sdk.services.blocking.AiService
import com.telnyx.sdk.services.blocking.AiServiceImpl
import com.telnyx.sdk.services.blocking.AuditEventService
import com.telnyx.sdk.services.blocking.AuditEventServiceImpl
import com.telnyx.sdk.services.blocking.AuthenticationProviderService
import com.telnyx.sdk.services.blocking.AuthenticationProviderServiceImpl
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberBlockService
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberBlockServiceImpl
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberService
import com.telnyx.sdk.services.blocking.AvailablePhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.BalanceService
import com.telnyx.sdk.services.blocking.BalanceServiceImpl
import com.telnyx.sdk.services.blocking.BillingGroupService
import com.telnyx.sdk.services.blocking.BillingGroupServiceImpl
import com.telnyx.sdk.services.blocking.BrandService
import com.telnyx.sdk.services.blocking.BrandServiceImpl
import com.telnyx.sdk.services.blocking.BulkSimCardActionService
import com.telnyx.sdk.services.blocking.BulkSimCardActionServiceImpl
import com.telnyx.sdk.services.blocking.BundlePricingService
import com.telnyx.sdk.services.blocking.BundlePricingServiceImpl
import com.telnyx.sdk.services.blocking.CallControlApplicationService
import com.telnyx.sdk.services.blocking.CallControlApplicationServiceImpl
import com.telnyx.sdk.services.blocking.CallEventService
import com.telnyx.sdk.services.blocking.CallEventServiceImpl
import com.telnyx.sdk.services.blocking.CallService
import com.telnyx.sdk.services.blocking.CallServiceImpl
import com.telnyx.sdk.services.blocking.CampaignBuilderService
import com.telnyx.sdk.services.blocking.CampaignBuilderServiceImpl
import com.telnyx.sdk.services.blocking.CampaignService
import com.telnyx.sdk.services.blocking.CampaignServiceImpl
import com.telnyx.sdk.services.blocking.ChannelZoneService
import com.telnyx.sdk.services.blocking.ChannelZoneServiceImpl
import com.telnyx.sdk.services.blocking.ChargesBreakdownService
import com.telnyx.sdk.services.blocking.ChargesBreakdownServiceImpl
import com.telnyx.sdk.services.blocking.ChargesSummaryService
import com.telnyx.sdk.services.blocking.ChargesSummaryServiceImpl
import com.telnyx.sdk.services.blocking.CommentService
import com.telnyx.sdk.services.blocking.CommentServiceImpl
import com.telnyx.sdk.services.blocking.ConferenceService
import com.telnyx.sdk.services.blocking.ConferenceServiceImpl
import com.telnyx.sdk.services.blocking.ConnectionService
import com.telnyx.sdk.services.blocking.ConnectionServiceImpl
import com.telnyx.sdk.services.blocking.CountryCoverageService
import com.telnyx.sdk.services.blocking.CountryCoverageServiceImpl
import com.telnyx.sdk.services.blocking.CredentialConnectionService
import com.telnyx.sdk.services.blocking.CredentialConnectionServiceImpl
import com.telnyx.sdk.services.blocking.CustomStorageCredentialService
import com.telnyx.sdk.services.blocking.CustomStorageCredentialServiceImpl
import com.telnyx.sdk.services.blocking.CustomerServiceRecordService
import com.telnyx.sdk.services.blocking.CustomerServiceRecordServiceImpl
import com.telnyx.sdk.services.blocking.DetailRecordService
import com.telnyx.sdk.services.blocking.DetailRecordServiceImpl
import com.telnyx.sdk.services.blocking.DialogflowConnectionService
import com.telnyx.sdk.services.blocking.DialogflowConnectionServiceImpl
import com.telnyx.sdk.services.blocking.DocumentLinkService
import com.telnyx.sdk.services.blocking.DocumentLinkServiceImpl
import com.telnyx.sdk.services.blocking.DocumentService
import com.telnyx.sdk.services.blocking.DocumentServiceImpl
import com.telnyx.sdk.services.blocking.DynamicEmergencyAddressService
import com.telnyx.sdk.services.blocking.DynamicEmergencyAddressServiceImpl
import com.telnyx.sdk.services.blocking.DynamicEmergencyEndpointService
import com.telnyx.sdk.services.blocking.DynamicEmergencyEndpointServiceImpl
import com.telnyx.sdk.services.blocking.EnumerationService
import com.telnyx.sdk.services.blocking.EnumerationServiceImpl
import com.telnyx.sdk.services.blocking.ExternalConnectionService
import com.telnyx.sdk.services.blocking.ExternalConnectionServiceImpl
import com.telnyx.sdk.services.blocking.FaxApplicationService
import com.telnyx.sdk.services.blocking.FaxApplicationServiceImpl
import com.telnyx.sdk.services.blocking.FaxService
import com.telnyx.sdk.services.blocking.FaxServiceImpl
import com.telnyx.sdk.services.blocking.FqdnConnectionService
import com.telnyx.sdk.services.blocking.FqdnConnectionServiceImpl
import com.telnyx.sdk.services.blocking.FqdnService
import com.telnyx.sdk.services.blocking.FqdnServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpAllowedPortService
import com.telnyx.sdk.services.blocking.GlobalIpAllowedPortServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentHealthService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentHealthServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentsUsageService
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentsUsageServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckService
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckTypeService
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckTypeServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpLatencyService
import com.telnyx.sdk.services.blocking.GlobalIpLatencyServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpProtocolService
import com.telnyx.sdk.services.blocking.GlobalIpProtocolServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpService
import com.telnyx.sdk.services.blocking.GlobalIpServiceImpl
import com.telnyx.sdk.services.blocking.GlobalIpUsageService
import com.telnyx.sdk.services.blocking.GlobalIpUsageServiceImpl
import com.telnyx.sdk.services.blocking.InboundChannelService
import com.telnyx.sdk.services.blocking.InboundChannelServiceImpl
import com.telnyx.sdk.services.blocking.InexplicitNumberOrderService
import com.telnyx.sdk.services.blocking.InexplicitNumberOrderServiceImpl
import com.telnyx.sdk.services.blocking.IntegrationSecretService
import com.telnyx.sdk.services.blocking.IntegrationSecretServiceImpl
import com.telnyx.sdk.services.blocking.InventoryCoverageService
import com.telnyx.sdk.services.blocking.InventoryCoverageServiceImpl
import com.telnyx.sdk.services.blocking.InvoiceService
import com.telnyx.sdk.services.blocking.InvoiceServiceImpl
import com.telnyx.sdk.services.blocking.IpConnectionService
import com.telnyx.sdk.services.blocking.IpConnectionServiceImpl
import com.telnyx.sdk.services.blocking.IpService
import com.telnyx.sdk.services.blocking.IpServiceImpl
import com.telnyx.sdk.services.blocking.LedgerBillingGroupReportService
import com.telnyx.sdk.services.blocking.LedgerBillingGroupReportServiceImpl
import com.telnyx.sdk.services.blocking.LegacyService
import com.telnyx.sdk.services.blocking.LegacyServiceImpl
import com.telnyx.sdk.services.blocking.ListService
import com.telnyx.sdk.services.blocking.ListServiceImpl
import com.telnyx.sdk.services.blocking.ManagedAccountService
import com.telnyx.sdk.services.blocking.ManagedAccountServiceImpl
import com.telnyx.sdk.services.blocking.MediaService
import com.telnyx.sdk.services.blocking.MediaServiceImpl
import com.telnyx.sdk.services.blocking.MessageService
import com.telnyx.sdk.services.blocking.MessageServiceImpl
import com.telnyx.sdk.services.blocking.MessagingHostedNumberOrderService
import com.telnyx.sdk.services.blocking.MessagingHostedNumberOrderServiceImpl
import com.telnyx.sdk.services.blocking.MessagingHostedNumberService
import com.telnyx.sdk.services.blocking.MessagingHostedNumberServiceImpl
import com.telnyx.sdk.services.blocking.MessagingNumbersBulkUpdateService
import com.telnyx.sdk.services.blocking.MessagingNumbersBulkUpdateServiceImpl
import com.telnyx.sdk.services.blocking.MessagingOptoutService
import com.telnyx.sdk.services.blocking.MessagingOptoutServiceImpl
import com.telnyx.sdk.services.blocking.MessagingProfileService
import com.telnyx.sdk.services.blocking.MessagingProfileServiceImpl
import com.telnyx.sdk.services.blocking.MessagingService
import com.telnyx.sdk.services.blocking.MessagingServiceImpl
import com.telnyx.sdk.services.blocking.MessagingTollfreeService
import com.telnyx.sdk.services.blocking.MessagingTollfreeServiceImpl
import com.telnyx.sdk.services.blocking.MessagingUrlDomainService
import com.telnyx.sdk.services.blocking.MessagingUrlDomainServiceImpl
import com.telnyx.sdk.services.blocking.MesssageService
import com.telnyx.sdk.services.blocking.MesssageServiceImpl
import com.telnyx.sdk.services.blocking.MobileNetworkOperatorService
import com.telnyx.sdk.services.blocking.MobileNetworkOperatorServiceImpl
import com.telnyx.sdk.services.blocking.MobilePhoneNumberService
import com.telnyx.sdk.services.blocking.MobilePhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.MobilePushCredentialService
import com.telnyx.sdk.services.blocking.MobilePushCredentialServiceImpl
import com.telnyx.sdk.services.blocking.MobileVoiceConnectionService
import com.telnyx.sdk.services.blocking.MobileVoiceConnectionServiceImpl
import com.telnyx.sdk.services.blocking.NetworkCoverageService
import com.telnyx.sdk.services.blocking.NetworkCoverageServiceImpl
import com.telnyx.sdk.services.blocking.NetworkService
import com.telnyx.sdk.services.blocking.NetworkServiceImpl
import com.telnyx.sdk.services.blocking.NotificationChannelService
import com.telnyx.sdk.services.blocking.NotificationChannelServiceImpl
import com.telnyx.sdk.services.blocking.NotificationEventConditionService
import com.telnyx.sdk.services.blocking.NotificationEventConditionServiceImpl
import com.telnyx.sdk.services.blocking.NotificationEventService
import com.telnyx.sdk.services.blocking.NotificationEventServiceImpl
import com.telnyx.sdk.services.blocking.NotificationProfileService
import com.telnyx.sdk.services.blocking.NotificationProfileServiceImpl
import com.telnyx.sdk.services.blocking.NotificationSettingService
import com.telnyx.sdk.services.blocking.NotificationSettingServiceImpl
import com.telnyx.sdk.services.blocking.NumberBlockOrderService
import com.telnyx.sdk.services.blocking.NumberBlockOrderServiceImpl
import com.telnyx.sdk.services.blocking.NumberLookupService
import com.telnyx.sdk.services.blocking.NumberLookupServiceImpl
import com.telnyx.sdk.services.blocking.NumberOrderPhoneNumberService
import com.telnyx.sdk.services.blocking.NumberOrderPhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.NumberOrderService
import com.telnyx.sdk.services.blocking.NumberOrderServiceImpl
import com.telnyx.sdk.services.blocking.NumberReservationService
import com.telnyx.sdk.services.blocking.NumberReservationServiceImpl
import com.telnyx.sdk.services.blocking.NumbersFeatureService
import com.telnyx.sdk.services.blocking.NumbersFeatureServiceImpl
import com.telnyx.sdk.services.blocking.OAuthClientService
import com.telnyx.sdk.services.blocking.OAuthClientServiceImpl
import com.telnyx.sdk.services.blocking.OAuthGrantService
import com.telnyx.sdk.services.blocking.OAuthGrantServiceImpl
import com.telnyx.sdk.services.blocking.OAuthService
import com.telnyx.sdk.services.blocking.OAuthServiceImpl
import com.telnyx.sdk.services.blocking.OperatorConnectService
import com.telnyx.sdk.services.blocking.OperatorConnectServiceImpl
import com.telnyx.sdk.services.blocking.OtaUpdateService
import com.telnyx.sdk.services.blocking.OtaUpdateServiceImpl
import com.telnyx.sdk.services.blocking.OutboundVoiceProfileService
import com.telnyx.sdk.services.blocking.OutboundVoiceProfileServiceImpl
import com.telnyx.sdk.services.blocking.PartnerCampaignService
import com.telnyx.sdk.services.blocking.PartnerCampaignServiceImpl
import com.telnyx.sdk.services.blocking.PaymentService
import com.telnyx.sdk.services.blocking.PaymentServiceImpl
import com.telnyx.sdk.services.blocking.PhoneNumberAssignmentByProfileService
import com.telnyx.sdk.services.blocking.PhoneNumberAssignmentByProfileServiceImpl
import com.telnyx.sdk.services.blocking.PhoneNumberBlockService
import com.telnyx.sdk.services.blocking.PhoneNumberBlockServiceImpl
import com.telnyx.sdk.services.blocking.PhoneNumberCampaignService
import com.telnyx.sdk.services.blocking.PhoneNumberCampaignServiceImpl
import com.telnyx.sdk.services.blocking.PhoneNumberService
import com.telnyx.sdk.services.blocking.PhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.PhoneNumbersRegulatoryRequirementService
import com.telnyx.sdk.services.blocking.PhoneNumbersRegulatoryRequirementServiceImpl
import com.telnyx.sdk.services.blocking.PortabilityCheckService
import com.telnyx.sdk.services.blocking.PortabilityCheckServiceImpl
import com.telnyx.sdk.services.blocking.PortingOrderService
import com.telnyx.sdk.services.blocking.PortingOrderServiceImpl
import com.telnyx.sdk.services.blocking.PortingPhoneNumberService
import com.telnyx.sdk.services.blocking.PortingPhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.PortingService
import com.telnyx.sdk.services.blocking.PortingServiceImpl
import com.telnyx.sdk.services.blocking.PortoutService
import com.telnyx.sdk.services.blocking.PortoutServiceImpl
import com.telnyx.sdk.services.blocking.PrivateWirelessGatewayService
import com.telnyx.sdk.services.blocking.PrivateWirelessGatewayServiceImpl
import com.telnyx.sdk.services.blocking.PublicInternetGatewayService
import com.telnyx.sdk.services.blocking.PublicInternetGatewayServiceImpl
import com.telnyx.sdk.services.blocking.QueueService
import com.telnyx.sdk.services.blocking.QueueServiceImpl
import com.telnyx.sdk.services.blocking.RcsAgentService
import com.telnyx.sdk.services.blocking.RcsAgentServiceImpl
import com.telnyx.sdk.services.blocking.RecordingService
import com.telnyx.sdk.services.blocking.RecordingServiceImpl
import com.telnyx.sdk.services.blocking.RecordingTranscriptionService
import com.telnyx.sdk.services.blocking.RecordingTranscriptionServiceImpl
import com.telnyx.sdk.services.blocking.RegionService
import com.telnyx.sdk.services.blocking.RegionServiceImpl
import com.telnyx.sdk.services.blocking.RegulatoryRequirementService
import com.telnyx.sdk.services.blocking.RegulatoryRequirementServiceImpl
import com.telnyx.sdk.services.blocking.ReportService
import com.telnyx.sdk.services.blocking.ReportServiceImpl
import com.telnyx.sdk.services.blocking.RequirementGroupService
import com.telnyx.sdk.services.blocking.RequirementGroupServiceImpl
import com.telnyx.sdk.services.blocking.RequirementService
import com.telnyx.sdk.services.blocking.RequirementServiceImpl
import com.telnyx.sdk.services.blocking.RequirementTypeService
import com.telnyx.sdk.services.blocking.RequirementTypeServiceImpl
import com.telnyx.sdk.services.blocking.RoomCompositionService
import com.telnyx.sdk.services.blocking.RoomCompositionServiceImpl
import com.telnyx.sdk.services.blocking.RoomParticipantService
import com.telnyx.sdk.services.blocking.RoomParticipantServiceImpl
import com.telnyx.sdk.services.blocking.RoomRecordingService
import com.telnyx.sdk.services.blocking.RoomRecordingServiceImpl
import com.telnyx.sdk.services.blocking.RoomService
import com.telnyx.sdk.services.blocking.RoomServiceImpl
import com.telnyx.sdk.services.blocking.SetiService
import com.telnyx.sdk.services.blocking.SetiServiceImpl
import com.telnyx.sdk.services.blocking.ShortCodeService
import com.telnyx.sdk.services.blocking.ShortCodeServiceImpl
import com.telnyx.sdk.services.blocking.SimCardDataUsageNotificationService
import com.telnyx.sdk.services.blocking.SimCardDataUsageNotificationServiceImpl
import com.telnyx.sdk.services.blocking.SimCardGroupService
import com.telnyx.sdk.services.blocking.SimCardGroupServiceImpl
import com.telnyx.sdk.services.blocking.SimCardOrderPreviewService
import com.telnyx.sdk.services.blocking.SimCardOrderPreviewServiceImpl
import com.telnyx.sdk.services.blocking.SimCardOrderService
import com.telnyx.sdk.services.blocking.SimCardOrderServiceImpl
import com.telnyx.sdk.services.blocking.SimCardService
import com.telnyx.sdk.services.blocking.SimCardServiceImpl
import com.telnyx.sdk.services.blocking.SiprecConnectorService
import com.telnyx.sdk.services.blocking.SiprecConnectorServiceImpl
import com.telnyx.sdk.services.blocking.StorageService
import com.telnyx.sdk.services.blocking.StorageServiceImpl
import com.telnyx.sdk.services.blocking.SubNumberOrderService
import com.telnyx.sdk.services.blocking.SubNumberOrderServiceImpl
import com.telnyx.sdk.services.blocking.SubNumberOrdersReportService
import com.telnyx.sdk.services.blocking.SubNumberOrdersReportServiceImpl
import com.telnyx.sdk.services.blocking.TelephonyCredentialService
import com.telnyx.sdk.services.blocking.TelephonyCredentialServiceImpl
import com.telnyx.sdk.services.blocking.TexmlApplicationService
import com.telnyx.sdk.services.blocking.TexmlApplicationServiceImpl
import com.telnyx.sdk.services.blocking.TexmlService
import com.telnyx.sdk.services.blocking.TexmlServiceImpl
import com.telnyx.sdk.services.blocking.TextToSpeechService
import com.telnyx.sdk.services.blocking.TextToSpeechServiceImpl
import com.telnyx.sdk.services.blocking.UsageReportService
import com.telnyx.sdk.services.blocking.UsageReportServiceImpl
import com.telnyx.sdk.services.blocking.UserAddressService
import com.telnyx.sdk.services.blocking.UserAddressServiceImpl
import com.telnyx.sdk.services.blocking.UserTagService
import com.telnyx.sdk.services.blocking.UserTagServiceImpl
import com.telnyx.sdk.services.blocking.VerificationService
import com.telnyx.sdk.services.blocking.VerificationServiceImpl
import com.telnyx.sdk.services.blocking.VerifiedNumberService
import com.telnyx.sdk.services.blocking.VerifiedNumberServiceImpl
import com.telnyx.sdk.services.blocking.VerifyProfileService
import com.telnyx.sdk.services.blocking.VerifyProfileServiceImpl
import com.telnyx.sdk.services.blocking.VirtualCrossConnectService
import com.telnyx.sdk.services.blocking.VirtualCrossConnectServiceImpl
import com.telnyx.sdk.services.blocking.VirtualCrossConnectsCoverageService
import com.telnyx.sdk.services.blocking.VirtualCrossConnectsCoverageServiceImpl
import com.telnyx.sdk.services.blocking.WebhookDeliveryService
import com.telnyx.sdk.services.blocking.WebhookDeliveryServiceImpl
import com.telnyx.sdk.services.blocking.WebhookService
import com.telnyx.sdk.services.blocking.WebhookServiceImpl
import com.telnyx.sdk.services.blocking.WellKnownService
import com.telnyx.sdk.services.blocking.WellKnownServiceImpl
import com.telnyx.sdk.services.blocking.WireguardInterfaceService
import com.telnyx.sdk.services.blocking.WireguardInterfaceServiceImpl
import com.telnyx.sdk.services.blocking.WireguardPeerService
import com.telnyx.sdk.services.blocking.WireguardPeerServiceImpl
import com.telnyx.sdk.services.blocking.WirelessBlocklistService
import com.telnyx.sdk.services.blocking.WirelessBlocklistServiceImpl
import com.telnyx.sdk.services.blocking.WirelessBlocklistValueService
import com.telnyx.sdk.services.blocking.WirelessBlocklistValueServiceImpl
import com.telnyx.sdk.services.blocking.WirelessService
import com.telnyx.sdk.services.blocking.WirelessServiceImpl
import java.util.function.Consumer

class TelnyxClientImpl(private val clientOptions: ClientOptions) : TelnyxClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: TelnyxClientAsync by lazy { TelnyxClientAsyncImpl(clientOptions) }

    private val withRawResponse: TelnyxClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val legacy: LegacyService by lazy { LegacyServiceImpl(clientOptionsWithUserAgent) }

    private val oauth: OAuthService by lazy { OAuthServiceImpl(clientOptionsWithUserAgent) }

    private val oauthClients: OAuthClientService by lazy {
        OAuthClientServiceImpl(clientOptionsWithUserAgent)
    }

    private val oauthGrants: OAuthGrantService by lazy {
        OAuthGrantServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val accessIpAddress: AccessIpAddressService by lazy {
        AccessIpAddressServiceImpl(clientOptionsWithUserAgent)
    }

    private val accessIpRanges: AccessIpRangeService by lazy {
        AccessIpRangeServiceImpl(clientOptionsWithUserAgent)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptionsWithUserAgent) }

    private val addresses: AddressService by lazy { AddressServiceImpl(clientOptionsWithUserAgent) }

    private val advancedOrders: AdvancedOrderService by lazy {
        AdvancedOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val ai: AiService by lazy { AiServiceImpl(clientOptionsWithUserAgent) }

    private val auditEvents: AuditEventService by lazy {
        AuditEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val authenticationProviders: AuthenticationProviderService by lazy {
        AuthenticationProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val availablePhoneNumberBlocks: AvailablePhoneNumberBlockService by lazy {
        AvailablePhoneNumberBlockServiceImpl(clientOptionsWithUserAgent)
    }

    private val availablePhoneNumbers: AvailablePhoneNumberService by lazy {
        AvailablePhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val balance: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val billingGroups: BillingGroupService by lazy {
        BillingGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val brand: BrandService by lazy { BrandServiceImpl(clientOptionsWithUserAgent) }

    private val bulkSimCardActions: BulkSimCardActionService by lazy {
        BulkSimCardActionServiceImpl(clientOptionsWithUserAgent)
    }

    private val bundlePricing: BundlePricingService by lazy {
        BundlePricingServiceImpl(clientOptionsWithUserAgent)
    }

    private val callControlApplications: CallControlApplicationService by lazy {
        CallControlApplicationServiceImpl(clientOptionsWithUserAgent)
    }

    private val callEvents: CallEventService by lazy {
        CallEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val calls: CallService by lazy { CallServiceImpl(clientOptionsWithUserAgent) }

    private val campaign: CampaignService by lazy {
        CampaignServiceImpl(clientOptionsWithUserAgent)
    }

    private val campaignBuilder: CampaignBuilderService by lazy {
        CampaignBuilderServiceImpl(clientOptionsWithUserAgent)
    }

    private val channelZones: ChannelZoneService by lazy {
        ChannelZoneServiceImpl(clientOptionsWithUserAgent)
    }

    private val chargesBreakdown: ChargesBreakdownService by lazy {
        ChargesBreakdownServiceImpl(clientOptionsWithUserAgent)
    }

    private val chargesSummary: ChargesSummaryService by lazy {
        ChargesSummaryServiceImpl(clientOptionsWithUserAgent)
    }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptionsWithUserAgent) }

    private val conferences: ConferenceService by lazy {
        ConferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val connections: ConnectionService by lazy {
        ConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val countryCoverage: CountryCoverageService by lazy {
        CountryCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val credentialConnections: CredentialConnectionService by lazy {
        CredentialConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val customStorageCredentials: CustomStorageCredentialService by lazy {
        CustomStorageCredentialServiceImpl(clientOptionsWithUserAgent)
    }

    private val customerServiceRecords: CustomerServiceRecordService by lazy {
        CustomerServiceRecordServiceImpl(clientOptionsWithUserAgent)
    }

    private val detailRecords: DetailRecordService by lazy {
        DetailRecordServiceImpl(clientOptionsWithUserAgent)
    }

    private val dialogflowConnections: DialogflowConnectionService by lazy {
        DialogflowConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val documentLinks: DocumentLinkService by lazy {
        DocumentLinkServiceImpl(clientOptionsWithUserAgent)
    }

    private val documents: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val dynamicEmergencyAddresses: DynamicEmergencyAddressService by lazy {
        DynamicEmergencyAddressServiceImpl(clientOptionsWithUserAgent)
    }

    private val dynamicEmergencyEndpoints: DynamicEmergencyEndpointService by lazy {
        DynamicEmergencyEndpointServiceImpl(clientOptionsWithUserAgent)
    }

    private val enumeration: EnumerationService by lazy {
        EnumerationServiceImpl(clientOptionsWithUserAgent)
    }

    private val externalConnections: ExternalConnectionService by lazy {
        ExternalConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val faxApplications: FaxApplicationService by lazy {
        FaxApplicationServiceImpl(clientOptionsWithUserAgent)
    }

    private val faxes: FaxService by lazy { FaxServiceImpl(clientOptionsWithUserAgent) }

    private val fqdnConnections: FqdnConnectionService by lazy {
        FqdnConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val fqdns: FqdnService by lazy { FqdnServiceImpl(clientOptionsWithUserAgent) }

    private val globalIpAllowedPorts: GlobalIpAllowedPortService by lazy {
        GlobalIpAllowedPortServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignmentHealth: GlobalIpAssignmentHealthService by lazy {
        GlobalIpAssignmentHealthServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignments: GlobalIpAssignmentService by lazy {
        GlobalIpAssignmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpAssignmentsUsage: GlobalIpAssignmentsUsageService by lazy {
        GlobalIpAssignmentsUsageServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpHealthCheckTypes: GlobalIpHealthCheckTypeService by lazy {
        GlobalIpHealthCheckTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpHealthChecks: GlobalIpHealthCheckService by lazy {
        GlobalIpHealthCheckServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpLatency: GlobalIpLatencyService by lazy {
        GlobalIpLatencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpProtocols: GlobalIpProtocolService by lazy {
        GlobalIpProtocolServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIpUsage: GlobalIpUsageService by lazy {
        GlobalIpUsageServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalIps: GlobalIpService by lazy {
        GlobalIpServiceImpl(clientOptionsWithUserAgent)
    }

    private val inboundChannels: InboundChannelService by lazy {
        InboundChannelServiceImpl(clientOptionsWithUserAgent)
    }

    private val integrationSecrets: IntegrationSecretService by lazy {
        IntegrationSecretServiceImpl(clientOptionsWithUserAgent)
    }

    private val inventoryCoverage: InventoryCoverageService by lazy {
        InventoryCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val ipConnections: IpConnectionService by lazy {
        IpConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val ips: IpService by lazy { IpServiceImpl(clientOptionsWithUserAgent) }

    private val ledgerBillingGroupReports: LedgerBillingGroupReportService by lazy {
        LedgerBillingGroupReportServiceImpl(clientOptionsWithUserAgent)
    }

    private val list: ListService by lazy { ListServiceImpl(clientOptionsWithUserAgent) }

    private val managedAccounts: ManagedAccountService by lazy {
        ManagedAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val media: MediaService by lazy { MediaServiceImpl(clientOptionsWithUserAgent) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptionsWithUserAgent) }

    private val messaging: MessagingService by lazy {
        MessagingServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingHostedNumberOrders: MessagingHostedNumberOrderService by lazy {
        MessagingHostedNumberOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingHostedNumbers: MessagingHostedNumberService by lazy {
        MessagingHostedNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingNumbersBulkUpdates: MessagingNumbersBulkUpdateService by lazy {
        MessagingNumbersBulkUpdateServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingOptouts: MessagingOptoutService by lazy {
        MessagingOptoutServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingProfiles: MessagingProfileService by lazy {
        MessagingProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingTollfree: MessagingTollfreeService by lazy {
        MessagingTollfreeServiceImpl(clientOptionsWithUserAgent)
    }

    private val messagingUrlDomains: MessagingUrlDomainService by lazy {
        MessagingUrlDomainServiceImpl(clientOptionsWithUserAgent)
    }

    private val messsages: MesssageService by lazy {
        MesssageServiceImpl(clientOptionsWithUserAgent)
    }

    private val mobileNetworkOperators: MobileNetworkOperatorService by lazy {
        MobileNetworkOperatorServiceImpl(clientOptionsWithUserAgent)
    }

    private val mobilePushCredentials: MobilePushCredentialService by lazy {
        MobilePushCredentialServiceImpl(clientOptionsWithUserAgent)
    }

    private val networkCoverage: NetworkCoverageService by lazy {
        NetworkCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val networks: NetworkService by lazy { NetworkServiceImpl(clientOptionsWithUserAgent) }

    private val notificationChannels: NotificationChannelService by lazy {
        NotificationChannelServiceImpl(clientOptionsWithUserAgent)
    }

    private val notificationEventConditions: NotificationEventConditionService by lazy {
        NotificationEventConditionServiceImpl(clientOptionsWithUserAgent)
    }

    private val notificationEvents: NotificationEventService by lazy {
        NotificationEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val notificationProfiles: NotificationProfileService by lazy {
        NotificationProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val notificationSettings: NotificationSettingService by lazy {
        NotificationSettingServiceImpl(clientOptionsWithUserAgent)
    }

    private val numberBlockOrders: NumberBlockOrderService by lazy {
        NumberBlockOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val numberLookup: NumberLookupService by lazy {
        NumberLookupServiceImpl(clientOptionsWithUserAgent)
    }

    private val numberOrderPhoneNumbers: NumberOrderPhoneNumberService by lazy {
        NumberOrderPhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val numberOrders: NumberOrderService by lazy {
        NumberOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val numberReservations: NumberReservationService by lazy {
        NumberReservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val numbersFeatures: NumbersFeatureService by lazy {
        NumbersFeatureServiceImpl(clientOptionsWithUserAgent)
    }

    private val operatorConnect: OperatorConnectService by lazy {
        OperatorConnectServiceImpl(clientOptionsWithUserAgent)
    }

    private val otaUpdates: OtaUpdateService by lazy {
        OtaUpdateServiceImpl(clientOptionsWithUserAgent)
    }

    private val outboundVoiceProfiles: OutboundVoiceProfileService by lazy {
        OutboundVoiceProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val payment: PaymentService by lazy { PaymentServiceImpl(clientOptionsWithUserAgent) }

    private val phoneNumberAssignmentByProfile: PhoneNumberAssignmentByProfileService by lazy {
        PhoneNumberAssignmentByProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumberBlocks: PhoneNumberBlockService by lazy {
        PhoneNumberBlockServiceImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumberCampaigns: PhoneNumberCampaignService by lazy {
        PhoneNumberCampaignServiceImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbers: PhoneNumberService by lazy {
        PhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbersRegulatoryRequirements:
        PhoneNumbersRegulatoryRequirementService by lazy {
        PhoneNumbersRegulatoryRequirementServiceImpl(clientOptionsWithUserAgent)
    }

    private val portabilityChecks: PortabilityCheckService by lazy {
        PortabilityCheckServiceImpl(clientOptionsWithUserAgent)
    }

    private val porting: PortingService by lazy { PortingServiceImpl(clientOptionsWithUserAgent) }

    private val portingOrders: PortingOrderService by lazy {
        PortingOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val portingPhoneNumbers: PortingPhoneNumberService by lazy {
        PortingPhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val portouts: PortoutService by lazy { PortoutServiceImpl(clientOptionsWithUserAgent) }

    private val privateWirelessGateways: PrivateWirelessGatewayService by lazy {
        PrivateWirelessGatewayServiceImpl(clientOptionsWithUserAgent)
    }

    private val publicInternetGateways: PublicInternetGatewayService by lazy {
        PublicInternetGatewayServiceImpl(clientOptionsWithUserAgent)
    }

    private val queues: QueueService by lazy { QueueServiceImpl(clientOptionsWithUserAgent) }

    private val rcsAgents: RcsAgentService by lazy {
        RcsAgentServiceImpl(clientOptionsWithUserAgent)
    }

    private val recordingTranscriptions: RecordingTranscriptionService by lazy {
        RecordingTranscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val recordings: RecordingService by lazy {
        RecordingServiceImpl(clientOptionsWithUserAgent)
    }

    private val regions: RegionService by lazy { RegionServiceImpl(clientOptionsWithUserAgent) }

    private val regulatoryRequirements: RegulatoryRequirementService by lazy {
        RegulatoryRequirementServiceImpl(clientOptionsWithUserAgent)
    }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptionsWithUserAgent) }

    private val requirementGroups: RequirementGroupService by lazy {
        RequirementGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val requirementTypes: RequirementTypeService by lazy {
        RequirementTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val requirements: RequirementService by lazy {
        RequirementServiceImpl(clientOptionsWithUserAgent)
    }

    private val roomCompositions: RoomCompositionService by lazy {
        RoomCompositionServiceImpl(clientOptionsWithUserAgent)
    }

    private val roomParticipants: RoomParticipantService by lazy {
        RoomParticipantServiceImpl(clientOptionsWithUserAgent)
    }

    private val roomRecordings: RoomRecordingService by lazy {
        RoomRecordingServiceImpl(clientOptionsWithUserAgent)
    }

    private val rooms: RoomService by lazy { RoomServiceImpl(clientOptionsWithUserAgent) }

    private val seti: SetiService by lazy { SetiServiceImpl(clientOptionsWithUserAgent) }

    private val shortCodes: ShortCodeService by lazy {
        ShortCodeServiceImpl(clientOptionsWithUserAgent)
    }

    private val simCardDataUsageNotifications: SimCardDataUsageNotificationService by lazy {
        SimCardDataUsageNotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val simCardGroups: SimCardGroupService by lazy {
        SimCardGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val simCardOrderPreview: SimCardOrderPreviewService by lazy {
        SimCardOrderPreviewServiceImpl(clientOptionsWithUserAgent)
    }

    private val simCardOrders: SimCardOrderService by lazy {
        SimCardOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val simCards: SimCardService by lazy { SimCardServiceImpl(clientOptionsWithUserAgent) }

    private val siprecConnectors: SiprecConnectorService by lazy {
        SiprecConnectorServiceImpl(clientOptionsWithUserAgent)
    }

    private val storage: StorageService by lazy { StorageServiceImpl(clientOptionsWithUserAgent) }

    private val subNumberOrders: SubNumberOrderService by lazy {
        SubNumberOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val subNumberOrdersReport: SubNumberOrdersReportService by lazy {
        SubNumberOrdersReportServiceImpl(clientOptionsWithUserAgent)
    }

    private val telephonyCredentials: TelephonyCredentialService by lazy {
        TelephonyCredentialServiceImpl(clientOptionsWithUserAgent)
    }

    private val texml: TexmlService by lazy { TexmlServiceImpl(clientOptionsWithUserAgent) }

    private val texmlApplications: TexmlApplicationService by lazy {
        TexmlApplicationServiceImpl(clientOptionsWithUserAgent)
    }

    private val textToSpeech: TextToSpeechService by lazy {
        TextToSpeechServiceImpl(clientOptionsWithUserAgent)
    }

    private val usageReports: UsageReportService by lazy {
        UsageReportServiceImpl(clientOptionsWithUserAgent)
    }

    private val userAddresses: UserAddressService by lazy {
        UserAddressServiceImpl(clientOptionsWithUserAgent)
    }

    private val userTags: UserTagService by lazy { UserTagServiceImpl(clientOptionsWithUserAgent) }

    private val verifications: VerificationService by lazy {
        VerificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val verifiedNumbers: VerifiedNumberService by lazy {
        VerifiedNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val verifyProfiles: VerifyProfileService by lazy {
        VerifyProfileServiceImpl(clientOptionsWithUserAgent)
    }

    private val virtualCrossConnects: VirtualCrossConnectService by lazy {
        VirtualCrossConnectServiceImpl(clientOptionsWithUserAgent)
    }

    private val virtualCrossConnectsCoverage: VirtualCrossConnectsCoverageService by lazy {
        VirtualCrossConnectsCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhookDeliveries: WebhookDeliveryService by lazy {
        WebhookDeliveryServiceImpl(clientOptionsWithUserAgent)
    }

    private val wireguardInterfaces: WireguardInterfaceService by lazy {
        WireguardInterfaceServiceImpl(clientOptionsWithUserAgent)
    }

    private val wireguardPeers: WireguardPeerService by lazy {
        WireguardPeerServiceImpl(clientOptionsWithUserAgent)
    }

    private val wireless: WirelessService by lazy {
        WirelessServiceImpl(clientOptionsWithUserAgent)
    }

    private val wirelessBlocklistValues: WirelessBlocklistValueService by lazy {
        WirelessBlocklistValueServiceImpl(clientOptionsWithUserAgent)
    }

    private val wirelessBlocklists: WirelessBlocklistService by lazy {
        WirelessBlocklistServiceImpl(clientOptionsWithUserAgent)
    }

    private val partnerCampaigns: PartnerCampaignService by lazy {
        PartnerCampaignServiceImpl(clientOptionsWithUserAgent)
    }

    private val wellKnown: WellKnownService by lazy {
        WellKnownServiceImpl(clientOptionsWithUserAgent)
    }

    private val inexplicitNumberOrders: InexplicitNumberOrderService by lazy {
        InexplicitNumberOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val mobilePhoneNumbers: MobilePhoneNumberService by lazy {
        MobilePhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val mobileVoiceConnections: MobileVoiceConnectionService by lazy {
        MobileVoiceConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): TelnyxClientAsync = async

    override fun withRawResponse(): TelnyxClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxClient =
        TelnyxClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun legacy(): LegacyService = legacy

    override fun oauth(): OAuthService = oauth

    override fun oauthClients(): OAuthClientService = oauthClients

    override fun oauthGrants(): OAuthGrantService = oauthGrants

    override fun webhooks(): WebhookService = webhooks

    override fun accessIpAddress(): AccessIpAddressService = accessIpAddress

    override fun accessIpRanges(): AccessIpRangeService = accessIpRanges

    override fun actions(): ActionService = actions

    override fun addresses(): AddressService = addresses

    override fun advancedOrders(): AdvancedOrderService = advancedOrders

    override fun ai(): AiService = ai

    override fun auditEvents(): AuditEventService = auditEvents

    override fun authenticationProviders(): AuthenticationProviderService = authenticationProviders

    override fun availablePhoneNumberBlocks(): AvailablePhoneNumberBlockService =
        availablePhoneNumberBlocks

    override fun availablePhoneNumbers(): AvailablePhoneNumberService = availablePhoneNumbers

    override fun balance(): BalanceService = balance

    override fun billingGroups(): BillingGroupService = billingGroups

    override fun brand(): BrandService = brand

    override fun bulkSimCardActions(): BulkSimCardActionService = bulkSimCardActions

    override fun bundlePricing(): BundlePricingService = bundlePricing

    override fun callControlApplications(): CallControlApplicationService = callControlApplications

    override fun callEvents(): CallEventService = callEvents

    override fun calls(): CallService = calls

    override fun campaign(): CampaignService = campaign

    override fun campaignBuilder(): CampaignBuilderService = campaignBuilder

    override fun channelZones(): ChannelZoneService = channelZones

    override fun chargesBreakdown(): ChargesBreakdownService = chargesBreakdown

    override fun chargesSummary(): ChargesSummaryService = chargesSummary

    override fun comments(): CommentService = comments

    override fun conferences(): ConferenceService = conferences

    override fun connections(): ConnectionService = connections

    override fun countryCoverage(): CountryCoverageService = countryCoverage

    override fun credentialConnections(): CredentialConnectionService = credentialConnections

    override fun customStorageCredentials(): CustomStorageCredentialService =
        customStorageCredentials

    override fun customerServiceRecords(): CustomerServiceRecordService = customerServiceRecords

    override fun detailRecords(): DetailRecordService = detailRecords

    override fun dialogflowConnections(): DialogflowConnectionService = dialogflowConnections

    override fun documentLinks(): DocumentLinkService = documentLinks

    override fun documents(): DocumentService = documents

    override fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService =
        dynamicEmergencyAddresses

    override fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService =
        dynamicEmergencyEndpoints

    override fun enumeration(): EnumerationService = enumeration

    override fun externalConnections(): ExternalConnectionService = externalConnections

    override fun faxApplications(): FaxApplicationService = faxApplications

    override fun faxes(): FaxService = faxes

    override fun fqdnConnections(): FqdnConnectionService = fqdnConnections

    override fun fqdns(): FqdnService = fqdns

    override fun globalIpAllowedPorts(): GlobalIpAllowedPortService = globalIpAllowedPorts

    override fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService =
        globalIpAssignmentHealth

    override fun globalIpAssignments(): GlobalIpAssignmentService = globalIpAssignments

    override fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService =
        globalIpAssignmentsUsage

    override fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService =
        globalIpHealthCheckTypes

    override fun globalIpHealthChecks(): GlobalIpHealthCheckService = globalIpHealthChecks

    override fun globalIpLatency(): GlobalIpLatencyService = globalIpLatency

    override fun globalIpProtocols(): GlobalIpProtocolService = globalIpProtocols

    override fun globalIpUsage(): GlobalIpUsageService = globalIpUsage

    override fun globalIps(): GlobalIpService = globalIps

    override fun inboundChannels(): InboundChannelService = inboundChannels

    override fun integrationSecrets(): IntegrationSecretService = integrationSecrets

    override fun inventoryCoverage(): InventoryCoverageService = inventoryCoverage

    override fun invoices(): InvoiceService = invoices

    override fun ipConnections(): IpConnectionService = ipConnections

    override fun ips(): IpService = ips

    override fun ledgerBillingGroupReports(): LedgerBillingGroupReportService =
        ledgerBillingGroupReports

    override fun list(): ListService = list

    override fun managedAccounts(): ManagedAccountService = managedAccounts

    override fun media(): MediaService = media

    override fun messages(): MessageService = messages

    override fun messaging(): MessagingService = messaging

    override fun messagingHostedNumberOrders(): MessagingHostedNumberOrderService =
        messagingHostedNumberOrders

    override fun messagingHostedNumbers(): MessagingHostedNumberService = messagingHostedNumbers

    override fun messagingNumbersBulkUpdates(): MessagingNumbersBulkUpdateService =
        messagingNumbersBulkUpdates

    override fun messagingOptouts(): MessagingOptoutService = messagingOptouts

    override fun messagingProfiles(): MessagingProfileService = messagingProfiles

    override fun messagingTollfree(): MessagingTollfreeService = messagingTollfree

    override fun messagingUrlDomains(): MessagingUrlDomainService = messagingUrlDomains

    override fun messsages(): MesssageService = messsages

    override fun mobileNetworkOperators(): MobileNetworkOperatorService = mobileNetworkOperators

    override fun mobilePushCredentials(): MobilePushCredentialService = mobilePushCredentials

    override fun networkCoverage(): NetworkCoverageService = networkCoverage

    override fun networks(): NetworkService = networks

    override fun notificationChannels(): NotificationChannelService = notificationChannels

    override fun notificationEventConditions(): NotificationEventConditionService =
        notificationEventConditions

    override fun notificationEvents(): NotificationEventService = notificationEvents

    override fun notificationProfiles(): NotificationProfileService = notificationProfiles

    override fun notificationSettings(): NotificationSettingService = notificationSettings

    override fun numberBlockOrders(): NumberBlockOrderService = numberBlockOrders

    override fun numberLookup(): NumberLookupService = numberLookup

    override fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService = numberOrderPhoneNumbers

    override fun numberOrders(): NumberOrderService = numberOrders

    override fun numberReservations(): NumberReservationService = numberReservations

    override fun numbersFeatures(): NumbersFeatureService = numbersFeatures

    override fun operatorConnect(): OperatorConnectService = operatorConnect

    override fun otaUpdates(): OtaUpdateService = otaUpdates

    override fun outboundVoiceProfiles(): OutboundVoiceProfileService = outboundVoiceProfiles

    override fun payment(): PaymentService = payment

    override fun phoneNumberAssignmentByProfile(): PhoneNumberAssignmentByProfileService =
        phoneNumberAssignmentByProfile

    override fun phoneNumberBlocks(): PhoneNumberBlockService = phoneNumberBlocks

    override fun phoneNumberCampaigns(): PhoneNumberCampaignService = phoneNumberCampaigns

    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    override fun phoneNumbersRegulatoryRequirements(): PhoneNumbersRegulatoryRequirementService =
        phoneNumbersRegulatoryRequirements

    override fun portabilityChecks(): PortabilityCheckService = portabilityChecks

    override fun porting(): PortingService = porting

    override fun portingOrders(): PortingOrderService = portingOrders

    override fun portingPhoneNumbers(): PortingPhoneNumberService = portingPhoneNumbers

    override fun portouts(): PortoutService = portouts

    override fun privateWirelessGateways(): PrivateWirelessGatewayService = privateWirelessGateways

    override fun publicInternetGateways(): PublicInternetGatewayService = publicInternetGateways

    override fun queues(): QueueService = queues

    override fun rcsAgents(): RcsAgentService = rcsAgents

    override fun recordingTranscriptions(): RecordingTranscriptionService = recordingTranscriptions

    override fun recordings(): RecordingService = recordings

    override fun regions(): RegionService = regions

    override fun regulatoryRequirements(): RegulatoryRequirementService = regulatoryRequirements

    override fun reports(): ReportService = reports

    override fun requirementGroups(): RequirementGroupService = requirementGroups

    override fun requirementTypes(): RequirementTypeService = requirementTypes

    override fun requirements(): RequirementService = requirements

    override fun roomCompositions(): RoomCompositionService = roomCompositions

    override fun roomParticipants(): RoomParticipantService = roomParticipants

    override fun roomRecordings(): RoomRecordingService = roomRecordings

    override fun rooms(): RoomService = rooms

    override fun seti(): SetiService = seti

    override fun shortCodes(): ShortCodeService = shortCodes

    override fun simCardDataUsageNotifications(): SimCardDataUsageNotificationService =
        simCardDataUsageNotifications

    override fun simCardGroups(): SimCardGroupService = simCardGroups

    override fun simCardOrderPreview(): SimCardOrderPreviewService = simCardOrderPreview

    override fun simCardOrders(): SimCardOrderService = simCardOrders

    override fun simCards(): SimCardService = simCards

    override fun siprecConnectors(): SiprecConnectorService = siprecConnectors

    override fun storage(): StorageService = storage

    override fun subNumberOrders(): SubNumberOrderService = subNumberOrders

    override fun subNumberOrdersReport(): SubNumberOrdersReportService = subNumberOrdersReport

    override fun telephonyCredentials(): TelephonyCredentialService = telephonyCredentials

    override fun texml(): TexmlService = texml

    override fun texmlApplications(): TexmlApplicationService = texmlApplications

    override fun textToSpeech(): TextToSpeechService = textToSpeech

    override fun usageReports(): UsageReportService = usageReports

    override fun userAddresses(): UserAddressService = userAddresses

    override fun userTags(): UserTagService = userTags

    override fun verifications(): VerificationService = verifications

    override fun verifiedNumbers(): VerifiedNumberService = verifiedNumbers

    override fun verifyProfiles(): VerifyProfileService = verifyProfiles

    override fun virtualCrossConnects(): VirtualCrossConnectService = virtualCrossConnects

    override fun virtualCrossConnectsCoverage(): VirtualCrossConnectsCoverageService =
        virtualCrossConnectsCoverage

    override fun webhookDeliveries(): WebhookDeliveryService = webhookDeliveries

    override fun wireguardInterfaces(): WireguardInterfaceService = wireguardInterfaces

    override fun wireguardPeers(): WireguardPeerService = wireguardPeers

    override fun wireless(): WirelessService = wireless

    override fun wirelessBlocklistValues(): WirelessBlocklistValueService = wirelessBlocklistValues

    override fun wirelessBlocklists(): WirelessBlocklistService = wirelessBlocklists

    override fun partnerCampaigns(): PartnerCampaignService = partnerCampaigns

    override fun wellKnown(): WellKnownService = wellKnown

    override fun inexplicitNumberOrders(): InexplicitNumberOrderService = inexplicitNumberOrders

    override fun mobilePhoneNumbers(): MobilePhoneNumberService = mobilePhoneNumbers

    override fun mobileVoiceConnections(): MobileVoiceConnectionService = mobileVoiceConnections

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelnyxClient.WithRawResponse {

        private val legacy: LegacyService.WithRawResponse by lazy {
            LegacyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauth: OAuthService.WithRawResponse by lazy {
            OAuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthClients: OAuthClientService.WithRawResponse by lazy {
            OAuthClientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val oauthGrants: OAuthGrantService.WithRawResponse by lazy {
            OAuthGrantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accessIpAddress: AccessIpAddressService.WithRawResponse by lazy {
            AccessIpAddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accessIpRanges: AccessIpRangeService.WithRawResponse by lazy {
            AccessIpRangeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val addresses: AddressService.WithRawResponse by lazy {
            AddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val advancedOrders: AdvancedOrderService.WithRawResponse by lazy {
            AdvancedOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiService.WithRawResponse by lazy {
            AiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val auditEvents: AuditEventService.WithRawResponse by lazy {
            AuditEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val authenticationProviders: AuthenticationProviderService.WithRawResponse by lazy {
            AuthenticationProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val availablePhoneNumberBlocks:
            AvailablePhoneNumberBlockService.WithRawResponse by lazy {
            AvailablePhoneNumberBlockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val availablePhoneNumbers: AvailablePhoneNumberService.WithRawResponse by lazy {
            AvailablePhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billingGroups: BillingGroupService.WithRawResponse by lazy {
            BillingGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val brand: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bulkSimCardActions: BulkSimCardActionService.WithRawResponse by lazy {
            BulkSimCardActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bundlePricing: BundlePricingService.WithRawResponse by lazy {
            BundlePricingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val callControlApplications: CallControlApplicationService.WithRawResponse by lazy {
            CallControlApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val callEvents: CallEventService.WithRawResponse by lazy {
            CallEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaign: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaignBuilder: CampaignBuilderService.WithRawResponse by lazy {
            CampaignBuilderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val channelZones: ChannelZoneService.WithRawResponse by lazy {
            ChannelZoneServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chargesBreakdown: ChargesBreakdownService.WithRawResponse by lazy {
            ChargesBreakdownServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chargesSummary: ChargesSummaryService.WithRawResponse by lazy {
            ChargesSummaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conferences: ConferenceService.WithRawResponse by lazy {
            ConferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val connections: ConnectionService.WithRawResponse by lazy {
            ConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val countryCoverage: CountryCoverageService.WithRawResponse by lazy {
            CountryCoverageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val credentialConnections: CredentialConnectionService.WithRawResponse by lazy {
            CredentialConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customStorageCredentials:
            CustomStorageCredentialService.WithRawResponse by lazy {
            CustomStorageCredentialServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customerServiceRecords: CustomerServiceRecordService.WithRawResponse by lazy {
            CustomerServiceRecordServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val detailRecords: DetailRecordService.WithRawResponse by lazy {
            DetailRecordServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dialogflowConnections: DialogflowConnectionService.WithRawResponse by lazy {
            DialogflowConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documentLinks: DocumentLinkService.WithRawResponse by lazy {
            DocumentLinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dynamicEmergencyAddresses:
            DynamicEmergencyAddressService.WithRawResponse by lazy {
            DynamicEmergencyAddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dynamicEmergencyEndpoints:
            DynamicEmergencyEndpointService.WithRawResponse by lazy {
            DynamicEmergencyEndpointServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val enumeration: EnumerationService.WithRawResponse by lazy {
            EnumerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalConnections: ExternalConnectionService.WithRawResponse by lazy {
            ExternalConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val faxApplications: FaxApplicationService.WithRawResponse by lazy {
            FaxApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val faxes: FaxService.WithRawResponse by lazy {
            FaxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fqdnConnections: FqdnConnectionService.WithRawResponse by lazy {
            FqdnConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fqdns: FqdnService.WithRawResponse by lazy {
            FqdnServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAllowedPorts: GlobalIpAllowedPortService.WithRawResponse by lazy {
            GlobalIpAllowedPortServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignmentHealth:
            GlobalIpAssignmentHealthService.WithRawResponse by lazy {
            GlobalIpAssignmentHealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignments: GlobalIpAssignmentService.WithRawResponse by lazy {
            GlobalIpAssignmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpAssignmentsUsage:
            GlobalIpAssignmentsUsageService.WithRawResponse by lazy {
            GlobalIpAssignmentsUsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpHealthCheckTypes:
            GlobalIpHealthCheckTypeService.WithRawResponse by lazy {
            GlobalIpHealthCheckTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpHealthChecks: GlobalIpHealthCheckService.WithRawResponse by lazy {
            GlobalIpHealthCheckServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpLatency: GlobalIpLatencyService.WithRawResponse by lazy {
            GlobalIpLatencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpProtocols: GlobalIpProtocolService.WithRawResponse by lazy {
            GlobalIpProtocolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIpUsage: GlobalIpUsageService.WithRawResponse by lazy {
            GlobalIpUsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalIps: GlobalIpService.WithRawResponse by lazy {
            GlobalIpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboundChannels: InboundChannelService.WithRawResponse by lazy {
            InboundChannelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrationSecrets: IntegrationSecretService.WithRawResponse by lazy {
            IntegrationSecretServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inventoryCoverage: InventoryCoverageService.WithRawResponse by lazy {
            InventoryCoverageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ipConnections: IpConnectionService.WithRawResponse by lazy {
            IpConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ips: IpService.WithRawResponse by lazy {
            IpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ledgerBillingGroupReports:
            LedgerBillingGroupReportService.WithRawResponse by lazy {
            LedgerBillingGroupReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val list: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val managedAccounts: ManagedAccountService.WithRawResponse by lazy {
            ManagedAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaService.WithRawResponse by lazy {
            MediaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messaging: MessagingService.WithRawResponse by lazy {
            MessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingHostedNumberOrders:
            MessagingHostedNumberOrderService.WithRawResponse by lazy {
            MessagingHostedNumberOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingHostedNumbers: MessagingHostedNumberService.WithRawResponse by lazy {
            MessagingHostedNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingNumbersBulkUpdates:
            MessagingNumbersBulkUpdateService.WithRawResponse by lazy {
            MessagingNumbersBulkUpdateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingOptouts: MessagingOptoutService.WithRawResponse by lazy {
            MessagingOptoutServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingProfiles: MessagingProfileService.WithRawResponse by lazy {
            MessagingProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingTollfree: MessagingTollfreeService.WithRawResponse by lazy {
            MessagingTollfreeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messagingUrlDomains: MessagingUrlDomainService.WithRawResponse by lazy {
            MessagingUrlDomainServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messsages: MesssageService.WithRawResponse by lazy {
            MesssageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobileNetworkOperators: MobileNetworkOperatorService.WithRawResponse by lazy {
            MobileNetworkOperatorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobilePushCredentials: MobilePushCredentialService.WithRawResponse by lazy {
            MobilePushCredentialServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val networkCoverage: NetworkCoverageService.WithRawResponse by lazy {
            NetworkCoverageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val networks: NetworkService.WithRawResponse by lazy {
            NetworkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationChannels: NotificationChannelService.WithRawResponse by lazy {
            NotificationChannelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationEventConditions:
            NotificationEventConditionService.WithRawResponse by lazy {
            NotificationEventConditionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationEvents: NotificationEventService.WithRawResponse by lazy {
            NotificationEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationProfiles: NotificationProfileService.WithRawResponse by lazy {
            NotificationProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationSettings: NotificationSettingService.WithRawResponse by lazy {
            NotificationSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberBlockOrders: NumberBlockOrderService.WithRawResponse by lazy {
            NumberBlockOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberLookup: NumberLookupService.WithRawResponse by lazy {
            NumberLookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberOrderPhoneNumbers: NumberOrderPhoneNumberService.WithRawResponse by lazy {
            NumberOrderPhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberOrders: NumberOrderService.WithRawResponse by lazy {
            NumberOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberReservations: NumberReservationService.WithRawResponse by lazy {
            NumberReservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numbersFeatures: NumbersFeatureService.WithRawResponse by lazy {
            NumbersFeatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatorConnect: OperatorConnectService.WithRawResponse by lazy {
            OperatorConnectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val otaUpdates: OtaUpdateService.WithRawResponse by lazy {
            OtaUpdateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val outboundVoiceProfiles: OutboundVoiceProfileService.WithRawResponse by lazy {
            OutboundVoiceProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payment: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberAssignmentByProfile:
            PhoneNumberAssignmentByProfileService.WithRawResponse by lazy {
            PhoneNumberAssignmentByProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBlocks: PhoneNumberBlockService.WithRawResponse by lazy {
            PhoneNumberBlockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberCampaigns: PhoneNumberCampaignService.WithRawResponse by lazy {
            PhoneNumberCampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbersRegulatoryRequirements:
            PhoneNumbersRegulatoryRequirementService.WithRawResponse by lazy {
            PhoneNumbersRegulatoryRequirementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portabilityChecks: PortabilityCheckService.WithRawResponse by lazy {
            PortabilityCheckServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val porting: PortingService.WithRawResponse by lazy {
            PortingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portingOrders: PortingOrderService.WithRawResponse by lazy {
            PortingOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portingPhoneNumbers: PortingPhoneNumberService.WithRawResponse by lazy {
            PortingPhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portouts: PortoutService.WithRawResponse by lazy {
            PortoutServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val privateWirelessGateways: PrivateWirelessGatewayService.WithRawResponse by lazy {
            PrivateWirelessGatewayServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val publicInternetGateways: PublicInternetGatewayService.WithRawResponse by lazy {
            PublicInternetGatewayServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val queues: QueueService.WithRawResponse by lazy {
            QueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rcsAgents: RcsAgentService.WithRawResponse by lazy {
            RcsAgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordingTranscriptions: RecordingTranscriptionService.WithRawResponse by lazy {
            RecordingTranscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingService.WithRawResponse by lazy {
            RecordingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val regions: RegionService.WithRawResponse by lazy {
            RegionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val regulatoryRequirements: RegulatoryRequirementService.WithRawResponse by lazy {
            RegulatoryRequirementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirementGroups: RequirementGroupService.WithRawResponse by lazy {
            RequirementGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirementTypes: RequirementTypeService.WithRawResponse by lazy {
            RequirementTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val requirements: RequirementService.WithRawResponse by lazy {
            RequirementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomCompositions: RoomCompositionService.WithRawResponse by lazy {
            RoomCompositionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomParticipants: RoomParticipantService.WithRawResponse by lazy {
            RoomParticipantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val roomRecordings: RoomRecordingService.WithRawResponse by lazy {
            RoomRecordingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rooms: RoomService.WithRawResponse by lazy {
            RoomServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seti: SetiService.WithRawResponse by lazy {
            SetiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shortCodes: ShortCodeService.WithRawResponse by lazy {
            ShortCodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardDataUsageNotifications:
            SimCardDataUsageNotificationService.WithRawResponse by lazy {
            SimCardDataUsageNotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardGroups: SimCardGroupService.WithRawResponse by lazy {
            SimCardGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardOrderPreview: SimCardOrderPreviewService.WithRawResponse by lazy {
            SimCardOrderPreviewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCardOrders: SimCardOrderService.WithRawResponse by lazy {
            SimCardOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val simCards: SimCardService.WithRawResponse by lazy {
            SimCardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val siprecConnectors: SiprecConnectorService.WithRawResponse by lazy {
            SiprecConnectorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val storage: StorageService.WithRawResponse by lazy {
            StorageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subNumberOrders: SubNumberOrderService.WithRawResponse by lazy {
            SubNumberOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subNumberOrdersReport: SubNumberOrdersReportService.WithRawResponse by lazy {
            SubNumberOrdersReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val telephonyCredentials: TelephonyCredentialService.WithRawResponse by lazy {
            TelephonyCredentialServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val texml: TexmlService.WithRawResponse by lazy {
            TexmlServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val texmlApplications: TexmlApplicationService.WithRawResponse by lazy {
            TexmlApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val textToSpeech: TextToSpeechService.WithRawResponse by lazy {
            TextToSpeechServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageReports: UsageReportService.WithRawResponse by lazy {
            UsageReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val userAddresses: UserAddressService.WithRawResponse by lazy {
            UserAddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val userTags: UserTagService.WithRawResponse by lazy {
            UserTagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifications: VerificationService.WithRawResponse by lazy {
            VerificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifiedNumbers: VerifiedNumberService.WithRawResponse by lazy {
            VerifiedNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val verifyProfiles: VerifyProfileService.WithRawResponse by lazy {
            VerifyProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val virtualCrossConnects: VirtualCrossConnectService.WithRawResponse by lazy {
            VirtualCrossConnectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val virtualCrossConnectsCoverage:
            VirtualCrossConnectsCoverageService.WithRawResponse by lazy {
            VirtualCrossConnectsCoverageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhookDeliveries: WebhookDeliveryService.WithRawResponse by lazy {
            WebhookDeliveryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireguardInterfaces: WireguardInterfaceService.WithRawResponse by lazy {
            WireguardInterfaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireguardPeers: WireguardPeerService.WithRawResponse by lazy {
            WireguardPeerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wireless: WirelessService.WithRawResponse by lazy {
            WirelessServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wirelessBlocklistValues: WirelessBlocklistValueService.WithRawResponse by lazy {
            WirelessBlocklistValueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wirelessBlocklists: WirelessBlocklistService.WithRawResponse by lazy {
            WirelessBlocklistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerCampaigns: PartnerCampaignService.WithRawResponse by lazy {
            PartnerCampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val wellKnown: WellKnownService.WithRawResponse by lazy {
            WellKnownServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inexplicitNumberOrders: InexplicitNumberOrderService.WithRawResponse by lazy {
            InexplicitNumberOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobilePhoneNumbers: MobilePhoneNumberService.WithRawResponse by lazy {
            MobilePhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mobileVoiceConnections: MobileVoiceConnectionService.WithRawResponse by lazy {
            MobileVoiceConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxClient.WithRawResponse =
            TelnyxClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun legacy(): LegacyService.WithRawResponse = legacy

        override fun oauth(): OAuthService.WithRawResponse = oauth

        override fun oauthClients(): OAuthClientService.WithRawResponse = oauthClients

        override fun oauthGrants(): OAuthGrantService.WithRawResponse = oauthGrants

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun accessIpAddress(): AccessIpAddressService.WithRawResponse = accessIpAddress

        override fun accessIpRanges(): AccessIpRangeService.WithRawResponse = accessIpRanges

        override fun actions(): ActionService.WithRawResponse = actions

        override fun addresses(): AddressService.WithRawResponse = addresses

        override fun advancedOrders(): AdvancedOrderService.WithRawResponse = advancedOrders

        override fun ai(): AiService.WithRawResponse = ai

        override fun auditEvents(): AuditEventService.WithRawResponse = auditEvents

        override fun authenticationProviders(): AuthenticationProviderService.WithRawResponse =
            authenticationProviders

        override fun availablePhoneNumberBlocks():
            AvailablePhoneNumberBlockService.WithRawResponse = availablePhoneNumberBlocks

        override fun availablePhoneNumbers(): AvailablePhoneNumberService.WithRawResponse =
            availablePhoneNumbers

        override fun balance(): BalanceService.WithRawResponse = balance

        override fun billingGroups(): BillingGroupService.WithRawResponse = billingGroups

        override fun brand(): BrandService.WithRawResponse = brand

        override fun bulkSimCardActions(): BulkSimCardActionService.WithRawResponse =
            bulkSimCardActions

        override fun bundlePricing(): BundlePricingService.WithRawResponse = bundlePricing

        override fun callControlApplications(): CallControlApplicationService.WithRawResponse =
            callControlApplications

        override fun callEvents(): CallEventService.WithRawResponse = callEvents

        override fun calls(): CallService.WithRawResponse = calls

        override fun campaign(): CampaignService.WithRawResponse = campaign

        override fun campaignBuilder(): CampaignBuilderService.WithRawResponse = campaignBuilder

        override fun channelZones(): ChannelZoneService.WithRawResponse = channelZones

        override fun chargesBreakdown(): ChargesBreakdownService.WithRawResponse = chargesBreakdown

        override fun chargesSummary(): ChargesSummaryService.WithRawResponse = chargesSummary

        override fun comments(): CommentService.WithRawResponse = comments

        override fun conferences(): ConferenceService.WithRawResponse = conferences

        override fun connections(): ConnectionService.WithRawResponse = connections

        override fun countryCoverage(): CountryCoverageService.WithRawResponse = countryCoverage

        override fun credentialConnections(): CredentialConnectionService.WithRawResponse =
            credentialConnections

        override fun customStorageCredentials(): CustomStorageCredentialService.WithRawResponse =
            customStorageCredentials

        override fun customerServiceRecords(): CustomerServiceRecordService.WithRawResponse =
            customerServiceRecords

        override fun detailRecords(): DetailRecordService.WithRawResponse = detailRecords

        override fun dialogflowConnections(): DialogflowConnectionService.WithRawResponse =
            dialogflowConnections

        override fun documentLinks(): DocumentLinkService.WithRawResponse = documentLinks

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun dynamicEmergencyAddresses(): DynamicEmergencyAddressService.WithRawResponse =
            dynamicEmergencyAddresses

        override fun dynamicEmergencyEndpoints(): DynamicEmergencyEndpointService.WithRawResponse =
            dynamicEmergencyEndpoints

        override fun enumeration(): EnumerationService.WithRawResponse = enumeration

        override fun externalConnections(): ExternalConnectionService.WithRawResponse =
            externalConnections

        override fun faxApplications(): FaxApplicationService.WithRawResponse = faxApplications

        override fun faxes(): FaxService.WithRawResponse = faxes

        override fun fqdnConnections(): FqdnConnectionService.WithRawResponse = fqdnConnections

        override fun fqdns(): FqdnService.WithRawResponse = fqdns

        override fun globalIpAllowedPorts(): GlobalIpAllowedPortService.WithRawResponse =
            globalIpAllowedPorts

        override fun globalIpAssignmentHealth(): GlobalIpAssignmentHealthService.WithRawResponse =
            globalIpAssignmentHealth

        override fun globalIpAssignments(): GlobalIpAssignmentService.WithRawResponse =
            globalIpAssignments

        override fun globalIpAssignmentsUsage(): GlobalIpAssignmentsUsageService.WithRawResponse =
            globalIpAssignmentsUsage

        override fun globalIpHealthCheckTypes(): GlobalIpHealthCheckTypeService.WithRawResponse =
            globalIpHealthCheckTypes

        override fun globalIpHealthChecks(): GlobalIpHealthCheckService.WithRawResponse =
            globalIpHealthChecks

        override fun globalIpLatency(): GlobalIpLatencyService.WithRawResponse = globalIpLatency

        override fun globalIpProtocols(): GlobalIpProtocolService.WithRawResponse =
            globalIpProtocols

        override fun globalIpUsage(): GlobalIpUsageService.WithRawResponse = globalIpUsage

        override fun globalIps(): GlobalIpService.WithRawResponse = globalIps

        override fun inboundChannels(): InboundChannelService.WithRawResponse = inboundChannels

        override fun integrationSecrets(): IntegrationSecretService.WithRawResponse =
            integrationSecrets

        override fun inventoryCoverage(): InventoryCoverageService.WithRawResponse =
            inventoryCoverage

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun ipConnections(): IpConnectionService.WithRawResponse = ipConnections

        override fun ips(): IpService.WithRawResponse = ips

        override fun ledgerBillingGroupReports(): LedgerBillingGroupReportService.WithRawResponse =
            ledgerBillingGroupReports

        override fun list(): ListService.WithRawResponse = list

        override fun managedAccounts(): ManagedAccountService.WithRawResponse = managedAccounts

        override fun media(): MediaService.WithRawResponse = media

        override fun messages(): MessageService.WithRawResponse = messages

        override fun messaging(): MessagingService.WithRawResponse = messaging

        override fun messagingHostedNumberOrders():
            MessagingHostedNumberOrderService.WithRawResponse = messagingHostedNumberOrders

        override fun messagingHostedNumbers(): MessagingHostedNumberService.WithRawResponse =
            messagingHostedNumbers

        override fun messagingNumbersBulkUpdates():
            MessagingNumbersBulkUpdateService.WithRawResponse = messagingNumbersBulkUpdates

        override fun messagingOptouts(): MessagingOptoutService.WithRawResponse = messagingOptouts

        override fun messagingProfiles(): MessagingProfileService.WithRawResponse =
            messagingProfiles

        override fun messagingTollfree(): MessagingTollfreeService.WithRawResponse =
            messagingTollfree

        override fun messagingUrlDomains(): MessagingUrlDomainService.WithRawResponse =
            messagingUrlDomains

        override fun messsages(): MesssageService.WithRawResponse = messsages

        override fun mobileNetworkOperators(): MobileNetworkOperatorService.WithRawResponse =
            mobileNetworkOperators

        override fun mobilePushCredentials(): MobilePushCredentialService.WithRawResponse =
            mobilePushCredentials

        override fun networkCoverage(): NetworkCoverageService.WithRawResponse = networkCoverage

        override fun networks(): NetworkService.WithRawResponse = networks

        override fun notificationChannels(): NotificationChannelService.WithRawResponse =
            notificationChannels

        override fun notificationEventConditions():
            NotificationEventConditionService.WithRawResponse = notificationEventConditions

        override fun notificationEvents(): NotificationEventService.WithRawResponse =
            notificationEvents

        override fun notificationProfiles(): NotificationProfileService.WithRawResponse =
            notificationProfiles

        override fun notificationSettings(): NotificationSettingService.WithRawResponse =
            notificationSettings

        override fun numberBlockOrders(): NumberBlockOrderService.WithRawResponse =
            numberBlockOrders

        override fun numberLookup(): NumberLookupService.WithRawResponse = numberLookup

        override fun numberOrderPhoneNumbers(): NumberOrderPhoneNumberService.WithRawResponse =
            numberOrderPhoneNumbers

        override fun numberOrders(): NumberOrderService.WithRawResponse = numberOrders

        override fun numberReservations(): NumberReservationService.WithRawResponse =
            numberReservations

        override fun numbersFeatures(): NumbersFeatureService.WithRawResponse = numbersFeatures

        override fun operatorConnect(): OperatorConnectService.WithRawResponse = operatorConnect

        override fun otaUpdates(): OtaUpdateService.WithRawResponse = otaUpdates

        override fun outboundVoiceProfiles(): OutboundVoiceProfileService.WithRawResponse =
            outboundVoiceProfiles

        override fun payment(): PaymentService.WithRawResponse = payment

        override fun phoneNumberAssignmentByProfile():
            PhoneNumberAssignmentByProfileService.WithRawResponse = phoneNumberAssignmentByProfile

        override fun phoneNumberBlocks(): PhoneNumberBlockService.WithRawResponse =
            phoneNumberBlocks

        override fun phoneNumberCampaigns(): PhoneNumberCampaignService.WithRawResponse =
            phoneNumberCampaigns

        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers

        override fun phoneNumbersRegulatoryRequirements():
            PhoneNumbersRegulatoryRequirementService.WithRawResponse =
            phoneNumbersRegulatoryRequirements

        override fun portabilityChecks(): PortabilityCheckService.WithRawResponse =
            portabilityChecks

        override fun porting(): PortingService.WithRawResponse = porting

        override fun portingOrders(): PortingOrderService.WithRawResponse = portingOrders

        override fun portingPhoneNumbers(): PortingPhoneNumberService.WithRawResponse =
            portingPhoneNumbers

        override fun portouts(): PortoutService.WithRawResponse = portouts

        override fun privateWirelessGateways(): PrivateWirelessGatewayService.WithRawResponse =
            privateWirelessGateways

        override fun publicInternetGateways(): PublicInternetGatewayService.WithRawResponse =
            publicInternetGateways

        override fun queues(): QueueService.WithRawResponse = queues

        override fun rcsAgents(): RcsAgentService.WithRawResponse = rcsAgents

        override fun recordingTranscriptions(): RecordingTranscriptionService.WithRawResponse =
            recordingTranscriptions

        override fun recordings(): RecordingService.WithRawResponse = recordings

        override fun regions(): RegionService.WithRawResponse = regions

        override fun regulatoryRequirements(): RegulatoryRequirementService.WithRawResponse =
            regulatoryRequirements

        override fun reports(): ReportService.WithRawResponse = reports

        override fun requirementGroups(): RequirementGroupService.WithRawResponse =
            requirementGroups

        override fun requirementTypes(): RequirementTypeService.WithRawResponse = requirementTypes

        override fun requirements(): RequirementService.WithRawResponse = requirements

        override fun roomCompositions(): RoomCompositionService.WithRawResponse = roomCompositions

        override fun roomParticipants(): RoomParticipantService.WithRawResponse = roomParticipants

        override fun roomRecordings(): RoomRecordingService.WithRawResponse = roomRecordings

        override fun rooms(): RoomService.WithRawResponse = rooms

        override fun seti(): SetiService.WithRawResponse = seti

        override fun shortCodes(): ShortCodeService.WithRawResponse = shortCodes

        override fun simCardDataUsageNotifications():
            SimCardDataUsageNotificationService.WithRawResponse = simCardDataUsageNotifications

        override fun simCardGroups(): SimCardGroupService.WithRawResponse = simCardGroups

        override fun simCardOrderPreview(): SimCardOrderPreviewService.WithRawResponse =
            simCardOrderPreview

        override fun simCardOrders(): SimCardOrderService.WithRawResponse = simCardOrders

        override fun simCards(): SimCardService.WithRawResponse = simCards

        override fun siprecConnectors(): SiprecConnectorService.WithRawResponse = siprecConnectors

        override fun storage(): StorageService.WithRawResponse = storage

        override fun subNumberOrders(): SubNumberOrderService.WithRawResponse = subNumberOrders

        override fun subNumberOrdersReport(): SubNumberOrdersReportService.WithRawResponse =
            subNumberOrdersReport

        override fun telephonyCredentials(): TelephonyCredentialService.WithRawResponse =
            telephonyCredentials

        override fun texml(): TexmlService.WithRawResponse = texml

        override fun texmlApplications(): TexmlApplicationService.WithRawResponse =
            texmlApplications

        override fun textToSpeech(): TextToSpeechService.WithRawResponse = textToSpeech

        override fun usageReports(): UsageReportService.WithRawResponse = usageReports

        override fun userAddresses(): UserAddressService.WithRawResponse = userAddresses

        override fun userTags(): UserTagService.WithRawResponse = userTags

        override fun verifications(): VerificationService.WithRawResponse = verifications

        override fun verifiedNumbers(): VerifiedNumberService.WithRawResponse = verifiedNumbers

        override fun verifyProfiles(): VerifyProfileService.WithRawResponse = verifyProfiles

        override fun virtualCrossConnects(): VirtualCrossConnectService.WithRawResponse =
            virtualCrossConnects

        override fun virtualCrossConnectsCoverage():
            VirtualCrossConnectsCoverageService.WithRawResponse = virtualCrossConnectsCoverage

        override fun webhookDeliveries(): WebhookDeliveryService.WithRawResponse = webhookDeliveries

        override fun wireguardInterfaces(): WireguardInterfaceService.WithRawResponse =
            wireguardInterfaces

        override fun wireguardPeers(): WireguardPeerService.WithRawResponse = wireguardPeers

        override fun wireless(): WirelessService.WithRawResponse = wireless

        override fun wirelessBlocklistValues(): WirelessBlocklistValueService.WithRawResponse =
            wirelessBlocklistValues

        override fun wirelessBlocklists(): WirelessBlocklistService.WithRawResponse =
            wirelessBlocklists

        override fun partnerCampaigns(): PartnerCampaignService.WithRawResponse = partnerCampaigns

        override fun wellKnown(): WellKnownService.WithRawResponse = wellKnown

        override fun inexplicitNumberOrders(): InexplicitNumberOrderService.WithRawResponse =
            inexplicitNumberOrders

        override fun mobilePhoneNumbers(): MobilePhoneNumberService.WithRawResponse =
            mobilePhoneNumbers

        override fun mobileVoiceConnections(): MobileVoiceConnectionService.WithRawResponse =
            mobileVoiceConnections
    }
}
