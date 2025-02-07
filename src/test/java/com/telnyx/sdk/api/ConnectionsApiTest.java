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

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.*;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ConnectionsApi
 */
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();
    private IpConnection existingConnection;

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth =
            (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

        try {
            existingConnection = new IpConnectionsApi()
                .createIpConnection(prepareSampleCreateIpConnectionRequest())
                .getData();
        } catch (Exception e) {
            e.printStackTrace();
            fail(
                "Test Setup Failure - Unable to create existing connection: " +
                e.getMessage()
            );
        }
    }

    @After
    public void tearDown() throws InterruptedException {
        try {
            new IpConnectionsApi()
                .deleteIpConnection(existingConnection.getId());
        } catch (ApiException e) {
            //ignore;
        }
        //todo: Find a better way to avoid rate limiting during integration testing against production system
        //sleep(100);
    }

    /**
     * List connections
     * <p>
     * Returns a list of your connections irrespective of type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void listConnections_defaultParams_returnsNotNullListOfConnections()
        throws ApiException {
        //given
        Integer pageNumber = 1;
        Integer pageSize = 20;
        //TODO: these params are not accepted in mock server
        String filterConnectionNameContains = "";
        String filterOutboundVoiceProfileId = "123";
        String sort = "created_at";

        //when
        ListConnectionsResponse response = api
            .listConnections()
            .pageNumber(pageNumber)
            .pageSize(pageSize)
            .filterConnectionNameContains(filterConnectionNameContains)
            .filterOutboundVoiceProfileId(filterOutboundVoiceProfileId)
            .sort(sort)
            .execute();

        //then
        assertNotNull(response);
    }

    /**
     * Retrieve a connection
     * <p>
     * Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void retrieveConnection_connectionIdProvided_returnsConnection()
        throws ApiException {
        //when
        ConnectionResponse response = api.retrieveConnection(
            existingConnection.getId()
        );

        //then
        assertNotNull(response);
    }

    private CreateIpConnectionRequest prepareSampleCreateIpConnectionRequest() {
        return new CreateIpConnectionRequest()
            .active(true)
            .anchorsiteOverride(AnchorsiteOverride.CHICAGO_IL)
            .connectionName(
                "connections_api_test_" + System.currentTimeMillis()
            )
            .defaultOnHoldComfortNoiseEnabled(true)
            .dtmfType(DtmfType.RFC_2833)
            .encodeContactHeaderEnabled(false)
            .encryptedMedia(EncryptedMedia.SRTP)
            .inbound(
                new CreateInboundIpRequest()
                    .aniNumberFormat(
                        CreateInboundIpRequest.AniNumberFormatEnum._E_164
                    )
                    .channelLimit(10)
                    .codecs(Collections.singletonList("G722"))
                    .defaultRoutingMethod(
                        CreateInboundIpRequest.DefaultRoutingMethodEnum.SEQUENTIAL
                    )
                    .dnisNumberFormat(
                        CreateInboundIpRequest.DnisNumberFormatEnum._E164
                    )
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(CreateInboundIpRequest.SipRegionEnum.US)
                    .sipSubdomain(
                        "example.sip.telnyx.com" + System.currentTimeMillis()
                    )
                    .sipSubdomainReceiveSettings(
                        CreateInboundIpRequest.SipSubdomainReceiveSettingsEnum.ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10)
                    .timeout2xxSecs(20)
            )
            .onnetT38PassthroughEnabled(false)
            .outbound(
                new OutboundIp()
                    .aniOverride("+15555551234")
                    .aniOverrideType(OutboundIp.AniOverrideTypeEnum.ALWAYS)
                    .callParkingEnabled(true)
                    .channelLimit(10)
                    .generateRingbackTone(true)
                    .instantRingbackEnabled(true)
                    .ipAuthenticationMethod(
                        OutboundIp.IpAuthenticationMethodEnum.TOKEN
                    )
                    .ipAuthenticationToken("token" + System.currentTimeMillis())
                    .localization("GB")
                    .outboundVoiceProfileId(
                        TestConfiguration.EXISTING_OUTBOUND_VOICE_PROFILE_ID
                    )
                    .t38ReinviteSource(OutboundIp.T38ReinviteSourceEnum.TELNYX)
                    .techPrefix("7777")
            )
            .rtcpSettings(
                new ConnectionRtcpSettings()
                    .captureEnabled(true)
                    .port(ConnectionRtcpSettings.PortEnum.RTCP_MUX)
                    .reportFrequencySecs(10)
            )
            .transportProtocol(
                CreateIpConnectionRequest.TransportProtocolEnum.UDP
            )
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25);
    }
}
