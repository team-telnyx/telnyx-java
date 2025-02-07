/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.ConnectionRtcpSettings;
import com.telnyx.sdk.model.CreateInboundIpRequest;
import com.telnyx.sdk.model.CreateIpConnectionRequest;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.EncryptedMedia;
import com.telnyx.sdk.model.IpConnectionResponse;
import com.telnyx.sdk.model.ListIpConnectionsResponse;
import com.telnyx.sdk.model.OutboundIp;
import com.telnyx.sdk.model.UpdateIpConnectionRequest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

/**
 * API tests for IpConnectionsApi
 */
public class IpConnectionsApiTest {

    private final IpConnectionsApi api = new IpConnectionsApi();

    @Ignore
    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * Create an Ip connection
     * <p>
     * Creates an IP connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void createIpConnection_defaultParams_returnsCreatedIpConnection() throws ApiException {
        //given
        CreateIpConnectionRequest createIpConnectionRequest = prepareSampleCreateIpConnectionRequest();

        //when
        IpConnectionResponse response = api.createIpConnection(createIpConnectionRequest);

        //then
        assertNotNull(response);
    }

    /**
     * Delete an Ip connection
     * <p>
     * Deletes an existing IP connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void deleteIpConnection_ipConnectionIdProvided_ipConnectionWouldNotReturnAnymore() throws ApiException {
        //given
        String id = api.createIpConnection(prepareSampleCreateIpConnectionRequest()).getData().getId();

        //when
        IpConnectionResponse response = api.deleteIpConnection(id);

        //then
        assertNotNull(response);

        IpConnectionResponse retrievedIpConnection = api.retrieveIpConnection(id);
        assertNull(retrievedIpConnection);
    }

    /**
     * List Ip connections
     * <p>
     * Returns a list of your IP connections.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void listIpConnections_defaultParams_returnsNotNullListOfIpConnections() throws ApiException {
        //given
        Integer pageNumber = 1;
        Integer pageSize = 20;
        String filterConnectionNameContains = "";
        String filterOutboundOutboundVoiceProfileId = "123";
        String sort = "created_at";
        //when
        ListIpConnectionsResponse response = api.listIpConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterOutboundOutboundVoiceProfileId(filterOutboundOutboundVoiceProfileId)
                .sort(sort)
                .execute();

        //then
        assertNotNull(response);
    }

    /**
     * Retrieve an Ip connection
     * <p>
     * Retrieves the details of an existing ip connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void retrieveIpConnection_ipConnectionIdProvided_returnsIpConnection() throws ApiException {
        //given
        String id = api.createIpConnection(prepareSampleCreateIpConnectionRequest()).getData().getId();

        //when
        IpConnectionResponse response = api.retrieveIpConnection(id);

        //then
        assertNotNull(response);
    }

    /**
     * Update an Ip connection
     * <p>
     * Updates settings of an existing IP connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void updateIpConnection_changedParams_returnsUpdatedIpConnection() throws ApiException {
        //given
        String id = api.createIpConnection(prepareSampleCreateIpConnectionRequest()).getData().getId();
        UpdateIpConnectionRequest updateIpConnectionRequest = prepareSampleUpdateIpConnectionRequest();

        //when
        IpConnectionResponse response = api.updateIpConnection(id, updateIpConnectionRequest);

        //then
        assertNotNull(response);
        assertEquals(updateIpConnectionRequest.getConnectionName(), response.getData().getConnectionName());
        assertEquals(updateIpConnectionRequest.getAnchorsiteOverride(), response.getData().getAnchorsiteOverride());
        assertEquals(updateIpConnectionRequest.getOutbound().getAniOverride(), response.getData().getOutbound().getAniOverride());
        assertEquals(updateIpConnectionRequest.getOutbound().getIpAuthenticationToken(), response.getData().getOutbound().getIpAuthenticationToken());
        assertEquals(updateIpConnectionRequest.getOutbound().getLocalization(), response.getData().getOutbound().getLocalization());
        assertEquals(updateIpConnectionRequest.getOutbound().getTechPrefix(), response.getData().getOutbound().getTechPrefix());
    }


    private UpdateIpConnectionRequest prepareSampleUpdateIpConnectionRequest() {
        return new UpdateIpConnectionRequest()
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.SAN_JOSE_CA)
                .connectionName("another_connection")
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(false)
                .encryptedMedia(EncryptedMedia.SRTP)
                //TODO: CreateInboundIpRequest must be used instead of InboundIp
//                .inbound(new CreateInboundIpRequest()
//                        .aniNumberFormat(CreateInboundIpRequest.AniNumberFormatEnum._E_164)
//                        .channelLimit(10)
//                        .codecs(Collections.singletonList("G722"))
//                        .defaultRoutingMethod(CreateInboundIpRequest.DefaultRoutingMethodEnum.SEQUENTIAL)
//                        .dnisNumberFormat(CreateInboundIpRequest.DnisNumberFormatEnum._E164)
//                        .generateRingbackTone(true)
//                        .isupHeadersEnabled(true)
//                        .prackEnabled(true)
//                        .privacyZoneEnabled(true)
//                        .sipCompactHeadersEnabled(true)
//                        .sipRegion(CreateInboundIpRequest.SipRegionEnum.US)
//                        .sipSubdomain("test")
//                        .sipSubdomainReceiveSettings(CreateInboundIpRequest.SipSubdomainReceiveSettingsEnum.ONLY_MY_CONNECTIONS)
//                        .timeout1xxSecs(10)
//                        .timeout2xxSecs(20)
//                )
                .onnetT38PassthroughEnabled(false)
                .outbound(new OutboundIp()
                        .aniOverride("test2")
                        .aniOverrideType(OutboundIp.AniOverrideTypeEnum.ALWAYS)
                        .callParkingEnabled(true)
                        .channelLimit(10)
                        .generateRingbackTone(true)
                        .instantRingbackEnabled(true)
                        .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethodEnum.TOKEN)
                        .ipAuthenticationToken("test2")
                        .localization("test2")
                        .outboundVoiceProfileId("123")
                        .t38ReinviteSource(OutboundIp.T38ReinviteSourceEnum.TELNYX)
                        .techPrefix("test2")
                )
                .rtcpSettings(new ConnectionRtcpSettings()
                        .captureEnabled(true)
                        .port(ConnectionRtcpSettings.PortEnum.RTCP_MUX)
                        .reportFrequencySecs(10)
                )
                .transportProtocol(UpdateIpConnectionRequest.TransportProtocolEnum.UDP)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25);
    }

    private CreateIpConnectionRequest prepareSampleCreateIpConnectionRequest() {
        return new CreateIpConnectionRequest()
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.CHICAGO_IL)
                .connectionName("some_connection")
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(false)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(new CreateInboundIpRequest()
                        .aniNumberFormat(CreateInboundIpRequest.AniNumberFormatEnum._E_164)
                        .channelLimit(10)
                        .codecs(Collections.singletonList("G722"))
                        .defaultRoutingMethod(CreateInboundIpRequest.DefaultRoutingMethodEnum.SEQUENTIAL)
                        .dnisNumberFormat(CreateInboundIpRequest.DnisNumberFormatEnum._E164)
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .sipRegion(CreateInboundIpRequest.SipRegionEnum.US)
                        .sipSubdomain("test")
                        .sipSubdomainReceiveSettings(CreateInboundIpRequest.SipSubdomainReceiveSettingsEnum.ONLY_MY_CONNECTIONS)
                        .timeout1xxSecs(10)
                        .timeout2xxSecs(20)
                )
                .onnetT38PassthroughEnabled(false)
                .outbound(new OutboundIp()
                        .aniOverride("test")
                        .aniOverrideType(OutboundIp.AniOverrideTypeEnum.ALWAYS)
                        .callParkingEnabled(true)
                        .channelLimit(10)
                        .generateRingbackTone(true)
                        .instantRingbackEnabled(true)
                        .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethodEnum.TOKEN)
                        .ipAuthenticationToken("test")
                        .localization("test")
                        .outboundVoiceProfileId("123")
                        .t38ReinviteSource(OutboundIp.T38ReinviteSourceEnum.TELNYX)
                        .techPrefix("test")
                )
                .rtcpSettings(new ConnectionRtcpSettings()
                        .captureEnabled(true)
                        .port(ConnectionRtcpSettings.PortEnum.RTCP_MUX)
                        .reportFrequencySecs(10)
                )
                .transportProtocol(CreateIpConnectionRequest.TransportProtocolEnum.UDP)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25);
    }
}
