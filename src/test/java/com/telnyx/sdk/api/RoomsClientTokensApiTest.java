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

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.CreateRoomClientTokenRequest;
import com.telnyx.sdk.model.CreateRoomClientTokenResponse;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.RefreshRoomClientTokenRequest;
import com.telnyx.sdk.model.RefreshRoomClientTokenResponse;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoomsClientTokensApi
 */
public class RoomsClientTokensApiTest {

    private final RoomsClientTokensApi api = new RoomsClientTokensApi();

    /**
     * Create Client Token to join a room.
     *
     * Synchronously create an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;, a Refresh Token is also provided to refresh a Client Token, the Refresh Token expires after &#x60;refresh_token_ttl_secs&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoomClientTokenTest() throws ApiException {
        //UUID roomId = null;
        //CreateRoomClientTokenRequest createRoomClientTokenRequest = null;
        //CreateRoomClientTokenResponse response = api.createRoomClientToken(roomId, createRoomClientTokenRequest);
        // TODO: test validations
    }

    /**
     * Refresh Client Token to join a room.
     *
     * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshRoomClientTokenTest() throws ApiException {
        //UUID roomId = null;
        //RefreshRoomClientTokenRequest refreshRoomClientTokenRequest = null;
        //RefreshRoomClientTokenResponse response = api.refreshRoomClientToken(roomId, refreshRoomClientTokenRequest);
        // TODO: test validations
    }

}