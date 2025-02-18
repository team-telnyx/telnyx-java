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
import com.telnyx.sdk.model.CreatePrivateWirelessGatewayResponse;
import com.telnyx.sdk.model.CreatePrivateWirelessGatwewayRequest;
import com.telnyx.sdk.model.DeletePrivateWirelessGatewayResponse;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetAllPrivateWirelessGatewaysResponse;
import com.telnyx.sdk.model.GetPrivateWirelessGatewayResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for PrivateWirelessGatewaysApi
 */
public class PrivateWirelessGatewaysApiTest {

    private final PrivateWirelessGatewaysApi api =
        new PrivateWirelessGatewaysApi();

    /**
     * Create a Private Wireless Gateway
     *
     * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPrivateWirelessGatewayTest() throws ApiException {
        //CreatePrivateWirelessGatwewayRequest createPrivateWirelessGatwewayRequest = null;
        //CreatePrivateWirelessGatewayResponse response = api.createPrivateWirelessGateway(createPrivateWirelessGatwewayRequest);
        // TODO: test validations
    }

    /**
     * Delete a Private Wireless Gateway
     *
     * Deletes the Private Wireless Gateway.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePrivateWirelessGatewayTest() throws ApiException {
        //UUID id = null;
        //DeletePrivateWirelessGatewayResponse response = api.deletePrivateWirelessGateway(id);
        // TODO: test validations
    }

    /**
     * Get a Private Wireless Gateway
     *
     * Retrieve information about a Private Wireless Gateway.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateWirelessGatewayTest() throws ApiException {
        //UUID id = null;
        //GetPrivateWirelessGatewayResponse response = api.getPrivateWirelessGateway(id);
        // TODO: test validations
    }

    /**
     * Get all Private Wireless Gateways
     *
     * Get all Private Wireless Gateways belonging to the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateWirelessGatewaysTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterName = null;
        //String filterIpRange = null;
        //String filterRegionCode = null;
        //String filterCreatedAt = null;
        //String filterUpdatedAt = null;
        //GetAllPrivateWirelessGatewaysResponse response = api.getPrivateWirelessGateways(pageNumber, pageSize, filterName, filterIpRange, filterRegionCode, filterCreatedAt, filterUpdatedAt);
        // TODO: test validations
    }
}
