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
import com.telnyx.sdk.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

/**
 * API tests for CredentialConnectionsApi
 */
public class CredentialConnectionsApiTest {

    private final CredentialConnectionsApi api = new CredentialConnectionsApi();
    private OutboundVoiceProfilesApi outboundVoiceProfilesApi;
    private CredentialConnection existingCredentialConnection;
    private String existingOutboundVoiceProfileId;

    @Before
    @Ignore
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

        try {
            outboundVoiceProfilesApi = new OutboundVoiceProfilesApi();
            CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = new CreateOutboundVoiceProfileRequest().name("test-name-" + System.currentTimeMillis());
            existingOutboundVoiceProfileId = outboundVoiceProfilesApi.createVoiceProfile(createOutboundVoiceProfileRequest).getData().getId();
            existingCredentialConnection = api.createCredentialConnection(prepareSampleCreateCredentialConnectionRequest("existing_credential_connection_test")).getData();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test Setup Failure - Unable to create existing connection: " + e.getMessage());
        }
    }

    @After
    @Ignore
    public void tearDown() throws InterruptedException {
        try {
            outboundVoiceProfilesApi.deleteOutboundVoiceProfile(existingOutboundVoiceProfileId);
            api.deleteCredentialConnection(existingCredentialConnection.getId());
        } catch (ApiException e) {
            e.printStackTrace();
            //ignore
        }

        //todo: Find a better way to avoid rate limiting during integration testing against production system
        //sleep(100);
    }

    /**
     * Create a credential connection
     * <p>
     * Creates a credential connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void createCredentialConnection_defaultParams_returnsCreatedCredentialConnection() throws ApiException {
        //given
        CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = new CreateOutboundVoiceProfileRequest().name("ovp_create_credential_connections_test_" + System.currentTimeMillis());
        String ovpId = outboundVoiceProfilesApi.createVoiceProfile(createOutboundVoiceProfileRequest).getData().getId();
        CreateCredentialConnectionRequest createCredentialConnectionRequest = prepareSampleCreateCredentialConnectionRequest("create_credential_connection_test_" + System.currentTimeMillis());

        //when
        CredentialConnectionResponse response = api.createCredentialConnection(createCredentialConnectionRequest);

        //then
        assertNotNull(response);

        //clean up
        try {
            outboundVoiceProfilesApi.deleteOutboundVoiceProfile(ovpId);
            api.deleteCredentialConnection(response.getData().getId());
        } catch (Exception e) {
            e.printStackTrace();
            //ignore
        }
    }

    /**
     * Delete a credential connection
     * <p>
     * Deletes an existing credential connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void deleteCredentialConnection_credentialConnectionIdProvided_credentialConnectionWouldNotReturnAnymore() throws ApiException {
        //when
        CredentialConnectionResponse response = api.deleteCredentialConnection(existingCredentialConnection.getId());

        //then
        assertNotNull(response);

        CredentialConnectionResponse retrievedCredentialConnection = api.retrieveCredentialConnection(existingCredentialConnection.getId());
        assertNull(retrievedCredentialConnection);
    }

    /**
     * List credential connections
     * <p>
     * Returns a list of your credential connections.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void listCredentialConnections_defaultParams_returnsNotNullListOfCredentialConnections() throws ApiException {
        //given
        Integer pageNumber = 1;
        Integer pageSize = 20;
        String sort = "created_at";

        //when
        ListCredentialConnectionsResponse response = api.listCredentialConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .sort(sort)
                .execute();

        //then
        assertNotNull(response);
    }

    /**
     * Retrieve a credential connection
     * <p>
     * Retrieves the details of an existing credential connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void retrieveCredentialConnection_credentialConnectionIdProvided_returnsCredentialConnection() throws ApiException {
        //when
        CredentialConnectionResponse response = api.retrieveCredentialConnection(existingCredentialConnection.getId());

        //then
        assertNotNull(response);
    }

    /**
     * Update a credential connection
     * <p>
     * Updates settings of an existing credential connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void updateCredentialConnection_changedParams_returnsUpdatedCredentialConnection() throws ApiException {
        //given
        UpdateCredentialConnectionRequest updateCredentialConnectionRequest = prepareSampleUpdateCredentialConnectionRequest();

        //when
        CredentialConnectionResponse response = api.updateCredentialConnection(existingCredentialConnection.getId(), updateCredentialConnectionRequest);

        //then
        assertNotNull(response);
        assertEquals(updateCredentialConnectionRequest.getConnectionName(), response.getData().getConnectionName());
        assertEquals(updateCredentialConnectionRequest.getOutbound().getAniOverride(), response.getData().getOutbound().getAniOverride());
        assertEquals(updateCredentialConnectionRequest.getOutbound().getLocalization(), response.getData().getOutbound().getLocalization());
    }

    private CreateCredentialConnectionRequest prepareSampleCreateCredentialConnectionRequest(String connectionName) {
        return new CreateCredentialConnectionRequest()
                .userName("MyUser" + System.currentTimeMillis())
                .password("my123secure456password789")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.CHICAGO_IL)
                .connectionName(connectionName)
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(false)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(new CredentialInbound()
                        .aniNumberFormat(CredentialInbound.AniNumberFormatEnum._E_164)
                        .channelLimit(10)
                        .codecs(Collections.singletonList("G722"))
                        .dnisNumberFormat(CredentialInbound.DnisNumberFormatEnum._E164)
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .privacyZoneEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .timeout1xxSecs(10)
                        .timeout2xxSecs("20")
                )
                .onnetT38PassthroughEnabled(false)
                .outbound(new CredentialOutbound()
                        .aniOverride("+15555551234")
                        .aniOverrideType(CredentialOutbound.AniOverrideTypeEnum.ALWAYS)
                        .callParkingEnabled(true)
                        .channelLimit(10)
                        .generateRingbackTone(true)
                        .instantRingbackEnabled(true)
                        .localization("US")
                        .outboundVoiceProfileId(existingOutboundVoiceProfileId)
                        .t38ReinviteSource(CredentialOutbound.T38ReinviteSourceEnum.TELNYX)
                )
                .rtcpSettings(new ConnectionRtcpSettings()
                        .captureEnabled(true)
                        .port(ConnectionRtcpSettings.PortEnum.RTCP_MUX)
                        .reportFrequencySecs(10)
                )
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25);
    }

    private UpdateCredentialConnectionRequest prepareSampleUpdateCredentialConnectionRequest() {
        return new UpdateCredentialConnectionRequest()
                .userName("MyUser" + System.currentTimeMillis())
                .password("my123secure456password789")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.SAN_JOSE_CA)
                .connectionName("credential_connections_update_test")
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(false)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(new CredentialInbound()
                        .aniNumberFormat(CredentialInbound.AniNumberFormatEnum._E_164)
                        .channelLimit(10)
                        .codecs(Collections.singletonList("G722"))
                        .dnisNumberFormat(CredentialInbound.DnisNumberFormatEnum._E164)
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .privacyZoneEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .timeout1xxSecs(10)
                        .timeout2xxSecs("20")
                )
                .onnetT38PassthroughEnabled(false)
                .outbound(new CredentialOutbound()
                        .aniOverride("+15555551234")
                        .aniOverrideType(CredentialOutbound.AniOverrideTypeEnum.ALWAYS)
                        .callParkingEnabled(true)
                        .channelLimit(10)
                        .generateRingbackTone(true)
                        .instantRingbackEnabled(true)
                        .localization("US")
                        .outboundVoiceProfileId(existingOutboundVoiceProfileId)
                        .t38ReinviteSource(CredentialOutbound.T38ReinviteSourceEnum.TELNYX)
                )
                .rtcpSettings(new ConnectionRtcpSettings()
                        .captureEnabled(true)
                        .port(ConnectionRtcpSettings.PortEnum.RTCP_MUX)
                        .reportFrequencySecs(10)
                )
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25);
    }
}
